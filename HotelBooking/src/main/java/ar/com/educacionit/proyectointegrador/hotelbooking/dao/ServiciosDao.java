/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.proyectointegrador.hotelbooking.dao;

import ar.com.educacionit.proyectointegrador.hotelbooking.configuracion.ConexionBaseDeDatos;
import ar.com.educacionit.proyectointegrador.hotelbooking.modelos.Servicio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Punto Digital
 */
public class ServiciosDao {
    //Copiar de la clase usuariosdao y linkear con el frame de servicios
    public static void insertarServicio(Servicio s ) throws Exception {
        try (Connection con = ConexionBaseDeDatos.obtenerConexion()) {
            String sql = "insert into servicios (idServicios, descripcion, precio) "
                    + "values ('" + s.getId()+ "', '" + s.getDescripcion()
                    + "', " + s.getPrecio()+ ")";
            Statement st = con.createStatement();
            st.execute(sql);
            st.close();
        }
    }

    public static void modificarDescripcion(Servicio s ) throws Exception {
        try (Connection con = ConexionBaseDeDatos.obtenerConexion()) {
            String sql = "update servicios set descripcion = " + s.getDescripcion() + "precio = " + s.getPrecio()
                    + "' where idServicios = " + s.getId();
            Statement st = con.createStatement();
            st.execute(sql);
            st.close();
        }
    }
    
  
    public static void borrarServicios(int id) throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String sql = "delete from servicios where idServicios = " + id;
        Statement st = con.createStatement();
        st.execute(sql);
        st.close();
        con.close();
    }

    public static Servicio getServicio(int id) throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String sql = "select * from servicios where idServicios = " + id;
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        Servicio s = new Servicio();
        if (rs.next()) {
            int idServicios = rs.getInt("idServicios");
            String descripcion = rs.getString("descripcion");
            double precio = rs.getDouble("precio");
            s.setId(idServicios);
            s.setDescripcion(descripcion);
            s.setPrecio(precio);
        }
        st.close();
        con.close();
        return s;
    }
}
