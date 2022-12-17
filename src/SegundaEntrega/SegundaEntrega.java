package SegundaEntrega;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SegundaEntrega {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Ingresar Precio: ");
        double precio = scanner.nextDouble();
        scanner.reset();
        System.out.println("           El Precio es : " + precio);
        double aportacionIva = precio * AportIva();
        System.out.println("       Aportacion de Iva: " + df.format(aportacionIva));
        double precTotal = precio + aportacionIva;
        System.out.println("--------------------------------");





        System.out.println(" Precio con Iva Incluido: " + df.format(precTotal));

    }
    static double AportIva() {

        return 0.25;
    }
}
