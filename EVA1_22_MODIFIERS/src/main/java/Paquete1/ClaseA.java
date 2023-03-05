package Paquete1;

import Paquete2.claseE;

public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        claseB objB = new claseB();
        /*objB.publicB atributs visibles
          objB.defaultA*/
        ClaseC objC = new ClaseC();
        /*objC.publicC
          objC.defaultC*/
        //Clase D es default en otro archivo pero mismo paquete
        claseD objD = new claseD();
        //objD.publicD
        //objD.publicA
        // hay que agregar la clausula import
        claseE objE = new claseE();
        //objE.publicE
        // solo es visible el atributo publico
        
        //claseF objF = new claseF();
        //clase f es default y es no vissible para las clases de este paquete        
    }
}

class claseB{
     public int publicB;
    int defaultB;
    private int privateB;
}
