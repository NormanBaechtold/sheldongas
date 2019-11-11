/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheldongas.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author norma
 */
public class Model {
    final private ArrayList<Pillar> pillars = new ArrayList<>();
    
    public Model() {
        for(int i = 0; i < 6; ++i) {
            this.pillars.add(new Pillar("Säule " + (i + 1)));
        }
        
    }
    
    public List<Pillar> get_pillars() {
        return this.pillars;
    }
}
