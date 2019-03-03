
/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    
    public static void main(String[] args) {
        
        int[] arreglo = new int[50];//creacion del arreglo
        int A=0;
        int E=0;
        System.out.println("Arreglo Original");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= (int)(Math.random()*100+1);//se llena arreglo con numeros aleatorios
                System.out.print("["+arreglo[i]+"]");
            if(arreglo[i]% 2==0){//formula pra determinar si son pares
                A++;// aumenta el conteo de pares
            }
            else{
                E++;//aumenta impares
            }
    }    
        int[] par = new int[A];// se crean arreglos con el tamaño exacto de los pares e impares
        int[] impar = new int[E];
        
        A=0;// se inicializan las variables para optimizar
        E=0;
        
        for (int i = 0; i < 50; i++) {
            if(arreglo[i]% 2==0){//formula para determinar los pares
                par[A] = arreglo[i];//cada numero par se guarda en el arreglo
                A++;//se cuentan
            }
            else{
                impar[E] = arreglo[i];//cada impar se guarda en el arreglo
                E++;//se cuentan
            }
        } 
        System.out.println("");
        System.out.println("Pares: ");
        for (int i = 0; i <A; i++) {
            System.out.print("["+ par[i]+ "]");//se imprimen
        }
        System.out.println("");
        
        System.out.println("Impares: ");
        for (int i = 0; i <E; i++) {
            System.out.print("["+ impar[i]+ "]");//se imprimen
        }
        System.out.println("");
}}
