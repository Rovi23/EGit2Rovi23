package spai.egit2;

public class Persona {
    private String nombre;

    private String apellido;
    
    private String apellido2;
    

    private String format(String cadena) {
        cadena = cadena.trim();
        return cadena.substring(0, 1).toUpperCase() + cadena.substring(1).toLowerCase();
    }

    public Persona(String nombre, String apellido, String apellido2) {
        this.setNombre(nombre);
        this.setApellido(apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = this.format(nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = this.format(apellido);
    }
    
    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = this.format(apellido2);
    }

    public String nombreCompleto() {
        return this.nombre + " " + this.apellido + " " + this.apellido2;
    }

    public String inicial() {
        return this.nombre.substring(0, 1) + ".";
    }
}
