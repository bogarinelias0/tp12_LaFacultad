import java.util.Scanner;

public class Profesor extends Persona{

       private double basico;
       private int antiguedad;
 
 
       public Profesor(double basico, int antiguedad, String nombre, String apellido, int legajo){
           super.nombre = nombre;
           super.apellido = apellido;
           super.legajo = legajo;
       this.basico = basico;
       this.antiguedad = antiguedad;
 
     }
 
     public double getBasico(){
       return this.basico;
     }
     public int getAntiguedad(){
       return this.antiguedad;
     }

     public void setBasico(double basico){
       this.basico = basico;
     }
     public void setAntiguedad(int antiguedad){
       this.antiguedad = antiguedad;
     }
 
 
     public double calcularSueldo(){
            double sueldo = (((10 * this.basico)/100)* this.antiguedad)+ this.basico;
           return sueldo;
 
    }

    public void modificarDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nuevo nombre");
        super.nombre = entrada.nextLine();
        System.out.println("Ingrese nuevo apellido");
        super.apellido = entrada.nextLine();
        System.out.println("Ingrese nuevo legajo");
        super.legajo = entrada.nextInt();
        System.out.println("Ingrese nuevo sueldo");
        this.basico = entrada.nextDouble();
        this.antiguedad = entrada.nextInt();
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                ", basico=" + basico +
                ", antiguedad=" + antiguedad +
                '}';
    }
}