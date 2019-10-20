package com.example.five1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class Holder extends BaseAdapter {
    int[]arr={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    Context c;
    Holder(Context c)
    {
        this.c=c;
    }
    @Override
    public int getCount() {
        return arr.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img=new ImageView (c);
        img.setImageResource(arr[position]);
        img.setLayoutParams (new ViewGroup.LayoutParams (150,150));

        return img;
    }
}

