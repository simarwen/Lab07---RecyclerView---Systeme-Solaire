package com.simarwen.systemesolaire.adapters;

import android.content.Context;

import com.simarwen.systemesolaire.R;
import com.simarwen.systemesolaire.models.Planet;

import java.util.ArrayList;
import java.util.List;

public class PlanetDataProvider {

    private Context context;

    public PlanetDataProvider(Context context) {
        this.context = context;
    }

    public List<Planet> getPlanets() {
        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet(context.getString(R.string.mercury_name), context.getString(R.string.mercury_distance), R.drawable.mercury, context.getString(R.string.mercury_description)));
        planets.add(new Planet(context.getString(R.string.venus_name), context.getString(R.string.venus_distance), R.drawable.venus, context.getString(R.string.venus_description)));
        planets.add(new Planet(context.getString(R.string.earth_name), context.getString(R.string.earth_distance), R.drawable.earth, context.getString(R.string.earth_description)));
        planets.add(new Planet(context.getString(R.string.mars_name), context.getString(R.string.mars_distance), R.drawable.mars, context.getString(R.string.mars_description)));
        planets.add(new Planet(context.getString(R.string.jupiter_name), context.getString(R.string.jupiter_distance), R.drawable.jupiter, context.getString(R.string.jupiter_description)));
        planets.add(new Planet(context.getString(R.string.saturn_name), context.getString(R.string.saturn_distance), R.drawable.saturn, context.getString(R.string.saturn_description)));
        planets.add(new Planet(context.getString(R.string.uranus_name), context.getString(R.string.uranus_distance), R.drawable.uranus, context.getString(R.string.uranus_description)));
        planets.add(new Planet(context.getString(R.string.neptune_name), context.getString(R.string.neptune_distance), R.drawable.neptune, context.getString(R.string.neptune_description)));
        return planets;
    }
}
