
/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
        
        int n = 126;
        
        System.out.println(suma(n));
    }
    public static int suma(int n){
        
        if(n < 10 ){
            return n;
        }else{
            return (n % 10) + suma(n/10);
        }
    }
    
}
