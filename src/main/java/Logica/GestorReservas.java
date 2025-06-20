package Logica;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GestorReservas {
    private List<Reserva> reservas;

    public GestorReservas() {
        reservas = PersistenciaReservas.cargarReservas();
    }

    // Añade una reserva con el cálculo de importe y descuento VIP
    public void añadirReserva(Cliente cliente, Evento evento, LocalDateTime fechaSeleccionada,
                              int cantidadEntradas) {
        if (!evento.getFechas().contains(fechaSeleccionada)) {
            throw new IllegalArgumentException("La fecha seleccionada no corresponde al evento");
        }

        double importeTotal = evento.getPrecio() * cantidadEntradas;
        if (cliente.isEsVIP()) {
            importeTotal *= 0.9; // 10% de descuento para clientes VIP
        }

        Reserva nuevaReserva = new Reserva(cliente, evento, fechaSeleccionada, cantidadEntradas, importeTotal);
        reservas.add(nuevaReserva);
        System.out.println("Reserva añadida. Total reservas ahora: " + reservas.size());
        PersistenciaReservas.guardarReservas(reservas); 
    }

    // Consultar todas las reservas
    public List<Reserva> getReservas() {
        return reservas;
    }

    // Buscar reservas por cliente
    public List<Reserva> buscarReservasPorCliente(Cliente cliente) {
        List<Reserva> resultado = new ArrayList<>();
        for (Reserva r : reservas) {
            if (r.getCliente().getCorreo().equalsIgnoreCase(cliente.getCorreo())) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    // Buscar reservas desde una fecha dada
    public List<Reserva> buscarReservasDesdeFecha(LocalDateTime fecha) {
        List<Reserva> resultado = new ArrayList<>();
        for (Reserva r : reservas) {
            if (!r.getFechaReserva().isBefore(fecha)) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    // Método opcional si deseas guardar manualmente
    public void guardarReservas() {
        PersistenciaReservas.guardarReservas(reservas);
    }
}