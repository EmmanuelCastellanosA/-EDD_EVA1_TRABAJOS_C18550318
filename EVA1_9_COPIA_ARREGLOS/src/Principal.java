
/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
       
       int[] aiArreglo = new int[100];
       llenar(aiArreglo);
       imprimir(aiArreglo);
       System.out.println("");
       //int[] aiCopia = aiArreglo; //no sirve
       
       int [] aiCopia = new int[100];
       //leer elemento por elemento y copiar
       for (int i=0; i<aiArreglo.length; i++){
           aiCopia[i] = aiArreglo[i];//copia del arreglo
    }
       imprimir(aiCopia);
       
    }
    public static void llenar(int[] aiArre) {
        for (int i = 0; i < aiArre.length; i++) {
            aiArre[i] = (int) (Math.random() * 100 + 1);//llena arreglos con numeros aleatorios
        }

    }

    public static void imprimir(int[] aiArre) {
        for (int i = 0; i < aiArre.length; i++) {
            System.out.print("[" + aiArre[i] + "]");
        }
    }
}
