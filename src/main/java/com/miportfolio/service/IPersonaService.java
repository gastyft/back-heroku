
package com.miportfolio.service;

import com.miportfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List <Persona>  getPersonas();

    public void savePersona (Persona pers);
    
    public void deletePersona (Long id);
    
    public Persona findPersona (Long id);
}
