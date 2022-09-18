/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miportfolio.service;

import com.miportfolio.model.HardSkills;
import java.util.List;

public interface IHardSkillsService {
     
    public List <HardSkills>  getHardSkills();

    public void saveHardSkills (HardSkills hard);
    
    public void deleteHardSkills (Long id);
    
    public HardSkills findHardSkills (Long id);
}
