package com.zheng.animationdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zheng.animationdemo.R;
import com.zheng.animationdemo.dialog.AnimationDialog;


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

    public void showSwitchAnimation(View view) {
        startActivity(new Intent(this, SwitchAnimationActivity.class));
        //设置进入动画, A进入B，第一个参数为B的进入动画，对应style中的android:activityOpenEnterAnimation
        // 第二个参数为A的退出动画，对应style中的android:activityOpenExitAnimation
        overridePendingTransition(R.anim.anim_in_from_bottom, R.anim.anim_out_to_top);
    }

    public void showDialogAnimation(View view) {
        AnimationDialog dialog = new AnimationDialog(this);
        dialog.show();
    }
}
