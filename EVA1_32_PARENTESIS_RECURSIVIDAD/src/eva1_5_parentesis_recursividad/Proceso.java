
package eva1_5_parentesis_recursividad;

import java.util.Stack;

public class Proceso {
    
    private String cadena;
    private Stack<Character>  A = new Stack<Character>();
    public Proceso(String cadena){
        this.cadena = cadena;
    }
    
    public boolean equilibrada(){
        
        char arreglo_A[] = cadena.toCharArray();
        
        for (int i = 0; i < arreglo_A.length; i++) {
            if(arreglo_A[i] == '('){
                A.push('(');
            }
            else if(arreglo_A[i]==')'){
            if(!A.empty()){
                A.pop();
                }
            }
        }
        
        return A.empty();
}
    
}
