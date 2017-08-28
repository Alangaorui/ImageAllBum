package com.alan.falbum;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class ImageLoader {

    private static RequestOptions myOptions = new RequestOptions()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .skipMemoryCache(false)  // 禁止内存缓存
            .centerCrop()
            .error(R.drawable.ic_img_error)
            .placeholder(R.drawable.ic_photo_loading);

    public static void load(Context context, ImageView imageView, String imagePath) {
        Glide.with(context)
                .load(imagePath)
                .apply(myOptions)
                .into(imageView);
    }


}
