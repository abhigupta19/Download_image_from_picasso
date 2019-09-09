package com.sar.user.save_image_cache;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
Bitmap bmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //URL url=new URL("https://i3.wp.com/www.digitbin.com/content/uploads/Aptoide-Logo-600x400.jpg");
        ImageView imageView=findViewById(R.id.imageView);
        Picasso.get().load("https://i3.wp.com/www.digitbin.com/content/uploads/Aptoide-Logo-600x400.jpg").into(imageView);
    }
}
