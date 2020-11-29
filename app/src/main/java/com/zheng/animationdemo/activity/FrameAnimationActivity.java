package com.zheng.animationdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.zheng.animationdemo.R;

public class FrameAnimationActivity extends AppCompatActivity {

    private ImageView ivFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        ivFrame = findViewById(R.id.iv_frame);
        //设置逐帧动画做背景,或者在布局文件中直接指定background属性
        //ivFrame.setBackgroundResource(R.drawable.animation_frame);
    }

    public void playFrameAnimation(View view){
        AnimationDrawable drawable = (AnimationDrawable)ivFrame.getBackground();
        drawable.start();
    }

    public void stopFrameAnimation(View view) {
        AnimationDrawable drawable = (AnimationDrawable)ivFrame.getBackground();
        drawable.stop();
    }


}
