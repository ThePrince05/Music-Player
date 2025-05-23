
package com.raven.main;

import com.raven.model.Model_Menu;
import com.raven.swing.ScrollBar;
import java.awt.Color;


public class Main extends javax.swing.JFrame {

   
    public Main() {
        initComponents();
        init();
    }

  
    private void init(){
        sp.setVerticalScrollBar(new ScrollBar());
        setBackground(new Color(0,0,0,0)); // Remove background color
        list1.addItem(new Model_Menu("Playlist","playlist"));
        list1.addItem(new Model_Menu("Artists","artists"));
        list1.addItem(new Model_Menu("Albums","albums"));
        list1.addItem(new Model_Menu("Songs","song"));
        
        list2.addItem(new Model_Menu("Store","store"));
        list2.addItem(new Model_Menu("Radio","radio"));
        list2.addItem(new Model_Menu("For You","love"));
        list2.addItem(new Model_Menu("Browse","browse"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new com.raven.swing.Panel();
        menu1 = new com.raven.component.Menu();
        list1 = new com.raven.component.ListMenu<>();
        jLabel1 = new javax.swing.JLabel();
        list2 = new com.raven.component.ListMenu<>();
        jLabel2 = new javax.swing.JLabel();
        panelMoving = new javax.swing.JPanel();
        sp = new javax.swing.JScrollPane();
        form_Artists1 = new com.raven.form.Form_Artists();
        button2 = new com.raven.component.Button();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                list1MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 229, 229));
        jLabel1.setText("LIBRARY");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1));

        list2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                list2MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(229, 229, 229));
        jLabel2.setText("DISCOVER");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1));

        panelMoving.setOpaque(false);
        panelMoving.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMovingMouseDragged(evt);
            }
        });
        panelMoving.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMovingMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu1Layout.createSequentialGroup()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))))
                .addContainerGap())
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        sp.setBackground(new java.awt.Color(214, 217, 223));
        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setToolTipText("");
        sp.setOpaque(false);
        sp.setViewportView(form_Artists1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10))
            .addComponent(button2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void list1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MousePressed
        // TODO add your handling code here:
        list2.clearSelection();
    }//GEN-LAST:event_list1MousePressed

    private void list2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list2MousePressed
        // TODO add your handling code here:
        list1.clearSelection();
    }//GEN-LAST:event_list2MousePressed

    private int x;
    private int y;
    private void panelMovingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMovingMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelMovingMousePressed

    private void panelMovingMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMovingMouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen() - x, evt.getYOnScreen() - y);
    }//GEN-LAST:event_panelMovingMouseDragged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Button button2;
    private com.raven.form.Form_Artists form_Artists1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.raven.component.ListMenu<String> list1;
    private com.raven.component.ListMenu<String> list2;
    private com.raven.component.Menu menu1;
    private com.raven.swing.Panel panel1;
    private javax.swing.JPanel panelMoving;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
