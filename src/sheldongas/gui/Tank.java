/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheldongas.gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author norma
 */
public class Tank extends JPanel {
    sheldongas.model.Tank model;
    public Tank(sheldongas.model.Tank tank) {
        this.model = tank;
        JLabel fuel_type_label = new JLabel("Tank: ");
        JLabel fuel_type = this.get_fuel_type();
        JLabel fill = new JLabel(Math.round(tank.get_relative_fill() * 100) + "%");
        this.add(fuel_type_label);
        this.add(fuel_type);
        this.add(fill);
    }
    
    private JLabel get_fuel_type() {
        switch(this.model.get_fuel_type()) {
            case DIESEL:
                return new JLabel("Diesel");
            case E10:
                return new JLabel("E10");
            case SUPER:
                return new JLabel("Super");
            default:
                return null;
        }
    }
}
