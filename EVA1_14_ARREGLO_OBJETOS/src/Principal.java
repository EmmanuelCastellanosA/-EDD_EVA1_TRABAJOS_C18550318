
import java.util.Scanner;

/**
 * C18550318
 * @author Emmanuel Castellanos Azuela
 */
public class Principal {

    public static void main(String[] args) {
        
        Persona [] apDatos = new Persona [5];
        Scanner sCaptu = new Scanner(System.in);
        
        for(int i =0; i < apDatos.length; i++){
            apDatos[i] = new Persona();
            
            System.out.println("Nombre:");
            apDatos[i].setNombre(sCaptu.nextLine());
            System.out.println("Apellido");
            apDatos[i].setApellido(sCaptu.nextLine());
            System.out.println("Nacionalidad");
            apDatos[i].setNacionalidad(sCaptu.nextLine());
            System.out.println("Edad:");
            apDatos[i].setEdad(sCaptu.nextInt());
            sCaptu.nextLine();
            
        }
            System.out.println("______________________________");
            
        for(Persona apDato: apDatos){
            System.out.println("♦♦  Datos de la persona  ♦♦");
            System.out.println("");
            System.out.println("Nombre completo: " + apDato.getNombre() + " " + apDato.getApellido());
            System.out.println("Edad: " + apDato.getEdad());
            System.out.println("Nacionalidad: " + apDato.getNacionalidad());
            
            System.out.println("______________________________");
        }
    }
    
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    
    public Persona(){
        nombre = "Emmanuel";
        apellido = "Castellanos";
        edad = 19;
        nacionalidad = "Mexicano";
    }

    public Persona(String nombre, String apellido, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


}