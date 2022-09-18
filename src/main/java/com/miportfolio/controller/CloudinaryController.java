
package com.miportfolio.controller;

import com.miportfolio.model.Imagen;
import com.miportfolio.service.CloudinaryService;
import com.miportfolio.service.ImagenService;

import com.miportfolio.dto.MensajeCloudinary;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins="https://portfolio-yo-programo.web.app")

public class CloudinaryController {
    
    @Autowired
    CloudinaryService cloudinaryService;
    
    @Autowired
    ImagenService imagenService;
    
    

    
    @GetMapping("/cloudinary/list")
    public ResponseEntity<List<Imagen>> List(){
        List<Imagen> list= imagenService.List();
        return new ResponseEntity(list, HttpStatus.OK);
        
    }
 
            @PostMapping("/cloudinary/upload")
            public ResponseEntity<?> upload(@RequestParam MultipartFile multipartFile) throws IOException{
                            
          
                BufferedImage bi = ImageIO.read(multipartFile.getInputStream());
               if(bi== null){
                return new ResponseEntity(new MensajeCloudinary("imagen no valida"), HttpStatus.BAD_REQUEST);
            }
               else{
               
                Map result= cloudinaryService.upload(multipartFile);
                Imagen imagens = new Imagen((String)result.get("original_filename"), 
                                (String)result.get("url"), 
                                (String)result.get("public_id"));
                
                imagenService.save(imagens);
                return new ResponseEntity(new Mensaje("imagen subida"), HttpStatus.OK);
            }}
        
            

            
            @DeleteMapping("/cloudinary/delete/{id}")
            public ResponseEntity<?> delete(@PathVariable("id")int id) throws IOException{
                if(!imagenService.exists(id))
                    return new ResponseEntity(new MensajeCloudinary("no existe"), HttpStatus.NOT_FOUND);
                Imagen imagen= imagenService.getOne(id).get();
                Map result= cloudinaryService.delete(imagen.getImagen_Id());
                imagenService.delete(id);
                return new ResponseEntity(new MensajeCloudinary("imagen eliminada"), HttpStatus.OK);
            }
         
            }
            
    
            

