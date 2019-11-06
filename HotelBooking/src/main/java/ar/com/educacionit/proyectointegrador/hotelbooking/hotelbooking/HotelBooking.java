
package ar.com.educacionit.proyectointegrador.hotelbooking.hotelbooking;

import ar.com.educacionit.proyectointegrador.hotelbooking.dao.UsuarioDao;
import ar.com.educacionit.proyectointegrador.hotelbooking.modelos.Usuario;
import ar.com.educacionit.proyectointegrador.hotelbooking.vistas.LoginFrame;
import javax.swing.JFrame;

public class HotelBooking {

    public static void main(String[] args) {
        /*Usuario fulano = new Usuario("30100102", "julia@gmail.com", "30100102");
        try {
            //UsuarioDao.inserta(fulano);
            //fulano.setClave("nueva");
            UsuarioDao.modificarClave(fulano);
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
*/
        
        JFrame ventanaLogin = new LoginFrame();
        ventanaLogin.setVisible(true);
            
    }
    
}
