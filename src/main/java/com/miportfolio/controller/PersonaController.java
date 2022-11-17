
package com.miportfolio.controller;

import com.miportfolio.model.Persona;
import com.miportfolio.service.IPersonaService;
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

public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping("/personas/traer")
    public List <Persona> getPersonas(){
return interPersona.getPersonas();
}
    
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona pers){
    interPersona.savePersona(pers);
    return "La persona fue guardada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
    
    interPersona.deletePersona(id);
    return "La persona fue eliminada correctamente";
            }
    

    @PutMapping("/personas/editar/{id}") //puede ser con el ID "/personas/editar/{id}"
    public Persona editPersona (@PathVariable Long id,
            @RequestParam ("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("edad") String nuevaEdad,
            @RequestParam("ciudad") String nuevaCiudad,
            @RequestParam("nacionalidad") String nuevaNacionalidad,
            @RequestParam("estado_civil") String nuevoEstado_civil) {
    Persona pers= interPersona.findPersona(id);
    
    
    pers.setApellido(nuevoApellido);
    pers.setNombre(nuevoNombre);
    pers.setEdad(nuevaEdad);
    pers.setCiudad(nuevaCiudad);
    pers.setNacionalidad(nuevaNacionalidad);
    pers.setEstado_civil(nuevoEstado_civil);
    interPersona.savePersona(pers);
    
    return pers;
    
    
    }
    
     @GetMapping("/personas/traer/perfil")
    public Persona findPersonas(){
return interPersona.findPersona((long)1);
}
}
            
    

