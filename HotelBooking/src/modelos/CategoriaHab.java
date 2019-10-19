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
public class CategoriaHab {
    private int id;
    private double porcentajeAumento;

    @Override
    public String toString() {
        return "CategoriaHab{" + "id=" + id + ", porcentajeAumento=" + porcentajeAumento + '}';
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

    public CategoriaHab() {
    }

    public CategoriaHab(int id, double porcentajeAumento) {
        this.id = id;
        this.porcentajeAumento = porcentajeAumento;
    }
}
