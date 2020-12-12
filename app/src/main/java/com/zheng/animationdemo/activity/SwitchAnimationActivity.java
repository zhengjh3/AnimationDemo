package com.zheng.animationdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zheng.animationdemo.R;

public class SwitchAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_animation);
    }

    @Override
    public void finish() {
        super.finish();
        //设置finish 退出动画, B返回C，
        // 第一个参数为C的进入动画，对应style中的android:activityCloseEnterAnimation
        // 第二个参数为B的退出动画，对应style中的android:activityCloseExitAnimation
        overridePendingTransition(R.anim.anim_in_from_top, R.anim.anim_out_to_bottom);
    }
}
