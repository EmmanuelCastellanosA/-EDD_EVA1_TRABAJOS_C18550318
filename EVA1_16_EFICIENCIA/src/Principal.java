
/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
        
        int[] aiDatos = new int[2565651];
        
        for(int i = 0; i < aiDatos.length; i++){//tarda mucho por los for anidados 
            for(int j= 0; j < aiDatos.length; j++)//se repite N^2
                
            
            aiDatos[j] = (int)(Math.random() * 100 + 1);
        }
        //Recursividad: metodo que se llama asi mismo
    }
    
}
