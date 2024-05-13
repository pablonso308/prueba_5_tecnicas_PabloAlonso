package Ejercicio1entrega2;

// Adapter
public class BookingAdapter implements BookingSystem {
    private ExternalBookingSystem externalSystem;

    public BookingAdapter(ExternalBookingSystem externalSystem) {
        this.externalSystem = externalSystem;
    }

    @Override
    public void bookTable() {
        externalSystem.makeReservation();
    }
}
