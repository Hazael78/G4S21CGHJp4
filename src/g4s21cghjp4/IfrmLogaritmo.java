/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21cghjp4;

import Operaciones.Avanzado;

/**
 *
 * @author hazae
 */
public class IfrmLogaritmo extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfrmLogaritmo
     */
    public IfrmLogaritmo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtnum1 = new javax.swing.JTextField();
        btnLogaritmo = new javax.swing.JButton();
        lblresultado = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Introduce el numero ");

        btnLogaritmo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnLogaritmo.setForeground(new java.awt.Color(0, 153, 153));
        btnLogaritmo.setText("GO");
        btnLogaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogaritmoActionPerformed(evt);
            }
        });

        lblresultado.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        lblresultado.setForeground(new java.awt.Color(0, 204, 51));
        lblresultado.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnLogaritmo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblresultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogaritmo)
                    .addComponent(lblresultado)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogaritmoActionPerformed
        // TODO add your handling code here:
        Avanzado objavanzado = new Avanzado();
        lblresultado.setText("El resultado del logaritmo de es " + String.valueOf(objavanzado.logaritmo(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnLogaritmoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogaritmo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JTextField txtnum1;
    // End of variables declaration//GEN-END:variables
}
