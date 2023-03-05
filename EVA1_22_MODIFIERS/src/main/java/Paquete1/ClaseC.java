package Paquete1;

import Paquete2.claseE;

public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        ClaseA objA = new ClaseA();
        /*objA.publicA atributs visibles
          objA.defaultA*/
        claseB objB = new claseB();
        /*objB.publicB atributs visibles
          objB.defaultB*/
        claseD objD = new claseD();
        /*objD.publicD atributs visibles
          objD.defaultD*/
        claseB objE = new claseE();
        /*objE.publicE atributs visibles
          objE.defaultE*/
        claseF objF = new claseF();
        /*objF.publicF atributs visibles
          objF.defaultF*/
    }
}
 class claseD{
    public int publicD;
    int defaultD;
    private int privateD;
 }