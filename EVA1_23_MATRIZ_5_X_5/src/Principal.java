
/**
 * C18550318
 * @author Emmanuel Alpachino
 */
public class Principal {

    public static void main(String[] args) {
       int A[][] = new int [5][5];
       int a,v,g=5;
       
        for (int i = 0; i <A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = (int)(Math.random()*100+1);
            }
        }
        System.out.println("Original");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("["+A[i][j]+"]");
            }System.out.println("");
        }
        System.out.println("____________________");
        System.out.println("Invertida");
        
        if(g % 2 == 0){
            a = -1;
        }
        else
            a = (g/2);
        
        for (int i = 0; i < g; i++) {
            for (int j = 0; j < a; j++) {
                
                if((g % 2 != 0)&&(i == a)&&(j==a+1))break;
                
                v= A[i][j];
                A[i][j]=A[(g-1)-i][(g-1)-j];
                A[(g-1)-i][(g-1)-j] = v;
            }
        }
        for (int i = 0; i < g; i++) {
            for (int j = 0; j <g; j++) {
              System.out.print("["+A[i][j]+"]");
            }System.out.println("\t");
        }
        
    } 
}
