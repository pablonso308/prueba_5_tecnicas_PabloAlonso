package Ejercicio1entrega3;

// Mediator Interface
public interface Mediator {
    void bookTable();
    void orderFood();
    void cancelBooking();
}

// Concrete Mediator
class RestaurantMediator implements Mediator {
    private Kitchen kitchen;
    private CustomerService customerService;
    private DeliveryService deliveryService;

    public RestaurantMediator(Kitchen kitchen, CustomerService customerService, DeliveryService deliveryService) {
        this.kitchen = kitchen;
        this.customerService = customerService;
        this.deliveryService = deliveryService;
    }

    @Override
    public void bookTable() {
        customerService.takeReservation();
    }

    @Override
    public void orderFood() {
        kitchen.prepareOrder();
        deliveryService.handleDelivery();
    }

    @Override
    public void cancelBooking() {
        customerService.cancelReservation();
    }
}
