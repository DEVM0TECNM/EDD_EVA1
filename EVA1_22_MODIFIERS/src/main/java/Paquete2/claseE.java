package Paquete2;

import Paquete1.ClaseA;
import Paquete1.ClaseC;

public class claseE {
     public int publicE;
    int defaultE;
    private int privateE;
    public void prueba(){
        ClaseA objA = new ClaseA();
       //objA.publicA
       claseB objB = new claseB();
       //no visible
       ClaseC objC = new ClaseC();
       //objC.publicC
       claseD objD = new claseD();
       //no visible
       
    }
}
class claseF{
     public int publicF;
    int defaultF;
    private int privateF;
}
