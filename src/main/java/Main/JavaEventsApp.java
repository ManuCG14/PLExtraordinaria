package Main;

import InterfazGrafica.Principal;
import Logica.GestorUsuarios;

public class JavaEventsApp {

    public static void main(String[] args) {       
        GestorUsuarios gestor = new GestorUsuarios();         
        Principal princ = new Principal(gestor);              
        princ.setVisible(true);   
    }
    
}
