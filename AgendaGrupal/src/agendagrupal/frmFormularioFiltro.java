
package agendagrupal;

import javax.swing.table.DefaultTableModel;


public class frmFormularioFiltro extends javax.swing.JFrame {
    public frmFormularioFiltro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Regresar = new javax.swing.JButton();
        TITULO = new javax.swing.JLabel();
        jButton_mostrar_contactos = new javax.swing.JButton();
        jButton_Limpiar = new javax.swing.JButton();
        jButton_Buscar_varones = new javax.swing.JButton();
        jButton_buscar_mujeres = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Regresar.setText("regresar");
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegresarActionPerformed(evt);
            }
        });

        TITULO.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        TITULO.setText("FILTRO DE CONTACTOS");
        TITULO.setToolTipText("");

        jButton_mostrar_contactos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_mostrar_contactos.setText("Mostrar tosdos los contactos");
        jButton_mostrar_contactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mostrar_contactosActionPerformed(evt);
            }
        });

        jButton_Limpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Limpiar.setText("Limpiar");
        jButton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimpiarActionPerformed(evt);
            }
        });

        jButton_Buscar_varones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Buscar_varones.setText("Mostrar contactos varones");
        jButton_Buscar_varones.setToolTipText("");
        jButton_Buscar_varones.setActionCommand("");
        jButton_Buscar_varones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Buscar_varonesActionPerformed(evt);
            }
        });

        jButton_buscar_mujeres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_buscar_mujeres.setText("Mostrar contactos mujeres");
        jButton_buscar_mujeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscar_mujeresActionPerformed(evt);
            }
        });

        jTable_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Genero", "Nombre", "Apellido Paterno", "Apellido Materno", "correo", "Fecha neacimiento", "dirección", "telefono"
            }
        ));
        jScrollPane1.setViewportView(jTable_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(TITULO)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_mostrar_contactos)
                                .addGap(44, 44, 44)
                                .addComponent(jButton_Buscar_varones, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButton_buscar_mujeres, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_Limpiar)
                                .addGap(26, 26, 26)
                                .addComponent(jButton_Regresar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITULO)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_mostrar_contactos)
                    .addComponent(jButton_Buscar_varones)
                    .addComponent(jButton_buscar_mujeres))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Regresar)
                    .addComponent(jButton_Limpiar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Buscar_varonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Buscar_varonesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Buscar_varonesActionPerformed

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegresarActionPerformed
        System.exit(0);
        /*this.setVisible(false);
        new ventana().setVisible(true);*/
    }//GEN-LAST:event_jButton_RegresarActionPerformed

    private void jButton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimpiarActionPerformed
        DefaultTableModel temp = (DefaultTableModel) jTable_datos.getModel();
        int filas = jTable_datos.getRowCount();

        for (int a = 0; filas > a; a++) {
            temp.removeRow(0);
        }
    }//GEN-LAST:event_jButton_LimpiarActionPerformed

    private void jButton_buscar_mujeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscar_mujeresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_buscar_mujeresActionPerformed

    private void jButton_mostrar_contactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mostrar_contactosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_mostrar_contactosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFormularioFiltro().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO;
    private javax.swing.JButton jButton_Buscar_varones;
    private javax.swing.JButton jButton_Limpiar;
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JButton jButton_buscar_mujeres;
    private javax.swing.JButton jButton_mostrar_contactos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_datos;
    // End of variables declaration//GEN-END:variables
}
