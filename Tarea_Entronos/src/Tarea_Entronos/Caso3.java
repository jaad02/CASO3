package Tarea_Entronos;

import java.util.Scanner;

public class Caso3 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// variables
		int lado1 = 0;
		int altura = 0;
		int radio = 0;

		double resultado = areaTriangulo(lado1, altura);
		System.out.println("El area del triangulo es:"+resultado);
		System.out.println("Introduce el radio, para hallar area y perimetro de la circunferencia: ");
		radio = in.nextInt();
		resultado = areaCircunferencia(radio);
		System.out.println("El area de la circunferencia es: " +resultado);
		resultado = perimetroCircunferencia(radio);
		System.out.println("El perimetro de la circunferencia es: " +resultado);

	}

	public static double areaTriangulo(int lado1, int altura) {

		double area = 0;
		System.out.println("Introduce la base del triangulo: ");
		lado1 = in.nextInt();
		System.out.println("Introduce la altura: ");
		altura = in.nextInt();

		area = (lado1 * altura) / 2;
		return area;
	}

	public static double areaCircunferencia(int radio) {
		return Math.PI * radio * radio;
	}

	public static double perimetroCircunferencia(int radio) {
		return Math.PI * (radio * 2);
	}

}
