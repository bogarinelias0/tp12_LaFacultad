import java.util.LinkedList;
 
public class Materia
                    //extends Informacion
                    {
    private String nombre;
    private Profesor titular;
    private LinkedList<Estudiante> coleccionEstudiantes;

    //Constructor
    public Materia(String nombre, Profesor titular, LinkedList<Estudiante> coleccionEstudiantes){
        try{
            this.nombre = nombre;
            this.titular = titular;
            this.coleccionEstudiantes = coleccionEstudiantes;
        }
        catch (Exception e){
            System.out.println("Hubo un error al intentar crear la materia");
        }
    }

    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public Profesor getTitular(){
        return this.titular;
    }
    public LinkedList<Estudiante> getColeccionEstudiantes(){
        return this.coleccionEstudiantes;
    }

    //Setters
    public void setNombre(String nombre){
        try{
            this.nombre = nombre;
        }
        catch (Exception e){
            System.out.println("Hubo un error al intentar establecer el nombre de la materia");
        }
    }
    public void setTitular(Profesor titular){
        try{
            this.titular = titular;
        }
        catch (Exception e){
            System.out.println("Hubo un error al intentar establecer el titular de la materia");
        }
        
    }
    public void setColeccionEstudiantes(LinkedList<Estudiante> coleccionEstudiantes){
        try{
            this.coleccionEstudiantes = coleccionEstudiantes;
        }
        catch (Exception e){
            System.out.println("Hubo un error al intentar cargar los estudiantes de la materia");
        }
        
    }

    //Agrega el estudiante ingresado por parámetro a la lista coleccionEstudiantes
    public void agregarEstudiante(Estudiante estudiante){
        try{
            this.coleccionEstudiantes.add(estudiante);
        }
        catch (Exception e){
            System.out.println("Hubo un error al intentar agregar al estudiante a la materia");
        }
    }

    //Elimina el estudiante de coleccionEstudiantes con el nombre ingresado por parámetro.
    //Esto se logra implementando un for each para obtener cada estudiante, y luego comparando
    //el nombre de cada estudiante con el nombre ingresado por parámetro
    public void eliminarEstudiante(String nombre){
        for (Estudiante estudiante: this.coleccionEstudiantes){
            if (estudiante.getNombre.equals(nombre){
                this.coleccionEstudiantes.remove(estudiante);
                return;
            }
        }

        System.out.println("No hay un estudiante con ese nombre inscripto a esta materia");
    }

    //Modifica el titular de tipo Profesor por el Profesor ingresado por parámetro
    public void modificarTitular(Profesor titular){
        try{
            this.titular = titular;
        }
        catch (Exception e){
            System.out.println("Hubo un error al intentar modificar al titular de la materia");
        }
    }

    //Muy probablemente no funcione adecuadamente, hay que ver la implementación que cada 
    //uno le da al toString de su clase 
    public String toString(){
        String resultado = "Nombre de materia: " + this.nombre + "\n" + this.titular.toString();
        
        for (Estudiante estudiante: this.coleccionEstudiantes){
            resultado = resultado + "\n" + estudiante.toString();
        }

        return resultado;
    }
}
