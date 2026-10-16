package com.examen;

public class Producto {
    private double precioCosto;
    private double precioVenta;

    public Producto(double precioCosto, double precioVenta) {
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }
}
