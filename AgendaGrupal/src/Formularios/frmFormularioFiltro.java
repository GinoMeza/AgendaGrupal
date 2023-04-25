
package agendagrupal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



public class frmFormularioFiltro extends javax.swing.JFrame {
    public frmFormularioFiltro() {
        initComponents();
    }
    TableRowSorter<DefaultTableModel> sorter;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Regresar = new javax.swing.JButton();
        TITULO = new javax.swing.JLabel();
        jButton_mostrar_contactos = new javax.swing.JButton();
        jButton_Limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_datos = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Regresar.setText("Salir");
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

        jTable_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Genero", "Nombre", "Apellido Paterno", "Apellido Materno", "correo", "Fecha neacimiento", "dirección", "telefono"
            }
        ));
        jScrollPane1.setViewportView(jTable_datos);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel1.setText("Ingrese el género que desea filtrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_mostrar_contactos)
                                .addGap(96, 96, 96)
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_Limpiar)
                                .addGap(26, 26, 26)
                                .addComponent(jButton_Regresar)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(TITULO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITULO)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_mostrar_contactos)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
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

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegresarActionPerformed
        System.exit(0);
        /*this.setVisible(false);
        new ventana().setVisible(true);*/
    }//GEN-LAST:event_jButton_RegresarActionPerformed

    private void jButton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimpiarActionPerformed
        Limpiesa();
    }//GEN-LAST:event_jButton_LimpiarActionPerformed

    private void jButton_mostrar_contactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mostrar_contactosActionPerformed
        jTable_datos.setModel(listaContactos());//muestra todos los contactos 
    }//GEN-LAST:event_jButton_mostrar_contactosActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        filtrar();//filtra los contactos por genero poro solo si el boton de mostrar todos los contactos se preciono anteriormente
    }//GEN-LAST:event_jTextField1KeyReleased
    private void Limpiesa(){//se encarga de borrar los datos que aparecen en la tabla pero no los datos guardados
        DefaultTableModel temp = (DefaultTableModel) jTable_datos.getModel();
        int filas = jTable_datos.getRowCount();

        for (int a = 0; filas > a; a++) {
            temp.removeRow(0);
        }
    }
    private void filtrar(){//se encarga de filtrar los contactos basandose en el genero del contacto
    try{
        
        tabla_Filtro();
        sorter.setRowFilter(RowFilter.regexFilter(jTextField1.getText(), 0));        
    }catch(Exception e){}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmFormularioFiltro().setVisible(true);
            }
        });
    }
    
    //FUNCIÓN QUE MUESTRA LOS DATOS DE UN .TXT EN UN JTABLE
    public DefaultTableModel listaContactos(){//este modulo se encarga de mostrartodos los datos de manera general
	Vector cabeceras = new Vector();//crea un array para almacenar los datos que japaremos del .txt
        //usamos addElement para agregar elementos en el array
	cabeceras.addElement("Género");
	cabeceras.addElement("Nombre");
	cabeceras.addElement("Apellido paterno");
        cabeceras.addElement("Apellido materno");
        cabeceras.addElement("Correo");
        cabeceras.addElement("Fecha de nacimiento");
        cabeceras.addElement("Dirección");
        cabeceras.addElement("Teléfono");
	
        //creamos una variable en la que se almacenaran los datos de la tabla
	DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
	try{//captura de posibles errores
		FileReader fr = new FileReader("datos.txt");//abre el .txt
		BufferedReader br = new BufferedReader(fr);//lee los datos de el .txt
		String d;
		while((d= br.readLine())!=null){//la lectura continua hasta que se llegue al final del documento .txt
			StringTokenizer dato = new StringTokenizer(d,"|");//modo de diferenciar la separación de datos
			Vector x = new Vector();
			while(dato.hasMoreTokens()){
				x.addElement(dato.nextToken());
			}
			mdlTabla.addRow(x);
		}
	} catch(Exception e){
		JOptionPane.showMessageDialog(null, "fallo en la apertura del archivo de contactos");
	}
	return mdlTabla;
    }
    
    
    private DefaultTableModel tabla_Filtro(){//este modulo a diferencia del anterior esta para usoexclusivo de el filtrado no eliminar
	Vector cabeceras = new Vector();//crea un array para almacenar los datos que japaremos del .txt
        //usamos addElement para agregar elementos en el array
	cabeceras.addElement("GENERO");
	cabeceras.addElement("NOMBRE");
	cabeceras.addElement("APELLIDO PATERNO");
        cabeceras.addElement("APELLIDO MATERNO");
        cabeceras.addElement("CORREO");
        cabeceras.addElement("FECHA NACIMIENTO");
        cabeceras.addElement("DIRECCIÓN");
        cabeceras.addElement("TELEFONO");
	
        //creamos una variable en la que se almacenaran los datos de la tabla
	DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
        
	try{//captura de posibles errores
		FileReader fr = new FileReader("datos.txt");//abre el .txt
		BufferedReader br = new BufferedReader(fr);//lee los datos de el .txt
		String d;
		while((d= br.readLine())!=null){//la lectura continua hasta que se llegue al final del documento .txt
			StringTokenizer dato = new StringTokenizer(d,"|");//modo de diferenciar la separación de datos
			Vector x = new Vector();
			while(dato.hasMoreTokens()){
				x.addElement(dato.nextToken());
			}
			mdlTabla.addRow(x);
		}
                jTable_datos.setAutoCreateRowSorter(true);
                sorter = new TableRowSorter<>(mdlTabla);
                jTable_datos.setRowSorter(sorter);
	} catch(Exception e){
		JOptionPane.showMessageDialog(null, "fallo en la apertura del archivo de contactos");
	}
	return mdlTabla;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO;
    private javax.swing.JButton jButton_Limpiar;
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JButton jButton_mostrar_contactos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_datos;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
