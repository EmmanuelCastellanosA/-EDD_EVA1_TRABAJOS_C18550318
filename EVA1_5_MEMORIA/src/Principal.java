
/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
     
        Principal pObj = new Principal(); /*pObj apunta la dirccion de memoria en la que esta
        guardado el objeto*/
        Principal pObj2 = new Principal();
        System.out.println(pObj);
        System.out.println(pObj2);
        
        Principal pCopia = pObj;//copea la direccion del apuntador donde se guardo el objeto
        System.out.println(pCopia);
        
        pObj = null;//se inicializa variable
        pObj2 = null;
        System.out.println(pObj);
        System.out.println(pObj2);
        System.out.println(pCopia);//la variable llama al objeto
        
    }
    
}
//No se crea una copia del objeto, se crea una copia de la direccion en la que se guardo
//GARBAGE COLLECTOR --> SE ENCARGA DE LIBERAR EL OBJETO