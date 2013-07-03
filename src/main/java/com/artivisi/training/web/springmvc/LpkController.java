/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.training.web.springmvc;

import com.artivisi.training.domain.Kolektor;
import com.artivisi.training.service.LPKService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author endy
 */
@Controller
public class LpkController {
    
    @Autowired
    private LPKService lpkService;
    
    @ModelAttribute("daftarKolektor")
    public List<Kolektor> dataUntukCombo(){
        return lpkService.cariSemuaKolektor();
    }
    
    @RequestMapping(value = "/lpk/form", method = RequestMethod.GET)
    public void tampilkanForm(){
        
    }
    
    
    @RequestMapping(value = "/lpk/form", method = RequestMethod.POST)
    public String prosesForm(){
        return "redirect:../halo";
    }
}
