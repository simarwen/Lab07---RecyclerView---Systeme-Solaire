package com.simarwen.systemesolaire.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.simarwen.systemesolaire.R;
import com.simarwen.systemesolaire.adapters.PlanetAdapter;
import com.simarwen.systemesolaire.adapters.PlanetDataProvider;
import com.simarwen.systemesolaire.models.Planet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlanetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Get data from the Planet Data Provider
        PlanetDataProvider planetDataProvider = new PlanetDataProvider(this);
        List<Planet> planetList = planetDataProvider.getPlanets();

        // Create the Adapter with the click listener
        adapter = new PlanetAdapter(this, planetList, this::onItemClick);
        recyclerView.setAdapter(adapter);
    }


    public void onItemClick(View view) {
        Planet currentPlanet = (Planet) view.getTag();
        Intent intent = new Intent(this, PlanetDetailActivity.class);
        intent.putExtra("planet_name", currentPlanet.getName());
        intent.putExtra("planet_distance", currentPlanet.getDistance());
        intent.putExtra("planet_image", currentPlanet.getImageResId());
        intent.putExtra("planet_description", currentPlanet.getDescription());
        startActivity(intent);
    }


}