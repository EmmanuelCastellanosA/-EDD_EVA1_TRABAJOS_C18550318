/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
        //LLENAR CON 100 ENTEROS ALEATORIOS
        //IMPRIMIR
        //DIRECCIÓN DE MEMORIA
        //ELEMENTOS EN UNA LÍNEA
       
        int[] aiDatos = new int[100];

        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100 + 1);//llenado del arreglo con valores aleatorios
        }
        System.out.println(aiDatos);//inprimimos arreglo

        for (int aiDato : aiDatos) {//for-each
            System.out.print("[" + aiDato + "]");
        }

        //Arreglo de tamaño 50
        /*aiDatos = new int[50];
        System.out.println("");
        System.out.println(aiDatos);
        for (int aiDato : aiDatos){
        System.out.print("[" + aiDato + "]");*/
        
        int[] aiCopia = aiDatos;//copia del arreglo, se traspasan los datos
        System.out.println("");
        System.out.println("aiDatos = " + aiDatos);
        System.out.println("aiCopia = " + aiCopia);

        aiDatos = new int[50];//Se asignan al arreglo un tamaño de 50
        System.out.println("");
        System.out.println(aiDatos);
        System.out.println("\nIMPRIMIENDO DATOS");
        for (int aiDato : aiDatos) {//for each
            System.out.print("[" + aiDato + "]");
        }

        System.out.println("\nIMPRIMIENDO COPIA");
        for (int i : aiCopia) {//llenamos el arreglo
            System.out.print("[" + i + "]");
        }

    }

}
