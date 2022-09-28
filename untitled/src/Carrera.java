
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrera {

    Scanner s = new Scanner(System.in);

    //Variable nombre
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //----------------------------------------
    //Crear la coleccion
    public List<Carrera> coleccionMaterias = new ArrayList<Carrera>();

    //---------------------------
    public  Carrera(String nombre){
        this.nombre = nombre;
    }
    //---------------------------------Metodos--------------------------

    public void AgregarMateria(String NombreMateria){
        coleccionMaterias.add(new Carrera(NombreMateria));
    }
    public void QuitarMateria(String NombreMateria) {
        for (int i = 0; i < coleccionMaterias.size(); i++) {
            coleccionMaterias.removeIf(carrera -> carrera.getNombre().equalsIgnoreCase(NombreMateria));
        }
    }

    public void EncontrarMateria(String NombreMateria){
        boolean respuesta = true;
        for (int i= 0; i<coleccionMaterias.size();i++){
            if (coleccionMaterias.removeIf(carrera -> carrera.getNombre().equalsIgnoreCase(NombreMateria))){
                System.out.println("Se encontro la materia desea eliminarla?");
                respuesta = s.hasNext("si");
                if (respuesta == false){
                    AgregarMateria(NombreMateria);
                    i++;
                }
            }
            s.nextLine()
            ;break;
        }

    }

    public void MostrarMaterias() {
        for (Carrera carrera:coleccionMaterias) {
            System.out.println(carrera.getNombre());
        }
    }
}