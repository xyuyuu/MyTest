package com.example.mytimingapplication.adapter;

import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.example.mytimingapplication.data.ItemBean;
import com.example.mytimingapplication.provider.AnswerProvider;
import com.example.mytimingapplication.provider.ContactAppProvider;
import com.example.mytimingapplication.provider.DiaryProvider;
import com.example.mytimingapplication.provider.FreeLiveProvider;
import com.example.mytimingapplication.provider.GroupProvider;
import com.example.mytimingapplication.provider.TopicProvider;
import com.example.mytimingapplication.provider.UnknowProvider;
import com.example.mytimingapplication.provider.VideoProvider;


import java.util.List;

public class HomePageAdapter extends BaseProviderMultiAdapter<ItemBean.Mylist> {
    public HomePageAdapter(List<ItemBean.Mylist> data) {
        super(data);
        addItemProvider(new AnswerProvider());//答疑
        addItemProvider(new FreeLiveProvider());//免费live
        addItemProvider(new GroupProvider());//学习群
        addItemProvider(new VideoProvider());//汤视频
        addItemProvider(new DiaryProvider());//日记
        addItemProvider(new TopicProvider());//话题
        addItemProvider(new ContactAppProvider());//契约应用
        addItemProvider(new UnknowProvider());//未知类型
    }


    protected int getItemType(List<? extends ItemBean.Mylist> list, int i) {
        switch (list.get(i).getContentType()) {
            case ItemBean.TYPE_MAIN_DIARY:
                return ItemBean.TYPE_MAIN_DIARY;
            case ItemBean.TYPE_MAIN_VIDEO:
                return ItemBean.TYPE_MAIN_VIDEO;
            case ItemBean.TYPE_MAIN_DK:
                return ItemBean.TYPE_MAIN_GROUP;
            case ItemBean.TYPE_MAIN_QY:
                return ItemBean.TYPE_MAIN_QY;
            case ItemBean.TYPE_MAIN_FREE_LIVE:
                return ItemBean.TYPE_MAIN_FREE_LIVE;
            case ItemBean.TYPE_MAIN_TOPIC:
                return ItemBean.TYPE_MAIN_TOPIC;
            case ItemBean.TYPE_MAIN_ANSWER:
                return ItemBean.TYPE_MAIN_ANSWER;
            default:
                return ItemBean.TYPE_MAIN_UNKNOWN;

        }
    }
}
