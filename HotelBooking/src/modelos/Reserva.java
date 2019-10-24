package modelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reserva {
    private Habitacion habitacion;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;
    ArrayList<Servicios> servicios = new ArrayList<Servicios>();
    private int cantPersonas;

    public Reserva() {
    }
    
    public Reserva(Habitacion habitacion, LocalDate fechaIngreso, LocalDate fechaEgreso, int cantPersonas) {
        this.habitacion = habitacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.cantPersonas = cantPersonas;
    }


    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public ArrayList<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicios> servicios) {
        this.servicios = servicios;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    @Override
    public String toString() {
        return "Reserva{" + "habitacion=" + habitacion + ", fechaIngreso=" + fechaIngreso + ", fechaEgreso=" + fechaEgreso + ", servicios=" + servicios + ", cantPersonas=" + cantPersonas + '}';
    }

}
