
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  

        int matriz[][], nFilas, nCol;
        int Edad=0;
        Alumno[][] apDatos = new Alumno[0][];//una filas... indistintas columnas
    
        System.out.println("Numero de grupos");
        nFilas = entrada.nextInt();
        
        System.out.println("Numero de Alumnos");
        nCol = entrada.nextInt();
        
        System.out.println("Nombre del Alumno");
        String nombre;
        nombre = entrada.next();
        
        System.out.println("Ingresa Edad");
        Edad = entrada.nextInt();
 
        matriz = new int[nFilas][nCol];
        
        for(int i=0; i< nFilas; i++){//llenamos filas
            for(int j=0; j<nCol; j++){//llenamos columnas
                System.out.print("Matriz ["+i+"]["+j+"]: ");//imprimimos matriz en las que estamos
                matriz[i][j] = Edad;//llamamos dato edad que ingreso el usuario
                
            }
        }
        System.out.println("\nNombre y Edad es: ");
        for(int i = 0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.println(nombre + " " + matriz[i][j]);
            }
            
            System.out.println("");
        }
        
    }
    
class Alumno{
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    
public Alumno(){
    nombre = "Emmanuel";
    apellido = "Castellanos";
    edad = 19;
    carrera = "Ingenieria en Informatica";
}   

        public Alumno(String nombre, String apellido, int edad, String carrera) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad; 
            this.carrera = carrera;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int Edad) {
            this.edad = Edad;
                    
        }

        public String getCarrera() {
            return carrera;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }

}
}

