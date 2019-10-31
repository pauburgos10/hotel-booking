
package ar.com.educacionit.proyectointegrador.hotelbooking.modelos;

public class Usuario {
    
    private String dni;
    private String email;
    private String clave;
    private String rol;

    public Usuario() {
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario(String dni, String email,  String clave) {
        this.dni = dni;
        this.email = email;
        this.clave = clave;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
