package TareaEntonosIvanJuan;

import java.util.Scanner;

public class Tarea_Entornos {
	static Scanner entrada= new Scanner (System.in);

	public static void main(String[] args) {
		int lado1=0;
		int lado2=0;
		//double resultado = calcularArea(lado1,lado2);
		//System.out.println("El área es: "+resultado);
		areaPerímetroCircunferencia();

	}
	public static double calcularArea (int lado1, int lado2) {
		System.out.println("introduzca el primer lado");
		lado1=entrada.nextInt();
		System.out.println("introduzca el segundo lado");
		lado2=entrada.nextInt();
		double area=lado1*lado2;
		return area;
	}
	public static void areaPerímetroCircunferencia() {
		int radio = 0;
		double pi = 3.14;
		System.out.println("Introduzca el radio de la circunferencia: ");
		radio = entrada.nextInt();
		double perimetroCirc = 2*pi*radio;
		System.out.println("El perimetro es: "+perimetroCirc);
		double areaCirc = pi * (radio * radio);
		System.out.println("El area esL: "+areaCirc);
		
		
	}

}
