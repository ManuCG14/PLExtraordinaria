package Logica;

import java.io.Serializable;

public class Direccion implements Serializable {
    private String calle;
    private String numero;
    private String ciudad;
    private String codigoPostal;

    public String getCodigo_postal() {
        return codigoPostal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigoPostal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Direccion(String calle, String numero, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public Direccion(String ciudad) {
        this.ciudad = ciudad;
    }
    
}