package tp3guiatelefonica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.swing.JOptionPane;


public class Guia {

    private HashMap< Long, Cliente > guiaTel = new HashMap();

    public boolean agregarCliente(Cliente cliente, long nroTel) {
   
        return guiaTel.put(nroTel, cliente)== null;
    }

    
    public Cliente buscarCliente(long nroTel) {
        return guiaTel.get(nroTel);
    }
    

    public ArrayList<Long> buscarTelefono(String apellido) {
       ArrayList<Long> telApellido = new ArrayList();
        for (Map.Entry<Long,Cliente> entry : guiaTel.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)){
                telApellido.add(entry.getKey());
            }
        }
       return telApellido;
    }

    public HashSet<Cliente> buscarClientes(String ciudad) {
        HashSet<Cliente> city = new HashSet();
        
        for (Map.Entry<Long,Cliente> entry : guiaTel.entrySet()) {
            if (entry.getValue().getCiudad().equalsIgnoreCase(ciudad)){
                city.add(entry.getValue());
            }
        }
       return city;
    }

    public void borrarCliente(long nroTel) {
        
        for (Map.Entry<Long, Cliente> entry : guiaTel.entrySet()) {
           if(nroTel == entry.getKey()){
                       guiaTel.remove(nroTel);
                       JOptionPane.showMessageDialog(null,"El cliente fue eliminado");

           } else{
               JOptionPane.showMessageDialog(null,"no se encuentra asociado ningun cliente a ese numero");

            
        }
    }

   
}

    @Override
    public String toString() {
        return "Guia{" + "guiaTel=" + guiaTel + '}';
    }
}
