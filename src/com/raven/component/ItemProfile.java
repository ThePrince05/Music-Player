
package com.raven.component;

import com.raven.model.Model_Menu;
import com.raven.model.Model_Music;
import com.raven.model.Model_Profile;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

public class ItemProfile extends javax.swing.JPanel {

     public Model_Profile getData() {
        return data;
    }

    private final Model_Profile data;
   
    public ItemProfile(Model_Profile data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        lbName.setText(data.getName());
        lbDescription.setText(data.getDescription());
        if(data.getImage() != null){
            imageAvatar.setImage(data.getImage());
        }
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

        jPanel1.setLayout(new java.awt.GridLayout(2, 1, 1, 0));

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

        imageAvatar.setBorderSize(0);
        imageAvatar.setLayout(new javax.swing.BoxLayout(imageAvatar, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                    .addComponent(imageAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents
    

            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.ImageAvatar imageAvatar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbName;
    // End of variables declaration//GEN-END:variables

   

    
}
