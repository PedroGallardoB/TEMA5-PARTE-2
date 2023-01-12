package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	int cantidad;
	int valor;
	int lista[];
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Introduzca el tamaño de la lista: ");
	cantidad=sc.nextInt();
	System.out.print("Introduzca el valor de las posiciones: ");
	valor=sc.nextInt();
	lista = new int[cantidad];
	Arrays.fill(lista, valor);
	System.out.println(Arrays.toString(lista));
	sc.close();
	
}
}
