package Ejercicio1entrega1;

public class ThemeRestaurant implements Restaurant {
    public void serveCustomers() {
        System.out.println("Providing a themed dining experience.");
    }

    @Override
    public void setServiceStrategy(ThemedServiceStrategy themedServiceStrategy) {

    }
}
