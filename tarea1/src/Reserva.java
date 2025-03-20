public class Reserva {
    private String fecha;
    private Hotel hotel;
    private Cliente cliente;

    public Reserva(String fecha) {
        this.fecha = fecha;
    }

    public void hacerReserva(Hotel hotel, Cliente cliente) {
        System.out.println("La reserva esta hecha para la fecha: " + fecha);
        System.out.println("En el Hotel: " + hotel);
    }

    public void cancelarReserva(String fecha) {

    }

}
