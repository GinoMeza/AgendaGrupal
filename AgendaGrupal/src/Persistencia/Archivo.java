/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Contacto;
import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Archivo {

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

    public void agregarRegistro(Contacto contacto) {
        try {
            FileWriter escribir = new FileWriter(datos, true); //el boolean true indica que vamos a añadir y no sobreescribir 
            
            escribir.append("Genero:" + contacto.getGenero()  + " ");
            escribir.append("\nNombre:" + contacto.getNombre()  + " ");
            escribir.append("\nApellidoPaterno:" + contacto.getApellidoPaterno()  + " ");
            escribir.append("\nApellidoMaterno:" + contacto.getApellidoMaterno()  + " ");
            escribir.append("\nCorreo:" + contacto.getCorreo()  + " " );
            escribir.append("\nFechaNacimiento:" + contacto.getFechaNacimiento()  + " " );
            escribir.append("\nDirección:" + contacto.getDireccion()  + " " );
            escribir.append("\nTelefono:" + contacto.getTelefono()  + " " );
            escribir.append("\n*****\n");
            escribir.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha sucedido un error" + ex);
        }
    }

    public Contacto leerRegistro() {
        String cadena = "algo"; //para leer el registro
        String registroCompleto[] = new String[5]; //usado para recuperar los datos de contacto
        String datoFinal[] = new String[5];
        Contacto contacto = new Contacto(); // el valor que voy a retornar
        String genero, nombre, apellidopaterno, apellidomaterno, correo, fechanacimiento, direccion, telefono;
        int contadorReg = 0;

        try {
            FileReader lector = new FileReader(datos);
            BufferedReader lectura = new BufferedReader(lector);

            try {
                cadena = lectura.readLine();
                System.out.println(cadena);
                while (cadena != null && !cadena.equals("*****")) { //recupera 1 registro

                    cadena = lectura.readLine();
                    System.out.println(cadena);
                    registroCompleto[contadorReg] = cadena; //guardo los datos en un vector para despues pasarlos a persona
                    contadorReg++;
                }
                for (int i = 0; i < 7; i++) {
                    String[] parts = registroCompleto[i].split(":");
                    datoFinal[i] = parts[1];
                }
                contacto.setGenero(datoFinal[0]);
                contacto.setNombre(datoFinal[1]);
                contacto.setApellidoPaterno(datoFinal[2]);
                contacto.setApellidoMaterno(datoFinal[3]);
                contacto.setCorreo(datoFinal[4]);
                contacto.setFechaNacimiento(datoFinal[5]);
                contacto.setDireccion(datoFinal[6]);
                contacto.setTelefono(datoFinal[7]);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Ha sucedido un error" + ex);
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ha sucedido un error" + ex);
        }

        return contacto;
    }

    public List leerTodosLosRegistros() {
        ArrayList<String> recupero = new ArrayList<String>();
        String cadena = "algo"; //para leer cada linea y controlar si se llego al fin del archivo
        String registro[] = new String[5]; // para guardar cada registro del archivo
        String datoFinal;

        //comienzo lectura del archivo
        try {
            FileReader lector = new FileReader(datos); //abrir archivo para leer 
            BufferedReader lectura = new BufferedReader(lector); //abrir archivo para leer

            while (cadena != null){ //veo si es el final del archivo
                int contadorRegistro = 0;
                try {
                    cadena = lectura.readLine();
                    
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Ha sucedido un error" + ex);
                }
                
                while ( cadena != null && !cadena.equals("*****")) {
                    if (cadena.contains(":")) {                       
                        String partes = cadena.split(":")[1];
                        datoFinal = partes; //probado, recupera los registros divididos
                        registro[contadorRegistro] = datoFinal; // probado, guarda los registros
                        recupero.add(registro[contadorRegistro]); //agrego lo recuperado a una lista
                        contadorRegistro++;
                    } else {
                        throw new IllegalArgumentException("String " + cadena + " no contiene :");
                    }

                    //vuelvo a leer la siguiente cadena
                    try {
                        cadena = lectura.readLine();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Ha sucedido un error" + ex);
                    }
               
                }
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ha sucedido un error" + ex);
        }
      
        return recupero;
    }

   
}