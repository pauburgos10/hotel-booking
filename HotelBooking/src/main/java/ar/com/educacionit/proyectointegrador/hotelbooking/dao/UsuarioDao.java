package ar.com.educacionit.proyectointegrador.hotelbooking.dao;

import ar.com.educacionit.proyectointegrador.hotelbooking.configuracion.ConexionBaseDeDatos;
import ar.com.educacionit.proyectointegrador.hotelbooking.modelos.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
            String rol = rs.getString("rol");
            u.setEmail(email);
            u.setDni(id);
            u.setClave(clave);
            u.setRol(rol);
        }
        st.close();
        con.close();
        return u;
    }

    public static List<Usuario> getTodosUsuarios() throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String sql = "select * from uauarios";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        List<Usuario> lista = new ArrayList<Usuario>();
        if (rs.next()) {
            Usuario u = new Usuario();
            String id = rs.getString("dni");
            String email = rs.getString("email");
            String clave = rs.getString("clave");
            String rol = rs.getString("rol");
            u.setEmail(email);
            u.setDni(id);
            u.setClave(clave);
            u.setRol(rol);
            lista.add(u);
        }
        st.close();
        con.close();
        return lista;

    }
}
