import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4;

        System.out.println("-------------------------------------------------------------------------------------------");

        int suma = i + j;

        System.out.println("suma = " + (i + j)) ;
        System.out.println("(i + j) = " + (i - j)) ;

        System.out.println("-------------------------------------------------------------------------------------------");

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        System.out.println("-------------------------------------------------------------------------------------------");

        int multi = i + j ;
        System.out.println("multiplicacion = " + multi);

        int div = i / j ;

        float div2 = (float) i / (float)j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        System.out.println("-------------------------------------------------------------------------------------------");

        int resto = i % j ;
        System.out.println("resto = " + resto);

        System.out.println("-------------------------------------------------------------------------------------------");

        resto = 8 % 5 ;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero")) ;

        System.out.println("-------------------------------------------------------------------------------------------");

        if (numero % 2 == 0) {
            System.out.println("numero par = " + numero);
        }else
            System.out.println("numero inpar= " + numero);




    }
}
