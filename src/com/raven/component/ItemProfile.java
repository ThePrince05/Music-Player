
package com.raven.component;

import com.raven.model.Model_Menu;
import com.raven.model.Model_Music;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

public class ItemProfile extends javax.swing.JPanel {

    private final Model_Music data;
    private boolean play;
    
    
    public void setPlay(boolean play){
        this.play = play;
        
        if(play){
            lbIcon.setText("");
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/com/raven/icon/playing.png")));
            lbName.setFont(new java.awt.Font("Sanserif", 1, 14)); 
            lbName.setForeground(new Color(203,30,148));
            lbTime.setFont(new java.awt.Font("Sanserif", 1, 14));
            lbName.setForeground(new Color(203,30,148));
        }
        else{
            lbIcon.setIcon(null);
            lbIcon.setText(data.getNo());
            lbName.setFont(new java.awt.Font("Sanserif", 0, 14)); 
            lbName.setForeground(new Color(51,51,51));
            lbTime.setFont(new java.awt.Font("Sanserif", 0, 14));
            lbName.setForeground(new Color(51, 51, 51));
        }
    }
     
     public boolean isPlay() {
        return play;
    }
    
    public ItemProfile(Model_Music data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        lbName.setText(data.getName());
        lbTime.setText(data.getTime());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();
        imageAvatar = new com.raven.swing.ImageAvatar();

        setBackground(new java.awt.Color(255, 255, 255));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(208, 52));

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        lbName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbName.setForeground(new java.awt.Color(51, 51, 51));
        lbName.setText("Name");
        lbName.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lbName);

        lbDescription.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbDescription.setForeground(new java.awt.Color(51, 51, 51));
        lbDescription.setText("Description");
        lbDescription.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lbDescription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics grphcs){
            Graphics2D g2 = (Graphics2D)grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(246, 246, 246));
            g2.fillRect(0, getHeight() - 2, getWidth(), getHeight()); 
        super.paintComponent(grphcs);
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.ImageAvatar imageAvatar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbName;
    // End of variables declaration//GEN-END:variables

   

    
}
