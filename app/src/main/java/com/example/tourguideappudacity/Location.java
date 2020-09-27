package com.example.tourguideappudacity;

public class Location {
    private String name;
    private String description;
    private int imgId =-1;

    public Location(String name, String description, int imgId) {
        this.name = name;
        this.description = description;
        this.imgId = imgId;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImgId() {
        return imgId;
    }

    public boolean hasImage(){
        return imgId!=-1;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imgId=" + imgId +
                '}';
    }

}
