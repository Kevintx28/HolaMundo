public class Practica01 {
    public static void main(String[] args) {
        String mensaje = "0853247032753802975043875234809750234587203894572304857234857289345783924758934275089234578974432";

        System.out.println("---------------------------------------------------------------------");

        int posicion = mensaje.length() / 2;
        System.out.println("MENSAJE = "+mensaje);
        System.out.println("Tamanio: ["+ mensaje.length() + "]");

        if((mensaje.length() % 2) == 1) {
            System.out.println("Letra del medio: ["+ mensaje.charAt(posicion)+"]");

            System.out.println("-------------------------------------------------------------------");

        }
    }
}
//[1 2 3 4 5 6 7]

