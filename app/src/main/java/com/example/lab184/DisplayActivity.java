package com.example.lab184;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        String imageUriString = intent.getStringExtra("IMAGE_URI");

        ImageView imageViewDisplay = findViewById(R.id.imageViewDisplay);
        Uri imageUri = Uri.parse(imageUriString);

        // Use Glide library to load the image from URI into ImageView
    }
}

