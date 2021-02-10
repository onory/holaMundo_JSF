/*
 * va asociarse con la paguina HTML de JSF 
 */
package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named  // se indica para q sea reconocido por JSF
@RequestScoped // indica el alcance
public class candidato {
    
   private String nombre = "introduce tu nombre";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
   
   
    
}
