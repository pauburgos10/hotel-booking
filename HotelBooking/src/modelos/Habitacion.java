package modelos;

public class Habitacion {
    private int id;
    private double precioPorDia;
    private int capacidad;
    private CategoriaHabitacion categoria;

    public Habitacion() {
    }

    public Habitacion(int id, double precioPorDia, int capacidad, CategoriaHabitacion categoria) {
        this.id = id;
        this.precioPorDia = precioPorDia;
        this.capacidad = capacidad;
        this.categoria = categoria;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(int precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public CategoriaHabitacion getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaHabitacion categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "id=" + id + ", precioPorDia=" + precioPorDia + ", capacidad=" + capacidad + ", categoria=" + categoria + '}';
    }

}
