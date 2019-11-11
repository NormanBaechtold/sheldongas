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
public class Pillar {
    private ArrayList<Tank> tanks = new ArrayList<>();
    private Order order = null;
    final private String name;
    
    public Pillar(final String name) {
        this.name = name;
        
        this.tanks.add(new Tank(FuelType.DIESEL, 100));
        this.tanks.add(new Tank(FuelType.E10, 75));
        this.tanks.add(new Tank(FuelType.SUPER, 120));
    }
    
    void occupy(Order order) {
        this.order = order;
    }
    
    public List<Tank> get_tanks() {
        return this.tanks;
    }
    
    public boolean is_occupied() {
        return this.order == null;
    }
    
    public String get_name() {
        return this.name;
    }
}
