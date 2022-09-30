public class Profesor extends Persona{

       private double basico;
       private int antiguedad;
 
 
       public Profesor(double basico, int antiguedad, String nombre, String apellido, int legajo){
       super.setNombre(nombre);
       super.setApellido(apellido);
       super.setLegajo(legajo);
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

    }
 }