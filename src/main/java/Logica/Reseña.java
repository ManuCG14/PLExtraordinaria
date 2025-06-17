package Logica;

import java.io.Serializable;

public class Reseña implements Serializable {
    private Cliente cliente;
    private int calificacion; //  de 1 a 5
    private String comentario;

    public Reseña(Cliente cliente, int calificacion, String comentario) {
        this.cliente = cliente;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    // Getters
    public int getCalificacion() {
        return calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
