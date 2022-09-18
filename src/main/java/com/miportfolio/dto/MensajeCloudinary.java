
package com.miportfolio.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MensajeCloudinary {
       
    private String mensajeCludinary;

    public MensajeCloudinary() {
    }

    public MensajeCloudinary(String mensajeCludinary) {
        this.mensajeCludinary = mensajeCludinary;
    }

}
