/*
Llenado de arreglos con numeros aleatorios
For-Each
 */

/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) { //Direccion a la memoria estatica
  
        int aiDatos[]; //referencia --> 1 byte //stack
        aiDatos = new int[100]; // int --> 5 bytes = 400 //heap

        for (int i = 0; i < aiDatos.length; i++) {   //length esta en la memoria dinamica
            aiDatos[i] = (int) ((Math.random() * 100) + 1);//llena el arreglo.. valores aleatorios
            for (int aiDato : aiDatos) {
                System.out.println("[" + aiDato + "]");
            }
            System.out.println("");

        }
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("[" + aiDatos + "]");
        }
    }

}

//LIFO