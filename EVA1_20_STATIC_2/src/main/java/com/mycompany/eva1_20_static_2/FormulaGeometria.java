package com.mycompany.eva1_20_static_2;

public class FormulaGeometria {
//Final--> Solo se le puede agregar un valor una sola vez
    //CONSTANTES
    public static final double PI=3.141659;
    
    //AREAS
public static double areaTriangulo(Double base,Double altura){
    return (base*altura)/2.0;
}    
public static double areaCirculo(Double radio){
    return PI*radio*radio;
}
    //PERIMETRO
public static double perimetroCirculo(double radio){
    return PI*(radio*2);
}
   //VOLUMEN ESFERA
public static double volumenEsfera(Double radio){
    return (4.0/3.0)*PI*(radio*radio*radio);
}
}
