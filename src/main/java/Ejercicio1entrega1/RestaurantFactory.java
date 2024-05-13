package Ejercicio1entrega1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class RestaurantFactory {
    private static Map<String, Supplier<Restaurant>> registeredRestaurants = new HashMap<>();

    static {
        register("fast", FastFoodRestaurant::new);
        register("theme", ThemeRestaurant::new);
        register("luxury", LuxuryRestaurant::new);
    }

    public static void register(String type, Supplier<Restaurant> constructor) {
        registeredRestaurants.put(type, constructor);
    }

    public static Restaurant getRestaurant(String type) {
        Supplier<Restaurant> restaurant = registeredRestaurants.get(type);
        if (restaurant != null) {
            return restaurant.get();
        }
        throw new IllegalArgumentException("Unknown restaurant type: " + type);
    }
}
