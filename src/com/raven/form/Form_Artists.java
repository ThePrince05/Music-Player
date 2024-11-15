
package com.raven.form;

import com.raven.model.Model_Popular;
import javax.swing.ImageIcon;


public class Form_Artists extends javax.swing.JPanel {

 
    public Form_Artists() {
        initComponents();
        init();
    }

    
    private void init(){
       mostPopular.addImage(new Model_Popular(new ImageIcon(getClass().getResource("/com/raven/icon/test/avicii.png")),"Avicii True Stories","15 Albums | 17.5M Followers")); 
       mostPopular.addImage(new Model_Popular(new ImageIcon(getClass().getResource("/com/raven/icon/test/kygo.png")),"Kygo and Alan Walker","15 Albums | 17.5M Followers")); 
       mostPopular.addImage(new Model_Popular(new ImageIcon(getClass().getResource("/com/raven/icon/test/ed-sheeran.jpg")),"Ed Sheeran","15 Albums | 17.5M Followers")); 
       mostPopular.addImage(new Model_Popular(new ImageIcon(getClass().getResource("/com/raven/icon/test/sigala.jpg")),"Sigala","15 Albums | 17.5M Followers")); 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mostPopular = new com.raven.component.MostPopular();
        music2 = new com.raven.component.Music();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(168, 29, 177));
        jLabel1.setText("Artists");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(50, 50, 50));
        jLabel2.setText("Most popular");
        jLabel2.setToolTipText("");
        jLabel2.setAlignmentY(0.1F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostPopular, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(music2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostPopular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(music2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        music2.getAccessibleContext().setAccessibleParent(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.raven.component.MostPopular mostPopular;
    private com.raven.component.Music music2;
    // End of variables declaration//GEN-END:variables
}
