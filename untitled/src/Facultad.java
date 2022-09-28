
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facultad implements Informacion{

    @Override
    public void verCantidad(int cantidad) {

    }

    @Override
    public void listarContenidos(String contenido) {
        System.out.println(coleccionCarreras);
    }

    protected String nombre;

        public String getNombre() {
                return nombre;
        }
        public void setNombre(String nombre) {
                this.nombre = nombre;
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
    public  void agregarCarrera(String nombreCarrera){
           coleccionCarreras.add(new Carrera(nombreCarrera));
       }
       public void quitarMateria(String NombreCarrera){
           for (int i = 0; i < coleccionCarreras.size(); i++) {
               coleccionCarreras.removeIf(nombre -> nombre.getNombre().equals(NombreCarrera));
           }
       }
    public static void main(String[] args){

    }
}