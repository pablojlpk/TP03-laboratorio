package tp3guiatelefonica;

import java.util.HashMap;

public class Guia {
    private Long nroTel;
    private Cliente cliente;
    private HashMap< Long, Cliente > guiaTel = new HashMap();

    //HashMap<String,Float> listaProductos = new HashMap<String,Float>()

    public Guia(Long nroTel, Cliente cliente) {
        this.nroTel = nroTel;
        this.cliente = cliente;
    }
    

    public void agregarCliente(Cliente cliente, long nroTel) {
    }

    public Cliente buscarCliente(long nroTel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public HastSet<nroTel> buscarTelefono(String apellido) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public HastSet<Cliente> buscarClientes(String Ciudad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void borrarCliente(long nroTel) {
    }
}
