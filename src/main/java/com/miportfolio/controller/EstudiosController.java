
package com.miportfolio.controller;

import com.miportfolio.model.Estudios;
import com.miportfolio.service.IEstudiosService;
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
public class EstudiosController {
    @Autowired
    private IEstudiosService interEstudios;
    
    @GetMapping("/estudios/traer")
    public List <Estudios> getEstudios(){
return interEstudios.getEstudios();
}
    
    
    @PostMapping("/estudios/crear")
    public String createEstduio(@RequestBody Estudios est){
    interEstudios.saveEstudios(est);
            return "Los estudios fueron guardados correctamente";
    
    }
    
    @DeleteMapping("/estudios/borrar/{id_estudios}") 
    public String deleteEstudios(@PathVariable Long id_estudios){
    
    interEstudios.deleteEstudios(id_estudios);
    return "Los estudios fueron eliminados correctamente";
            }
    
    @PutMapping("/estudios/editar/{id_estudios}") //puede ir por id ejemplo  "/estudios/editar/{id_estudios}"
    public Estudios editEstudios (@PathVariable Long id_estudios,
           @RequestParam ("nombre_estudio") String nuevanombre_estudio,
            @RequestParam("estudio_detail") String nuevoestudio_detail){
    
    Estudios est= interEstudios.findEstudios(id_estudios);
    
    
    est.setNombre_estudio(nuevanombre_estudio);
    est.setEstudio_detail(nuevoestudio_detail);
   
    
    interEstudios.saveEstudios(est);
    
    return est;
    
    }
    
     @GetMapping("/estudios/traer/estudios")
    public Estudios findEstudios(){
return interEstudios.findEstudios((long)1);
}
    
}
