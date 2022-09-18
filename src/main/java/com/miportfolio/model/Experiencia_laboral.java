
package com.miportfolio.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Experiencia_laboral {
       @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private Long id_exp;
    
    private String experiencia_laboral;

}
