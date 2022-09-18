
package com.miportfolio.service;

import com.miportfolio.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public List <Proyectos>  getProyectos();

    public void saveProyectos (Proyectos pro);
    
    public void deleteProyectos (Long id_proyectos);
    
    public Proyectos findProyectos (Long id_proyectos);
}
