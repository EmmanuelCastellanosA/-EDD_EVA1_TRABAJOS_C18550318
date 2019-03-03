
//Emmanuel Castellanos el guapo
//C18550318

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad[] = new int [6];
        int suma=0, media=0, conteo=0, varianza=0;
        int sumatoria,desviacion=0;
        
        for (int i = 0; i < 6; i++) {
            System.out.print((i+1)+". Digite la Edad: ");
            edad [i] = entrada.nextInt();
   
            
            suma += edad[i];
            conteo++;
        }
        if(conteo==0){
            System.out.println("No se puede sacar la media");
        }
        else{
            media = suma/conteo;
            System.out.println("La media de las Edades es: "+media);
        }
        
        for (int i = 0; i < 5; i++) {
            sumatoria = (int) Math.pow(edad[i] - media,2);
            varianza = varianza + sumatoria;
        }
        varianza = varianza / (conteo-1);
        desviacion = (int) Math.sqrt(varianza);
        double redondeo = Math.rint(desviacion*100)/100;
        System.out.println("Desviacion estandar es: "+redondeo);
             
    }}
    

