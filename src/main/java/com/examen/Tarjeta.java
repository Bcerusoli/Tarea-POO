package com.examen;

public class Tarjeta extends Pago {
    @Override
    public double calcularComision(double precio) {
        return precio * 0.025; 
    }
}
