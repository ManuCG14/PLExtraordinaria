package Main;

import InterfazGrafica.Principal;
import Logica.Cliente;
import Logica.GestorEventos;
import Logica.GestorReservas;
import Logica.GestorUsuarios;

public class JavaEventsApp {

    public static void main(String[] args) {       
        GestorUsuarios gestorUsuarios = new GestorUsuarios();    
        GestorEventos gestorEventos = new GestorEventos();
        GestorReservas gestorReservas = new GestorReservas();
        Principal princ = new Principal(gestorUsuarios, gestorEventos, gestorReservas);              
        princ.setVisible(true);   
    }
    
}