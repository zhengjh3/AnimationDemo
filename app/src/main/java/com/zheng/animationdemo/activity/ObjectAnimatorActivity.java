package com.zheng.animationdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

import com.zheng.animationdemo.R;

public class ObjectAnimatorActivity extends AppCompatActivity {

    private static final String TAG = "ObjectAnimatorActivity";

    TextView tvRect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator);
        tvRect = findViewById(R.id.tv_rect);
    }

    /**
     * 展示平移动画
     * */
    public void playTranslateAnimator(View view){
        //可指定属性：
        // translationX,表示X坐标平移；translationY,表示Y坐标平移
        ObjectAnimator translateAnimator = ObjectAnimator.ofFloat(tvRect, "translationX", 0, 200);
        //设置动画时长
        translateAnimator.setDuration(1000);
        //设置插值器
        translateAnimator.setInterpolator(new LinearInterpolator());
        translateAnimator.start();
    }

    /**
     * 展示缩放动画
     * */
    public void playScaleAnimator(View view){
        // scaleX,表示X方向上的缩放；scaleY,表示Y方向上的缩放
        ObjectAnimator translateAnimator = ObjectAnimator.ofFloat(tvRect, "scaleX", 1, 2f);
        //设置动画时长
        translateAnimator.setDuration(1000);
        //设置插值器
        translateAnimator.setInterpolator(new LinearInterpolator());
        translateAnimator.start();
    }

    /**
     * 展示旋转动画
     * */
    public void playRotateAnimator(View view){
        // rotation,表示绕中心点旋转;rotationX表示绕X中轴线旋转；rotationY表示绕Y中轴线旋转
        ObjectAnimator translateAnimator = ObjectAnimator.ofFloat(tvRect, "rotationX", 0, -135);
        //设置动画时长
        translateAnimator.setDuration(1000);
        //设置插值器
        translateAnimator.setInterpolator(new LinearInterpolator());
        translateAnimator.start();
    }

    /**
     * 展示透明动画
     * */
    public void playAlphaAnimator(View view){
        // 后几个参数表示透明度的变化值
        ObjectAnimator translateAnimator = ObjectAnimator.ofFloat(tvRect, "alpha", 1, 0.25f, 1f);
        //设置动画时长
        translateAnimator.setDuration(2000);
        //设置插值器
        translateAnimator.setInterpolator(new LinearInterpolator());
        translateAnimator.start();
    }

}
