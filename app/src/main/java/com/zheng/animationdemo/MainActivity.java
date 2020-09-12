package com.zheng.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zheng.animationdemo.activity.LayoutAnimationActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showLayoutAnimation(View view) {
        startActivity(new Intent(this, LayoutAnimationActivity.class));
    }
}