/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplojts;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author caio
 */
public class NewClass {
    
    public static void main(String[] args){
        
        WKTReader reader = new WKTReader();
        
        try {
            Geometry geometria1 = reader.read("POLYGON((1 1, 1 4, 4 4, 4 1, 1 1))");
            Geometry geometria2 = reader.read("POLYGON((2 2, 2.5 3, 3 2, 2 2))");
            
            System.out.println(geometria2.within(geometria1));
            System.out.println(geometria1.covers(geometria2));
            
        } catch (ParseException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
