package tp3guiatelefonica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TP3GuiaTelefonica {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Guia gu = new Guia();
        //Cliente cli;
        Cliente c1i =  new Cliente(123,"Lopez Pujato","Pablo","Rivadavia 538","San Luis");
        Cliente c12 =  new Cliente(1234,"Sanchez","Tomas","San Martin 125","Concaran");
        Cliente c13 =  new Cliente(12345,"Gomez","Pablo","Los Nogales 45","Villa del Carmen");
        Cliente c14 =  new Cliente(12356,"Seitz","Jimena","Los Nogales 45","Villa del Carmen");
        gu.agregarCliente(c1i, 123);
        gu.agregarCliente(c12, 1234);
        gu.agregarCliente(c13, 12345);
        gu.agregarCliente(c14, 123456);
        long nrotel;
        char op;
        op = 'i';
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1- ALTA Cliente");
            System.out.println("2- BUSCA Cliente por Telefono");
            System.out.println("3- BUSCA Clientes por Ciudad");
            System.out.println("4- Busca Teléfono por Apellido");
            System.out.println("5- Borrar Cliente");
            System.out.println("S- Salir");
            System.out.print("Ingrese una opción:  ");
            op = leer.next().toUpperCase().charAt(0);
            switch (op) {
                case '1':
                    //-----------
                    //línea 1-instanciamos un objeto de la clase Formulario2.java
                    Frcliente verform = new Frcliente(gu);
                    //línea 2-hacemos visible el formulario que queremos llamar 
                    verform.setVisible(true);
                    break;
                case '2':
                    FrBuscarCliente verbc = new FrBuscarCliente(gu);
                    verbc.setVisible(true);
                    

                    break;
                case '3':
                    System.out.println("Ingrese la ciudad ");
                    System.out.println(gu.buscarClientes(leer.next()));
                    break;

                case '4':
                    System.out.println("Ingrese el apellido que desea buscar su teléfono");
                    System.out.println(gu.buscarTelefono(leer.next()));
                   
                   
                    break;
                case '5':
                    FrBorrarCliente borracli = new FrBorrarCliente(gu);
                    borracli.setVisible(true);
                    /*System.out.println("ingrese el nro telefónico del cliente que desea borrar");
                    nrotel = leer.nextLong();
                    gu.borrarCliente(nrotel);*/

                    break;
                case 'S':
                    System.out.println("");
                    break;

                default:
                    System.out.println("La opción ingresada es incorrecta. verifique");
            }

        } while (op != 'S');

    }
}
