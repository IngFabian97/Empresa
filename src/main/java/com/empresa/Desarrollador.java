package com.empresa;

public class Desarrollador extends Empleado {

    
   
    public Desarrollador(String nombre, int edad, double salarioBase, String departamento, String lenguajeProgamacion) {
        super(nombre, edad, salarioBase, departamento);
        this.lenguajeProgamacion = lenguajeProgamacion;
    }

    private String lenguajeProgamacion = null;

    public void programar(){
        System.out.println(getNombre() + " esta programando " + getLenguajeProgamacion());
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Lenguaje: " + getLenguajeProgamacion() + "Desarrollador" );
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }

    public String getLenguajeProgamacion() {
        return lenguajeProgamacion;
    }

    public void setLenguajeProgamacion(String lenguajeProgamacion) {
        this.lenguajeProgamacion = lenguajeProgamacion;
    }

    
}
