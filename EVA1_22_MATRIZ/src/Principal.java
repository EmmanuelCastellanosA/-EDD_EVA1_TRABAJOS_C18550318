
/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
        int A[][]=new int [100][100];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if(i==j){
                    A[i][j]=1;
                }
                else{
                    A[i][j]=0;
                }
                
            }
            
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("["+A[i][j]+"]");
            }System.out.print("\n");
        }
    }
    
}
