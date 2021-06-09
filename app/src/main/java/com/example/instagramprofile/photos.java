package com.example.instagramprofile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class photos extends BaseAdapter {

    Context mcontext;
    int [] profiles;
    LayoutInflater layoutInflater;
    public photos(Context mcontext, int[] profiles) {
        this.mcontext = mcontext;
        this.profiles = profiles;

    }

    @Override
    public int getCount() {
        return profiles.length;
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
        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
        convertView=layoutInflater.inflate(R.layout.pictures,null);
        ImageView img=(ImageView) convertView.findViewById(R.id.pic);
        img.setImageResource(profiles[position]);

        return convertView;
    }
}
