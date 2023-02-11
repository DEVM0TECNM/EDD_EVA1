/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_2_clasesjava;

public class EVA1_2_CLASESJAVA {

    public static void main(String[] args) {
        
        persona perso1 = new persona();
        /*:
        perso1.nombre = "Diego";
        perso1.apellido = "Vazquez";
        perso1.edad = 18;
        perso1.estadoCivil = true; //true es casado
        
        System.out.println(perso1.nombre);
        */
        perso1.setNombre("Diego Enrique");
        perso1.setApellido("Vazquez Montañez");
        perso1.setEdad(18);
        perso1.setEstadoCivil(false);
        /*
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getEstadoCivil());
        */
       perso1.imprimirDatos();
       
       persona perso2 = new persona();
       
       perso2.setNombre("jesus");
       perso2.setApellido("Octavio");
       perso2.setEdad(49);
       perso2.setEstadoCivil(true);
       
       perso2.imprimirDatos();
    }
    
}
