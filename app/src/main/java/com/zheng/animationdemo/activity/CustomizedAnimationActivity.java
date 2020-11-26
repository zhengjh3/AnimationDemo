package com.zheng.animationdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.zheng.animationdemo.R;
import com.zheng.animationdemo.customizedanim.Rotate3dAnimation;

public class CustomizedAnimationActivity extends AppCompatActivity {

    private ImageView ivPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customized_aniamtion);
        ivPicture = findViewById(R.id.iv_picture);
    }

    public void playCustomizedAnimation(View view) {
        if (ivPicture != null) {
            Rotate3dAnimation anim = new Rotate3dAnimation(0, 360, ivPicture.getWidth()/2,
                    ivPicture.getHeight()/2, 0, true);
            anim.setDuration(2000);
            anim.setFillAfter(true);
            //匀速旋转
            anim.setInterpolator(new LinearInterpolator());
            ivPicture.startAnimation(anim);
        }
    }

}
