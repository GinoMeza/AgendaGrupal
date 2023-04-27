package Formularios;

import javax.swing.JOptionPane;
import Logica.Contacto;
import java.text.SimpleDateFormat;
import Persistencia.Archivo;

public class frmRegistrar extends javax.swing.JFrame {

    Archivo archivo = new Archivo();
    Contacto contacto = new Contacto();
    
    public frmRegistrar() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtCorreoElectronico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        opcMasculino = new javax.swing.JRadioButton();
        opcFemenino = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefono:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Dirección:");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

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

        jLabel1.setText("Nombre");

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        jLabel2.setText("Apellidos paterno:");

        jLabel3.setText("Apellidos materno:");

        buttonGroup1.add(opcMasculino);
        opcMasculino.setText("Masculino");
        opcMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcMasculinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(opcFemenino);
        opcFemenino.setText("Femenino");
        opcFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcFemeninoActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(opcMasculino)
                                .addGap(35, 35, 35)
                                .addComponent(opcFemenino))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnRegistrar)
                        .addGap(58, 58, 58)
                        .addComponent(btnVolver)))
                .addContainerGap(75, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(opcMasculino)
                    .addComponent(opcFemenino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronicoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //Declaracion de variables
        String fechaNacimiento,nombre,apellidoPaterno,apellidoMaterno, correo,direccion,telefono;
        boolean genero; 
        
        //Obtener los datos llenados en los campos de texto
        //String genero = txtGenero.getText();
        nombre = txtNombre.getText();
        apellidoPaterno = txtApellidoPaterno.getText();
        apellidoMaterno = txtApellidoMaterno.getText();
        correo = txtCorreoElectronico.getText();
        direccion = txtDireccion.getText();
        telefono = txtTelefono.getText();
        
        //Obteniendo fecha de nacimiento
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-mm-yyyy");            // Cambiar el formato de las fechas
        fechaNacimiento = dFormat.format(txtFechaNacimiento.getDate());         // Obtener la fecha asignada
        //String fechanacimiento = txtFechaNacimiento.getText();
        
        //Obteniendo el sexo marcado
        if(opcMasculino.isSelected()){
            genero = true;        // Dependiendo de la opcion marcada se pasa un valor booleando de true = masculino
            contacto.setGenero(genero);         //Mandar al objeto declarado la opcion seleccionada
        }else{
            if(opcFemenino.isSelected()){
                genero = false;       // Dependiendo de la opcion marcada se pasa un valor booleando de true = masculino
                contacto.setGenero(genero);         //Mandar al objeto declarado la opcion seleccionada
            }else{
                JOptionPane.showMessageDialog(this,"Selección de sexo invalida.");
            }
        }
        
        //Mandar al objeto declarado la opcion seleccionada
        contacto.setNombre(nombre);
        contacto.setApellidoPaterno(apellidoPaterno);
        contacto.setApellidoMaterno(apellidoMaterno);
        contacto.setCorreo(correo);
        contacto.setFechaNacimiento(fechaNacimiento);
        //contacto.setGenero(direccion);
        contacto.setTelefono(telefono);
        
        archivo.guardar(contacto);
        archivo.guardarArchivo(contacto);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        new frmMenuPrincipal().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int key = evt.getKeyChar();                         //Obtener el codigo ascii del caracter ingresado

        boolean Mayusculas = key >= 65 && key <= 90;        //Declaración de mayusculas de acuerdo al ascii
        boolean Minusculas = key >= 97 && key <= 122;       //Declaración de minusculas de acuerdo al ascii
        boolean Espacio = key == 32;                        //Declaración de espacio de acuerdo al ascii
        boolean Numeros = key >= 48 && key <= 57;           //Declaración de numeros de acuerdo al ascii

        if(!(Minusculas || Mayusculas || Espacio)){
            //JOptionPane.showMessageDialog(this,"No se pone un número en nombre.");      //Lanzar un mensaje donde se advierta que no van números
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
        int key = evt.getKeyChar();                         //Obtener el codigo ascii del caracter ingresado

        boolean Mayusculas = key >= 65 && key <= 90;        //Declaración de mayusculas de acuerdo al ascii
        boolean Minusculas = key >= 97 && key <= 122;       //Declaración de minusculas de acuerdo al ascii
        boolean Espacio = key == 32;

        if(!(Minusculas || Mayusculas || Espacio)){
            //JOptionPane.showMessageDialog(this,"No se pone un número en nombre.");      //Lanzar un mensaje donde se advierta que no van números
            evt.consume();                //Este comando evita que se ingrese el numero
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void opcMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcMasculinoActionPerformed

    private void opcFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcFemeninoActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrar().setVisible(true);
            }
        });
    }

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
    private javax.swing.JRadioButton opcFemenino;
    private javax.swing.JRadioButton opcMasculino;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtDireccion;
    private com.toedter.calendar.JDateChooser txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
