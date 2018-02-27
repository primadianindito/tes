package com.example.asus.mainmenu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Asus on 2/20/2018.
 */

public class adapterMakanan extends BaseAdapter {
    Context context;

    public adapterMakanan(Context c){
        context = c;
    }
    public int [] makanan = {
            R.drawable.juanda, R.drawable.pojok, R.drawable.sederhana, R.drawable.warung, R.drawable.warungbali
    };
    @Override
    public int getCount() {
        return makanan.length;
    }

    @Override
    public Object getItem(int position) {
        return makanan[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView image = new ImageView(context);
        image.setImageResource(makanan[position]);
        image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        image.setLayoutParams(new GridView.LayoutParams(250, 250));
        return image;
    }
}
