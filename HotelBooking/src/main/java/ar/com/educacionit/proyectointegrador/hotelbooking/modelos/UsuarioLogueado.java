package ar.com.educacionit.proyectointegrador.hotelbooking.modelos;

public class UsuarioLogueado {
    private String dni;
    private String password;
    private static UsuarioLogueado usuarioLogueado;
    
    private UsuarioLogueado(String dni, String password) {
        this.dni = dni;
        this.password = password;
    }
    
    public static UsuarioLogueado getInstance(String dni, String password){
        if(usuarioLogueado == null) {
            usuarioLogueado = new UsuarioLogueado(dni, password);
        }
        return usuarioLogueado;
    }
}
