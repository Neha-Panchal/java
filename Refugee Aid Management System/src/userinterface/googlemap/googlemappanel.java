/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.googlemap;

import com.teamdev.jxmaps.MapViewOptions;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import Business.googlemap.map;

/**
 *
 * @author hp
 */
public class googlemappanel extends javax.swing.JPanel {

    
    private map Map;
    private String Address;
    public googlemappanel( map Map, String add) {
        initComponents();
        this.Map = Map;
        this.Address=add;
        
        MapViewOptions options = new MapViewOptions();
        options.importPlaces();
        options.setApiKey("AIzaSyBasa0YYrtweVdF0ZmmxEwTvKJ-TITybTo");
        final map mapView = new map(options,this.Address);

        JFrame frame = new JFrame("JxMaps - Hello, World!");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(mapView, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    /**
     * Creates new form googlemappanel
     */
//    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 847, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
