package Entornos;

import java.util.Scanner;

public class Caso3 {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int lado1 = 0;
		int altura = 0;
		double resultado = areaTriangulo(lado1, altura);
		System.out.println(resultado);
		
		//holaaaaaaaaaaaaaaa hicham
		

	}
	public static double areaTriangulo(int lado1, int altura) {
		
		double area = 0;
		System.out.println("Introduce la base del triangulo: ");
		lado1 = in.nextInt();
		System.out.println("Introduce la altura: ");
		altura = in.nextInt();
		
		area = (lado1*altura)/2;
		return area;
	}

}
