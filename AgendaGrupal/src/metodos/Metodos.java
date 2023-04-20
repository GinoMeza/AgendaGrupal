package metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.util.Formatter;
import java.util.Properties;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;

public class Metodos {
    
    Vector vPrincipal = new Vector();
    
    //Procedimiento para guardar datos en 1 vector
    public void guardar(Alumno unAlumno){
        vPrincipal.addElement(unAlumno);
    }
    
    //Procedimiento para guardar en un archivo txt  
    public void guardarArchivo(Alumno alumno){
        try{
            FileWriter fw = new FileWriter("Alumnos.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(pw);
            pw.print(alumno.getCodigo());
            pw.print("|"+alumno.getNombre());
            pw.println("|"+alumno.getEdad());
            pw.close();
        } catch (Exception e) {
            JOptinePane.showMessageDialog(null, e);
        }
    }
    
    //Funcion para mostrar los datos en un jtable
    public DefaultTableModel listAlumnos(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Codigo: ");
        cabeceras.addElement("Codigo: ");
        cabeceras.addElement("Codigo: ");
        //Creamos un vector que contenga codigo, nombre, edad
        //Creamos un modelo de tabla para agregar el vector, en la ubicacion 0
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
        
        try{
            FileReader fr = new FileReader("Alumnos.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d= br.readLine())!=null){
                StringTokenizer dato = new StringTolenizer(d,"|");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x):
            }
        } catch(Exception e){
            JOptinePane.showMessageDialog(null,e);
        }
        
        return mdlTabla;
    }
}
