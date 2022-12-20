/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aseguradora;

import aseguradora.Entidades.Cliente;
import aseguradora.Entidades.Gestioncuota;
import aseguradora.Entidades.Gestionpoliza;
import aseguradora.Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dayan
 */
public class Aseguradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Cliente> Asegurado = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opc, opcs1 = "";
        int opcion, opcs = 0;

        do {
            Cliente c1 = new Cliente();
            Vehiculo v1 = new Vehiculo();
            Gestionpoliza gp = new Gestionpoliza();
            Gestioncuota gt = new Gestioncuota();

            System.out.println("\tMenu de carga");
            System.out.println("--------------------------------------------");
            System.out.println("1 - ingresar un nuevo cliente");
            System.out.println("--------------------------------------------");
            System.out.println("2 - cargar un nuevo vehiculo");
            System.out.println("--------------------------------------------");
            System.out.println("3 - cargar datos de poliza ");
            System.out.println("--------------------------------------------");
            System.out.println("4- cargar datos de pago de poliza");
            System.out.println("---------------------------------------------");
            System.out.println("5 -mostrar Clientes");
            System.out.println("---------------------------------------------");
            System.out.println("6- salir ");
            System.out.println("---------------------------------------------");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    c1.CrearCliente();
                    Asegurado.add(c1);
                    break;
                case 2:
                    v1.CargarVehiculo();
                    Asegurado.add(v1);
                    break;
                case 3:
                    gp.Cargarpoliza();
                    Asegurado.add(gp);
                    break;
                case 4:
                    gt.Cuota();
                    Asegurado.add(gt);
                    break;
                case 5:
                    Asegurado.forEach((aux) -> {
                        System.out.println(aux);
                    });
                    break;
                case 6 : 
                    System.out.println("hasta luego");

                default:
                    System.out.println("esa no es una opcion valida");
                    break;
            }

        } while (!(opcion == 6));
    }
}


        

