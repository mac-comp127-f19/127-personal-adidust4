package activityStarterCode.maps;


import java.util.HashMap;

public class RestaurantExplorer {
    public static void main(String [] args) {
        // Step 1. Create a new empty HashMap.
        HashMap restaurantMap = new HashMap<String, Restaurant>();
        // The keys should be the names of the restaurant.
        // The values should be the restaurant objects.

        // Step 2. Add five restaurants to the map (hint: use put()).
        restaurantMap.put("Sandbar", new Restaurant("Sandbar","bar food", 5));
        restaurantMap.put("High Rock", new Restaurant("High Rock","new american", 3));
        restaurantMap.put("Macs", new Restaurant("Macs","mac and cheese", 1));
        restaurantMap.put("Pho-Q", new Restaurant("Pho-Q","vietnamese", 5));
        restaurantMap.put("Culver's", new Restaurant("Culver's","fast food", 4));

        // Step 3. Print the names of each restaurant (hint: use keySet()).
                System.out.println(restaurantMap.keySet());
        // Step 4. Remove one of the restaurants by name. Check to make sure
        // it no longer exists and print out the result (hint: use containsKey()).
        restaurantMap.remove("Macs");
        System.out.println("Contains Macs: " + restaurantMap.containsKey("Macs"));
        // Step 5. Print the restaurant objects (hint: use values())
        System.out.println(restaurantMap.values().toString());
        // Step 6. Print the restaurant names and objects (hint: use entrySet()).

        System.out.println(restaurantMap.entrySet());
    }
}
