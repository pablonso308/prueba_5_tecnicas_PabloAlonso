package Ejercicio1entrega1;

public class FineDiningServiceStrategy extends ThemedServiceStrategy implements ServiceStrategy {
    @Override
    public void serve() {
        System.out.println("Exquisite service with attention to detail.");
    }
}