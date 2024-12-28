package com.simarwen.systemesolaire.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.simarwen.systemesolaire.R;

public class PlanetDetailActivity extends AppCompatActivity {

    private ImageView planetDetailImageView;
    private TextView planetDetailNameTextView;
    private TextView planetDetailDistanceTextView;
    private TextView planetDetailDescriptionTextView;
    private ImageView backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_planet_detail);

        planetDetailImageView = findViewById(R.id.planetDetailImageView);
        planetDetailNameTextView = findViewById(R.id.planetDetailNameTextView);
        planetDetailDistanceTextView = findViewById(R.id.planetDetailDistanceTextView);
        planetDetailDescriptionTextView = findViewById(R.id.planetDetailDescriptionTextView);
        backButton = findViewById(R.id.backButton);


        // Get data from the intent
        String planetName = getIntent().getStringExtra("planet_name");
        String planetDistance = getIntent().getStringExtra("planet_distance");
        int planetImage = getIntent().getIntExtra("planet_image", 0);
        String planetDescription = getIntent().getStringExtra("planet_description");

        // Set data to the views
        planetDetailNameTextView.setText(planetName);
        planetDetailDistanceTextView.setText(planetDistance);
        planetDetailDescriptionTextView.setText(planetDescription);
        planetDetailImageView.setImageResource(planetImage);

        backButton.setOnClickListener(view -> {


            finish();
        });


    }
}