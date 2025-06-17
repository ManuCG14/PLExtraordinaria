package Logica;

import java.io.Serializable;

public class TarjetaCredito implements Serializable {
    
    private String nombreTitular;
    private String numero;
    private String fechaCaducidad;

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public TarjetaCredito(String nombreTitular, String numero, String fechaCaducidad) {
        this.nombreTitular = nombreTitular;
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }
}
