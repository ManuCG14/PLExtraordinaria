package Logica;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaEventos {

    private static final String RUTA_EVENTOS = "eventos.dat";

    // Guardar lista de eventos
    public static void guardarEventos(List<Evento> eventos) {
        try (FileOutputStream fos = new FileOutputStream(RUTA_EVENTOS);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {

            oos.writeInt(eventos.size()); // Escribir el número de eventos
            for (Evento evento : eventos) {
                oos.writeObject(evento); // Serializar uno por uno
            }

        } catch (IOException e) {
            System.err.println("Error al guardar los eventos: " + e.getMessage());
        }
    }

    // Cargar lista de eventos
    public static List<Evento> cargarEventos() {
        List<Evento> eventos = new ArrayList<>();

        File fichero = new File(RUTA_EVENTOS);
        if (!fichero.exists()) {
            System.out.println("No se encontró el archivo de eventos. Se devolverá una lista vacía.");
            return eventos;
        }

        try (FileInputStream fis = new FileInputStream(fichero);
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bis)) {

            int cantidad = ois.readInt();
            for (int i = 0; i < cantidad; i++) {
                Evento evento = (Evento) ois.readObject();
                eventos.add(evento);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los eventos: " + e.getMessage());
        }

        return eventos;
    }
}