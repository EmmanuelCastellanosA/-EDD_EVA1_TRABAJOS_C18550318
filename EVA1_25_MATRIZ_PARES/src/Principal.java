
/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
        int A[] = new int [50];
        
        System.out.println("Lista de los Numeros Pares:");
        System.out.println("");
        for (int i = 0; i < A.length; i++) {
            A[i]= (int)(Math.random()*100+1);
              if(A[i] %2==0){
                System.out.println("["+A[i]+"]");
            }
            
        }
    }
    
}
