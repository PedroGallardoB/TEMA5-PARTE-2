package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int puntuaciones[]=new int [8];
		
		System.out.println("Introduzca puntuaciones para los jugadores (HAY 8):");
		for(int i=0; i<puntuaciones.length;i++) {
			puntuaciones[i]=sc.nextInt();
		}
		
		Arrays.sort(puntuaciones);
		for(int i=puntuaciones.length-1; i>=0 ;i--) {
			System.out.println(puntuaciones[i]);
		}
		
	
		sc.close();
	}
}
