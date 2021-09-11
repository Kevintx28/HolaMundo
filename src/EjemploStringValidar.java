public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null ;

        boolean esNulo = curso == null ;

        System.out.println("esNulo = " + esNulo);

        if(esNulo) {
           curso = "Programacion Java" ;
        }
        boolean esVacio = curso.length() == 0 ;

        System.out.println("------------------------------------------------------------");

        System.out.println("esVacio = " + esVacio);

        System.out.println("------------------------------------------------------------");

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        System.out.println("------------------------------------------------------------");

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        System.out.println("------------------------------------------------------------");

        if( esBlanco == false) {
        System.out.println("curso = " + curso.toUpperCase());
        System.out.println("Bienvenido al curso".concat(curso));

        System.out.println("------------------------------------------------------------");

        }
    }
}
