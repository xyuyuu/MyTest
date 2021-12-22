package com.example.mytimingapplication.provider;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.mytimingapplication.R;
import com.example.mytimingapplication.data.ItemBean;

import org.jetbrains.annotations.NotNull;

public class UnknowProvider extends BaseItemProvider<ItemBean.Mylist> {
    @Override
    public int getItemViewType() {
        return ItemBean.TYPE_MAIN_UNKNOWN;
    }

    @Override
    public int getLayoutId() {
        return R.layout.unkown_itemlist;
    }

    @Override
    public void convert(@NotNull BaseViewHolder baseViewHolder, ItemBean.Mylist itemBean) {

    }
}
