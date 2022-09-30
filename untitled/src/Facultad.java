
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facultad implements Informacion{

    @Override
    public void verCantidad(int cantidad) {
        System.out.println("La cantidad de Carreras son: "+coleccionCarreras.size());
    }

    @Override
    public void listarContenidos(String contenido) {
            for(Carrera carrera : coleccionCarreras){
                System.out.println(carrera.getNombre());
            }

    }


    //Creo coleccion
       public List<Carrera> coleccionCarreras = new ArrayList<Carrera>();
       public Facultad(String nombre){
               this.nombre=nombre;
       }

    public String toString() {
        return "Carreras='" + nombre + '\'' +
                '}';
    }
    public void agregarCarrera(String nombreCarrera){
           coleccionCarreras.add(new Carrera(nombreCarrera));
       }
       public  void quitarCarrera(String NombreCarrera){
           for (int i = 0; i < coleccionCarreras.size(); i++) {
               coleccionCarreras.removeIf(nombre -> nombre.getNombre().equals(NombreCarrera));
           }
       }

    public List <Estudiante> coleccionEstudiantes = new ArrayList<Estudiante>();

    public void eliminarEstudiante(String nombreEstudiante){
        for (Estudiante estudiante: coleccionEstudiantes){
           if (estudiante.getNombre().equals(nombre)){
                this.coleccionEstudiantes.remove(estudiante);
                return;
            }

        }
    }
    protected String nombre;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void setColeccionCarreras(List<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    public List<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }


    public static void main(String[] args){


    }
}