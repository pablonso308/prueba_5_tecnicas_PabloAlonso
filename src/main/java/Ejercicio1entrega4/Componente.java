package Ejercicio1entrega4;
import java.util.ArrayList;
import java.util.List;

// Component
interface Componente {
    void mostrar();
}

// Composite
class Restaurante implements Componente {
    private String nombre;
    private List<Componente> componentes = new ArrayList<>();

    public Restaurante(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Componente componente) {
        componentes.add(componente);
    }

    public void mostrar() {
        System.out.println("Restaurante: " + nombre);
        for (Componente componente : componentes) {
            componente.mostrar();
        }
    }
}

// Leaf
class Plato implements Componente {
    private String nombre;

    public Plato(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println(" - Plato: " + nombre);
    }
}

// Client


