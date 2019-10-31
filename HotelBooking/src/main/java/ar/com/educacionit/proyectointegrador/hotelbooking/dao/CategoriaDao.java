
package ar.com.educacionit.proyectointegrador.hotelbooking.dao;

import ar.com.educacionit.proyectointegrador.hotelbooking.configuracion.ConexionBaseDeDatos;
import ar.com.educacionit.proyectointegrador.hotelbooking.modelos.CategoriaHabitacion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CategoriaDao {
    public static void inserta(CategoriaHabitacion ch) throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String sql = "insert into categorias (id, porcentaje, descripcion) "
                + "values ('" + ch.getId() + "', '" + ch.getPorcentajeAumento()
                + "', " + ch.getDescripcion() + ")";
        Statement st = con.createStatement();
        st.execute(sql);
        st.close();
        con.close();
    }
    public static void modificar(CategoriaHabitacion ch) throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String sql = "update categorias set descripcion ='" + ch.getDescripcion()
                + "' , porcentaje = " + ch.getPorcentajeAumento() + "' where id = " + ch.getId();
        Statement st = con.createStatement();
        st.execute(sql);
        st.close();
        con.close();
    }
}
