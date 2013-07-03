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
public class SimpanLpkController {
    
    @RequestMapping(value = "/simpan-lpk",method = RequestMethod.POST)
    @ResponseBody
    public String simpan(@RequestParam(value = "kolektor", required = false) String kol){
        System.out.println("Kolektor : "+kol);
        return "sukses";
    }
}
