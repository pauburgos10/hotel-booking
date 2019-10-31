package ar.com.educacionit.proyectointegrador.hotelbooking.modelos;

public class Servicio {
    private int idServicios;
    private String descripcion;
    private double precio;

    public Servicio() {
    }

    public Servicio(int id, String descripcion, double precio) {
        this.idServicios = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public int getId() {
        return idServicios;
    }

    public void setId(int id) {
        this.idServicios = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Servicios{" + "id=" + idServicios + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
    
}
