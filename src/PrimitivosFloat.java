import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class PrimitivosFloat {

    static float varFlotante = 45.45f ;

    public static void main(String[] args) {
        
        float realFloat = 1.5e-10f ;  //15000f ;
        System.out.println("realFloat = " + realFloat);

        System.out.println("float Corresponde en byte a = " + Float.BYTES);       System.out.println("float Corresponde en bites a = " + Float.SIZE);
        System.out.println("maximo valor para float = " + Float. MAX_VALUE);
        System.out.println("minimo valor para float = " + Float. MIN_VALUE);

        System.out.println("-----------------------------------------------------------------------");

        double realDouble = 3.4028235E38 ;
        System.out.println("realDouble = " + realDouble);

        System.out.println("double Corresponde en byte a = " + Double.BYTES);
        System.out.println("double Corresponde en bites a = " + Double.SIZE);
        System.out.println("maximo valor para double = " + Double. MAX_VALUE);
        System.out.println("minimo valor para double = " + Double. MIN_VALUE);

        System.out.println("-------------------------------------------------------------------------");

        //float varFlotante ;
        System.out.println("varFlotante = " + varFlotante);

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("A");
        lista.add("B");
        lista.add("C");





        HashMap<Integer, String> otraLista = new HashMap<Integer, String>();

        otraLista.put(2, "Una vida por otra");

        System.out.println("->>>>"+lista.get(2)+ " : " + otraLista.get(2));

        System.out.println("----------------------------------------------------------------");
    }
}
