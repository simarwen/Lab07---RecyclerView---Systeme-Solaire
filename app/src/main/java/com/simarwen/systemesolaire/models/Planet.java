package com.simarwen.systemesolaire.models;

public class Planet {




        private String name;
        private String distance;
        private int imageResId;
        private String description;

        public Planet(String name, String distance, int imageResId, String description) {
            this.name = name;
            this.distance = distance;
            this.imageResId = imageResId;
            this.description = description;
        }


        public String getName() {
            return name;
        }

        public String getDistance() {
            return distance;
        }

        public int getImageResId() {
            return imageResId;
        }
        public String getDescription() {
            return description;
        }




}
