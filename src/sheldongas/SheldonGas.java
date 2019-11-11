/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheldongas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import sheldongas.gui.PillarOverview;
import sheldongas.model.Model;

/**
 *
 * @author norma
 */
public class SheldonGas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("SheldonGas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Model model = new Model();
        JPanel overview = new PillarOverview(model);
        frame.add(overview);
        
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
    
}
