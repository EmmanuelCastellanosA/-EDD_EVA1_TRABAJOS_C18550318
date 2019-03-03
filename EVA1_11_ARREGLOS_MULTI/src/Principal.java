
/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
        
        int [][] aiMatriz = new int [3][3]; //matriz con 3x3 [FILAS][COLUMNAS]
        
        for( int i=0; i< aiMatriz.length; i++){ //Recorre las filas
            for(int j=0; j< aiMatriz[i].length; j++){ //Recorre las columnas
                aiMatriz[i][j] = (int)(Math.random() * 100 + 1);//Llena la matriz de numeros aleatorios
            }
        }
    
        for( int i=0; i< aiMatriz.length; i++){ //Recorre las filas
            for(int j=0; j< aiMatriz[i].length; j++){ //Recorre las columnas
                System.out.print("[" + aiMatriz[i][j] + "]");//imprimir
    }
    System.out.println("");
}
    }
}