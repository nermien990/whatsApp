package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageShow extends AppCompatActivity {

    ImageView imageShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_show);

        imageShow =(ImageView) findViewById(R.id.img_show);
        imageShow.setImageURI(getIntent().getData());

    }
}
