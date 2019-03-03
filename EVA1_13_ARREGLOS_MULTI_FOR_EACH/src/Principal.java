
/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
      
        int [][] aiMatriz = new int [3][];//tres filas...las columnas luego las especificamos 
        aiMatriz[0] = new int[15];//indicamos las columnas
        aiMatriz[1] = new int[3];
        aiMatriz[2] = new int[100];
        System.out.println(aiMatriz);
        System.out.println(aiMatriz[0]);       
        System.out.println(aiMatriz[1]);
        System.out.println(aiMatriz[2]);
        System.out.println(aiMatriz[0][0]);//imprime primera posicion de la matriz
        
        for (int i = 0; i < aiMatriz.length; i++){//llena las filas
            for (int j = 0; j < aiMatriz[i].length; j++){//llena las columnas
                aiMatriz[i][j] = (int)(Math.random() * 100 + 1);
            }
        }
        
        for (int[] aiMatriz1 : aiMatriz) {//for each
            for(int b: aiMatriz1){
                System.out.print("[" + b + "]");//imprime matriz 
            }
            System.out.println("");
        }
    
    }
    
}
