public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String curso = "Programacion Java" ;
        String profesor = "Andres Guzman" ;

        String a = "a" ;
        String b = "b" ;
        String c = a ;

        StringBuilder sb = new StringBuilder(a) ;

        long inicio = System.currentTimeMillis() ;

            for(int i = 0 ; i < 500 ; i ++ ){
                // c = c.concat(a).concat(b).concat("\n") ; "" 500 -> 2ms
                // c += a + b +"\n" ; 500 -> 19
        }
        long fin = System.currentTimeMillis() ;
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
    }
}
