package com.examen;

public class Main {
    public static void main(String[] args) {
        
        Pago tarjeta = new Tarjeta();
        Pago qr = new QR();
        Pago efectivo = new Efectivo();

        Producto productoCamisa = new Producto(50, 100);
        Producto productoPolera = new Producto(35, 60);
        Producto productoZapato = new Producto(30, 40);

        Venta ventaCamisa = new Venta(productoCamisa, 2, qr);
        Venta ventaPolera = new Venta(productoPolera, 1, efectivo);
        Venta ventaZapato = new Venta(productoZapato, 1, tarjeta);

        double gananciaCamisa = ventaCamisa.calcularGanancia();
        double gananciaPolera = ventaPolera.calcularGanancia();
        double gananciaZapato = ventaZapato.calcularGanancia();

        System.out.println("Ganancia Camisa: " + gananciaCamisa);
        System.out.println("Ganancia Polera: " + gananciaPolera);
        System.out.println("Ganancia Zapato: " + gananciaZapato);

        double gananciaTotal = gananciaCamisa + gananciaPolera + gananciaZapato;
        System.out.println("Ganancia Total: " + gananciaTotal);
    }
}
