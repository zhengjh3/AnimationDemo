package com.zheng.animationdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import com.zheng.animationdemo.R;

public class ViewAnimationActivity extends AppCompatActivity {

    private ImageView ivRect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation);
        ivRect = findViewById(R.id.iv_rect);
        ivRect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ViewAnimationActivity.this, "点击方块",Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 展示平移动画
     * */
    public void translateAnimation(View view){
        //加载动画xml方式
        Animation translateAnim = AnimationUtils.loadAnimation(this, R.anim.animation_translate);
        //开始动画
        ivRect.startAnimation(translateAnim);

        //动态创建动画方式，效果同animation_translate的配置
        /*TranslateAnimation anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_PARENT, 0.6f,Animation.RELATIVE_TO_SELF, 0,Animation.RELATIVE_TO_PARENT, 0.5f);
        //设置动画时长
        anim.setDuration(1000);
        //设置插值器
        anim.setInterpolator(new LinearInterpolator());
        //开始动画
        ivRect.startAnimation(anim);*/
    }

    /**
     * 展示缩放动画
     * */
    public void scaleAnimation(View view){
        //加载动画xml方式
       /* Animation translateAnim = AnimationUtils.loadAnimation(this, R.anim.animation_scale);
        ivBall.startAnimation(translateAnim);*/

        //动态创建动画方式，效果同animation_scale的配置
        ScaleAnimation anim = new ScaleAnimation(0, 2, 0, 2,Animation.RELATIVE_TO_SELF, 0.5f,Animation.RELATIVE_TO_SELF, 0.5f);
        //设置动画时长
        anim.setDuration(1000);
        //设置动画结束后是否停留在最后一帧
        anim.setFillAfter(true);
        //如果同时设置了FillAfter和FillBefore，不分先后，都以FillAfter为主
        //anim.setFillBefore(true);
        //设置插值器
        anim.setInterpolator(new AccelerateDecelerateInterpolator());
        //开始动画
        ivRect.startAnimation(anim);
    }

    /**
     * 展示旋转动画
     * */
    public void rotateAnimation(View view){
        //加载动画xml方式
        /*Animation translateAnim = AnimationUtils.loadAnimation(this, R.anim.animation_rotate);
        ivRect.startAnimation(translateAnim);*/

        //动态创建动画方式，效果同animation_scale的配置
        RotateAnimation anim = new RotateAnimation(0, 135, Animation.RELATIVE_TO_SELF, 0.5f,Animation.RELATIVE_TO_SELF, 0.5f);
        //设置动画时长
        anim.setDuration(1000);
        //设置动画结束后是否停留在最后一帧
        anim.setFillAfter(true);
        //如果同时设置了FillAfter和FillBefore，不分先后，都以FillAfter为主
        //anim.setFillBefore(true);
        //设置插值器
        anim.setInterpolator(new LinearInterpolator());
        //开始动画
        ivRect.startAnimation(anim);
    }

    /**
     * 展示透明动画
     * */
    public void alphaAnimation(View view){
        //加载动画xml方式
        Animation translateAnim = AnimationUtils.loadAnimation(this, R.anim.animation_alpha);
        ivRect.startAnimation(translateAnim);

        //动态创建动画方式，效果同animation_scale的配置
        /*AlphaAnimation anim = new AlphaAnimation(0, 1f);
        //设置动画时长
        anim.setDuration(2000);
        //设置动画结束后是否停留在最后一帧
        anim.setFillAfter(true);
        //如果同时设置了FillAfter和FillBefore，不分先后，都以FillAfter为主
        //anim.setFillBefore(true);
        //设置插值器
        anim.setInterpolator(new LinearInterpolator());
        //开始动画
        ivRect.startAnimation(anim);*/
    }

}