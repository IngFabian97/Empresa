package com.empresa;

public class Desarrollador extends Empleado {

    
   
    public Desarrollador(String nombre, int edad, double salarioBase, String departamento, String lenguajeProgamacion) {
        super(nombre, edad, salarioBase, departamento);
        this.lenguajeProgamacion = lenguajeProgamacion;
    }

    private String lenguajeProgamacion = null;

    public void programar(){

    }

    @Override
    public void mostrarDetalles(){

    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }
}
