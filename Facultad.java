import java.util.ArrayList;

public class Facultad implements Informacion{

    @Override
    public int verCantidad() {
        return coleccionCarreras.size();
    }

    @Override
    public String listarContenidos() {
        if (coleccionCarreras.isEmpty()) return "Esta facultad no posee carreras";

        String resultado = "";

        for(Carrera carrera : coleccionCarreras){
            resultado = resultado + (carrera.getNombre()) + "\n";
        }
        
        return resultado;
    }


    //Creo coleccion
       private ArrayList<Carrera> coleccionCarreras;
       
       public Facultad(String nombre, ArrayList<Carrera> coleccionCarreras){
               this.nombre=nombre;
               this.coleccionCarreras=coleccionCarreras;
       }

    public String toString() {
        String resultado = "Nombre: " + this.nombre + "\n";

        resultado = resultado + listarContenidos();
        
        return resultado;
    }

    public void agregarCarrera(Carrera carrera){
           coleccionCarreras.add(carrera);
    }

    public void quitarCarrera(String NombreCarrera){
        for (int i = 0; i < coleccionCarreras.size(); i++) {
            coleccionCarreras.removeIf(nombre -> nombre.getNombre().equals(NombreCarrera));
        }
    }

    protected String nombre;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColeccionCarreras(ArrayList<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    public ArrayList<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }
}