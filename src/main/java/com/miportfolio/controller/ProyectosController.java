
package com.miportfolio.controller;

import com.miportfolio.model.Proyectos;
import com.miportfolio.service.IProyectosService;
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
public class ProyectosController {
      @Autowired
    private IProyectosService interProyectos;
    
    @GetMapping("/proyectos/traer")
    public List <Proyectos> getProyectos(){
return interProyectos.getProyectos();
}
    
    
    @PostMapping("/proyectos/crear")
    public String createExperiencia(@RequestBody Proyectos pro){
    interProyectos.saveProyectos(pro);
            return "Las experiencias fueron guardadas correctamente";
    
    }
    
  
    @DeleteMapping("/proyectos/borrar/{id_proyectos}")
    public String deleteExperiencia(@PathVariable Long id_proyectos){
    
    interProyectos.deleteProyectos(id_proyectos);
            return "Las experiencias fueron eliminadas correctamente";
    
            }
    
    
    @PutMapping("/proyectos/editar/{id_proyectos}")
    public Proyectos editProyectos (@PathVariable Long id_proyectos,
            @RequestParam ("proyectos") String nuevoProyecto) {
    
    Proyectos pro = interProyectos.findProyectos(id_proyectos);
    
    
    pro.setProyecto(nuevoProyecto);
    
    interProyectos.saveProyectos(pro);
    return pro;
    
    }
      @GetMapping("/proyectos/traer/proyectos/{id_proyectos}")
    public Proyectos findProyectos(Long id_proyectos){
return interProyectos.findProyectos(id_proyectos); 
}

}
