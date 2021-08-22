public class EjemploStringArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.pdf" ;
        int i = archivo.lastIndexOf(".") ;
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length(i+1)) = " + archivo.substring(i+1));
        
    }
}
