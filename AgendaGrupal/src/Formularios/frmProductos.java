package Formularios;

import java.beans.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import persistencia.cConnection;


public class frmProductos extends javax.swing.JFrame {
    public frmProductos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btn_regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        Productos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel4.setText("ID producto");

        btn_regresar.setText("regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Precio");

        jLabel3.setText("Stock");

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        Productos.setText("Productos");

        jLabel5.setText("Categoria");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(83, 83, 83)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel5)))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtApellido)
                                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(134, 134, 134)
                                        .addComponent(btnGuardar))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(Productos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Productos)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btn_regresar)
                    .addComponent(btnEliminar))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = this.tblDatos.getSelectedRow(); //para selecionar la fila
        if(fila == -1){ //si no esta seleccionada
            JOptionPane.showMessageDialog(this,"Para eliminar un registro, debe seleccionarlo primero.");
        } else{
            int eliminar = JOptionPane.showConfirmDialog(null,"¿Esta de acuerdo en eliminar este registro?","Pregunta",JOptionPane.ERROR_MESSAGE,JOptionPane.YES_NO_OPTION);
            if(eliminar==JOptionPane.YES_OPTION){
                try{
                    Connection con3 = null; //para la variable conectar
                    cConnection conectado = new cConnection();//llama la clase cConnection
                    con3 = conectado.getConnection(); //retorna conexion
                    Statement st = con3.createStatement(); //crear sentencia sql
                    //Sentencia sql para eliminar datos
                    String SQLEliminar = "DELETE * FROM datos WHERE Id = ?";
                    PreparedStatement pst = con3.prepareStatement(SQLEliminar); //llama a SQLEliminar

                    pst.setInt(1,Integer.parseInt(txtid.getText())); //Solo necesitamos este dato

                    int n = pst.executeUpdate(); //para ejecutar la consulta sql
                    if(n>0){
                        JOptionPane.showMessageDialog(this,"Registro eliminado Correctamente");
                        Limpiar(); //llama la funcion limpiar
                        MostrarDatos(); //llama la funcion mostrar datos de encabezado
                        MostrarRegistroTabla(); //llama funcion de mostrar registros en la tabla
                    }
                } catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Ha ocurrido un error al eliminar el registro");
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = this.tblDatos.getSelectedRow(); //para selecionar la fila
        if(fila == -1){ //si no esta seleccionada
            JOptionPane.showMessageDialog(this,"Para actualizar un registro, debe seleccionarlo primero.");
        } else{
            try{
                Connection con2 = null; //llama la conexion
                cConnection conectando = new cConnection(); //llama la clase cConnection
                con2 = conectando.getConnection();//retorna conexion
                Statement st = con2.createStatement(); //crea una sentencia sql
                //Sentencia sql para poder modificar la fila seleccionada
                String SQLModificar = "UPDATE datos SET Nombre = ?,Apellido = ?,Correo = ? WHERE Id = ?";
                PreparedStatement pst = con2.prepareStatement(SQLModificar); //llamamos nuestra sentencia sql
                pst.setInt(4,Integer.parseInt(txtid.getText())); //guarda lo del campo txtid a la base de datos, el 4 es de la cantidad de columnas
                pst.setString(1,txtNombre.getText()); //guarda lo del campo txtNombre a la base de datos
                pst.setString(2,txtApellido.getText()); //guarda lo del campo txtApellido a la base de datos
                pst.setString(3,txtCorreo.getText()); //guarda lo del campo txtCorreo a la base de datos
                int s = pst.executeUpdate();
                pst.close();

                if(s>0){
                    JOptionPane.showMessageDialog(this,"Datos actualizados correctamente");
                    Limpiar(); //para limpiar los casilleros
                    MostrarDatos(); //para mostrar los nombres de cada columna
                    MostrarRegistroTabla(); //para mostrar los datos en la tabla
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(this,"Error al actualizar los datos - "+ e); //mensaje de error y el problema;
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        this.setVisible(false);
        new frmMenuPrincipal().setVisible(true);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        //Seleccionar registros de la tabla

        try{
            int fila = tblDatos.getSelectedRow();
            this.txtid.setText(tblDatos.getValueAt(fila, 0).toString());
            this.txtNombre.setText(tblDatos.getValueAt(fila, 1).toString());
            this.txtApellido.setText(tblDatos.getValueAt(fila, 2).toString());
            this.txtCorreo.setText(tblDatos.getValueAt(fila, 3).toString());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al seleccionar los datos - "+ e);
        }
    }//GEN-LAST:event_tblDatosMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtid.getText().isEmpty()){ //si esta vacion nombre
            JOptionPane.showMessageDialog(null,"Falta ingresar el ID");//para se ingrese dato nombre
            txtid.requestFocus();
        } else{
            if(txtNombre.getText().isEmpty()){ //si esta vacion apellido
                JOptionPane.showMessageDialog(null,"Falta ingresar Nombre");//para que se ingrese dato apellido
                txtNombre.requestFocus();
            }else{
                try{
                    Connection con = null; //para la variable conectar
                    cConnection conectado = new cConnection();//llama la clase cConnection
                    con = conectado.getConnection(); //retorna conexion
                    Statement st = con.createStatement(); //crear sentencia sql

                    //Sentencia SQL para ingresar datos
                    String SQLGuardar = "INSERT INTO datos(Id,Nombre,Apellido,Correo) VALUES(?,?,?,?)";
                    PreparedStatement pst = con.prepareCall(SQLGuardar); //llama a SQLGuardar
                    pst.setInt(1,Integer.parseInt(txtid.getText())); //guarda id, siempre comienza desde 1
                    pst.setString(2,txtNombre.getText()); //guarda nombre
                    pst.setString(3,txtApellido.getText()); //guarda apellido
                    pst.setString(4,txtCorreo.getText()); //guarda correo
                    int n = pst.executeUpdate(); //ejecuta sentencia SQL
                    pst.close(); //para cerrar prepareStatement

                    if (n>0){ //preguntamos si tiene datos
                        JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente"); //mensaje de guardado correctamente
                        Limpiar(); //llama funcion limpiar
                        MostrarDatos(); //llama funcion mostrar datos de encabezado
                        MostrarRegistroTabla(); //llama funcion de mostrar datos tabla
                    }
                } catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error al guardar los datos - " + e); //Muestra mensaje de error y el error correspondiente
                }
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Productos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
