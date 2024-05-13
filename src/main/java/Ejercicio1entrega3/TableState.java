package Ejercicio1entrega3;

// State Interface
public interface TableState {
    void handle(Table table);
}

// Concrete States
class FreeState implements TableState {
    @Override
    public void handle(Table table) {
        System.out.println("Table " + table.getNumber() + " is free.");
    }
}

class ReservedState implements TableState {
    @Override
    public void handle(Table table) {
        System.out.println("Table " + table.getNumber() + " is reserved.");
    }
}

class OccupiedState implements TableState {
    @Override
    public void handle(Table table) {
        System.out.println("Table " + table.getNumber() + " is occupied.");
    }
}

class Table {
    private int number;
    private TableState state;

    public Table(int number) {
        this.number = number;
        this.state = new FreeState();  // default state
    }

    public void setState(TableState state) {
        this.state = state;
        this.state.handle(this);
    }

    public int getNumber() {
        return number;
    }
}
