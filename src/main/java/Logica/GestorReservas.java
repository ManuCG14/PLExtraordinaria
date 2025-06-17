package Logica;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GestorReservas {
    private List<Reserva> reservas;
    private final String RUTA_ARCHIVO = "reservas.dat";

    public GestorReservas() {
        reservas = new ArrayList<>();
        cargarReservas();
    }

    // Añade una reserva con el cálculo de importe y descuento VIP
    public void añadirReserva(Cliente cliente, Evento evento, LocalDateTime fechaSeleccionada,
                              int cantidadEntradas) throws IOException {
        if (!evento.getFechas().contains(fechaSeleccionada)) {
            throw new IllegalArgumentException("La fecha seleccionada no corresponde al evento");
        }

        double importeTotal = evento.getPrecio() * cantidadEntradas;
        if (cliente.isEsVIP()) {
            importeTotal *= 0.9; // 10% de descuento para clientes VIP
        }

        Reserva nuevaReserva = new Reserva(cliente, evento, fechaSeleccionada, cantidadEntradas, importeTotal);

        reservas.add(nuevaReserva);

        guardarReservas();
    }

    // Guarda la lista de reservas en archivo binario
    public void guardarReservas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA_ARCHIVO))) {
            oos.writeObject(reservas);
        } catch (IOException e) {
            System.err.println("Error guardando reservas: " + e.getMessage());
        }
    }

    // Carga la lista de reservas desde archivo binario
    @SuppressWarnings("unchecked")
    public void cargarReservas() {
        File archivo = new File(RUTA_ARCHIVO);
        if (!archivo.exists()) {
            reservas = new ArrayList<>();
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            reservas = (List<Reserva>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error cargando reservas: " + e.getMessage());
            reservas = new ArrayList<>();
        }
    }

    // Consultar todas las reservas
    public List<Reserva> getReservas() {
        return reservas;
    }

    // Buscar reservas por cliente
    public List<Reserva> buscarReservasPorCliente(Cliente cliente) {
        List<Reserva> resultado = new ArrayList<>();
        for (Reserva r : reservas) {
            if (r.getCliente().getCorreo().equals(cliente.getCorreo())) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    // Buscar reservas desde una fecha dada (comparando fechaReserva)
    public List<Reserva> buscarReservasDesdeFecha(LocalDateTime fecha) {
        List<Reserva> resultado = new ArrayList<>();
        for (Reserva r : reservas) {
            if (!r.getFechaReserva().isBefore(fecha)) {
                resultado.add(r);
            }
        }
        return resultado;
    }
}