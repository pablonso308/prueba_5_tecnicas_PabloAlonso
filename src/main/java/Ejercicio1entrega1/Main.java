package Ejercicio1entrega1;

public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única del RestaurantManager
        RestaurantManager manager = RestaurantManager.getInstance();

        // Crear diferentes tipos de restaurantes
        Restaurant fastFood = manager.createRestaurant("fastfood");
        Restaurant theme = manager.createRestaurant("theme");
        Restaurant fineDining = manager.createRestaurant("finedining");

        // Configurar estrategias de servicio para cada tipo de restaurante
        fastFood.setServiceStrategy(new CasualServiceStrategy());
        theme.setServiceStrategy(new ThemedServiceStrategy());
        fineDining.setServiceStrategy(new FineDiningServiceStrategy());

        // Servir clientes en cada tipo de restaurante
        System.out.println("Fast Food Restaurant:");
        fastFood.serveCustomers();
        System.out.println("Theme Restaurant:");
        theme.serveCustomers();
        System.out.println("Fine Dining Restaurant:");
        fineDining.serveCustomers();
    }
}
