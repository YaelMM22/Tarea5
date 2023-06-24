package Viernes;

import java.util.Scanner;

public class monedas {
	
//Conversión de monedas: Se debe poder convertir soles, pesos, dólares y quetzales

	    private double CambioSOLtoUSD;
	    private double CambioSOLtoMXN;
	    private double CambioSOLtoGTQ;

	    public monedas(double CambioSOLtoUSD, double CambioSOLtoMXN, double CambioSOLtoGTQ) {
	        this.CambioSOLtoUSD = CambioSOLtoUSD;
	        this.CambioSOLtoMXN = CambioSOLtoMXN;
	        this.CambioSOLtoGTQ = CambioSOLtoGTQ;
	    }

	    public double convertirSolesADolares(double soles) {
	        return soles / CambioSOLtoUSD;
	    }

	    public double convertirSolesAPesos(double soles) {
	        return soles / CambioSOLtoMXN;
	    }

	    public double convertirSolesAQuetzales(double soles) {
	        return soles * CambioSOLtoGTQ;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Ingrese la cantidad en soles: ");
	        double soles = input.nextDouble();

	        // Definir los tipos de cambio
	        double tipoCambioPENtoUSD = 0.3;
	        double tipoCambioPENtoMXN = 4.7;
	        double tipoCambioPENtoGTQ = 2.2;


	        monedas conversor = new monedas(tipoCambioPENtoUSD, tipoCambioPENtoMXN, tipoCambioPENtoGTQ);

	        double dolares = conversor.convertirSolesADolares(soles);
	        double pesos = conversor.convertirSolesAPesos(soles);
	        double quetzales = conversor.convertirSolesAQuetzales(soles);

	        System.out.println("Dólares: " + dolares);
	        System.out.println("Pesos: " + pesos);
	        System.out.println("Quetzales: " + quetzales);
	    
	}

}
