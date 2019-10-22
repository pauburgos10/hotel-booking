/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author German
 */
public class Reserva {
    private Habitacion habitacion;
    private String fechaIngreso;
    private String fechaEgreso;
    ArrayList<Servicios> servicios = new ArrayList<Servicios>();
    private int cantPersonas;

    public Reserva() {
    }
    
    public Reserva(Habitacion habitacion, String fechaIngreso, String fechaEgreso, int cantPersonas) {
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
