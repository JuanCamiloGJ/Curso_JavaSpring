package es.pildoras.spring.mvc;

import java.util.Scanner;

public class CualEsMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		String mensaje = "";
		int cont = 0;
		double x, y, z;
		System.out.println("ingresa 3 números:");
		System.out.println("Valor de x: ");
		x = leer.nextDouble();
		System.out.println("Valor de y: ");
		y = leer.nextDouble();
		System.out.println("Valor de z: ");
		z = leer.nextDouble();

		if (x >= y && x >= z) {

			mensaje += "x ";
			cont++;
		}
		if (y >= x && y >= z) {

			mensaje += "y ";
			cont++;
		}
		if (z >= x && z >= y) {

			mensaje += "z ";
			cont++;
		}

		if (cont > 1) {
			System.out.println(mensaje + "tiene valores iguales");
		} else {
			System.out.println(mensaje + "es el número mayor");
		}
		leer.close();
		
		
		
		
	}

}
