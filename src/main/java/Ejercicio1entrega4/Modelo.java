package Ejercicio1entrega4;

// Modelo
class Modelo {
    private String nombre;

    public Modelo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Vista
class Vista {
    public void mostrarNombre(String nombre) {
        System.out.println("Nombre: " + nombre);
    }
}

// Controlador
class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void actualizarVista() {
        vista.mostrarNombre(modelo.getNombre());
    }
}


