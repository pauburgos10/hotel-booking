
package ar.com.educacionit.proyectointegrador.hotelbooking.dao;

import ar.com.educacionit.proyectointegrador.hotelbooking.configuracion.ConexionBaseDeDatos;
import ar.com.educacionit.proyectointegrador.hotelbooking.modelos.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class UsuarioDao {
    public static void inserta(Usuario u) throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String sql = "insert into usuarios (dni, email, clave) "
                + "values ('" + u.getDni() + "', '" + u.getEmail()
                + "', " + u.getClave() + ")";
        Statement st = con.createStatement();
        st.execute(sql);
        st.close();
        con.close();
    }

    public static void modificarClave(Usuario u) throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String sql = "update usuarios set clave ='" + u.getClave()
                + "' where dni = " + u.getDni();
        Statement st = con.createStatement();
        st.execute(sql);
        st.close();
        con.close();
    }
/*
    public static void elimina(int id) throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String sql = "delete from personas where id = " + id;
        Statement st = con.createStatement();
        st.execute(sql);
        st.close();
        con.close();
    }
*/
    public static Usuario getUsuario(String dni) throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String sql = "select * from uauarios where dni = " + dni;
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        Usuario u = new Usuario();
        if (rs.next()) {
            String id = rs.getString("dni");
            String email = rs.getString("email");
            String clave = rs.getString("clave");
            u.setEmail(email);
            u.setDni(id);
            u.setClave(clave);
        }
        st.close();
        con.close();
        return u;
    }

}
