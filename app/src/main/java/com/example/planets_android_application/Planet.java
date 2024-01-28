package com.example.planets_android_application;
// The class is acting as Model Class for our ListView
public class Planet
{
    //......................Modal Class.........................//
    // Attributes  (Step 01)
    private String planetName;
    private String moonCount;

    private  int planetImage; // Image cannot store inside of it  they just used to access the the Image.

    // Constructor - it allows to intilization object of that class

    // (Step 02)


    public Planet(String planetName, String moonCount, int planetImage) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImage = planetImage;
    }

    // (Step 03) Getters and Setters
    // Getter - it returns the value of data type int, String, double, float, etc.
    // Setters - Setter sets or updates the value (mutators)

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}
