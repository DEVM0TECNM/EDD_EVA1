package com.mycompany.eva1_14_alcance2;

public class EVA1_14_ALCANCE2 {

    public static void main(String[] args) {
        int x = 100; // visible dentro de todo el bloque main
        for (int i = 0; i < 10; i++) {
            int x = 100; // ya leida en el main y es visibe dentro del for
            int y = 100;
            if( i == 5){
                
            }
        }
        int y = 100;// fuera del bloque for es posible declarar una variable 
                    // con letra semejante
    }
}
