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
public class IfrmRaizcuadrada extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfrmRaizcuadrada
     */
    public IfrmRaizcuadrada() {
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
        btnRaizcuadrada = new javax.swing.JButton();
        lblresultado = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Introduce el numero ");

        btnRaizcuadrada.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnRaizcuadrada.setForeground(new java.awt.Color(0, 153, 153));
        btnRaizcuadrada.setText("GO");
        btnRaizcuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizcuadradaActionPerformed(evt);
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
                .addComponent(btnRaizcuadrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblresultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRaizcuadrada)
                    .addComponent(lblresultado)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRaizcuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizcuadradaActionPerformed
        // TODO add your handling code here:
        Avanzado objavanzado = new Avanzado();
        lblresultado.setText("El resultado de la raiz cuadrada es " + String.valueOf(objavanzado.rcuadrada(Integer.valueOf(txtnum1.getText()))));
    }//GEN-LAST:event_btnRaizcuadradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRaizcuadrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JTextField txtnum1;
    // End of variables declaration//GEN-END:variables
}
