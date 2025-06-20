package Logica;

import java.util.ArrayList;
import java.util.List;

public class GestorUsuarios {
    private List<Cliente> clientes;
    private List<Administrador> administradores;

    public GestorUsuarios() {
        // Cargar clientes desde archivo
        clientes = PersistenciaClientes.cargarClientes();
        administradores = new ArrayList<>();
        administradores.add(new Administrador("admin@javaevents.com", "admin"));
    }
    

    public boolean registrarCliente(Cliente cliente) {
        if (buscarClientePorCorreo(cliente.getCorreo()) == null) {
            clientes.add(cliente);
            PersistenciaClientes.guardarClientes(clientes);
            return true;
        }
        return false;
    }

    public Cliente buscarClientePorCorreo(String correo) {
        for (Cliente c : clientes) {
            if (c.getCorreo().equalsIgnoreCase(correo)) {
                return c;
            }
        }
        return null;
    }

    public boolean validarLoginCliente(String correo, String clave) {
        Cliente c = buscarClientePorCorreo(correo);
        return c != null && c.getClave().equals(clave);
    }

    public Administrador buscarAdministradorPorCorreo(String correo) {
        for (Administrador a : administradores) {
            if (a.getCorreo().equalsIgnoreCase(correo)) {
                return a;
            }
        }
        return null;
    }

    public boolean validarLoginAdministrador(String correo, String clave) {
        Administrador a = buscarAdministradorPorCorreo(correo);
        return a != null && a.getClave().equals(clave);
    }

    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes);
    }

    public List<Administrador> listarAdministradores() {
        return new ArrayList<>(administradores);
    }

    public boolean agregarAdministrador(Administrador administrador) {
        if (buscarAdministradorPorCorreo(administrador.getCorreo()) == null) {
            administradores.add(administrador);
            return true;
        }
        return false;
    }

    public void modificarCliente(Cliente clienteModificado) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente actual = clientes.get(i);
            if (actual.getCorreo().equals(clienteModificado.getCorreo())) {
                 clientes.set(i, clienteModificado);
                break;
        }
    }
        PersistenciaClientes.guardarClientes(clientes);
}


    public boolean eliminarCliente(String correo) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCorreo().equalsIgnoreCase(correo)) {
                clientes.remove(i);
                PersistenciaClientes.guardarClientes(clientes);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarAdministrador(String correo) {
        for (int i = 0; i < administradores.size(); i++) {
            if (administradores.get(i).getCorreo().equalsIgnoreCase(correo)) {
                administradores.remove(i);
                return true;
            }
        }
        return false;
    }
}