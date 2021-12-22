package com.example.mytimingapplication.provider;

import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.mytimingapplication.R;
import com.example.mytimingapplication.data.FreeLive;
import com.example.mytimingapplication.data.ItemBean;

import org.jetbrains.annotations.NotNull;

/**
 * liveProvider
 */
public class FreeLiveProvider extends BaseItemProvider<ItemBean.Mylist> {
    @Override
    public int getItemViewType() {
        return ItemBean.TYPE_MAIN_FREE_LIVE;
    }

    @Override
    public int getLayoutId() {
        return R.layout.freelive_itemlist;
    }


    public void convert(@NotNull BaseViewHolder baseViewHolder, ItemBean.Mylist itemBean) {
        //获取当前Item位置
        int position = baseViewHolder.getLayoutPosition();
        FreeLive freeLive = itemBean.getFreeLive();
        //设置背景图
//        int width = freeLive.getCover().getWidth();
//        int height = freeLive.getCover().getHeight();
        String backgroundUrl = freeLive.getCover().getUrl();
        Glide.with(getContext())
                .load(backgroundUrl)
                .placeholder(R.drawable.head_photo)
                .error(R.drawable.head_photo)
                .apply(new RequestOptions().transform(new CenterCrop(), new RoundedCorners(20)))
                .into((ImageView) baseViewHolder.findView(R.id.img_live_cover));
        //设置头像
        String userIcon = freeLive.getSpUserInfo().getAvatar();
        Glide.with(getContext())
                .load(userIcon)
                .placeholder(R.drawable.head_photo)
                .error(R.drawable.head_photo)
                .circleCrop()
                .into((ImageView) baseViewHolder.findView(R.id.img_live_headicon));
        //设置昵称
        baseViewHolder.setText(R.id.tv_live_name, freeLive.getSpUserInfo().getNickname());
        //设置标题
        baseViewHolder.setText(R.id.tv_live_conent, freeLive.getTitle());
        //设置标识
        if(freeLive.getSpUserInfo().getIsVerify()){
            baseViewHolder.getView(R.id.card_logo).setVisibility(View.VISIBLE);
        }


    }
}
