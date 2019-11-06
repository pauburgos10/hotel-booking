package ar.com.educacionit.proyectointegrador.hotelbooking.dao;

import ar.com.educacionit.proyectointegrador.hotelbooking.configuracion.ConexionBaseDeDatos;
import ar.com.educacionit.proyectointegrador.hotelbooking.modelos.UsuarioLogueado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao {
    public static UsuarioLogueado ingresar(String dni, String password) throws Exception {
        Connection con = ConexionBaseDeDatos.obtenerConexion();
        String query = "SELECT * FROM usuarios WHERE dni='"+dni+"' AND password='"+password+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        UsuarioLogueado usuario = null;
        
        if(rs.next()) {
          usuario = UsuarioLogueado.getInstance(dni, password);
          rs.getString("email");
        }
        
        st.close();
        con.close();

        return usuario;
    } 
}
