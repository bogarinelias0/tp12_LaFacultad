
import java.util.*;

public class Carrera {

    Scanner s = new Scanner(System.in);

    //Variable nombre
    private String nombre;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            this.nombre = nombre;
        }catch (Exception e){
            System.out.println("Hubo un error al intentar establecer el nombre de la Carrera");
        }
    }

    //----------------------------------------
    //Crear la coleccion
    public List<Carrera> coleccionMaterias = new ArrayList<Carrera>();

    //---------------------------
    public Carrera(String nombre) {
        this.nombre = nombre;
    }
    //---------------------------------Metodos--------------------------

    public void AgregarMateria(Materia materia) {
        try {
            this.coleccionMaterias.add(materia);
        } catch (Exception e) {
            System.out.println("Hubo un error al intentar Agregar una materia a la carrera");
        }
    }
    public void QuitarMateria(String NombreMateria) {
        try {
            for (int i = 0; i < coleccionMaterias.size(); i++) {
                coleccionMaterias.removeIf(carrera -> carrera.getNombre().equalsIgnoreCase(NombreMateria));
            }
        }catch (Exception e){
            System.out.println("Hubo un error al buscar el objeto. Verifique los datos puestos en consola");
        }
    }

    public void EncontrarMateria(String NombreMateria) {
       try {
           boolean respuesta = true;
           for (Carrera carrera : coleccionMaterias) {
               respuesta = false;
               if (carrera.getNombre().equalsIgnoreCase(NombreMateria)) {
                   System.out.println("Se encontro la materia " + carrera.getNombre() + ".\n ¿Desea eliminarla? s/n");
                   respuesta = s.hasNext("s");
                   if (respuesta) {
                       QuitarMateria(NombreMateria);
                   }

                   s.nextLine();
                   break;
               }

           }
       }catch (Exception e){
           System.out.println("Hubo un error al buscar el objeto. Verifique los datos puestos en consola");
       }
    }


    public void verCantidad() {
        System.out.println("La cantidad de Carreras son: " + coleccionMaterias.size());
    }
    public void listarContenidos() {
        for(Carrera materia : coleccionMaterias){
            System.out.println(materia.getNombre());
        }

    }

    //-----------------------------------------------------------------------------
    public String toString(){
        String resultado = "Nombre =: " + this.getNombre() +"\n";

        resultado = resultado + coleccionMaterias;

        return resultado;
    }
}



