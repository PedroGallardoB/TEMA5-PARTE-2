package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int lista1[] = new int[10];
		int lista2[] = new int[10];
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Compara 10 números (de 10 en 10). Introduce valores:");
		System.out.println("TRUE son iguales, FALSE son diferentes");
		for (int i = 0; i < 20; i++) {
			num = sc.nextInt();
			if (i < 10) {
				lista1[i] = num;
			} else {
				lista2[i-lista1.length] = num;
			}
		}
		
		System.out.println(Arrays.equals(lista1, lista2));
		sc.close();
	}
}
