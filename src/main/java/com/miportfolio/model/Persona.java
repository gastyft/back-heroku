
package com.miportfolio.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;




@Getter @Setter
@Entity
public class Persona {
      @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;
    private String apellido;
    private String edad;
  
    private String ciudad;
    private String nacionalidad;
    private String estado_civil;
}
