/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheldongas.model;

/**
 *
 * @author norma
 */
public class Price {
    final private float ratio; // euro / liter
    
    public Price(final float ratio) {
        this.ratio = ratio;
    }
    
    public float calculate(float volume) {
        return this.ratio * volume;
    }
}
