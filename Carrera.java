import java.util.ArrayList;
import java.util.Scanner;

public class Carrera implements Informacion{

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
    public ArrayList<Materia> coleccionMaterias;

    //---------------------------
    public Carrera(String nombre, ArrayList<Materia> coleccionMaterias){
        this.nombre = nombre;
        this.coleccionMaterias = coleccionMaterias;
    }
    //---------------------------------Metodos--------------------------

    public void agregarMateria(Materia materia){
        coleccionMaterias.add(materia);
    }
    public void quitarMateria(String nombreMateria) {
        for (int i = 0; i < coleccionMaterias.size(); i++) {
            coleccionMaterias.removeIf(carrera -> carrera.getNombre().equalsIgnoreCase(nombreMateria));
        }
    }

    public void encontrarMateria(String nombre){
        Scanner s = new Scanner(System.in);
        boolean respuesta = true;
        for (int i= 0; i<coleccionMaterias.size();i++){
            if (coleccionMaterias.removeIf(carrera -> carrera.getNombre().equalsIgnoreCase(nombre))){
                System.out.println("Se encontro la materia desea eliminarla?");
                respuesta = s.hasNext("si");
                if (respuesta == false){
                    //agregarMateria(nombre);
                    i++;
                }
            }
            s.nextLine();
            break;
        }

        s.close();

    }


    public void mostrarMaterias() {
        for (Materia materia :coleccionMaterias) {
            System.out.println(materia.getNombre());
        }
    }

    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }

    @Override
    public String listarContenidos(){
        String resultado = "";
        for (Materia materia: this.coleccionMaterias){
            resultado = resultado + materia.getNombre() + "\n";
        }

        return resultado;
    }
}
