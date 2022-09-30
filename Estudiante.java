import java.util.Scanner;

public class Estudiante extends Persona {

    public Estudiante (String nombre, String apellido, int legajo){
           super.nombre = nombre;
           super.apellido = apellido;
           super.legajo = legajo;
        }

    public void modificarDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nuevo nombre");
        super.nombre = entrada.nextLine();
        System.out.println("Ingrese nuevo apellido");
        super.apellido = entrada.nextLine();
        System.out.println("Ingrese nuevo legajo");
        super.legajo = entrada.nextInt();
       }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}
