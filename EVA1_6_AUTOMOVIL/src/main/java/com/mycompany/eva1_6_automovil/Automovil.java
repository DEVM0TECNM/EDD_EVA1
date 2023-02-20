package com.mycompany.eva1_6_automovil;

public class Automovil {
    private String marca;
    private String modelo;
    private String placas;
    private int año;
    private String dueño;
public Automovil (){
marca= "------";
modelo= "------";
placas="-------";
año=0;
dueño="-------";
}
//get y set marca---------------------------------------------------------------
public String getMarca(){
return marca;
}
public void setMarca ( String valorMarca ) {
marca= valorMarca;
}
//get y set modelo--------------------------------------------------------------
public String getModelo(){
return modelo;
}
public void setModelo ( String valorModelo ) {
modelo= valorModelo;
}
//get y set placas--------------------------------------------------------------
public String getPlacas(){
return placas;
}
public void setPlacas ( String valorPlacas ) {
placas= valorPlacas;
}
//Get y set año-----------------------------------------------------------------
public int getAño(){
return año;
}
public void setAño ( int valorAño ) {
año= valorAño;
}
//get y set dueño---------------------------------------------------------------
public String getDueño(){
return dueño;
}
public void setDueño ( String valorDueño ) {
dueño= valorDueño;
}
public void calcularAdeudo(){
 if (año>=2000 && año<=2005){
        System.out.println("su deuda es de $1500");
    }
    else{
    if (año>=2006 && año<=2010){
        System.out.println("su deuda es de $2000");
    }
    }
    if (año>=2011 && año <=2015){
        System.out.println("su deuda es de $3000");
    }
    else{
    if (año>=2016 && año<=2023){
        System.out.println("su deuda es de $4000");
    }
    else{
        System.out.println("Año de auto inaceptable");
    }   
}
}
}
