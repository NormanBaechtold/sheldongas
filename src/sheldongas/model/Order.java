/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheldongas.model;

import sheldongas.model.FuelType;
import sheldongas.model.Customer;

/**
 *
 * @author norma
 */
public class Order {
    final private Customer customer;
    final private FuelType fuel_type;
    final private float volume;
    final private Price price;
    
    public Order(
            final Customer customer,
            final FuelType fuel_type,
            final float volume,
            final Price price
            ) {
        this.customer = customer;
        this.fuel_type = fuel_type;
        this.volume = volume;
        this.price = price;
    }
}
