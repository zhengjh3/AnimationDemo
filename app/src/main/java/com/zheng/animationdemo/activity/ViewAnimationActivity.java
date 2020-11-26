package com.zheng.animationdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zheng.animationdemo.R;


public class ViewAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation);
    }

    public void showTweenAnimation(View view){
        startActivity(new Intent(this, TweenAnimationActivity.class));
    }

    public void showCustomizedAnimation(View view){
        startActivity(new Intent(this, CustomizedAnimationActivity.class));
    }

    public void showFrameAnimation(View view){
        startActivity(new Intent(this, FrameAnimationActivity.class));
    }

    public void showLayoutAnimation(View view) {
        startActivity(new Intent(this, LayoutAnimationActivity.class));
    }

}
