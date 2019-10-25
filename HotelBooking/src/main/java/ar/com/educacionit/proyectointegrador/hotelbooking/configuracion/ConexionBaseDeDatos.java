/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.proyectointegrador.hotelbooking.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Paula
 */
public class ConexionBaseDeDatos {
    public static Connection obtenerConexion() throws Exception {
        // Establece el nombre del driver a utilizar
        String dbDriver = "com.mysql.cj.jdbc.Driver";
        // Establece la url y base de datos a utilizar
        String dbConnString = "jdbc:mysql://localhost:3306/proyecto-integrador";
        // Establece el usuario de la base de datos
        String dbUser = "root";
        // Establece la contraseña de la base de datos
        String dbPassword = "admin";
        // Establece el driver de conexion
        Class.forName(dbDriver).newInstance();
        // Retorna la conexion
        Connection conn = DriverManager.getConnection(dbConnString, dbUser, dbPassword);
        return conn;
    }
}
