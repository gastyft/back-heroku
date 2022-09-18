
package com.miportfolio.repository;

import com.miportfolio.model.Experiencia_laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia_laboral, Long>{
    
}
