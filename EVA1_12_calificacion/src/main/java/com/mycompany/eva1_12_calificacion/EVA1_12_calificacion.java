package com.mycompany.eva1_12_calificacion;

public class EVA1_12_calificacion {
/*91-->100 A
 81--->90 B
71---> 80 C
menos a 70 D
    Recibe la calificacion numerica entera regresa la calificacion como letra */    
    public static void main(String[] args) {
   String cali;
   cali = calificacion(92);
        System.out.println("calificacion: "+cali);
    }
    
    public static String calificacion (int calif){
    if (calif>=91 && calif<=100){
     return "A";   
     }
    else if(calif>=81 && calif<=90){
            return "B";
        }
    else if((calif>=71 && calif<=80)){
            return "C";
        }
    else
        return "D";        
}
}
