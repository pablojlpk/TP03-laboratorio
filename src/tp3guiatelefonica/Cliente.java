package tp3guiatelefonica;

import java.util.Objects;
import javax.swing.JTextField;

public class Cliente {

    private Integer DNI;

    private String apellido;

    private String nombre;

    private String direccion;

    private String ciudad;

    public Cliente() {
        
    }

    public Cliente(Integer DNI, String apellido, String nombre, String direccion, String ciudad) {
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    Cliente(JTextField txdni, JTextField txapellido, JTextField txnombre, JTextField txdireccion, JTextField txciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "DNI=" + DNI + ", apellido=" + apellido + ", nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.DNI);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.DNI, other.DNI)) {
            return false;
        }
        return true;
    }

   
}

    
    
   

