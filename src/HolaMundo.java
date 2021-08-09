import java.sql.SQLOutput;

public class HolaMundo {
    public static void main(String[] args){

        String saludar = "hola mundo desde java";
        System.out.println();
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10 ;

        boolean valor = true ;
        int numero2 = 5 ;
        if (valor){
            System.out.println("numero = " + numero);
            numero2 = 11 ;
        }
        System.out.println("numero2 = " + numero2);
        var numero3 = "15";

        String nombre ;

        nombre = "andres" ;

        if(numero >10){
            nombre = "juan";
        }

        System.out.println("nombre = " + nombre);

        int edadPersona = 5;
    }
}

