package com.examen;

public class Venta {
    private Producto producto;
    private int cantidad;
    private Pago tipoPago;

    public Venta(Producto producto, int cantidad, Pago tipoPago) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.tipoPago = tipoPago;
    }

    // Ganancia = n × (Precio de venta − Precio de costo − Comisión por unidad)
    public double calcularGanancia() {
        double comisionPorUnidad = tipoPago.calcularComision(producto.getPrecioVenta());
        return cantidad * (producto.getPrecioVenta() - producto.getPrecioCosto() - comisionPorUnidad);
    }
}
