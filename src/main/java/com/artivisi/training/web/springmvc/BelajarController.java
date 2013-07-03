/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.training.web.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author endy
 */
@Controller
public class BelajarController {
    
    @RequestMapping(value = "/simpan-lpk",method = RequestMethod.POST)
    // tanpa response body, apa yang direturn menjadi nama view
    public String simpan(@RequestParam(value = "kolektor", required = false) String kol){
        System.out.println("Kolektor : "+kol);
        return "redirect:halo"; // ada tambahan redirect: artinya request ulang dengan GET
    }
    
    @RequestMapping(value = "/halo",method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody // apa yang direturn langsung kirim ke requestor
    public String halo(String nama){
        return "Halo "+nama;
    }
    
    @RequestMapping(value = "/coba",method = {RequestMethod.POST, RequestMethod.GET})
    // tanpa @ResponseBody => cari view yang namanya sama dengan request (yaitu /coba)
    public void coba(){
        
    }
}
