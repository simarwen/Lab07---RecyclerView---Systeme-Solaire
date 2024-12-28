package com.simarwen.systemesolaire.adapters;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simarwen.systemesolaire.R;
import com.simarwen.systemesolaire.models.Planet;
import com.simarwen.systemesolaire.views.PlanetDetailActivity;

import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder> {

    private List<Planet> planetList;
    private Context context;
    private View.OnClickListener itemClickListener;


    public PlanetAdapter(Context context, List<Planet> planetList, View.OnClickListener clickListener) {
        this.planetList = planetList;
        this.context = context;
        this.itemClickListener = clickListener;
    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_planet, parent, false);
        return new PlanetViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        final Planet currentPlanet = planetList.get(position);

        holder.nameTextView.setText(currentPlanet.getName());
        holder.distanceTextView.setText(currentPlanet.getDistance());
        // Load image from drawable using setImageResource()
        holder.planetImageView.setImageResource(currentPlanet.getImageResId());
        holder.itemView.setTag(currentPlanet); // Set the planet tag
        holder.itemView.setOnClickListener(itemClickListener);
    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }

    // Define an interface for item click
    public interface OnItemClickListener {
        void onItemClick(View view);
    }


    public static class PlanetViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView distanceTextView;
        ImageView planetImageView;


        public PlanetViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.planetNameTextView);
            distanceTextView = itemView.findViewById(R.id.planetDistanceTextView);
            planetImageView = itemView.findViewById(R.id.planetImageView);
        }
    }
}