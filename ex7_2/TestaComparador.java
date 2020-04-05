package ex7_2;

import java.util.Arrays;

public class TestaComparador {
	
	public static void main(String[] args) {
		int tam = 20;
		
		ComparadorDouble[] db = new ComparadorDouble[tam];
		
		for(int i = 0; i < tam; i++) {
			db[i] = new ComparadorDouble(Math.floor(10*Math.random())+Math.random());
		}
		
		Arrays.sort(db);
		
		System.out.println("Ordenando o vetor:");
		System.out.println(Arrays.toString(db));
		
		
	}

}
