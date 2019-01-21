package com.example.user.recyclerviewtest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();     //初始化数据源
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
// LayoutManager用于指定RecyclerView的布局方式
        LinearLayoutManager layoutManager = new
                LinearLayoutManager (this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitsList);
        recyclerView.setAdapter(adapter);

    }
    private void initFruits() {
        for (int i = 0; i < 5; i++) {
            Fruit A = new Fruit("AABBCC", "12333314", "五分钟前", R.drawable.aa);
            fruitsList.add(A);
            Fruit B= new Fruit("陌生人消息", "张欣尧张欣尧…：觉得你的视频真很6…", "五分钟前", R.drawable.bb);
            fruitsList.add(B);
            Fruit C= new Fruit("通知", "走不通的路就用拳头来打开", "三小时前", R.drawable.cc);
            fruitsList.add(C);
        }
        ////添加数据，此处省略
    }
}
