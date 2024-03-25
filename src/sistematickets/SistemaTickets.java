/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistematickets;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JDANIEL
 */
public class SistemaTickets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double suma = 0;
        List<Tickets> lista = new ArrayList();

        Tickets t1 = new Tickets();
        t1.setNumero(1);
        t1.setFila(0);
        t1.setAsiento(5);
        t1.setFechaCompra(new Date());
        t1.setFechaValidez(new Date());
        t1.setPrecio(150.00);

        Tickets t2 = new Tickets();
        t2.setNumero(1);
        t2.setFila(1);
        t2.setAsiento(0);
        t2.setFechaCompra(new Date());
        t2.setFechaValidez(new Date());
        t2.setPrecio(150.00);

        Tickets t3 = new Tickets();
        t3.setNumero(1);
        t3.setFila(0);
        t3.setAsiento(0);
        t3.setFechaCompra(new Date());
        t3.setFechaValidez(new Date());
        t3.setPrecio(150.00);

        Tickets t4 = new Tickets();
        t4.setNumero(1);
        t4.setFila(0);
        t4.setAsiento(8);
        t4.setFechaCompra(new Date());
        t4.setFechaValidez(new Date());
        t4.setPrecio(150.00);

        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        lista.add(t4);

        for (Tickets tickets : lista) {

            suma += tickets.getPrecio();

        }

        System.out.println("La suma total de los precios es de: " + suma);

        System.out.println("Ingresa un número de fila para buscarla en los tickets");
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        boolean bandera = false;

        for (Tickets t : lista) {

            if (entrada == t.getFila()) {

                System.out.println(t);
                bandera = true;
            }
        }

        if (!bandera) {
            System.out.println("La fila ingresada no se encuentra registrada en los tickets");

        }
        
        
        Cliente c1 = new Cliente();
        
        c1.setId(1);
        c1.setDni("1213435");
        c1.setNombre("Pablo");
        c1.setApellido("Lo");
        c1.getTikets().add(t1);
        c1.getTikets().add(t2);


        System.out.println(c1);
    }

}
