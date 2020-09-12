package com.zheng.animationdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.zheng.animationdemo.R;
import com.zheng.animationdemo.adapter.LayoutAnimationAdapter;
import com.zheng.animationdemo.bean.Person;

import java.util.ArrayList;
import java.util.List;

public class LayoutAnimationActivity extends AppCompatActivity {

    private ListView mListView;

    private List<Person> mList = new ArrayList<>();
    private LayoutAnimationAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_animation);
        initView();
        initData();
        initListener();
    }

    private void initView() {
        mListView = findViewById(R.id.lv_anim);
    }

    private void initData() {
        Person person1 = new Person();
        person1.setPortraitId(R.drawable.lufei);
        person1.setName("路飞");
        Person person2 = new Person();
        person2.setPortraitId(R.drawable.suolong);
        person2.setName("索隆");
        Person person3 = new Person();
        person3.setPortraitId(R.drawable.luobin);
        person3.setName("罗宾");
        Person person4 = new Person();
        person4.setPortraitId(R.drawable.buluke);
        person4.setName("布鲁克");
        Person person5 = new Person();
        person5.setPortraitId(R.drawable.leili);
        person5.setName("雷利");
        Person person6 = new Person();
        person6.setPortraitId(R.drawable.sabo);
        person6.setName("萨波");
        mList.add(person1);
        mList.add(person2);
        mList.add(person3);
        mList.add(person4);
        mList.add(person5);
        mList.add(person6);
        mAdapter = new LayoutAnimationAdapter(this, R.layout.item_layout_animation, mList);
        mListView.setAdapter(mAdapter);
    }

    private void initListener() {
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
