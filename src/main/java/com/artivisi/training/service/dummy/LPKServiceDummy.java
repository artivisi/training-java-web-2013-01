/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.training.service.dummy;

import com.artivisi.training.domain.Kolektor;
import com.artivisi.training.service.LPKService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author endy
 */
@Service
public class LPKServiceDummy implements LPKService {

    public List<Kolektor> cariSemuaKolektor() {
        List<Kolektor> hasil = new ArrayList<Kolektor>();
        
        Kolektor k = new Kolektor();
        k.setId("K-001");
        k.setKode("K-001");
        k.setNama("Safi'ie");
        k.setCabang("Cabang 001");
        k.setPerusahaan("Perusahaan <001>");
        hasil.add(k);
        
        Kolektor k2 = new Kolektor();
        k2.setId("K-002");
        k2.setKode("K-002");
        k2.setNama("Kolektor 002");
        k2.setCabang("Cabang 002");
        k2.setPerusahaan("Perusahaan 002");
        hasil.add(k2);
        
        Kolektor k3 = new Kolektor();
        k3.setId("K-003");
        k3.setKode("K-003");
        k3.setNama("Kolektor 003");
        k3.setCabang("Cabang 003");
        k3.setPerusahaan("Perusahaan 003");
        hasil.add(k3);
        
        return hasil;
    }
    
}
