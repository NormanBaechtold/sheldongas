/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheldongas.model;

import sheldongas.model.FuelType;

/**
 *
 * @author norma
 */
public class Tank {
    private float fill = 0;
    final private float limit;
    final FuelType fuel_type;
    
    public Tank(final FuelType fuel_type, final float limit) {
        this.limit = limit;
        this.fuel_type = fuel_type;
    }
    
    public void refill() {
        this.fill = this.limit;
    }
    
    public void draw(float volume) {
        this.fill -= volume;
    }
    
    public float get_fill() {
        return this.fill;
    }
    
    public FuelType get_fuel_type() {
        return this.fuel_type;
    }
    
    public float get_relative_fill() {
        return this.fill / this.limit;
    }
}
