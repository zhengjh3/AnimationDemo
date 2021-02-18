package com.zheng.animationdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zheng.animationdemo.R;

public class PropertyAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_animation);
    }

    public void showObjectAnimator(View view){
        startActivity(new Intent(this, ObjectAnimatorActivity.class));
    }

    public void showValueAnimator(View view){
    }

    public void showAnimatorSet(View view){
    }

}
