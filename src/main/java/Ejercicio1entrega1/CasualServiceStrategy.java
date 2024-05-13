package Ejercicio1entrega1;

// Estrategias concretas
public class CasualServiceStrategy implements ServiceStrategy {
    @Override
    public void serve() {
        System.out.println("Casual service for fast food.");
    }
}
