package com.raven.component;

import com.raven.model.Model_Popular;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class ItemImage extends javax.swing.JPanel {

    
    public ItemImage() {
        initComponents();
        init();
    }
    
    private void init(){
        setOpaque(false);
        setPreferredSize(new Dimension(350,200));
        setMaximumSize(new Dimension(350,200));
        setMinimumSize(new Dimension(350,200));
    }
   
    private Model_Popular data;
    public void setData(Model_Popular data){
        this.data = data;
        
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics grphcs){
        if(data != null){
           Graphics2D g2 = (Graphics2D) grphcs;
           g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
           g2.drawImage(toImage(data.getImage()), 0,0,0,0,null);
        }
        super.paintComponent(grphcs);
    }    

    private Image toImage(Icon icon){
      return ((ImageIcon) icon).getImage();  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
