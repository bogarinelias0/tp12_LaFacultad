
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facultad {




        protected String nombre;

        public String getNombre() {
                return nombre;
        }
        public void setNombre(String nombre) {
                this.nombre = nombre;
        }


       //Creo coleccion
       public List<Facultad> coleccionCarreras = new ArrayList<Facultad>();

       public Facultad(String nombre){
               this.nombre=nombre;
       }


}