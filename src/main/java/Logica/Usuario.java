package Logica;

import java.io.Serializable;

public abstract class Usuario implements Serializable {
    protected String correo;
    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public Usuario(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }
}
