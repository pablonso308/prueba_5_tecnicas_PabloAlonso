package Ejercicio1entrega2;

// Hoja
public class IndividualRestaurant implements RestaurantComponent {
    private String name;

    public IndividualRestaurant(String name) {
        this.name = name;
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving customers at " + name);
    }
}
