package ejercicios;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		int lista[]=new int [30];
		
		for(int i=0; i<lista.length;i++) {
			lista[i]=(int) (Math.random()*10);
		}
		Arrays.sort(lista);
		System.out.println(Arrays.toString(lista));
	}
}
