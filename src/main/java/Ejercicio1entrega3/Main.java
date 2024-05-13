package Ejercicio1entrega3;


public class Main {
    static void main(String[] args) {
        Restaurant restaurant = new Restaurant(); // Implement commands here
        Command book = new BookTableCommand(restaurant);
        Command order = new OrderFoodCommand(restaurant);
        Command cancel = new CancelReservationCommand(restaurant);

        // Command execution
        book.execute();
        order.execute();
        cancel.execute();

        // Mediator setup
        Kitchen kitchen = new Kitchen();
        CustomerService customerService = new CustomerService();
        DeliveryService deliveryService = new DeliveryService();
        Mediator mediator = new RestaurantMediator(kitchen, customerService, deliveryService);

        // Mediator usage
        mediator.bookTable();
        mediator.orderFood();
        mediator.cancelBooking();

        // State management
        Table table1 = new Table(101);
        table1.setState(new ReservedState());
        table1.setState(new OccupiedState());
        table1.setState(new FreeState());
    }
}
