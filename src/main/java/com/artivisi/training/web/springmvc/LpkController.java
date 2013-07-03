/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.training.web.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author endy
 */
@Controller
public class LpkController {
    
    @RequestMapping(value = "/lpk/form", method = RequestMethod.GET)
    public void tampilkanForm(){
        
    }
    
    
    @RequestMapping(value = "/lpk/form", method = RequestMethod.POST)
    public String prosesForm(){
        return "redirect:../halo";
    }
}
