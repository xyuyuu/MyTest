package com.example.mytimingapplication.provider;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.FitWindowsViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.mytimingapplication.MainActivity;
import com.example.mytimingapplication.R;
import com.example.mytimingapplication.data.Feed;
import com.example.mytimingapplication.data.ItemBean;
import com.google.android.material.shape.CornerSize;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * 日记provider
 */
public class DiaryProvider extends BaseItemProvider<ItemBean.Mylist> {
    public int getItemViewType() {
        return ItemBean.TYPE_MAIN_DIARY;
    }

    @Override
    public int getLayoutId() {
        return R.layout.diary_itemlist;
    }


    public void convert(@NotNull BaseViewHolder baseViewHolder, ItemBean.Mylist itemBean) {

        Feed feed = itemBean.getFeed();
        //设置昵称
        if (!feed.getAuthor().isVerify()) {
            baseViewHolder.setText(R.id.tv_title, feed.getAuthor().getNickname());
        }
        //设置头像
        String url = feed.getAuthor().getAvatar();
        ImageView imghead = baseViewHolder.getView(R.id.img_headIcon);
        Glide.with(context)
                .load(url)
                .circleCrop()
                .into(imghead);
        //设置内容
        baseViewHolder.setText(R.id.tv_content, feed.getContent());
        if (feed.getTopic() != null) {
            baseViewHolder.setText(R.id.tv_label, "#" + feed.getTopic().getName());
        } else if (feed.getTopic() == null) {
            baseViewHolder.setText(R.id.tv_label, "#");
        }

        //设置标签
        if (feed.getAuthor().getStatusInfo().getType() == 1) {
            TextView textView = baseViewHolder.getView(R.id.tv_studing);
            textView.setVisibility(View.GONE);
        } else if (feed.getAuthor().getStatusInfo().getType() == 2) {
            baseViewHolder.getView(R.id.tv_studying_lines).setVisibility(View.VISIBLE);
        }
        baseViewHolder.setText(R.id.tv_studyType, feed.getLabel().getLearnTag());
        //设置背景图片
        String backgroundUrl = feed.getImageList().get(0).getUrl();
        Glide.with(context)
                .load(backgroundUrl)
                .placeholder(R.drawable.head_photo)
                .error(R.drawable.head_photo)
                .apply(new RequestOptions().transforms(new FitCenter(), new RoundedCorners(10)))
                .into((ImageView) baseViewHolder.getView(R.id.img_homePage));
        //根据男女设置背景
        if (!feed.getAuthor().getGender().equals("female")) {
            Drawable drawable = getContext().getResources().getDrawable(R.drawable.answer_line_shape);
            baseViewHolder.getView(R.id.tv_title).setBackground(drawable);
        }


    }


}
