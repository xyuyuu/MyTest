package com.example.mytimingapplication.provider;

import android.annotation.SuppressLint;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.mytimingapplication.R;
import com.example.mytimingapplication.data.ClockApp;
import com.example.mytimingapplication.data.ContractApp;
import com.example.mytimingapplication.data.ItemBean;

import org.jetbrains.annotations.NotNull;

/**
 * 打卡应用和契约应用
 */
public class GroupProvider extends BaseItemProvider<ItemBean.Mylist> {
    @Override
    public int getItemViewType() {
        return ItemBean.TYPE_MAIN_GROUP;
    }

    @Override
    public int getLayoutId() {
        return R.layout.studygroup_itemlist;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void convert(@NotNull BaseViewHolder baseViewHolder, ItemBean.Mylist itemBean) {
        //获取位置
        int position = baseViewHolder.getLayoutPosition();
        ClockApp clockApp = itemBean.getClockApp();
        //设置群名
        baseViewHolder.setText(R.id.tv_group_title, clockApp.getGroupInfo().getName());
        //设置打卡主题内容
        baseViewHolder.setText(R.id.tv_group_name, clockApp.getTitle());
        //设置头像
        String userIcon = clockApp.getGroupInfo().getBuilderInfo().getAvatar();
        Glide.with(getContext())
                .load(userIcon)
                .circleCrop()
                .into((ImageView) baseViewHolder.findView(R.id.img_group_headicon));
        //设置昵称
        baseViewHolder.setText(R.id.tv_groupMaster_name, clockApp.getGroupInfo().getBuilderInfo().getNickname());
        //设置认证
        if(clockApp.getGroupInfo().getBuilderInfo().isVerify()){
            baseViewHolder.getView(R.id.card_logo).setVisibility(View.VISIBLE);
        }
    }
}
