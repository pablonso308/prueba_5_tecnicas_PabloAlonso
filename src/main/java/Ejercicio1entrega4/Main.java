package Ejercicio1entrega4;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Mi Restaurante");
        restaurante.agregar(new Plato("Hamburguesa"));
        restaurante.agregar(new Plato("Pizza"));

        Restaurante restauranteTemático = new Restaurante("Restaurante Temático");
        restauranteTemático.agregar(new Plato("Sushi"));
        restauranteTemático.agregar(new Plato("Tacos"));

        restaurante.agregar(restauranteTemático);

        restaurante.mostrar();

        Modelo modelo = new Modelo("MiRestaurante");
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.actualizarVista();
    }
}