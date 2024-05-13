package Ejercicio1entrega1;

public class FineDiningServiceStrategy implements ServiceStrategy {
    @Override
    public void serve() {
        System.out.println("Exquisite service with attention to detail.");
    }
}
