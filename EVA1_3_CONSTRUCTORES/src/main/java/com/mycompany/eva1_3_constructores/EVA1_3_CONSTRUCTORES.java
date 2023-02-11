package com.mycompany.eva1_3_constructores;
// Alumno: Diego enrique vazquez montañez
// Materia: Programacion orientada a objetos
// Docente : Ruben alonso Hernandez Chavez
public class EVA1_3_CONSTRUCTORES {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        
        cuenta1.setNomCliente("Jesus Octavio");
        cuenta1.setSaldo(400000);
        cuenta1.setNumeroCuenta("1");
        
        System.out.println("datos del cliente: ");
        String nombre = cuenta1.getNomCliente();
        System.out.println(nombre);
        System.out.println(cuenta1.getNumeroCuenta());
        System.out.println(cuenta1.getSaldo());
        //----------------------------------------------------------------------
        System.out.println(" ");
        CuentaBancaria cuenta2 = new CuentaBancaria();
        
        cuenta2.setNomCliente("Andres Manuel");
        cuenta2.setSaldo(10000000);
        cuenta2.setNumeroCuenta("2");
        
        System.out.println("Datos del cliente: ");
        System.out.println(cuenta2.getNomCliente());
        System.out.println(cuenta2.getNumeroCuenta());
        System.out.println(cuenta2.getSaldo());
        //----------------------------------------------------------------------
        System.out.println(" ");
        CuentaBancaria cuenta3 = new CuentaBancaria();
        
        cuenta3.setNomCliente("Juan Mario");
        cuenta3.setSaldo(3);
        cuenta3.setNumeroCuenta("3");
        
        System.out.println("Datos del cliente: ");
        System.out.println(cuenta3.getNomCliente());
        System.out.println(cuenta3.getNumeroCuenta());
        System.out.println(cuenta3.getSaldo()); 
    }
}
