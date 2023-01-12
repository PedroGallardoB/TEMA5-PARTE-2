package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {
public static void main(String[] args) {
	int inicio=0;
	int lista[]=new int[55];
	for (int i=1; i<=10;i++) {
		Arrays.fill(lista, inicio, inicio+i, i);
		inicio+=i;
	}
	System.out.println(Arrays.toString(lista));
}
}
