
package com.miportfolio.service;

import com.miportfolio.model.Persona;
import com.miportfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService {
   
    @Autowired
    private PersonaRepository persoRepository;
    
       @Override
    public List<Persona> getPersonas(){
    List<Persona> listaPersonas = persoRepository.findAll();
    return listaPersonas;
    
    }
       @Override
    public void savePersona(Persona pers){
    persoRepository.save(pers);
    
    }

    @Override
    public void deletePersona(Long id){
    persoRepository.deleteById(id);
    
    }
    
    @Override
    public Persona findPersona(Long id){
       Persona pers = persoRepository.findById(id).orElse(null);
    return pers;
    
    }
}
    
    

