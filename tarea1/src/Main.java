//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*En la encasulacion
* En la separacion de responsabilidades, la*/

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Trivago");
        Cliente cliente = new Cliente("Jose", "1234-5678-9012-3456");

        Reserva reserva = new Reserva("01-01-2000");
        reserva.hacerReserva(hotel, cliente);

        hotel.hacerPago(cliente.getTajetaCredito());
    }
}