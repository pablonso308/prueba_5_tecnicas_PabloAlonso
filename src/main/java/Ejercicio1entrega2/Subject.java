package Ejercicio1entrega2;

import java.util.ArrayList;
import java.util.List;


public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}

