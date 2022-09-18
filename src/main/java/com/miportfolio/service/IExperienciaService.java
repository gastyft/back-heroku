/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miportfolio.service;

import com.miportfolio.model.Experiencia_laboral;
import java.util.List;



public interface IExperienciaService {
    
    public List <Experiencia_laboral>  getExperiencia();

    public void saveExperiencia (Experiencia_laboral exp);
    
    public void deleteExperiencia (Long id);
    
    public Experiencia_laboral findExperiencia (Long id);
}
