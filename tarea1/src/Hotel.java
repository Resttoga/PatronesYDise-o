class Hotel {
    public void hacerReserva(Cliente cliente) {
        System.out.println("Reserva realizada para" + cliente.getNombre());
    }

    public void hacerPago(String tarjetaCredito) {
        System.out.println("Procesando pago con la tarjeta" + tarjetaCredito);
    }
}