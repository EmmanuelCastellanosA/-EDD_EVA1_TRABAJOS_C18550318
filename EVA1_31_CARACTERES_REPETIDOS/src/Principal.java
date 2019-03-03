
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "abbcdd";
        System.out.println ("Original: " + cadena);
        cadena = cadena.replaceAll("(.)\\1", "$1");
        System.out.println ("Resultado: " + cadena);
    }
}

