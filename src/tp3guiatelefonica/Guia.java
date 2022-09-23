package tp3guiatelefonica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public ArrayList<Long> buscarClientes(String ciudad) {
        ArrayList<Long> telCiudad = new ArrayList();
        for (Map.Entry<Long,Cliente> entry : guiaTel.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(ciudad)){
                telCiudad.add(entry.getKey());
            }
        }
       return telCiudad;
    }

    public void borrarCliente(long nroTel) {
    }
}