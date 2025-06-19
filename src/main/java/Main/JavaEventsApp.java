package Main;

import InterfazGrafica.Principal;
import Logica.GestorEventos;
import Logica.GestorUsuarios;

public class JavaEventsApp {

    public static void main(String[] args) {       
        GestorUsuarios gestorUsuarios = new GestorUsuarios();    
        GestorEventos gestorEventos = new GestorEventos();
        Principal princ = new Principal(gestorUsuarios, gestorEventos);              
        princ.setVisible(true);   
    }
    
}
