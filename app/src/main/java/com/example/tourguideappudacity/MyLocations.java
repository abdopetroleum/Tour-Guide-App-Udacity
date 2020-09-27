package com.example.tourguideappudacity;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyLocations {
    private static ArrayList<Location> Hotels=new ArrayList<Location>(){
        {
            add(new Location("Cancun Sokhna Resort",
                    "Complimentary breakfast, ATM on-site, Gift shop, Laundry facilities, Room service, Outdoor pool, Restaurant, Bar/Lounge, Express check out, Hairdryer, Cable or satellite TV, Air-conditioned, 24-hour front desk, Microwave, Refrigerator, Free parking, Storage available, Terrace/Patio, Disabled access, Linens, Towels, Grill, Lift, Minibar, Additional toilet, Balcony, Bathtub, Body soap, Bottle of water, Breakfast in the room, Carpeted, Children's television networks, Cleaning products, Conditioner, Desk, Dining area, Family rooms, Fire extinguisher, Flat-screen TV, Free toiletries, Heated pool, Interconnected room(s) available, Kids meals, Kid-friendly buffet, Pool towels, Pool view, Private bathroom, Private entrance, Private parking, Private pool, Safety deposit box, Sea view, Seating area, Shampoo, Shared lounge/TV area, Shower, Snack bar, Sofa, Soundproofing, Tea/coffee maker, Telephone, Tile/marble floor, Toilet, Toilet paper, Towels/sheets (extra fee), Dustbins, Tumble dryer, TV, Upper floors accessible by lift, VIP room facilities, Wardrobe or closet, Ironing service, Shops (on site), Garden, Kitchenette, Beach towels, No smoking, Safe, Bathrobe, Sauna, Private beach",
                 R.drawable.cancun_sokhna_resort   ) );
            add(new Location("Porto Sokhna Beach Resort",
                    "Disabled access, ATM on-site, Gift shop, Laundry facilities, Room service, Smoke alarms, Outdoor pool, No smoking, Hairdryer, Cable or satellite TV, Air-conditioned, 24-hour front desk, Free parking, Storage available, Terrace/Patio, Linens, Towels, Grill, Lift, Balcony, Bathtub, Body soap, Cleaning products, Desk, Electric kettle, Fire extinguisher, Flat-screen TV, Free toiletries, Kids meals, Pool towels, Pool with a view, Private bathroom, Private parking, Safety deposit box, Sea view, Seating area, Shampoo, Shower, Snack bar, Sofa, Telephone, Toilet, Toilet paper, Dustbins, Tumble dryer, TV, Wardrobe or closet, Ironing service, Packed lunches, Shoeshine, Shops (on site), Garden, CCTV in common areas, Child pool, Complimentary breakfast, Safe, Private beach, Children's high chair, Bathrobe, Beach towels, Restaurant, Bar/Lounge, Express check out, Coffee shop",
                    R.drawable.porto_sokhna_beach_resort));
            add(new Location("Mövenpick Resort El Sokhna",
                    "\n" +
                            "Disabled access, EV charging station, ATM on-site, Cribs available, Gift shop, Laundry facilities, Room service, Smoke alarms, Outdoor pool, Restaurant, Bar/Lounge, Hairdryer, Air-conditioned, 24-hour front desk, Sauna, Free parking, Private beach, Designated smoking area, Storage available, Non-smoking rooms available, Terrace/Patio, Towels, Fireplace, Grill, Lift, Minibar, Iron and ironing board, Accessible by lift, Allergy-free room, Baby safety gates, Balcony, Bidet, Body soap, Bottle of water, Bridal suite, Children's television networks, Cleaning products, Conditioner, Desk, Electric kettle, Entire unit located on ground floor, Family rooms, Fan, Fire extinguisher, Flat-screen TV, Free toiletries, Garden view, Heating, Infinity pool, Interconnected room(s) available, Key card access, Kids meals, Lockers, Newspapers, Non-feather pillow, Plunge pool, Pool towels, Pool with a view, Private bathroom, Roll-in shower, Safety deposit box, Sea view, Shampoo, Shared lounge/TV area, Shower, Shower cap, Slippers, Socket near the bed, Sofa, Tea/coffee maker, Telephone, Tile/marble floor, Toilet, Toilet paper, Toothbrush, TV, Upper floors accessible by lift, Upper floors accessible by stairs, VIP room facilities, Wardrobe or closet, Wine glasses, Ironing service, Shops (on site), Garden, Spa and wellness centre, First-aid kit, Physical distancing in dining areas, Physical distancing rules, Property is cleaned by professional cleaning companies, Process in place to check health of guests, CCTV in common areas, CCTV outside property, Hand sanitiser in guest accommodation and key areas, Use of cleaning chemicals that are effective against coronavirus, Guest accommodation is disinfected between stays, Guest accommodation sealed after cleaning, All plates, cutlery, glasses and other tableware have been sanitised, Guests can opt-out of accommodation cleaning service, Staff follow all safety protocols as directed by local authorities, Child pool, Coffee shop, Safe, Steam room, Express check out, Cable or satellite TV",
                    R.drawable.mvenpick_resort_elsokhna));
            add(new Location("Romance Hotel Ain Sokhna",
                    "\n" +
                            "Complimentary breakfast, Laundry facilities, Room service, Smoke alarms, Outdoor pool, Restaurant, Bar/Lounge, Cable or satellite TV, Air-conditioned, 24-hour front desk, Free parking, Private beach, Storage available, Terrace/Patio, Linens, Towels, Grill, Minibar, Pool bar, Balcony, Breakfast in the room, Bridal suite, Children's television networks, Dining area, Family rooms, Fire extinguisher, Flat-screen TV, Free toiletries, Garden view, Heating, Pool towels, Pool view, Pool with a view, Private bathroom, Private parking, Safety deposit box, Sea view, Seating area, Shampoo, Shared lounge/TV area, Sofa, Telephone, Toilet, Toilet paper, Dustbins, TV, VIP room facilities, Wardrobe or closet, Water slide, Ironing service, Packed lunches, Garden, Beach towels, CCTV in common areas, CCTV outside property, Child pool, No smoking, Coffee shop, Safe",
                  R.drawable.romance_hotel_ain_sokhna  ));
            add(new Location("Stella DI Mare Sea Club Hotel",
            "\n" +
                    "Parking, Disabled access, ATM on-site, Cribs available, Gift shop, Laundry facilities, Room service, Smoke alarms, Outdoor pool, No smoking, Restaurant, Bar/Lounge, Express check out, Hairdryer, Cable or satellite TV, Air-conditioned, 24-hour front desk, Night club, Sauna, Private beach, Storage available, Terrace/Patio, Towels, Fireplace, Lift, Minibar, Allergy-free room, Balcony, Bidet, Bottle of water, Breakfast in the room, Bridal suite, Carpeted, Children's television networks, Cleaning products, Conditioner, Electric kettle, Entire unit located on ground floor, Entire unit wheelchair accessible, Fire extinguisher, Flat-screen TV, Free toiletries, Garden view, Heating, Key card access, Newspapers, Non-feather pillow, Trouser press, Pool towels, Pool view, Private bathroom, Private check-in/check-out, Private entrance, Private parking, Safety deposit box, Seating area, Shampoo, Shared lounge/TV area, Shower, Shower cap, Slippers, Socket near the bed, Sofa, Sofa bed, Soundproof rooms, Tea/coffee maker, Telephone, Toilet, Toilet paper, Toothbrush, Towels/sheets (extra fee), Dustbins, TV, Upper floors accessible by stairs, VIP room facilities, Walk-in shower, Wardrobe or closet, Window, Ironing service, Packed lunches, Shoeshine, Shops (on site), Bathrobe, Garden, Beach towels, First-aid kit, Physical distancing in dining areas, Physical distancing rules, Property is cleaned by professional cleaning companies, Process in place to check health of guests, CCTV in common areas, CCTV outside property, Hand sanitiser in guest accommodation and key areas, Use of cleaning chemicals that are effective against coronavirus, Guest accommodation is disinfected between stays, Guest accommodation sealed after cleaning, All plates, cutlery, glasses and other tableware have been sanitised, Food can be delivered to guest accommodation, Guests can opt-out of accommodation cleaning service, Staff follow all safety protocols as directed by local authorities, Child pool, Coffee shop, Safe, Designated smoking area, Steam room, Grill, Rooftop",
             R.drawable.stella_di_mare_sea_club_hotel       ));
        }
    };
    private static ArrayList<Location> restaurants=new ArrayList<Location>(){
        {
            add(new Location("Fares",
                    "Fares is a High level Restaurant specialized in Seafood and Grill, we are in Suez and Sharm El-Sheikh, we got the most delightful experience in food.",
                    R.drawable.fares   ) );
            add(new Location("McDonald’s",
        "McDonald’s was founded more than 60 years ago. And in 1994, McDonald’s opened its first restaurant in Egypt. Today, over 80,000 customers are served under the Golden Arches at more than 100 stores throughout the country.",
                    R.drawable.mk));
            add(new Location("KFC",
                    "KFC (short for Kentucky Fried Chicken) is an American fast food restaurant chain headquartered in Louisville, Kentucky, that specializes in fried chicken. It is the world's second-largest restaurant chain (as measured by sales) after McDonald's, with 22,621 locations globally in 150 countries as of December 2019",
                    R.drawable.kfc));
        }
    };
    private static ArrayList<Location> cafes=new ArrayList<Location>(){
        {
            add(new Location("Santorini Cafe",
"A comfortable place, a professional staff and a high quality diversity of food and drinks .. food is really delicious, you have to try it yourself to feel the difference.",
                    R.drawable.santorini_cafe   ) );
            add(new Location("PUBG",
" The place is the first thing you enter feel the psychological comfort, the green color around you in all its surface and the sea view in front of you feel your own breath terrible",
                    R.drawable.pubg));
        }
    };
    private static ArrayList<Location> attractions=new ArrayList<Location>(){
        {
            add(new Location("Al Ashi Mosque",
"Al Ashi Mosque is located in the Suez district of Suez city and also named on one of the most famous families in Suez, a family of Ashi and held five prayers and religious lessons and has an association to help the poor and needy and the mosque is air conditioned and also fans",
                    R.drawable.mosque   ) );
            add(new Location("Lusanda Resort",
    "Very good comfortable beach with wonderful Aqua park for kinds.",
                    R.drawable.lusanda));
            add(new Location("Suez Stadium ",
                    "One of the most important stadiums in Egypt. Many important matches are hold on it",
                    R.drawable.staduim));
        }
    };

    public static ArrayList<Location> getHotels() {
        return Hotels;
    }

    public static void setHotels(ArrayList<Location> hotels) {
        Hotels = hotels;
    }

    public static ArrayList<Location> getRestaurants() {
        return restaurants;
    }

    public static void setRestaurants(ArrayList<Location> restaurants) {
        MyLocations.restaurants = restaurants;
    }

    public static ArrayList<Location> getCafes() {
        return cafes;
    }

    public static void setCafes(ArrayList<Location> cafes) {
        MyLocations.cafes = cafes;
    }

    public static ArrayList<Location> getAttractions() {
        return attractions;
    }

    public static void setAttractions(ArrayList<Location> attractions) {
        MyLocations.attractions = attractions;
    }
}
