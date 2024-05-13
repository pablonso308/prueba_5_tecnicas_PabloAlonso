package Ejercicio1entrega3;

// Command Interface
public interface Command{
    void execute();
}

// Concrete Commands
class BookTableCommand implements Command {
    private Restaurant restaurant;

    public BookTableCommand(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void execute() {
        restaurant.bookTable();
    }
}

class OrderFoodCommand implements Command {
    private Restaurant restaurant;

    public OrderFoodCommand(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void execute() {
        restaurant.orderFood();
    }
}

class CancelReservationCommand implements Command {
    private Restaurant restaurant;

    public CancelReservationCommand(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void execute() {
        restaurant.cancelReservation();
    }
}
