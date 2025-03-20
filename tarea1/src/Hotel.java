class Hotel {
    String name;

    public Hotel(String name) {
        this.name = name;
    }

    public void hacerPago(String tarjetaCredito) {
        System.out.println("Procesando pago con la tarjeta" + tarjetaCredito);
    }
}