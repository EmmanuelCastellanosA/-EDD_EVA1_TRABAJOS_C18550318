
/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
import java.util.Random;
import java.util.Scanner;
 
public class Principal {
 
	public static void main (String args[]){
 
		  Random r=new Random();
	      Scanner in=new Scanner(System.in);

 
	       double [][] m1=new double [5][5];
	       double [][] m2=new double [5][5];
	       double [][] mR=new double [5][5];
	        System.out.println("La matriz 1");
 
 
	        for(int i=0;i<5;i++){
	            System.out.print("");
	            for(int j=0;j<5;j++){
	                m1[i][j]=(int)(Math.random()*10+1);
	                System.out.print("["+m1[i][j]+"]");
	            }
	            System.out.print("");
	            System.out.println("");
	        }
                System.out.println("___________");
	        System.out.println("La matriz 2");
	        for(int i=0;i<5;i++){
	            System.out.print("");
	            for(int j=0;j<5;j++){
	                m2[i][j]=(int)(Math.random()*10+1);
	                System.out.print("["+m2[i][j]+"]");
	            }
	            System.out.print("");
	            System.out.println("");
	        }
 
	        if(5==5){
                    System.out.println("________________________");
	            System.out.println("La matriz resultante es:");
 
	            for(int i=0;i<5;i++){
 
	            	System.out.print("");
 
	            for(int j=0;j<5;j++){
 
 
	            for(int h=0;h<5;h++){
 
	            	 mR[i][j]+=m1[i][h]*m2[h][j];
                }
                System.out.print("["+mR[i][j]+"]");
            }
            System.out.print("");
            System.out.println("");
        }
    }
    else{
        System.out.println("Los rangos de las matrices son incorrectos");
    }
}
 
	}
