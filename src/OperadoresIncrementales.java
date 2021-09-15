public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre Incremento
        System.out.println("----------------------------------------------");

        int i = 1;
        int j = ++ i ; // i = i + 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post Incremento
        System.out.println("----------------------------------------------");

        i = 2;
        j = i++ ;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre Decremento
        System.out.println("----------------------------------------------");

        i = 3 ;
        j = --i ;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post Decremento
        System.out.println("----------------------------------------------");

        i = 4 ;
        j = i-- ;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("----------------------------------------------");

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);



    }
}
