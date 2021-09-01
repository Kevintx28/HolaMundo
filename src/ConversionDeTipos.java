public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50" ;

        int numero = Integer.parseInt(numeroStr) ;
        System.out.println("numero = " + numero) ;

        System.out.println("-----------------------------------------------------");

        System.out.println("-----------------------------------------------------");

        String realStr = "9876543" ;
        double realDouble = Double.parseDouble(realStr) ;
        System.out.println("realDouble = " + realDouble);

        System.out.println("------------------------------------------------------");

        System.out.println("-----------------------------------------------------");

        String logicoStr = "False" ;
        boolean logicoBoolean =  Boolean.parseBoolean(logicoStr) ;
        System.out.println("logicoBoolean = " + logicoBoolean);

        System.out.println("-------------------------------------------------------");

        System.out.println("-----------------------------------------------------");

        int otroNumeroInt = 100 ;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt) ;
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10) ;
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        System.out.println("---------------------------------------------------------");

        System.out.println("-----------------------------------------------------");

        double otroRealDouble = 123.456 ;
        String otroRealstr = Double.toString(otroRealDouble);
        System.out.println("otroRealstr = " + otroRealstr);

        System.out.println("-----------------------------------------------------------");

        System.out.println("-----------------------------------------------------");

        otroNumeroStr = String.valueOf(1.23456f) ;
        System.out.println("otroRealstr = " + otroRealstr);

        System.out.println("------------------------------------------------------------");

        System.out.println("-----------------------------------------------------");

        int i = 22767 ;
        short s = (short) i ;
        System.out.println("s = " + s);
        long l = i ;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);

        System.out.println("--------------------------------------------------------------");

        char b = (char) i ;
        System.out.println("b = " + b);
        float f = (float) i ;
        System.out.println("f = " + f);

        System.out.println("----------------------------------------------------------------");

        System.out.println("-----------------------------------------------------");
    }
}
