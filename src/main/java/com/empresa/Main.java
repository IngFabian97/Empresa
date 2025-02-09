package com.empresa;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Gerente("Fabian", 28, 4000, "Ingenieria", 1000000);
        emp1.mostrarDetalles();

        System.out.println(" ");
        Empleado emp2 = new Desarrollador("Juan", 30, 3000000, "Desarrollo", "Java");
        emp2.mostrarDetalles();

        System.out.println(" ");

        if(emp2 instanceof Desarrollador){
            ((Desarrollador) emp2).programar();
        }
    }
}