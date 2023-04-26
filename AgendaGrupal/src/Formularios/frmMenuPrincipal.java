package Formularios;

//Ventana principal del Programa

public class frmMenuPrincipal extends javax.swing.JFrame {
    
    frmRegistrar registrar = new frmRegistrar();
    frmFormularioFiltro filtro = new frmFormularioFiltro();
    
    public frmMenuPrincipal() {
        initComponents();
        setTitle("Agenda");
        registrar.setVisible(false);
        filtro.setVisible(false);
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
        jButtonRegistroContactos = new javax.swing.JButton();
        jButtonReportes = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 153, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Bienvenidos..");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 390, 40));

        jButtonRegistroContactos.setBackground(new java.awt.Color(51, 255, 51));
        jButtonRegistroContactos.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButtonRegistroContactos.setText("Registrar Contacto Nuevo");
        jButtonRegistroContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroContactosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistroContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 240, 100));

        jButtonReportes.setBackground(new java.awt.Color(51, 255, 204));
        jButtonReportes.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButtonReportes.setText("Reportes");
        jButtonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 240, 100));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book-agenda-table-notes.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 554, 397));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistroContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroContactosActionPerformed
        // esta parte envia a los registros
        this.setVisible(false);
        new frmRegistrar().setVisible(true);
    }//GEN-LAST:event_jButtonRegistroContactosActionPerformed

    private void jButtonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportesActionPerformed
        // esta parte envia a los reportes
        this.setVisible(false);
        new frmFormularioFiltro().setVisible(true);
    }//GEN-LAST:event_jButtonReportesActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistroContactos;
    private javax.swing.JButton jButtonReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
