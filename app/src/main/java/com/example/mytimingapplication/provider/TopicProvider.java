package com.example.mytimingapplication.provider;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.mytimingapplication.R;
import com.example.mytimingapplication.data.ItemBean;
import com.example.mytimingapplication.data.MyTopic;

import org.jetbrains.annotations.NotNull;

/**
 * 话题
 */
public class TopicProvider extends BaseItemProvider<ItemBean.Mylist> {
    @Override
    public int getItemViewType() {
        return ItemBean.TYPE_MAIN_TOPIC;
    }

    @Override
    public int getLayoutId() {
        return R.layout.topic_itemlist;
    }


    public void convert(@NotNull BaseViewHolder baseViewHolder, ItemBean.Mylist itemBean) {

        MyTopic topic = itemBean.getTopic();
        //设置话题名称
        baseViewHolder.setText(R.id.tv_topic_name, "#" + topic.getName());
        //设置话题图片
//        int width1 = topic.getFeedList().get(0).getImageList().get(0).getWidth();
//        int height1 = topic.getFeedList().get(0).getImageList().get(0).getWidth();
        String backgroundUrl1 = topic.getFeedList().get(0).getImageList().get(0).getShareImgUrl();
        Glide.with(context)
                .load(backgroundUrl1)
                .placeholder(R.drawable.head_photo)
                .error(R.drawable.head_photo)
                .apply(new RequestOptions().transforms(new CenterCrop(), new RoundedCorners(10)))
                .into((ImageView) baseViewHolder.findView(R.id.img_topic_title1));

//        int width2 = topic.getFeedList().get(1).getImageList().get(0).getWidth();
//        int height2 = topic.getFeedList().get(1).getImageList().get(0).getWidth();
        String backgroundUrl2 = topic.getFeedList().get(1).getImageList().get(0).getShareImgUrl();
        Glide.with(getContext())
                .load(backgroundUrl2)

                .error(R.drawable.head_photo)

                .apply(new RequestOptions().transforms(new CenterCrop(), new RoundedCorners(10)))
                .into((ImageView) baseViewHolder.findView(R.id.img_topic_title2));

//        int width3 = topic.getFeedList().get(2).getImageList().get(0).getWidth();
//        int height3 = topic.getFeedList().get(2).getImageList().get(0).getWidth();
        String backgroundUrl3 = topic.getFeedList().get(2).getImageList().get(0).getShareImgUrl();
        Glide.with(getContext())
                .load(backgroundUrl3)
                .error(R.drawable.head_photo)
                .apply(new RequestOptions().transforms(new CenterCrop(), new RoundedCorners(10)))
                .into((ImageView) baseViewHolder.findView(R.id.img_topic_title3));
        //设置内容
        baseViewHolder.setText(R.id.tv_topic_content1, topic.getFeedList().get(0).getContent());
        baseViewHolder.setText(R.id.tv_topic_content2, topic.getFeedList().get(1).getContent());
        baseViewHolder.setText(R.id.tv_topic_content3, topic.getFeedList().get(2).getContent());
    }
}
