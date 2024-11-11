
package com.raven.component;

import com.raven.model.Model_Menu;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class ItemMusic extends javax.swing.JPanel {

    private final Model_Menu data;
    private boolean selected;
    
    
    public void setSelected(boolean selected){
        this.selected = selected;
        
        if(selected){
            lbText.setFont(new java.awt.Font("Sanserif", 1, 14)); 
            lbText.setForeground(Color.WHITE);
            lblcon.setIcon(data.toIcon());
        }
        else{
            lbText.setFont(new java.awt.Font("Sanserif", 0, 14)); 
            lbText.setForeground(new Color(204,204,204));
            lblcon.setIcon(data.toIconSelected());
        }
    }
    public boolean isSelected() {
        return selected;
    }
    
    public ItemMusic(Model_Menu data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        lblcon.setIcon(data.toIcon());
        lbText.setText(data.getMenuName());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcon = new javax.swing.JLabel();
        lbText = new javax.swing.JLabel();
        lbText1 = new javax.swing.JLabel();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(208, 52));

        lblcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbText.setForeground(new java.awt.Color(51, 51, 51));
        lbText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbText.setText("03:00");

        lbText1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbText1.setForeground(new java.awt.Color(51, 51, 51));
        lbText1.setText("Music Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(lbText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(lbText1)
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbText1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics grphcs){
        if(selected){
            Graphics2D g2 = (Graphics2D)grphcs;
            g2.setColor(Color.WHITE);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.fillRect(0, 0, 2, getHeight());
        }
        
        super.paintComponent(grphcs);
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbText;
    private javax.swing.JLabel lbText1;
    private javax.swing.JLabel lblcon;
    // End of variables declaration//GEN-END:variables

    
}
