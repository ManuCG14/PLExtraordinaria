package Logica;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaReservas {

    private static final String RUTA_RESERVAS = "reservas.dat";

    // Guarda todas las reservas en un archivo binario
    public static void guardarReservas(List<Reserva> reservas) {
        try (FileOutputStream fos = new FileOutputStream(RUTA_RESERVAS);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {

            oos.writeInt(reservas.size());  // Guardamos el número de reservas
            for (Reserva reserva : reservas) {
                oos.writeObject(reserva);   // Guardamos cada reserva individualmente
            }

        } catch (IOException e) {
            System.err.println("Error al guardar las reservas: " + e.getMessage());
        }
    }

    // Carga todas las reservas desde el archivo binario
    public static List<Reserva> cargarReservas() {
        List<Reserva> reservas = new ArrayList<>();

        File archivo = new File(RUTA_RESERVAS);
        if (!archivo.exists()) {
            System.out.println("Archivo de reservas no encontrado. Se devolverá una lista vacía.");
            return reservas;
        }

        try (FileInputStream fis = new FileInputStream(archivo);
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bis)) {

            int cantidad = ois.readInt();
            for (int i = 0; i < cantidad; i++) {
                Reserva reserva = (Reserva) ois.readObject();
                reservas.add(reserva);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar las reservas: " + e.getMessage());
        }

        return reservas;
    }
}