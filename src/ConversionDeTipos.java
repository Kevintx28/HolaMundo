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
    }
}
