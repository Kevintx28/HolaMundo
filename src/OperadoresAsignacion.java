public class OperadoresAsignacion {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------");

        int i = 5 ;
        int j = i + 4 ;

        System.out.println("----------------------------------------------");

        System.out.println("i = " + j);
        System.out.println("j = " + j);

        System.out.println("----------------------------------------------");

        i += 2 ; // i = i + 2
        System.out.println("i = " + i);

        System.out.println("----------------------------------------------");

        i += 5 ; // i = i + 5
        System.out.println("i = " + i);

        System.out.println("----------------------------------------------");

        j += 4 ; // j = j - 4
        System.out.println("j = " + j);

        i *= 3 ; // j = j * 3
        System.out.println("j = " + j);

        System.out.println("----------------------------------------------");

        String sqlString = "selec * from clientes ass c" ;
        sqlString += "where c.nombre = 'Andres' " ;
        sqlString += " and c.activo" ;
        System.out.println("sqlString = " + sqlString);

        System.out.println("----------------------------------------------");




    }
}
