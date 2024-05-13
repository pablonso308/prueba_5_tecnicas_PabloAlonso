package Ejercicio1entrega2;

public class Main {
    public static void main(String[] args) {
        // Crear grupos de restaurantes
        RestaurantComponent restaurantChain = new RestaurantGroup();
        RestaurantComponent downtownGroup = new RestaurantGroup();
        RestaurantComponent uptownGroup = new RestaurantGroup();

        // Crear restaurantes individuales
        RestaurantComponent fastFoodRestaurant = new IndividualRestaurant("Fast Food City Center");
        RestaurantComponent themeRestaurant = new IndividualRestaurant("Theme Park Diner");
        RestaurantComponent fineDiningRestaurant = new IndividualRestaurant("Uptown Fine Dining");

        // Añadir restaurantes a los grupos correspondientes
        ((RestaurantGroup) downtownGroup).addRestaurant(fastFoodRestaurant);
        ((RestaurantGroup) downtownGroup).addRestaurant(themeRestaurant);
        ((RestaurantGroup) uptownGroup).addRestaurant(fineDiningRestaurant);

        // Añadir grupos de restaurantes a la cadena principal
        ((RestaurantGroup) restaurantChain).addRestaurant(downtownGroup);
        ((RestaurantGroup) restaurantChain).addRestaurant(uptownGroup);

        // Demostrar servicio al cliente en todos los restaurantes
        restaurantChain.serveCustomers();

        // Configurar el sistema de reservas con Adapter
        ExternalBookingSystem externalBookingSystem = new ExternalBookingSystem();
        BookingSystem bookingSystem = new BookingAdapter(externalBookingSystem);

        // Realizar una reserva
        bookingSystem.bookTable();

        // Configurar el sistema de notificaciones con Observer
        MenuUpdates menuUpdates = new MenuUpdates();
        Observer customer1 = new Customer("John Doe");
        Observer customer2 = new Customer("Jane Smith");

        // Registrar observadores
        menuUpdates.registerObserver(customer1);
        menuUpdates.registerObserver(customer2);

        // Notificar a los observadores sobre un cambio en el menú
        menuUpdates.notifyObservers("New seasonal menu available!");

        // Eliminar un observador y enviar otra notificación
        menuUpdates.removeObserver(customer2);
        menuUpdates.notifyObservers("Special weekend promotion!");
    }
}
