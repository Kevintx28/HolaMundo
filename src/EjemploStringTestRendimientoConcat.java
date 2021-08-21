public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String curso = "Programacion Java" ;
        String profesor = "Andres Guzman" ;

        String a = "a" ;
        String b = "b" ;
        String c = a ;

        StringBuilder sb = new StringBuilder(a) ;

        long inicio = System.currentTimeMillis() ;

            for(int i = 0 ; i < 100000 ; i ++ ){
                //c = c.concat(a).concat(b).concat("\n") ; // 500 -> 2ms, 1000 -> 4ms, 10000 -> 6ms, 100000 -> 6.725ms
                c += a + b +"\n" ; //500 -> 19, 1000 -> 14ms, 10000 -> 74ms,100000 -> 2.277.ms
                //sb.append(a).append(b).append("\n") ; //500 -> 0ms, 100 -> 0ms, 10000 -> 2ms,100000 -> 8ms

        }
        long fin = System.currentTimeMillis() ;
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());



    }
}
