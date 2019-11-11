/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheldongas.gui;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author norma
 */
public class Pillar extends JPanel implements MouseListener {
    final private sheldongas.model.Pillar model;
    
    class Occupied extends JPanel {
        public Occupied(final boolean state) {
            this.add(new JLabel("Occupied: "));
            this.add(new JLabel("" + state));
        }
    }
    
    class Tanks extends JPanel {
        public Tanks(final sheldongas.model.Pillar model) {
            this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
            for(sheldongas.model.Tank tank_model : model.get_tanks()) {
                Tank tank = new Tank(tank_model);
                tank.setAlignmentX(Component.CENTER_ALIGNMENT);
                this.add(tank);
            }
        }
    }
    
    public Pillar(final sheldongas.model.Pillar model) {
        this.model = model;
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        JLabel name = new JLabel(this.model.get_name());
        name.setAlignmentX(Component.CENTER_ALIGNMENT);
        Occupied occupied = new Occupied(this.model.is_occupied());
        occupied.setAlignmentX(Component.CENTER_ALIGNMENT);
        Tanks tanks = new Tanks(model);
        this.add(name);
        this.add(tanks);
        this.add(occupied);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Pressed " + this.model.get_name());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
