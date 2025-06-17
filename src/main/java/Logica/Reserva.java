package Logica;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Reserva implements Serializable {
    private Cliente cliente;
    private Evento evento;
    private LocalDateTime fechaSeleccionada;
    private int cantidadEntradas;
    private double importeTotal;
    private LocalDateTime fechaReserva;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public LocalDateTime getFechaSeleccionada() {
        return fechaSeleccionada;
    }

    public void setFechaSeleccionada(LocalDateTime fechaSeleccionada) {
        this.fechaSeleccionada = fechaSeleccionada;
    }

    public int getCantidadEntradas() {
        return cantidadEntradas;
    }

    public void setCantidadEntradas(int cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    
    public Reserva(Cliente cliente, Evento evento, LocalDateTime fechaSeleccionada,
                   int cantidadEntradas, double importeTotal) {
        this.cliente = cliente;
        this.evento = evento;
        this.fechaSeleccionada = fechaSeleccionada;
        this.cantidadEntradas = cantidadEntradas;
        this.importeTotal = importeTotal;
        this.fechaReserva = LocalDateTime.now();
    }
}
