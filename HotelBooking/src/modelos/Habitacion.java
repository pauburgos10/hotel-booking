/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author German
 */
public class Habitacion {
    private int id;
    private double precioPorDia;
    private int capacidad;
    private CategoriaHab categoria;

    public Habitacion() {
    }

    public Habitacion(int id, double precioPorDia, int capacidad, CategoriaHab categoria) {
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

    public CategoriaHab getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaHab categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "id=" + id + ", precioPorDia=" + precioPorDia + ", capacidad=" + capacidad + ", categoria=" + categoria + '}';
    }

}
