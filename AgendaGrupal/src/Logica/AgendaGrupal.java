
package Logica;

import Formularios.frmMenuPrincipal;
import Persistencia.Archivo;
import java.util.*;

        
public class AgendaGrupal {

    public static void main(String[] args) {
        
        //Crear y hacer visible el formulario
        frmMenuPrincipal formulario = new frmMenuPrincipal();
        formulario.setVisible(true);
        
        Archivo datos = new Archivo();
        
        datos.crearArchivo();   //Para crear la base de datos
    }
    
}
