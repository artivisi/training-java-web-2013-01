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
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author endy
 */
@Controller
public class KolektorController {
    
    @Autowired
    private LPKService lpkService;
    
    @RequestMapping("/kolektor/list")
    public ModelMap daftarKolektorHtml(){
        ModelMap data = new ModelMap();
        data.addAttribute("daftarKolektor", lpkService.cariSemuaKolektor());
        return data;
    }
    
    @RequestMapping("/kolektor/json")
    @ResponseBody
    public List<Kolektor> daftarKolektorJson(){
        return lpkService.cariSemuaKolektor();
    }
}
