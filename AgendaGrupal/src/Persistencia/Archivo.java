/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Contacto;
import java.io.*;
import java.util.*;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Archivo {

    Vector vPrincipal = new Vector();
    
    //Procedimientop para guardar datos en 1 vector
    public void guardar(Contacto contacto){
        vPrincipal.addElement(contacto);
    }
    
    //Procedimiento para guardar en un archivo txt
    public void guardarArchivo(Contacto contacto){
        try{
            FileWriter fw = new FileWriter("datos.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(contacto.getGenero());
            pw.print("|"+contacto.getNombre());
            pw.print("|"+contacto.getNombre());
            pw.print("|"+contacto.getApellidoPaterno());
            pw.print("|"+contacto.getApellidoMaterno());
            pw.print("|"+contacto.getCorreo());
            pw.print("|"+contacto.getFechaNacimiento());
            pw.print("|"+contacto.getDireccion());
            pw.println(" "+contacto.getTelefono());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    File datos;

    public void crearArchivo() {
        datos = new File("datos.txt");

        try {
            if (datos.createNewFile()) { //crea un nuevo archivo, si ya existe no hace nada
                JOptionPane.showMessageDialog(null, "Archivo creado");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha sucedido un error" + ex);
        }

    }

    

   
}