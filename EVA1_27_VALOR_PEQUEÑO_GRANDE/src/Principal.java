
/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
import java.util.Scanner;
 
public class Principal
{
	public static void main(String[] ARGS)
	{
		int[] A = new int [50];
		Scanner obtenerNumero = new Scanner(System.in);
		int i, max, min, suma;
                
                System.out.println("Arreglo Original: ");
                
                for (int j = 0; j <A.length; j++) {
                    A[j]=(int)(Math.random()*100+1);
                    System.out.print("["+A[j]+"]");                   
            }
                
		min=max=A[0];
 
		for(i = 0; i < A.length; i++)
		{
			if(min>A[i])
			{
				min=A[i];
			}
			if(max<A[i])
			{
				max=A[i];
			}
		}
                System.out.println("");
                System.out.println("___________________");
		System.out.println("Valor máximo: " + max);
                System.out.println("Valor minimo: " + min);
        }}
