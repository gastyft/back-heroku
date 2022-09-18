
package com.miportfolio.service;

import com.miportfolio.model.Estudios;
import java.util.List;



public interface IEstudiosService {
    
    public List <Estudios>  getEstudios();

    public void saveEstudios (Estudios est);
    
    public void deleteEstudios (Long id);
    
    public Estudios findEstudios (Long id);
}
