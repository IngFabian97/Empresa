package com.empresa;

public class Gerente extends Empleado{
    private double bono = 0;

    public Gerente(String nombre, int edad, double salarioBase, String departamento, double bono) {
        super(nombre, edad, salarioBase, departamento);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        // Implement the method logic here
        return getSalarioBase() + getBono();
    }

    @Override
    public void mostrarDetalles(){

    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }


    
}
