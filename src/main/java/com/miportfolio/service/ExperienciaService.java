
package com.miportfolio.service;

import com.miportfolio.model.Experiencia_laboral;
import com.miportfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
public class ExperienciaService implements IExperienciaService{
    @Autowired
    private ExperienciaRepository expRepository;
  @Override
    public List<Experiencia_laboral> getExperiencia(){
         List<Experiencia_laboral> listaExperiencia = expRepository.findAll();
    return listaExperiencia;
}
    
      @Override
    
    public void saveExperiencia(Experiencia_laboral exp){
    expRepository.save(exp);
    
    }
      @Override
    public void deleteExperiencia(Long id){
    expRepository.deleteById(id);
    
    }
      @Override
    public Experiencia_laboral findExperiencia(Long id_exp){
       Experiencia_laboral exp = expRepository.findById(id_exp).orElse(null);
    return exp;
    
    }
    
    
}
