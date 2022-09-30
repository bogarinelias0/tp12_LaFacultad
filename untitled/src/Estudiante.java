import java.util.Scanner;

public class Estudiante extends Persona {

    public Estudiante (String nombre, String apellido, int legajo) {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(legajo);
    }



    public void modificarDatos(String nombre, String apellido, int legajo) {
        super.nombre = nombre;
        super.apellido = apellido;
        super.legajo = legajo;
    }

    public void modificarDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nuevo nombre");
        super.nombre = entrada.nextLine();
        System.out.println("Ingrese nuevo apellido");
        super.apellido = entrada.nextLine();
        System.out.println("Ingrese nuevo legajo");
        super.legajo = entrada.nextInt();
    }

}
