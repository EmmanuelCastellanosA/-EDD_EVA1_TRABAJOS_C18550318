
/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Inicia Main");
        String sCade = "Hola " + cadena(); //Se almacena en el Stack
        System.out.println(sCade);
        System.out.println("Termina Main");
    }
    
    public static String cadena(){
        System.out.println("Inicia cadena");
        System.out.println("Termina cadena");
        return "Mundo";
    }
}
