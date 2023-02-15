package com.mycompany.eva1_4_tv;

public class Tv {
//Variables    
private int volumen;
private int canal;
private boolean poder;
//Constructores
public Tv(){//Constructor default
    volumen=0;
    canal=99;
    poder=false;//Falso= apagado, True= prendido
}
//Metodos para operar la TV (Interfaz)
   //Encender y apagar la tele
public void CambiarEstadoEnergia(){
    if(poder==true){
        poder=false;
    System.out.println("Apagando pantalla");
    }else{
        poder=true;
        System.out.println("Encendiendo pantalla");
    }
}
//Volumen
public void SubirVolumen(){
    if (poder == true){
        if(volumen < 100){
volumen = volumen +1;//Acumulador
//Opcionalmente Volumen++,Volumen+=1
System.out.println("Volumen: "+volumen);
        }
    }
}
public void BajarVolumen(){
    if (poder == true){
        if(volumen > 0 ){
    volumen = volumen -1;
    System.out.println("Volumen: "+volumen);
        }
    }
}
public void cambiarCanalAdelante(){
    if (poder == true){
        if (canal >=100){
        canal=0;
        }
        else
            canal = canal +1;
        System.out.println("Canal: "+canal);
    }
}
public void cambiarCanalAtras(){
    if(poder == true){
        if (canal<=0){
            canal=100;
        }
        else
            canal=canal-1;
        System.out.println("Canal: "+canal);
    }
}
}
