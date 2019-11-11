/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheldongas.gui;

import javax.swing.JPanel;

/**
 *
 * @author norma
 */
public class PillarOverview extends JPanel {
    public PillarOverview(sheldongas.model.Model model) {
        model.get_pillars().forEach((pillar) -> {
            this.add(new Pillar(pillar));
        });
    }
}
