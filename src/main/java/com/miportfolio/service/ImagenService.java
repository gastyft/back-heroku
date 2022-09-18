/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.service;

import com.miportfolio.model.Imagen;
import com.miportfolio.repository.ImagenRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ImagenService {
    @Autowired
    ImagenRepository imagenRepository;
    
    public List<Imagen> List(){
        return imagenRepository.findByOrderById();
    }
    public void save(Imagen imagen){
        imagenRepository.save(imagen);
    }
    public void delete(int id){
        imagenRepository.deleteById(id);
    }
    public Optional<Imagen> getOne(int id){
        return imagenRepository.findById(id);
        
    }
    public boolean exists (int id){
        return imagenRepository.existsById(id);
    }

    public Imagen getOne(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
}
