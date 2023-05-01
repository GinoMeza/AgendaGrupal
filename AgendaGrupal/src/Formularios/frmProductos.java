package Formularios;

//Importación de clases
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.cConnection;


public class frmProductos extends javax.swing.JFrame {
    public frmProductos() {
        initComponents();
        setLocationRelativeTo(null);                //Centrado de un formulario
        Columnas();                                 //Llamar a funcion columnas
        MostrarDatosTabla();                     //Llamar a funcion MostrarRegistroTabla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre Producto");

        jLabel2.setText("Stock");

        jLabel3.setText("Precio");

        txtNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProductoKeyTyped(evt);
            }
        });

        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo producto");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel5.setText("Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtStock)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addComponent(btnAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LimpiarCampos(){                     //Funcion de limpieza de campos de texto  
        this.txtCodigo.setText("");
        this.txtNombreProducto.setText("");
        this.txtStock.setText("");
        this.txtPrecio.setText("");
        this.txtCodigo.requestFocus();        
    }
    
    public void Columnas(){                         //Funcion de nombres de las columnas
        DefaultTableModel MiTabla = (DefaultTableModel)tblProductos.getModel();
        String EncabezadoTabla[]={"Codigo","Nombre Producto","Stock","Precio"};         //Asignamos nombre de columnas
        MiTabla = new DefaultTableModel(null,EncabezadoTabla);
        tblProductos.setModel(MiTabla);
    }
    
    public void MostrarDatosTabla(){ //Para que muestre los registros
        try{
            Connection conex = null; //llama la conexion
            DefaultTableModel dTabla = (DefaultTableModel)tblProductos.getModel();
            cConnection conectando = new cConnection(); //llama la clase cConnection
            conex = conectando.getConnection();//retorna conexion
            String Registro[] = new String[4]; //aca el numero lo modificas segun la cantidad de columnas
            String SQL = "Select * from productos"; //sentencia sql para llamar los registros
            Statement sentencia = conex.createStatement(); //crea la sentencia sql
            ResultSet rst = sentencia.executeQuery(SQL); //ejecuta la consulta de la sentencia sql
            while(rst.next()){
                Registro[0] = rst.getString("Id"); //el numero y el nombre que esta en tu BD, en este caso access, se comienza desde cero
                Registro[1] = rst.getString("Nombre"); 
                Registro[2] = rst.getString("Apellido");
                Registro[3] = rst.getString("Correo");
                dTabla.addRow(Registro); //Agrega a cada columna
            }
            tblProductos.setModel(dTabla); //para llamar nuestra tabla
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha producido un error al cargar los datos - " + e);//mensaje de error y el problema a resolver
        }
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(txtCodigo.getText().isEmpty()){                                                  //Campo vacio
            JOptionPane.showMessageDialog(null,"ERROR! Campo codigo invalido");             //Informar error
            txtCodigo.requestFocus();
        } else{
            if(txtNombreProducto.getText().isEmpty()){                                      //CampoVacio
                JOptionPane.showMessageDialog(null,"ERROR! Campo nombre invalido");         //Informar error
                txtNombreProducto.requestFocus();
            }else{
                if(txtStock.getText().isEmpty()){                                           //CampoVacio
                JOptionPane.showMessageDialog(null,"ERROR! Campo stock invalido");         //Informar error
                txtStock.requestFocus();
                } else{
                    if(txtPrecio.getText().isEmpty()){                                      //CampoVacio
                    JOptionPane.showMessageDialog(null,"ERROR! Campo precio invalido");     //Informar error
                    txtPrecio.requestFocus();
                } else{
                    try{
                        Connection con = null;                                              //Crear conexion
                        cConnection conectado = new cConnection();                          //Invocar clase cConnection
                        con = conectado.getConnection();                                    //Conexion remota
                        Statement st = con.createStatement();                               //Creacion de sentancia para base de datos
                        String SQLGuardar = "INSERT INTO productos(Codigo,Nombre producto,Stock,Precio) VALUES(?,?,?,?)";//Sentencia SQL para ingreso de datos
                        //Guardar en la base de datos
                        PreparedStatement pst = con.prepareCall(SQLGuardar);
                        pst.setInt(1,Integer.parseInt(txtCodigo.getText()));                //Guardar Codigo
                        pst.setString(2,txtNombreProducto.getText());                       //Guardar nombre del producto
                        pst.setInt(3,Integer.parseInt(txtStock.getText()));                 //Guardar stock
                        pst.setDouble(4,Double.parseDouble(txtPrecio.getText()));           //Guardar precio
                        int n = pst.executeUpdate();                                        
                        pst.close(); 

                        if (n>0){                                                           //n contiene datos
                            JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente"); //Mensaje en pantalla de confirmación
                            LimpiarCampos();                                                      //Limpiar campos de texto
                            Columnas();                                                 //Datos en encabezado
                            MostrarDatosTabla();                                         //Mostrar los datos en tabla
                        }
                    } catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Error al guardar los datos ERROR: " + e); //Mensaje de error
                    }
                    }
                }
            }
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = this.tblProductos.getSelectedRow();                                          //Asignamos la seleccion en la lista
        if(fila == -1){                                                                     //Sin seleccion
            JOptionPane.showMessageDialog(this,"Selección invalida.");
        } else{
            int eliminar = JOptionPane.showConfirmDialog(null,"¿Está de acuerdo en eliminar este registro?","Pregunta",JOptionPane.ERROR_MESSAGE,JOptionPane.YES_NO_OPTION);
            if(eliminar==JOptionPane.YES_OPTION){
                try{
                    Connection con3 = null;                                                 //Variable de conexión
                    cConnection conectado = new cConnection();                              //Llamar a cConection
                    con3 = conectado.getConnection();                                       //Confirma conexión
                    Statement st = con3.createStatement();                                  //Crear sentendia SQL
                    String SQLEliminar = "DELETE * FROM productos WHERE Codigo = ?";        //Sentencia SQL para eliminar datos de tabla
                    PreparedStatement pst = con3.prepareStatement(SQLEliminar);             //Llamar a SQLEliminar
                    pst.setInt(1,Integer.parseInt(txtCodigo.getText()));                    //Obtener el codigo
                    int n = pst.executeUpdate(); //para ejecutar la consulta sql
                    if(n>0){
                        JOptionPane.showMessageDialog(this,"Eliminado Correctamente.");     //Mensaje de confirmación eliminación
                        LimpiarCampos();                                                          //Limpiar campos
                        Columnas();                                                     //Llamar a funcion mostrar datos de encabezado
                        MostrarDatosTabla();                                             //Llamar a funcion mostrar datos en la tabla
                    }
                } catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Error al eliminar el registro.");   //Mensaje de error
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        //Seleccionar registros de la tabla
        try{
            int fila = tblProductos.getSelectedRow();
            this.txtCodigo.setText(tblProductos.getValueAt(fila, 0).toString());
            this.txtNombreProducto.setText(tblProductos.getValueAt(fila, 1).toString());
            this.txtStock.setText(tblProductos.getValueAt(fila, 2).toString());
            this.txtPrecio.setText(tblProductos.getValueAt(fila, 3).toString());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al seleccionar los datos - "+ e);     //Mensaje de error
        }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila = this.tblProductos.getSelectedRow();                                                  //Asignamos la selección en la lista
        if(fila == -1){                                                                                 //Selección nula
            JOptionPane.showMessageDialog(this,"Para actualizar un registro, debe seleccionarlo primero.");
        } else{
            try{
                Connection con2 = null;                                                                 //Variable de conexión
                cConnection conectando = new cConnection();                                             //Llamar a cConnection
                con2 = conectando.getConnection();                                                      //Confirma conexión
                Statement st = con2.createStatement();                                                  //Crear sentencia SQL
                String SQLModificar = "UPDATE productos SET Nombre producto = ?,Stock = ?,Precio = ? WHERE Codigo = ?";//Sentencia SQL para modificar la fila seleccionada
                PreparedStatement pst = con2.prepareStatement(SQLModificar);                            
                pst.setDouble(4,Double.parseDouble(txtPrecio.getText()));           //Guardar precio
                pst.setInt(1,Integer.parseInt(txtCodigo.getText()));                //Guardar Codigo
                pst.setString(2,txtNombreProducto.getText());                       //Guardar nombre del producto
                pst.setInt(3,Integer.parseInt(txtStock.getText()));                 //Guardar stock
                int s = pst.executeUpdate();
                pst.close();
                
                if(s>0){
                    JOptionPane.showMessageDialog(this,"Datos actualizados correctamente.");
                    LimpiarCampos();                                                        //Limpiar campo de texto
                    Columnas();                                                             //Asignar nombres
                    MostrarDatosTabla();                                                    //Mostrar datos en tabla
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(this,"Error al actualizar los datos - "+ e); //Mensaje de error
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        new frmMenuPrincipal().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();                         //Obtener el codigo ascii del caracter ingresado
        boolean Mayusculas = key >= 65 && key <= 90;        //DeclaraciÃ³n de mayusculas de acuerdo al ascii
        boolean Minusculas = key >= 97 && key <= 122;       //DeclaraciÃ³n de minusculas de acuerdo al ascii
        boolean Espacio = key == 32;                        //DeclaraciÃ³n de espacio de acuerdo al ascii
        if(!(Minusculas || Mayusculas || Espacio)){
            evt.consume();                //Este comando evita que se ingrese el numero
        }
    }//GEN-LAST:event_txtNombreProductoKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        int key = evt.getKeyChar();                         //Obtener el codigo ascii del caracter ingresado
        boolean Numeros = key >= 48 && key <= 57;           //Declaración de numeros de acuerdo al ascii
        if(!(Numeros)){
            evt.consume();                //Este comando evita que se ingrese el numero
        }
    }//GEN-LAST:event_txtStockKeyTyped
    
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
