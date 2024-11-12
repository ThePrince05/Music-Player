
package com.raven.component;

import com.raven.model.Model_Menu;
import com.raven.model.Model_Music;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

public class ItemMusic extends javax.swing.JPanel {

    private final Model_Music data;
    private boolean play;
    
    
    public void setPlay(boolean play){
        this.play = play;
        
        if(play){
            lbIcon.setText("");
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/com/raven/icon/playing.png")));
            lbText.setFont(new java.awt.Font("Sanserif", 1, 14)); 
            lbText.setForeground(new Color(203,30,148));
            lbTime.setFont(new java.awt.Font("Sanserif", 1, 14));
            lbText.setForeground(new Color(203,30,148));
        }
        else{
            lbIcon.setIcon(null);
            lbIcon.setText(data.getNo());
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/com/raven/icon/playing.png")));
            lbText.setFont(new java.awt.Font("Sanserif", 1, 14)); 
            lbText.setForeground(new Color(51,51,51));
            lbTime.setFont(new java.awt.Font("Sanserif", 0, 14));
            lbText.setForeground(new Color(51, 51, 51));
        }
    }
     
     public boolean isPlay() {
        return play;
    }
    
    public ItemMusic(Model_Music data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        lbText.setText(data.getName());
        lbTime.setText(data.getTime());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbText = new javax.swing.JLabel();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(208, 52));

        lbIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbTime.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbTime.setForeground(new java.awt.Color(51, 51, 51));
        lbTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTime.setText("03:00");

        lbText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbText.setForeground(new java.awt.Color(51, 51, 51));
        lbText.setText("Music Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(lbText)
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics grphcs){
        if(play){
            Graphics2D g2 = (Graphics2D)grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(246, 246, 246));
            g2.fillRect(0, getHeight() - 2, getWidth(), getHeight());
        }
        
        super.paintComponent(grphcs);
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbText;
    private javax.swing.JLabel lbTime;
    // End of variables declaration//GEN-END:variables

   

    
}
