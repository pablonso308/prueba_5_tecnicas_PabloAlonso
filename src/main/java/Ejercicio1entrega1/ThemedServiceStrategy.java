package Ejercicio1entrega1;

public class ThemedServiceStrategy implements ServiceStrategy {
    @Override
    public void serve() {
        System.out.println("Thematic service with special decorations.");
    }
}
