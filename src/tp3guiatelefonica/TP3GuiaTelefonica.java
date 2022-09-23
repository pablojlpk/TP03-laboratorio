package tp3guiatelefonica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TP3GuiaTelefonica {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Guia gu = new Guia();
        Cliente cli;
        long nrotel;
        char op;
        op = 'i';
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1- ALTA Cliente");
            System.out.println("2- BUSCA Cliente");
            System.out.println("3- BUSCA Clientes");
            System.out.println("4- Busca Teléfono");
            System.out.println("5- Borrar Cliente");
            System.out.println("S- Salir");
            System.out.print("Ingrese una opción:  ");
            op = leer.next().toUpperCase().charAt(0);
            switch (op) {
                case '1':
                    cli = new Cliente();
                    System.out.println("Ingrese el DNI");
                    cli.setDNI(leer.nextInt());
                    System.out.println("Ingrese el Apellido");
                    cli.setApellido(leer.next());
                    System.out.println("Ingrese el nombre");
                    cli.setNombre(leer.next());
                    System.out.println("ingrese la dirección");
                    cli.setDireccion(leer.next());
                    System.out.println("Infrese la ciudad");
                    cli.setCiudad(leer.next());
                    System.out.println("Ingrese el nro de Telefono");
                    nrotel = leer.nextLong();
                    gu.agregarCliente(cli, nrotel);

                    break;
                case '2':
                    System.out.println("Ingrese el nro de teléfono");
                    nrotel = leer.nextLong();
                    System.out.println(gu.buscarCliente(nrotel));

                    break;
                case '3':

                    break;
                case '4':

                    break;
                case '5':

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
