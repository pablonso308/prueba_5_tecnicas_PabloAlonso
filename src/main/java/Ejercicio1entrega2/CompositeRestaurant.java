package Ejercicio1entrega2;

import java.util.ArrayList;
import java.util.List;

public class CompositeRestaurant implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public void displayInfo() {
        for (Component child : children) {
            child.displayInfo();
        }
    }
}
