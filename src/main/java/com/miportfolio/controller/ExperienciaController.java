
package com.miportfolio.controller;

import com.miportfolio.model.Experiencia_laboral;
import com.miportfolio.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="https://portfolio-yo-programo.web.app")
public class ExperienciaController {
      @Autowired
    private IExperienciaService interExperiencia;
    
    @GetMapping("/experiencia/traer")
    public List <Experiencia_laboral> getExperiencia(){
return interExperiencia.getExperiencia();
}
    
    
    @PostMapping("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia_laboral exp){
    interExperiencia.saveExperiencia(exp);
            return "Las experiencias fueron guardadas correctamente";
    
    }
    
  
    @DeleteMapping("/experiencia/borrar/{id_exp}")
    public String deleteExperiencia(@PathVariable Long id_exp){
    
    interExperiencia.deleteExperiencia(id_exp);
            return "Las experiencias fueron eliminadas correctamente";
    
            }
    
    
    @PutMapping("/experiencia/editar/{id_exp}")
    public Experiencia_laboral editExperiencias (@PathVariable Long id_exp,
            @RequestParam ("experiencia_laboral") String nuevaExperiencia) {
    
    Experiencia_laboral exp = interExperiencia.findExperiencia(id_exp);
    
    
    exp.setExperiencia_laboral(nuevaExperiencia);
    
    interExperiencia.saveExperiencia(exp);
    return exp;
    
    }
      @GetMapping("/experiencia/traer/experiencia/{id_exp}")
    public Experiencia_laboral findExperiencia(Long id_exp){
return interExperiencia.findExperiencia((id_exp));
}
}

