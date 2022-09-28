class Estudiante extends Persona {

    public Estudiante (String nombre, String apellido, int legajo){
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(legajo);
    }

    public void modificarDatos(){

    };

}



class Profesor extends Personas{

    private double basico;
    private int antiguedad;


    public Profesor(double basico, int antiguedad, String nombre, String apellido, int Legajo){
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;

    }




    public double calcularSueldo(){
        double sueldo = (((10 * this.basico)/100)* this.antiguedad)+ this.basico;
        return sueldo;

    }
}