# Systeme Solaire 

This Android application displays information about planets in our solar system using a RecyclerView, and allows users to navigate to a detail view for each planet.

## Features

*   Displays a list of planets with their names, distances from the Sun, and images.
*   Provides a detail view for each planet, showing:
    *   Planet Name
    *   Distance from the Sun
    *   Planet Image
    *   Planet Description
*   Navigation between the list of planets and the detail views.
* Uses resource files (`strings.xml` and `drawable`) to provide a clean architecture.
* Provides a back button for navigation in planet detail screen.


## Architecture

The app follows an architectural pattern similar to Model-View-Controller (MVC) for structure and code organization:

*   **Model:**
    *   `Planet.java`: Represents the data model for a planet.
*   **View:**
    *   `activity_main.xml`: Layout for the main screen with the RecyclerView.
    *   `item_planet.xml`: Layout for each individual planet item in the RecyclerView.
    *   `activity_planet_detail.xml`: Layout for the planet detail screen.
*   **adapters:**
    *   `PlanetAdapter.java`: Adapter for the RecyclerView, managing data presentation and interactions.
    *   `PlanetViewHolder.java`: ViewHolder for the RecyclerView.

Other files:

* `PlanetDataProvider.java` : Data provider which is used to retrieve data for planets from string and drawable resources.
* `MainActivity.java` : Displays the `RecyclerView` of planets.
* `PlanetDetailActivity.java` : Displays the planet details.

## Packages

The project is organized into the following packages:

*   `com.simarwen.systemesolaire.models`:  Contains the `Planet` model.
*   `com.simarwen.systemesolaire.adapters`:  Contains the `PlanetAdapter` and `PlanetDataProvider` classes.
*   `com.simarwen.systemesolaire.views`: Contains the `MainActivity` and `PlanetDetailActivity`.

## Setup and Installation

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/simarwen/Lab07-RecyclerView-Systeme-Solaire.git
    ```
2.  **Open in Android Studio:**
    *   Start Android Studio.
    *   Select "Open an existing project".
    *   Navigate to the cloned repository and open the project.
3.  **Build and Run:**
    *   Click the "Run" button in Android Studio.
    *   Choose an emulator or connected device.

## Dependencies

The project uses the following dependency. The other dependencies are created automatically by Android Studio.
* `androidx.recyclerview:recyclerview` : For displaying items in a `RecyclerView`.

## Resources

* Images for the planets are in the `drawable` folder.
* Text resources like names, distances, and descriptions for the planets are located in the `strings.xml` file.

