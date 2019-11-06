package ar.com.educacionit.proyectointegrador.hotelbooking.modelos;

public class CategoriaHabitacion {
    private int id;
    private double porcentajeAumento;
    private String descripcion;

    public CategoriaHabitacion() {
    }

    public CategoriaHabitacion(int id, double porcentajeAumento, String descripcion) {
        this.id = id;
        this.porcentajeAumento = porcentajeAumento;
        this.descripcion = descripcion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public void setPorcentajeAumento(double porcentajeAumento) {
        this.porcentajeAumento = porcentajeAumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "CategoriaHabitacion{" + "id=" + id + ", porcentajeAumento=" + porcentajeAumento + ", descripcion=" + descripcion + '}';
    }
    



}
