package com.mycompany.eva1_19_static;
//Diego Enrique Vazquez
public class EVA1_19_STATIC {

    public static void main(String[] args) {
        //Static es algo que podemos usar sin crear instancias de una clase
        //
        System.out.println("Pi: " + Math.PI);
        System.out.println("Numero aleatorio: " + Math.random());
        Utilerias utileria = new Utilerias();
        Utilerias.OtroSaludo();
      Saludo2();//SI NO ES ESTATICO Y NO SE HA CREADO UN OBJETO, EL METODO NO
                //EXISTE
    }
    public void Saludo2(){
        System.out.println("Hola");
}
}

class Utilerias{
    // Saludo(){ ESTE METODO EXISTE HASTA QUE SE CREA UN OBJETO DE LA CLASE.
    //SOLO SE USA A TRAVEZ DE UN OBJETO.
    public void Saludo(){
            System.out.println("Hola");
}
    //ESTE METODO EXITE EN EL MOMENTO EN EL QUE EL PROGRAMA INICA
    //SU EJECUCION. NO NECESITA QUE SE CREE UNA CLASE DEL OBJETO PARA 
    //PODER UTILIZAR. SE USA A TRAVEZ DE LA CLASE.
    public static void OtroSaludo(){
            System.out.println("Otro saludo (static)");
    }
    
}

class OtraClase{
    
}