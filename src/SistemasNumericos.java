import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {


        String numeroStr = JOptionPane.showInputDialog(null, "ingrese un numero entero");
        int numeroDecimal = Integer.parseInt(numeroStr)
                ;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero Binario de = " + numeroDecimal + " = " + Integer.toBinaryString((numeroDecimal)));

        System.out.println("---------------------------------------------------------------------------");
        
        int numeroBinario = 0b111110100 ;
        System.out.println("numeroBinario = " + numeroDecimal);

        System.out.println("numero Octal de  = " + numeroDecimal + " = " + Integer.toOctalString((numeroDecimal)));
        int numeroOctal = 0764 ;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero Hexadecimal de = " + numeroOctal + " = " + Integer.toHexString(numeroDecimal));
        int numeroExadecimal = 0x1f4 ;
        System.out.println("numeroExadecimal = " + numeroExadecimal);

        JOptionPane.showInputDialog(null, "ingrese un numero entero");

    }
}
