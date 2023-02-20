package com.mycompany.eva1_6_automovil;

public class EVA1_6_AUTOMOVIL {

    public static void main(String[] args) {
        Automovil  auto = new Automovil();
            auto.setDueño("Jesus Octavio");
            auto.setMarca("B.M.W");
            auto.setModelo("U89R65MR71GA765Y");
            auto.setAño(2015);
            auto.setPlacas("4M0N6U2");
            
            System.out.println("Nombre del dueño: "+auto.getDueño());
        System.out.println("Marca del auto: "+auto.getMarca());
        System.out.println("Modelo del auto: "+auto.getModelo());
        System.out.println("Año del auto: "+auto.getAño());
        System.out.println("Placas del auto: "+auto.getPlacas());
        System.out.println(" ");        
        auto.calcularAdeudo();
    }
}
