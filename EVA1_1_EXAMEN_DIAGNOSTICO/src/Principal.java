/*
Progrma para derminar numeros primos y numeros no primos
 */

/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
        
        Primo pNum = new Primo();
        pNum.setNumero(5);
        pNum.esP();

        Primo N2 = new Primo(6998);
        N2.esP();
    }

}

    class Primo {

        private int numero; //Atributo

        public Primo() { //Constructor
    }

        public Primo(int numero) { //Constructor con parametros
        this.numero = numero;
    }

        public int getNumero() {//Get.. Obtener
        return numero;
    }

        public void setNumero(int numero) { //Set.. Mostrar
        this.numero = numero;
    }

        public void esP() {
            
            String E = numero + " Es primo";//Mostrar Primos
            
            for (int i = 2; i < numero; i++) {
                if((numero % i) == 0) { //determina si es primo o no
                    E = numero + " No es primo";//sMensaMostrar no Primos
                        break;
            }
        }
        System.out.println(E);
    }

}
