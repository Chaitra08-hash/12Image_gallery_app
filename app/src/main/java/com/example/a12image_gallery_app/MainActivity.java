package com.example.a12image_gallery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Gallery simpleGallery;
    CustomGalleryAdapter customGalleryAdapter;
    ImageView selectedImageView;
    // array of images
    int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5,
            R.drawable.car1, R.drawable.car2, R.drawable.car3, R.drawable.car4, R.drawable.images, R.drawable.image1,
            R.drawable.image2, R.drawable.image3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleGallery = (Gallery) findViewById(R.id.simpleGallery); // get the reference of Gallery
        selectedImageView = (ImageView) findViewById(R.id.imageView); // get the reference of ImageView
        customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images); // initialize the adapter
        simpleGallery.setAdapter(customGalleryAdapter); // set the adapter
        simpleGallery.setSpacing(10);
        // perform setOnItemClickListener event on the Gallery
        simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set the selected image in the ImageView
                selectedImageView.setImageResource(images[position]);

            }
        });

    }
}