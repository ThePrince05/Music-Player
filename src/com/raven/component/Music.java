
package com.raven.component;


import com.raven.model.Model_Music;
import com.raven.swing.ScrollBar;
import java.awt.Color;


public class Music extends javax.swing.JPanel {

   
    public Music() {
        initComponents();
        init();
    }

    private void init(){
              
            List.addItem(new Model_Music("1","Peace of Mind (feat. Vargas $ Lagola)","03:15"));
            List.addItem(new Model_Music("2","Heaven","04:37"));
            List.addItem(new Model_Music("3","SOS (feat. Aloe Blacc)","02:37"));
            List.addItem(new Model_Music("4","Bad Reputation (feat. Joe Blacc)","02:37"));
            List.addItem(new Model_Music("5","Ain't A Thing","03:03"));
            List.addItem(new Model_Music("6","Hold The Line (feat. A R I Z O N A)","02:51"));
            List.addItem(new Model_Music("7","Freak (feat. Bonn)","02:59"));
            List.addItem(new Model_Music("8","Excuse Me Mr Sir (feat. Vargas & Lagola)","03:07"));
            List.addItem(new Model_Music("9","Heart Upon My Sleeve (feat. Imagine Dragons)","04:14"));
            List.addItem(new Model_Music("10","Never Leave Me (feat. Joe Janiak)","02:58"));
            List.addItem(new Model_Music("11","Fades Away (feat. Noonie Bao)","02:58"));
            List.addItem(new Model_Music("12","Wake Me Up","04:07"));
            List.addItem(new Model_Music("13","You Wake Me","03:53"));
            List.addItem(new Model_Music("14","Hey Brother","04:15"));
            List.addItem(new Model_Music("15","Addicted To You","02:28"));

         }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        List = new com.raven.component.ListMusic<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Most Trending Music");

        List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(List, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(List, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.ListMusic<String> List;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
