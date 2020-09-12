package com.zheng.animationdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.zheng.animationdemo.R;
import com.zheng.animationdemo.bean.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * author: zhengjh
 * desc:
 * date:2020/9/12
 */
public class LayoutAnimationAdapter extends ArrayAdapter<Person> {

    private List<Person> mDatas = new ArrayList<>();
    private int mItemResourceId;

    public LayoutAnimationAdapter(Context context, @LayoutRes int resource, List<Person> datas) {
        super(context, resource, datas);
        mDatas = datas;
        mItemResourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Person person = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(mItemResourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.ivItem = view.findViewById(R.id.iv_item);
            viewHolder.tvItem = view.findViewById(R.id.tv_item);
            view.setTag(viewHolder);
        } else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.ivItem.setImageResource(person.getPortraitId());
        viewHolder.tvItem.setText(person.getName());
        return view;
    }

    class ViewHolder{
        ImageView ivItem;
        TextView tvItem;
    }
}
