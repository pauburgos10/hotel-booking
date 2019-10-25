package ar.com.educacionit.proyectointegrador.hotelbooking.hotelbooking;

import ar.com.educacionit.proyectointegrador.hotelbooking.configuracion.ConexionBaseDeDatos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PersonaDAO {

    public static void inserta(Persona p) throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String sql = "insert into personas (nombre, apellido, edad) "
                + "values ('" + p.getNombre() + "', '" + p.getApellido() 
                + "', " + p.getEdad() + ")";
        Statement st = con.createStatement();
        st.execute(sql);
        st.close();
        con.close();
    }

    public static void modifica(Persona p) throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String sql = "update personas set nombre ='" + p.getNombre() 
                + "', apellido = '" + p.getApellido()
                + "', edad=" + p.getEdad() + " where id = " + p.getId();
        Statement st = con.createStatement();
        st.execute(sql);
        st.close();
        con.close();
    }

    public static void elimina(int id) throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String sql = "delete from personas where id = " + id;
        Statement st = con.createStatement();
        st.execute(sql);
        st.close();
        con.close();
    }

    public static Persona getPersona(int idPersona) throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String sql = "select * from personas where id = " + idPersona;
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        Persona p = new Persona();
        if (rs.next()) {
            int id = rs.getInt("id");
            int edad = rs.getInt("edad");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            p.setEdad(edad);
            p.setId(id);
            p.setNombre(nombre);
            p.setApellido(apellido);
        }
        st.close();
        con.close();
        return p;
    }

}
