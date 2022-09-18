
package com.miportfolio.security.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.miportfolio.security.entity.Rol;
import com.miportfolio.security.enums.RolNombre;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre); 
    
}
