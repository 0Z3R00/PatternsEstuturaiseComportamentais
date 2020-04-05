package ex6_2;

import java.util.Random;

public class Seleciona {

	public void selecao(int[] vet) {

		String msg = "";
		Ordenacao ordena = null;
		int tam = vet.length;

		if(tam <= 10) {
			ordena = new BubbleSort();
			msg = "BubbleSort";
		}else if(tam > 1000) {
			ordena = new QuickSort();
			msg = "QuickSort";
		}else {
			Random r = new Random(); 
			int num = r.nextInt(2);
			if(num == 1){
				ordena = new InsertionSort();
				msg = "InsertionSort";
			}else {
				ordena = new SelectionSort();
				msg = "SelectionSort";
			}
		}
		ordena.ordena(vet);
		System.out.println(msg);
		for(int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
}
