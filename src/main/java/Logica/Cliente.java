package Logica;

public class Cliente extends Usuario {
    private String nombre;
    private String telefono;
    private Direccion direccion;
    private TarjetaCredito tarjeta;
    private boolean esVIP;

    public boolean isEsVIP() {
        return esVIP;
    }

    public void setEsVIP(boolean esVIP) {
        this.esVIP = esVIP;
    }


    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }


    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Cliente(String nombre, String correo, String clave, String telefono, Direccion direccion,
                   TarjetaCredito tarjeta, boolean esVIP) {
        super(correo, clave);
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tarjeta = tarjeta;
        this.esVIP = esVIP;
    }


    
}
