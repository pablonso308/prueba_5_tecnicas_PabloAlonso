package Ejercicio1entrega1;

public  class FastFoodRestaurant implements Restaurant {
    @Override
    public void serveCustomers() {
        System.out.println("Serving fast food quickly.");
    }

    @Override
    public void setServiceStrategy(ThemedServiceStrategy themedServiceStrategy) {

    }
}