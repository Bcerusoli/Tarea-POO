package com.examen;

public class Efectivo extends Pago {
    @Override
    public double calcularComision(double precio) {
        return 0; 
    }
}
