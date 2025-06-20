package Logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento implements Serializable {
    private String titulo;
    private String tipo; // Concierto, Teatro, etc.
    private Direccion direccion;
    private List<LocalDateTime> fechas;
    private double precio;
    private String imagenPortada;
    private List<Reseña> reseñas;

    public Evento(String titulo, String tipo, Direccion direccion, double precio, String imagenPortada) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.direccion = direccion;
        this.precio = precio;
        this.imagenPortada = imagenPortada;
        this.fechas = new ArrayList<>();
        this.reseñas = new ArrayList<>();
    }

    public Evento(String titulo, String tipo, double precio, Direccion direccion) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.direccion = direccion;
        this.precio = precio;
    }

    public void añadirFecha(LocalDateTime fecha) {
        fechas.add(fecha);
    }

    public void añadirReseña(Reseña reseña) {
        reseñas.add(reseña);
    }
    
    public double calcularCalificacionMedia() {
        if (reseñas.size() == 0) return 0.0;

        int suma = 0;
        for (Reseña r : reseñas) {
            suma += r.getCalificacion();
        }
        return (double) suma / reseñas.size();
    }

    public double getCalificacionMedia() {
        return calcularCalificacionMedia();
    }

    public List<LocalDate> getFechasComoLocalDate() {
        List<LocalDate> fechasLocalDate = new ArrayList<>();
        for (LocalDateTime dt : fechas) {
            fechasLocalDate.add(dt.toLocalDate());
        }
        return fechasLocalDate;
    }

    public List<LocalDateTime> getFechas() {
        return fechas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getImagenPortada() {
        return imagenPortada;
    }

    public List<Reseña> getReseñas() {
        return reseñas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setImagenPortada(String imagenPortada) {
        this.imagenPortada = imagenPortada;
    }
}