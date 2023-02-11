/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_2_clasesjava;

/**
 *
 * @author Usuario
 */
public class persona {
    // Atributos de la clase
    private String nombre;
    private String apellido;
    private int edad;
    private boolean estadoCivil;
    //Get y Set nombre
    public String getNombre(){
        return nombre; 
    }
    public void setNombre (String valor){
       nombre= valor;
    }
    //Get y Set apellido
    public String getApellido(){
        return apellido;
    }
   public void setApellido (String valor){
       apellido= valor;
   }
   //Get y Set edad
   public int getEdad (){
       return edad;
   }
   public void setEdad (int valor){
       edad= valor;
   }
   //Get y Set estadoCivil
   public boolean getEstadoCivil(){
       return estadoCivil;
   }        
   public void setEstadoCivil(Boolean valor){
       estadoCivil=valor;
               
   }
   public void imprimirDatos(){
         System.out.println("Datos almacenados: ");
       System.out.println("Nombre completo: " + nombre + " " + apellido);
       System.out.println("Edad: " + edad );
       if (estadoCivil)
           System.out.println("Estado civil: casado");
       else
           System.out.println("Estado civil: soltero");
   }
}
