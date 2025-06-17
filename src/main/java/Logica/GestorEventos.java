package Logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestorEventos {
    private List<Evento> eventos;

    public GestorEventos() {
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public boolean eliminarEvento(String titulo) {
        Iterator<Evento> it = eventos.iterator();
        while (it.hasNext()) {
            Evento e = it.next();
            if (e.getTitulo().equalsIgnoreCase(titulo)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean modificarEvento(String tituloOriginal, Evento eventoModificado) {
        for (int i = 0; i < eventos.size(); i++) {
            if (eventos.get(i).getTitulo().equalsIgnoreCase(tituloOriginal)) {
                eventos.set(i, eventoModificado);
                return true;
            }
        }
        return false;
    }

    public List<Evento> listarEventos() {
        return new ArrayList<>(eventos);
    }
    
    public List<Evento> buscarPorCiudad(String ciudad) {
        List<Evento> resultado = new ArrayList<>();
        for (Evento e : eventos) {
            if (e.getDireccion().getCiudad().equalsIgnoreCase(ciudad)) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    public List<Evento> buscarPorTipo(String tipo) {
        List<Evento> resultado = new ArrayList<>();
        for (Evento e : eventos) {
            if (e.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    public List<Evento> buscarPorFecha(LocalDate fechaDesde) {
        List<Evento> resultado = new ArrayList<>();
        for (Evento e : eventos) {
            for (LocalDate f : e.getFechasComoLocalDate()) {
                if (!f.isBefore(fechaDesde)) { 
                    resultado.add(e);
                    break; 
                }
            }
        }
        return resultado;
    }

    public List<Evento> buscarEventosCombinados(String ciudad, String tipo, LocalDate fechaDesde) {
        List<Evento> resultado = new ArrayList<>();
        for (Evento e : eventos) {
            boolean coincide = true;

            if (ciudad != null && !e.getDireccion().getCiudad().equalsIgnoreCase(ciudad)) {
                coincide = false;
            }
            if (tipo != null && !e.getTipo().equalsIgnoreCase(tipo)) {
                coincide = false;
            }
            if (fechaDesde != null) {
                boolean fechaOk = false;
                for (LocalDate f : e.getFechasComoLocalDate()) {
                    if (!f.isBefore(fechaDesde)) {
                        fechaOk = true;
                        break;
                    }
                }
                if (!fechaOk) {
                    coincide = false;
                }
            }

            if (coincide) {
                resultado.add(e);
            }
        }
        return resultado;
    }
}