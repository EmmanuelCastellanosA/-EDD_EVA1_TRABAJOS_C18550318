/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {

        int aiArreglo[] = new int[100];
        llenar(aiArreglo);
        imprimir(aiArreglo);
        int iVal = 10;
        System.out.println("\niVal = " + iVal);
        incrementa(iVal);
        System.out.println("iVal = " + iVal);
    }

    public static void llenar(int[] aiArre) {
        for (int i = 0; i < aiArre.length; i++) {//aiArre.length... tamaño del arreglo
            aiArre[i] = (int) (Math.random() * 100 + 1);//llenar el arreglo con numeros aleatorios
        }
    }
    public static void imprimir(int[] aiArre) {
        for (int i = 0; i < aiArre.length; i++) {
            System.out.print("[" + aiArre[i] + "]");
        }
    }
    public static void incrementa(int i) {
        i++;
    }
}

/* Direccion + (No. bytes * valor)

referencia es una direccion de memoria

paso por valor: se manda una copia del valor(No se puede cambiar nada)
paso por referencia: se manda una direccion de memoria

JAVA SOLO USA PASO POR VALOR
copia de lo que mandan(direccion de memoria)
Can la pura direccion se puede modificar el objeto y el arreglo en java */
