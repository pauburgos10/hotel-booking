package modelos;

import java.util.ArrayList;

public class Hotel {
    ArrayList <Habitacion> habitaciones = new ArrayList<>();
    ArrayList <Reserva> reservas = new ArrayList<>();

    public Hotel() {
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Hotel{" + "habitaciones=" + habitaciones + ", reservas=" + reservas + '}';
    }
}
