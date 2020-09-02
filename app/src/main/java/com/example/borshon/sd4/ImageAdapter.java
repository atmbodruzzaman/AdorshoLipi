package com.example.borshon.sd4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageAdapter extends PagerAdapter {

    private Context mcontext;
    private int[] mImagesIDs = new int[]{R.drawable.mojib , R.drawable.mancitro , R.drawable.potaka,R.drawable.songsod,R.drawable.sphidminar,R.drawable.smrity,R.drawable.shapla,R.drawable.doyel};



    ImageAdapter(Context context){
        mcontext = context;
    }

    @Override
    public int getCount() {
        return mImagesIDs.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mcontext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImagesIDs[position]);
        container.addView(imageView,0);
        Toast.makeText(mcontext, "Swap for more", Toast.LENGTH_LONG).show();
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
