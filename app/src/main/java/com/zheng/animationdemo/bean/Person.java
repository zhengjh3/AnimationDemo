package com.zheng.animationdemo.bean;

import androidx.annotation.NonNull;

/**
 * author: zhengjh
 * desc:
 * date:2020/9/12
 */
public class Person {
    private int portraitId;
    private String name;

    public int getPortraitId() {
        return portraitId;
    }

    public void setPortraitId(int portraitId) {
        this.portraitId = portraitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return "Person {" +
                "portraitId:" + portraitId +
                ",name:" + name +
                "}";
    }
}
