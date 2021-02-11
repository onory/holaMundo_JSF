

package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named // etiqueta par ser reconocido el manage bean por JSF
@RequestScoped // determina el alcance
public class VacanteForm {
    
//inyeccion del objeto candidato del manage bean anterior
    
@Inject // dependencia de CDI para poder ser usado desde paquete de model     
private Candidato candidato;   

Logger log = LogManager.getRootLogger();
    
public void setCandidato(Candidato candidato){
    
    this.candidato = candidato;
}

//redireccionamiento a otra paguina depndiendo el nombre de candidato ingresado

public String enviar(){
    
    if(this.candidato.getNombre().equals("Juan")){ // valida si el nombre ingresado en index es juan para redireccionar
       
        log.info("Entrando al caso de exito");
        
    return "exito"; // exito refiere a una xhtml, no es necesario mencionar la extencion
}else{
        
        log.info("Entrando al caso de fallo");
        
        return "fallo"; // fallo refiere a una xhtml, no es necesario mencionar la extencion
    }
    
}
    
   
    
}
