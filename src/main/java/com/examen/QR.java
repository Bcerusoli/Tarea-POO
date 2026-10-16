package com.examen;

public class QR extends Pago {
    @Override
    public double calcularComision(double precio) {
        return precio * 0.02; 
    }
}
