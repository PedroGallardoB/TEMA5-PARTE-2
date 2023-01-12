package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		int lista[]=new int [1000];
		Scanner sc = new Scanner(System.in);
		int valor;
		int cantidad=0;
		
		for(int i=0; i<lista.length;i++) {
			lista[i]=(int) (Math.random()*100);
		}
		
		System.out.println("Introduce un valor para saber cuántas veces aparece");
		valor=sc.nextInt();
		for (int i=0;i<lista.length;i++) {
			if (valor==lista[i]) {
				cantidad++;
			}
		}
		
		if (cantidad!=0) {
			System.out.println("El número aparece "+cantidad+ " veces.");
		}else {
			System.out.println("El número no aparece.");
		}
		sc.close();
	}
}
