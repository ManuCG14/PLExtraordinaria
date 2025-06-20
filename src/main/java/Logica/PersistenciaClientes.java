package Logica;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaClientes {

    private static final String RUTA_CLIENTES = "clientes.dat";

    // Guarda la lista de clientes en un fichero binario
    public static void guardarClientes(List<Cliente> clientes) {
        try (FileOutputStream fos = new FileOutputStream(RUTA_CLIENTES);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {

            oos.writeInt(clientes.size());  // Escribimos el número de clientes
            for (Cliente cliente : clientes) {
                oos.writeObject(cliente);   // Escribimos cada cliente uno a uno
            }

        } catch (IOException e) {
            System.err.println("Error al guardar los clientes: " + e.getMessage());
        }
    }

    // Carga la lista de clientes desde el fichero binario
    public static List<Cliente> cargarClientes() {
        List<Cliente> clientes = new ArrayList<>();

        File archivo = new File(RUTA_CLIENTES);
        if (!archivo.exists()) {
            System.out.println("Archivo de clientes no encontrado. Se devolverá una lista vacía.");
            return clientes;
        }

        try (FileInputStream fis = new FileInputStream(archivo);
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bis)) {

            int cantidad = ois.readInt();
            for (int i = 0; i < cantidad; i++) {
                Cliente cliente = (Cliente) ois.readObject();
                clientes.add(cliente);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los clientes: " + e.getMessage());
        }

        return clientes;
    }
}