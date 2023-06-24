package Viernes;

import java.util.Scanner;

public class Iva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        double iva = precio * 0.16; // Calculamos el 16% de IVA

        double precioConIVA = precio + iva; // Precio con IVA

        double descuento;
        if (precio > 50) {
            descuento = precio * 0.10; // 10% de descuento si el precio es superior a 50 pesos
        } else {
            descuento = precio * 0.05; // 5% de descuento si el precio es inferior a 50 pesos
        }

        double precioFinal = precioConIVA - descuento; // Precio final con descuento

        System.out.println("Precio: " + precio);
        System.out.println("IVA: " + iva);
        System.out.println("Descuento: " + descuento);
        System.out.println("Precio final: " + precioFinal);
    }
}

