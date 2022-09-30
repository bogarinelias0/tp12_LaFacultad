public class Profesor extends Persona {

    private double basico;
    private int antiguedad;


    public Profesor(double basico, int antiguedad, String nombre, String apellido, int Legajo) {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;

    }

    public double calcularSueldo() {
        double sueldo = (((10 * this.basico) / 100) * this.antiguedad) + this.basico;
        return sueldo;

    }

    public void modificarDatos(String nombre, String apellido, int legajo) {
        super.nombre = nombre;
        super.apellido = apellido;
        super.legajo = legajo;
    }
}