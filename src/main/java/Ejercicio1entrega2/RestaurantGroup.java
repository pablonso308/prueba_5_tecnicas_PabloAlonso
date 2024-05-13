package Ejercicio1entrega2;

import java.util.ArrayList;
import java.util.List;

// Composite
public class RestaurantGroup implements RestaurantComponent {
    private List<RestaurantComponent> restaurants = new ArrayList<>();

    public void addRestaurant(RestaurantComponent restaurant) {
        restaurants.add(restaurant);
    }

    public void removeRestaurant(RestaurantComponent restaurant) {
        restaurants.remove(restaurant);
    }

    @Override
    public void serveCustomers() {
        for (RestaurantComponent restaurant : restaurants) {
            restaurant.serveCustomers();
        }
    }
}
