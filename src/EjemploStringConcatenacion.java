public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java" ;
        String profesor = "Andres Guzman" ;

        System.out.println("-----------------------------------------------");

        String detalle = curso + "com el instructor " + profesor ;
        System.out.println(detalle);

        int numeroA = 10 ;
        int numeroB = 5 ;
        System.out.println(detalle + (numeroA + numeroB)) ;
        System.out.println( numeroA + numeroB + detalle);

        System.out.println("---------------------------------------------");

        String detalle2 = curso.concat(" ".concat(profesor)) ;
        System.out.println("detalle2 = " + detalle2);

        System.out.println("---------------------------------------------------------------");
    }
}
