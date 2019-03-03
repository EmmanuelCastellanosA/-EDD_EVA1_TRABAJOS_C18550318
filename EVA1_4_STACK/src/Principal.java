/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {

    System.err.println("Inicio main");
    A();
    //Stack --> LIFO
    //LIFO --> LAST IN FIRST OUT
    //FIFO --> FIRST IN LAST OUT
    }
   
    public static void A(){
     System.out.println("Inicio A");
     System.out.println("Fin A");
    }
    public static void B(){
     System.out.println("Inicio B");
     C();
     System.out.println("Fin B");
    }

    public static void C(){
        System.out.println("Inicio C");  
        System.out.println("Fin C");
}
}