package Formularios;


import javax.swing.JOptionPane;
import Logica.Contacto;
import Persistencia.Archivo;

public class frmRegistrar extends javax.swing.JFrame {

    Archivo archivo = new Archivo();
    Contacto contacto = new Contacto();
    
    public frmRegistrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellidos paterno:");

        jLabel3.setText("Apellidos materno:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Fecha de nacimiento:");

        jLabel7.setText("Correo electronico:");

        jLabel8.setText("Sexo:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });

        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyTyped(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        txtCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtFechaNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaNacimientoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnRegistrar)
                        .addGap(58, 58, 58)
                        .addComponent(btnVolver)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnVolver))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        String genero = txtGenero.getText();
        String nombre = txtNombre.getText();
        String apellidopaterno = txtApellidoPaterno.getText();
        String apellidomaterno = txtApellidoMaterno.getText();
        String correo = txtCorreoElectronico.getText();
        String fechanacimiento = txtFechaNacimiento.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        
        contacto.setGenero(genero);
        contacto.setNombre(nombre);
        contacto.setApellidoPaterno(apellidopaterno);
        contacto.setApellidoMaterno(apellidomaterno);
        contacto.setCorreo(correo);
        contacto.setFechaNacimiento(fechanacimiento);
        contacto.setGenero(direccion);
        contacto.setTelefono(telefono);
        
        archivo.guardar(contacto);
        archivo.guardarArchivo(contacto);
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        new frmMenuPrincipal().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int key = evt.getKeyChar();                         //Obtener el codigo ascii del caracter ingresado
        
        boolean Mayusculas = key >= 65 && key <= 90;        //Declaración de mayusculas de acuerdo al ascii
        boolean Minusculas = key >= 97 && key <= 122;       //Declaración de minusculas de acuerdo al ascii
        boolean Espacio = key == 32;                        //Declaración de espacio de acuerdo al ascii
        boolean Numeros = key >= 48 && key <= 57;           //Declaración de numeros de acuerdo al ascii
        
        if(!(Minusculas || Mayusculas || Espacio)){
            JOptionPane.showMessageDialog(this,"No se pone un número en nombre.");      //Lanzar un mensaje donde se advierta que no van números
            evt.consume();                //Este comando evita que se ingrese el numero
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped
        int key = evt.getKeyChar();                         //Obtener el codigo ascii del caracter ingresado
        
        boolean Mayusculas = key >= 65 && key <= 90;        //Declaración de mayusculas de acuerdo al ascii
        boolean Minusculas = key >= 97 && key <= 122;       //Declaración de minusculas de acuerdo al ascii
        boolean Espacio = key == 32;
        
        if(!(Minusculas || Mayusculas || Espacio)){
            //JOptionPane.showMessageDialog(this,"No se pone un número en nombre.");      //Lanzar un mensaje donde se advierta que no van números
            evt.consume();                //Este comando evita que se ingrese el numero
        }
    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void txtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyTyped
        int key = evt.getKeyChar();                         //Obtener el codigo ascii del caracter ingresado
        
        boolean Mayusculas = key >= 65 && key <= 90;        //Declaración de mayusculas de acuerdo al ascii
        boolean Minusculas = key >= 97 && key <= 122;       //Declaración de minusculas de acuerdo al ascii
        boolean Espacio = key == 32;
        
        if(!(Minusculas || Mayusculas || Espacio)){
            //JOptionPane.showMessageDialog(this,"No se pone un número en nombre.");      //Lanzar un mensaje donde se advierta que no van números
            evt.consume();                //Este comando evita que se ingrese el numero
        }
    }//GEN-LAST:event_txtApellidoMaternoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        /*int key = evt.getKeyChar();                         //Obtener el codigo ascii del caracter ingresado
        
        boolean Mayusculas = key >= 65 && key <= 90;        //Declaración de mayusculas de acuerdo al ascii
        boolean Minusculas = key >= 97 && key <= 122;       //Declaración de minusculas de acuerdo al ascii
        boolean Espacio = key == 32;
        
        
        if(!(Minusculas || Mayusculas || Espacio)){
            //JOptionPane.showMessageDialog(this,"No se pone un número en nombre.");      //Lanzar un mensaje donde se advierta que no van números
            evt.consume();                //Este comando evita que se ingrese el numero
        }*/
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtFechaNacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaNacimientoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoKeyTyped

    private void txtCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronicoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
