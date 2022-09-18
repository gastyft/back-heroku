/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.service;

import com.miportfolio.model.Proyectos;
import com.miportfolio.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{
       @Autowired
    private ProyectosRepository proRepository;
  @Override
    public List<Proyectos> getProyectos(){
         List<Proyectos> listaProyectos = proRepository.findAll();
    return listaProyectos;
}
    
      @Override
    
    public void saveProyectos(Proyectos exp){
    proRepository.save(exp);
    
    }
      @Override
    public void deleteProyectos(Long id){
    proRepository.deleteById(id);
    
    }
      @Override
    public Proyectos findProyectos(Long id_exp){
       Proyectos pro = proRepository.findById(id_exp).orElse(null);
    return pro;
    
    }
}
