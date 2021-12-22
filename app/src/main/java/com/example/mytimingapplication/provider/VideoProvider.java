package com.example.mytimingapplication.provider;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.wifi.WifiManager;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.mytimingapplication.R;
import com.example.mytimingapplication.data.ItemBean;
import com.example.mytimingapplication.data.Svlog;
import com.google.android.material.transition.MaterialContainerTransform;

import org.jetbrains.annotations.NotNull;

import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.ColorFilterTransformation;
import jp.wasabeef.glide.transformations.GrayscaleTransformation;

/**
 * 汤视频
 */
public class VideoProvider extends BaseItemProvider<ItemBean.Mylist> {

    @Override
    public int getItemViewType() {
        return ItemBean.TYPE_MAIN_VIDEO;
    }

    @Override
    public int getLayoutId() {
        return R.layout.video_itemlist;
    }


    public void convert(@NotNull BaseViewHolder baseViewHolder, ItemBean.Mylist itemBean) {
        int position = baseViewHolder.getLayoutPosition();
        Svlog svlog = itemBean.getSvlog();

        //设置汤视频logo
        SpannableString spannableString = new SpannableString("汤视频");
        spannableString.setSpan(new RelativeSizeSpan(1.5f), 0, 1, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        baseViewHolder.setText(R.id.tv_Tangvedio_name, spannableString);
        //设置标题
        baseViewHolder.setText(R.id.tv_vedio_content, svlog.getContent());
        //设置昵称
        baseViewHolder.setText(R.id.tv_vedio_name, svlog.getAuthor().getNickname());
        //设置背景
        String backgroundUrl = svlog.getVideo().getCover().getShareImgUrl();
        Glide.with(getContext())
                .load(backgroundUrl)
                .transform(new BlurTransformation(2), new CenterCrop(), new RoundedCorners(20))
                .into((ImageView) baseViewHolder.findView(R.id.img_cover));
        //设置中心背景
        String backgroundUrl2 = svlog.getVideo().getCover().getUrl();
        Glide.with(getContext())
                .load(backgroundUrl2)
                .transform(new CenterCrop())
                .into((ImageView) baseViewHolder.findView(R.id.img_coveritem));
        //设置头像
        String url = svlog.getAuthor().getAvatar();
        Glide.with(getContext())
                .load(url)
                .circleCrop()
                .into((ImageView) baseViewHolder.findView(R.id.img_video_headicon));
        //设置标识
        if(svlog.getAuthor().getIsVerify()){
            baseViewHolder.getView(R.id.card_logo).setVisibility(View.VISIBLE);
        }
    }
}
