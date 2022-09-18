

package com.miportfolio.service;

import com.miportfolio.model.Estudios;
import com.miportfolio.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiosService implements IEstudiosService{
    @Autowired
    private EstudiosRepository estRepository;
        @Override
    public List<Estudios> getEstudios(){
    List<Estudios> listaEstudios = estRepository.findAll();
    return listaEstudios;
    
    }
    @Override
    public void saveEstudios(Estudios est){
    estRepository.save(est);
    
    }
    @Override
    public void deleteEstudios(Long id){
    estRepository.deleteById(id);
    
    }
    @Override
    public Estudios findEstudios(Long id){
       Estudios est = estRepository.findById(id).orElse(null);
    return est;
    
    }
}
