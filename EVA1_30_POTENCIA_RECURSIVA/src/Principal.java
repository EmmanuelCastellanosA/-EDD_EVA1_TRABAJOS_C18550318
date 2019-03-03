
import java.util.Scanner;

/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {
    public static void main(String[] args) {
       
      int base=3;
      int exponente=3;
      
        System.out.println(R(base,exponente));
    }  
    public static int R(int base,int exponente){
      
   
        if(exponente==0){
            return 1;
        }else if(exponente==1){
            return base;
        }else{
            return base * R(base,exponente-1);
        }
            
        
    }}

