public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50" ;

        int numero = Integer.parseInt(numeroStr) ;
        System.out.println("numero = " + numero) ;

        String realStr = "9876543" ;
        double realDouble = Double.parseDouble(realStr) ;
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "False" ;
        boolean logicoBoolean =  Boolean.parseBoolean(logicoStr) ;
        System.out.println("logicoBoolean = " + logicoBoolean);


        int otroNumeroInt = 100 ;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt) ;
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10) ;
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 123.456 ;
        String otroRealstr = Double.toString(otroRealDouble);
        System.out.println("otroRealstr = " + otroRealstr);

        otroNumeroStr = String.valueOf(1.23456f) ;
        System.out.println("otroRealstr = " + otroRealstr);

    }
}
