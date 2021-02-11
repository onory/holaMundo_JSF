/*
 * Para que gunciones como listener de JSF debe implementar de la calse  javax.faces.event.PhaseListener
 * con todos los medos abstractos 
 */
package beans.lifecycle;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DebuggerListener implements javax.faces.event.PhaseListener{

    //logg permite enviar mensajes a la coansola con el api de lojg
        
        Logger log = LogManager.getRootLogger();
    
      @Override
    public void beforePhase(PhaseEvent pe) {
        
        if(log.isInfoEnabled())
         log.info("Antes de la fase: " + pe.getPhaseId().toString());
        
    }
    @Override
    public void afterPhase(PhaseEvent pe) {
       
        if(log.isInfoEnabled())
         log.info("Despues de la fase: " + pe.getPhaseId().toString());
        
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}
