
package ar.com.educacionit.proyectointegrador.hotelbooking.hotelbooking;

import ar.com.educacionit.proyectointegrador.hotelbooking.dao.UsuarioDao;
import ar.com.educacionit.proyectointegrador.hotelbooking.modelos.Usuario;

public class HotelBooking {

    public static void main(String[] args) {
        Usuario fulano = new Usuario("30100100", "jimena@gmail.com", "30100100");
        try {
            UsuarioDao.inserta(fulano);
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
            
    }
    
}
