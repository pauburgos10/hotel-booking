package ar.com.educacionit.proyectointegrador.hotelbooking.dao;

import ar.com.educacionit.proyectointegrador.hotelbooking.configuracion.ConexionBaseDeDatos;
import ar.com.educacionit.proyectointegrador.hotelbooking.modelos.UsuarioLogueado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao {
    public static UsuarioLogueado ingresar(String email, String password) throws Exception {
        UsuarioLogueado usuario;
        try (Connection con = ConexionBaseDeDatos.obtenerConexion()) {
            String query = "SELECT * FROM usuarios WHERE email='"+email+"' AND password='"+password+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            usuario = null;
            if(rs.next()) {
                usuario = UsuarioLogueado.getInstance(email, password);
                //rs.getString("email");
            }   st.close();
        }

        return usuario;
    } 
}
