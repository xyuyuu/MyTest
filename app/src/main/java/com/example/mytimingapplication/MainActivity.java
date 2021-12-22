package com.example.mytimingapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.mytimingapplication.adapter.HomePageAdapter;
import com.example.mytimingapplication.data.ItemBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ItemBean itemBeans;
    List<ItemBean.Mylist> mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //解析Json数据
        ReadJson readJson = new ReadJson();
        String str = readJson.getJson();
        Gson gson = new Gson();
        itemBeans = gson.fromJson(str, new TypeToken<ItemBean>() {
        }.getType());
        mylist = itemBeans.getList();

        recyclerView = (RecyclerView) findViewById(R.id.recycle_Timing);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        HomePageAdapter adapter = new HomePageAdapter(mylist);
        //添加头部
        View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.top_itemlist, null);
        adapter.setHeaderView(view);
        recyclerView.setAdapter(adapter);
    }
}