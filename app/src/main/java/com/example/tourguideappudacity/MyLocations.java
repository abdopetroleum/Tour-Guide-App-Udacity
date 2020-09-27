package com.example.tourguideappudacity;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyLocations {
    private static Context context = MainActivity.context;
    private static Resources resources = context.getResources();
    private static ArrayList<Location> Hotels = new ArrayList<Location>() {
        {
            String[] names = resources.getStringArray(R.array.hotel_names);
            String[] hotelDescription = resources.getStringArray(R.array.hotel_descriptions);
            add(new Location(names[0],
                    hotelDescription[0],
                    R.drawable.cancun_sokhna_resort));
            add(new Location(names[1],
                    hotelDescription[1],
                    R.drawable.porto_sokhna_beach_resort));
            add(new Location(names[2],
                    hotelDescription[2],
                    R.drawable.mvenpick_resort_elsokhna));
            add(new Location(names[3],
                    hotelDescription[3],
                    R.drawable.romance_hotel_ain_sokhna));
            add(new Location(names[4],
                    hotelDescription[4],
                    R.drawable.stella_di_mare_sea_club_hotel));
        }
    };
    private static ArrayList<Location> restaurants = new ArrayList<Location>() {
        {
            String[] names = resources.getStringArray(R.array.restaurant_names);
            String[] descriptions = resources.getStringArray(R.array.restaurant_descriptions);
            add(new Location(names[0],
                    descriptions[0],
                    R.drawable.fares));
            add(new Location(names[1],
                    descriptions[1],
                    R.drawable.mk));
            add(new Location(names[2],
                    descriptions[2],
                    R.drawable.kfc));
        }
    };
    private static ArrayList<Location> cafes = new ArrayList<Location>() {
        {
            String[] names = resources.getStringArray(R.array.cafe_names);
            String[] descriptions = resources.getStringArray(R.array.cafe_descriptions);
            add(new Location(names[0],
                    descriptions[0],
                    R.drawable.santorini_cafe));
            add(new Location(names[1],
                    descriptions[1],
                    R.drawable.pubg));
        }
    };
    private static ArrayList<Location> attractions = new ArrayList<Location>() {
        {
            String[] names = resources.getStringArray(R.array.attractions_names);
            String[] descriptions = resources.getStringArray(R.array.attractions_descriptions);
            add(new Location(names[0],
                    descriptions[0],
                    R.drawable.mosque));
            add(new Location(names[1],
                    descriptions[1],
                    R.drawable.lusanda));
            add(new Location(names[2],
                    descriptions[2],
                    R.drawable.staduim));
        }
    };

    public static ArrayList<Location> getHotels() {
        return Hotels;
    }

    public static ArrayList<Location> getRestaurants() {
        return restaurants;
    }

    public static ArrayList<Location> getCafes() {
        return cafes;
    }

    public static ArrayList<Location> getAttractions() {
        return attractions;
    }
}
