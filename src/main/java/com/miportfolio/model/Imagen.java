
package com.miportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Imagen {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private String imagen_url;
    private String imagen_Id;

    public Imagen() {
    }
        public Imagen(String name, String imagen_url, String imagen_Id) {
        this.name = name;
        this.imagen_url = imagen_url;
        this.imagen_Id = imagen_Id;
    }


}
