
package hotel.clases;

import java.util.ArrayList;


public class Reserva {
    private Habitacion habitacion;
    private String fechaIngreso;
    private String fechaEgreso;
    ArrayList<Servicios> servicios = new ArrayList<Servicios>();
    private int cantPersonas;

    public Reserva(Habitacion habitacion, String fechaIngreso, String fechaEgreso, int cantPersonas) {
        this.habitacion = habitacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.cantPersonas = cantPersonas;
    }

    public Reserva() {
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(String fechaEgreso) {
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
