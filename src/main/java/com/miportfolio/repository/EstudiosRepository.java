
package com.miportfolio.repository;

import com.miportfolio.model.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiosRepository extends JpaRepository<Estudios, Long> {
    
}
