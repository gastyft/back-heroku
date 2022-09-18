/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.controller;

import com.miportfolio.model.HardSkills;
import com.miportfolio.service.IHardSkillsService;
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

public class HardSkillsController {
        
    @Autowired
    private IHardSkillsService interHard;
    
    @GetMapping("/hardskills/traer")
    public List <HardSkills> getHardSkills(){
return interHard.getHardSkills();
}
    
    
    @PostMapping("/hardskills/crear")
    public String createPersona(@RequestBody HardSkills hard){
    interHard.saveHardSkills(hard);
    return "La persona fue guardada correctamente";
    }
    
    @DeleteMapping("/hardskills/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
    
    interHard.deleteHardSkills(id);
    return "Las skills fue eliminada correctamente";
            }
    

    @PutMapping("/hardskills/editar/{id}") //puede ser con el ID "/personas/editar/{id}"
    public HardSkills editHardSkills (@PathVariable Long id,
            @RequestParam ("frontend") int nuevofrontend,
            @RequestParam("backend") int nuevobackend,
            @RequestParam("base_datos") int nuevabase_datos,
            @RequestParam("ingles") int nuevaingles,
            @RequestParam("italiano") int nuevaitaliano,
            @RequestParam("trabajo_equipo") int  nuevotrabajo_equipo,
            @RequestParam("comunicacion") int nuevocomunicacion) {
    HardSkills hard = interHard.findHardSkills(id);
    
    
    hard.setFrontend(nuevofrontend);
    hard.setBackend(nuevobackend);
    hard.setBase_datos(nuevabase_datos);
    hard.setIngles(nuevaingles);
    hard.setItaliano(nuevaitaliano);
    hard.setTrabajo_equipo(nuevotrabajo_equipo);
    hard.setComunicacion(nuevocomunicacion);
    interHard.saveHardSkills(hard);
    
    return hard;
    
    
    }
    
     @GetMapping("/hardskills/traer/perfil")
    public HardSkills findHardSkills(){
return interHard.findHardSkills((long)1);
}
}
