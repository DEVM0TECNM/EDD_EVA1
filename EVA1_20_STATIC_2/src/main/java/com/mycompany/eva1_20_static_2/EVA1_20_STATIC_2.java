package com.mycompany.eva1_20_static_2;

public class EVA1_20_STATIC_2 {

    public static void main(String[] args) {
        final int x;
        x=100;
        
        FormulaGeometria formulas = new FormulaGeometria();
        //no existe ningun metodo dentro del objeto
        System.out.println("PI: "+FormulaGeometria.PI);
        System.out.println("Area triangulo: "+FormulaGeometria.areaTriangulo(5.0, 5.0));
        System.out.println("Volumen esfera: "+FormulaGeometria.volumenEsfera(10.0));
    }
}
