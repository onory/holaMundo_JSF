

package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named // etiqueta par ser reconocido el manage bean por JSF
@RequestScoped // determina el alcance
public class VacanteForm {
    
//inyeccion del objeto candidato del manage bean anterior
    
@Inject // dependencia de CDI para poder ser usado desde paquete de model     
private Candidato candidato;   
    
public void setCandidato(Candidato candidato){
    
    this.candidato = candidato;
}

//redireccionamiento a otra paguina depndiendo el nombre de candidato ingresado

public String enviar(){
    
    if(this.candidato.getNombre().equals("Juan")){ // valida si el nombre ingresado en index es juan para redireccionar
    
    return "exito"; // exito refiere a una xhtml, no es necesario mencionar la extencion
}else{
        return "fallo"; // fallo refiere a una xhtml, no es necesario mencionar la extencion
    }
    
}
    
   
    
}
