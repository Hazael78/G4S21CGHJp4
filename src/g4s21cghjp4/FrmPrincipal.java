/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21cghjp4;

/**
 *
 * @author hazae
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        d_p_contenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        m_i_suma = new javax.swing.JMenuItem();
        m_i_resta = new javax.swing.JMenuItem();
        m_i_divi = new javax.swing.JMenuItem();
        m_i_multi = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        m_i_poten = new javax.swing.JMenuItem();
        m_i_fact = new javax.swing.JMenuItem();
        m_i_log = new javax.swing.JMenuItem();
        m_i_racua = new javax.swing.JMenuItem();
        m_i_racu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout d_p_contenedorLayout = new javax.swing.GroupLayout(d_p_contenedor);
        d_p_contenedor.setLayout(d_p_contenedorLayout);
        d_p_contenedorLayout.setHorizontalGroup(
            d_p_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );
        d_p_contenedorLayout.setVerticalGroup(
            d_p_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        jMenu1.setText("Operaciones");

        jMenu5.setText("Basicas");

        m_i_suma.setText("Suma");
        m_i_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_sumaActionPerformed(evt);
            }
        });
        jMenu5.add(m_i_suma);

        m_i_resta.setText("Resta");
        m_i_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_restaActionPerformed(evt);
            }
        });
        jMenu5.add(m_i_resta);

        m_i_divi.setText("Division");
        m_i_divi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_diviActionPerformed(evt);
            }
        });
        jMenu5.add(m_i_divi);

        m_i_multi.setText("Multiplicacion");
        m_i_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_multiActionPerformed(evt);
            }
        });
        jMenu5.add(m_i_multi);

        jMenu1.add(jMenu5);

        jMenu6.setText("Avanzadas");

        m_i_poten.setText("Potencia");
        m_i_poten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_potenActionPerformed(evt);
            }
        });
        jMenu6.add(m_i_poten);

        m_i_fact.setText("Factorial");
        m_i_fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_factActionPerformed(evt);
            }
        });
        jMenu6.add(m_i_fact);

        m_i_log.setText("Logaritmo");
        m_i_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_logActionPerformed(evt);
            }
        });
        jMenu6.add(m_i_log);

        m_i_racua.setText("Raiz Cuadrada");
        m_i_racua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_racuaActionPerformed(evt);
            }
        });
        jMenu6.add(m_i_racua);

        m_i_racu.setText("Raiz Cubica");
        m_i_racu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_i_racuActionPerformed(evt);
            }
        });
        jMenu6.add(m_i_racu);

        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d_p_contenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d_p_contenedor)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_i_diviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_diviActionPerformed
        // TODO add your handling code here:
        IfrmDivi objdivi =new IfrmDivi();
        objdivi.setVisible(true);
        d_p_contenedor.add(objdivi);
    }//GEN-LAST:event_m_i_diviActionPerformed

    private void m_i_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_sumaActionPerformed
        // TODO add your handling code here:
        IfrmSuma objsuma =new IfrmSuma();
        objsuma.setVisible(true);
        d_p_contenedor.add(objsuma);
    }//GEN-LAST:event_m_i_sumaActionPerformed

    private void m_i_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_restaActionPerformed
        // TODO add your handling code here:
        IfrmResta objresta =new IfrmResta();
        objresta.setVisible(true);
        d_p_contenedor.add(objresta);
    }//GEN-LAST:event_m_i_restaActionPerformed

    private void m_i_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_multiActionPerformed
        // TODO add your handling code here:
        IfrmMulti objmulti =new IfrmMulti();
        objmulti.setVisible(true);
        d_p_contenedor.add(objmulti);
    }//GEN-LAST:event_m_i_multiActionPerformed

    private void m_i_potenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_potenActionPerformed
        // TODO add your handling code here:
        IfrmPotencia objpotencia =new IfrmPotencia();
        objpotencia.setVisible(true);
        d_p_contenedor.add(objpotencia);
    }//GEN-LAST:event_m_i_potenActionPerformed

    private void m_i_factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_factActionPerformed
        // TODO add your handling code here:
        IfrmFactorial objfactorial =new IfrmFactorial();
        objfactorial.setVisible(true);
        d_p_contenedor.add(objfactorial);
    }//GEN-LAST:event_m_i_factActionPerformed

    private void m_i_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_logActionPerformed
        // TODO add your handling code here:
        IfrmLogaritmo objlogaritmo =new IfrmLogaritmo();
        objlogaritmo.setVisible(true);
        d_p_contenedor.add(objlogaritmo);
    }//GEN-LAST:event_m_i_logActionPerformed

    private void m_i_racuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_racuaActionPerformed
        // TODO add your handling code here:
        IfrmRaizcuadrada objraizcuadrada =new IfrmRaizcuadrada();
        objraizcuadrada.setVisible(true);
        d_p_contenedor.add(objraizcuadrada);
    }//GEN-LAST:event_m_i_racuaActionPerformed

    private void m_i_racuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_i_racuActionPerformed
        // TODO add your handling code here:
        IfrmRaizcubica objraizcubica =new IfrmRaizcubica();
        objraizcubica.setVisible(true);
        d_p_contenedor.add(objraizcubica);
    }//GEN-LAST:event_m_i_racuActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane d_p_contenedor;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem m_i_divi;
    private javax.swing.JMenuItem m_i_fact;
    private javax.swing.JMenuItem m_i_log;
    private javax.swing.JMenuItem m_i_multi;
    private javax.swing.JMenuItem m_i_poten;
    private javax.swing.JMenuItem m_i_racu;
    private javax.swing.JMenuItem m_i_racua;
    private javax.swing.JMenuItem m_i_resta;
    private javax.swing.JMenuItem m_i_suma;
    // End of variables declaration//GEN-END:variables
}
