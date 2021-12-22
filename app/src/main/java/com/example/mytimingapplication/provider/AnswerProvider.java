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
import com.example.mytimingapplication.data.ItemBean;
import com.example.mytimingapplication.data.QaRoom;

import org.jetbrains.annotations.NotNull;

import jp.wasabeef.glide.transformations.BlurTransformation;

/**
 * 在线答疑provider
 */
public class AnswerProvider extends BaseItemProvider<ItemBean.Mylist> {
    @Override
    public int getItemViewType() {
        return ItemBean.TYPE_MAIN_ANSWER;
    }

    @Override
    public int getLayoutId() {
        return R.layout.answer_itemlist;
    }


    public void convert(@NotNull BaseViewHolder baseViewHolder, ItemBean.Mylist itemBean) {

        int position = baseViewHolder.getLayoutPosition();//获取当前Item位置
        QaRoom qaRoom = itemBean.getQaRoom();
        //设置标题
        baseViewHolder.setText(R.id.tv_answer_title, qaRoom.getTitle());
        //设置头像
        String url = qaRoom.getUserInfo().getAvatar();
        Glide.with(getContext())
                .load(url)
                .circleCrop()
                .into((ImageView) baseViewHolder.findView(R.id.img_answer_headIcon));
        //设置昵称
        baseViewHolder.setText(R.id.tv_answer_name, qaRoom.getUserInfo().getNickname());
        //设置认证信息
        baseViewHolder.setText(R.id.tv_answer_peopleContent, qaRoom.getUserInfo().getAuthenticationInfo().getCertList().get(0).getDesc());
        //设置背景图片
        String backgroundurl = qaRoom.getCoverUrl();
        Glide.with(getContext())
                .load(backgroundurl)
                .placeholder(R.drawable.head_photo)
                .error(R.drawable.head_photo)
                .apply(new RequestOptions().transform(new BlurTransformation(30), new CenterCrop(), new RoundedCorners(20)))
                .into((ImageView) baseViewHolder.findView(R.id.img_answer_background));
        //设置提问者头像
        String userIcon = qaRoom.getQaList().get(0).getUserInfo().getAvatar();
        Glide.with(getContext())
                .load(userIcon)
                .circleCrop()
                .into((ImageView) baseViewHolder.findView(R.id.img_answer_qaheadIcon));
        //设置提问者提问内容
        baseViewHolder.setText(R.id.tv_answer_user_content, qaRoom.getQaList().get(0).getText());
        //设置排队人的头像
        String queueUser1 = qaRoom.getQueueUserList().get(0).getAvatar();
        Glide.with(getContext())
                .load(queueUser1)
                .circleCrop()
                .into((ImageView) baseViewHolder.findView(R.id.img_answer_userIcon));
        String queueUser2 = qaRoom.getQueueUserList().get(1).getAvatar();
        Glide.with(getContext())
                .load(queueUser2)
                .circleCrop()
                .into((ImageView) baseViewHolder.findView(R.id.img_answer_userIcon2));
        //设置排队人数
        baseViewHolder.setText(R.id.tv_answer_users_count, qaRoom.getQueueCount() + "人正在排队");
        //设置认证
        if (qaRoom.getUserInfo().isVerify()) {
            baseViewHolder.getView(R.id.card_logo).setVisibility(View.VISIBLE);
        }
    }
}
