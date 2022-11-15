
package com.miportfolio.security.util;

import com.miportfolio.security.entity.Rol;
import com.miportfolio.security.enums.RolNombre;
import com.miportfolio.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class createRoles implements CommandLineRunner {
       @Autowired
    RolService rolService;
    @Override
    public void run(String... args) throws Exception {
        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
         
    }
} 



