package ejercicios;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int lista[]=new int[6];
		int ganador[]=new int[6];
		int aciertos=0;
		
		for(int i=0;i<lista.length;i++) {
			lista[i]=(int)(Math.random()*49)+1;
			ganador[i]=(int)(Math.random()*49)+1;
		}
		System.out.println("TU LISTA: " + Arrays.toString(lista));
		Arrays.sort(ganador);
		System.out.println("LISTA GANADORA: " + Arrays.toString(ganador));
		
		for(int i=0;i<lista.length;i++) {
			int posicion = Arrays.binarySearch(ganador, lista[i]);
			if (posicion >= 0) {
				aciertos++;
			}
	}
		System.out.println("Tienes " + aciertos+ " aciertos");
}
}