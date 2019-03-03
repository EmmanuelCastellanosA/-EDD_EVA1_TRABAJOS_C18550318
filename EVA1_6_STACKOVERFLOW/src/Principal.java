
/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
       
        System.out.println("Inicia Main");
        recursiva();
        System.out.println("Fin main");
    }
   
    public static void recursiva(){
        recursiva();//se llama asi mismo
    }
}
//overflow: desbordamiento de memoria tamaño del stack es limitado