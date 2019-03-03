
import java.util.Scanner;

/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Introduce un número");
        int iNum = sCaptu.nextInt();
        sCaptu.nextLine();
        //for( int i = iNum; i>= 1; i--){
        //System.out.print(i + " - ");
    //}
    recursiveDown(iNum);
    
    recursiveUp(iNum, 1);
    }
    public static void recursiveDown(int iVal){
        /*DOS CARACTERÍSTICAS:
        1.- Llamada recursiva
        2.- Detener recursividad
        */
        System.out.print(iVal);
        
        if(iVal > 1){
            System.out.print(" - ");
           recursiveDown(iVal - 1);
        } 
    }

    public static void recursiveUp(int iVal, int iCont){
        
        System.out.print(iCont);
        if(iCont < iVal){
            System.out.print(" - ");
            recursiveUp(iVal, iCont + 1);
        }
    }
}
