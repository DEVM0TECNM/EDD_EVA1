package com.mycompany.eva1_8_llamadafuncion;

public class EVA1_8_LlamadaFuncion {

    public static void main(String[] args) {
        System.out.println("Inicia main()");
        A();
        System.out.println("Termina main()");
    }
    public static void A(){
        System.out.println("Inicia A()");
        B();
        System.out.println("Termina A()");
    }
    public static void B(){
        System.out.println("Inicia B()");
        System.out.println("Termina B()");
    }
}
