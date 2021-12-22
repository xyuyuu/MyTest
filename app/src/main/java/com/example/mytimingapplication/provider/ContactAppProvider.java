package com.example.mytimingapplication.provider;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.mytimingapplication.R;
import com.example.mytimingapplication.data.ContractApp;
import com.example.mytimingapplication.data.ItemBean;

import org.jetbrains.annotations.NotNull;

public class ContactAppProvider extends BaseItemProvider<ItemBean.Mylist> {
    @Override
    public int getItemViewType() {
        return ItemBean.TYPE_MAIN_QY;
    }

    @Override
    public int getLayoutId() {
        return R.layout.contact_itemlist;
    }

    @Override
    public void convert(@NotNull BaseViewHolder baseViewHolder, ItemBean.Mylist mylist) {
        ContractApp contractApp = mylist.getContractApp();

        //设置钱数
        SpannableString spannableString = new SpannableString("$" + contractApp.getTotalAmount() / 100);
        spannableString.setSpan(new RelativeSizeSpan(2f), 1, spannableString.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        baseViewHolder.setText(R.id.tv_contact_money, spannableString);

        //设置时间
        baseViewHolder.setText(R.id.group_time1, "" + (int) (contractApp.getSurplusSeconds() % 360));
        baseViewHolder.setText(R.id.group_time2, "" + (int) (contractApp.getSurplusSeconds() % 360 / 60));
        baseViewHolder.setText(R.id.group_time3, "" + (int) (contractApp.getSurplusSeconds() % 360 % 60));
        //设置头像
        String userIcon = contractApp.getGroupInfo().getBuilderInfo().getAvatar();
        Glide.with(getContext())
                .load(userIcon)
                .circleCrop()
                .into((ImageView) baseViewHolder.findView(R.id.img_group_headicon));
        //设置昵称
        baseViewHolder.setText(R.id.tv_groupMaster_name, contractApp.getGroupInfo().getBuilderInfo().getNickname());
        //设置认证
        if(contractApp.getGroupInfo().getBuilderInfo().isVerify()){
            baseViewHolder.getView(R.id.card_logo).setVisibility(View.VISIBLE);
        }

    }
}
