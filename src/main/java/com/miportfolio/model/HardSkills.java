
package com.miportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

     
@Getter @Setter
@Entity
public class HardSkills {

      @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private int frontend ;
    private int  backend;
    private int base_datos;
  
    private int italiano;
    private int ingles;
    private int trabajo_equipo;
    private int comunicacion;
    
}

