package com.zheng.animationdemo.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.zheng.animationdemo.R;

public class AnimationDialog extends Dialog {

    public AnimationDialog(Context context){
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_for_animtion);
        //设置dialog动画
        this.getWindow().setWindowAnimations(R.style.WindowAnimation);
    }
}
