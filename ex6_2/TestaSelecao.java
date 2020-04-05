package ex6_2;

import java.util.Random;

public class TestaSelecao {
	
	public  static  void  main ( String  args []) {
		int num = 25;
		
		int array[] = new int[num]; 
		Random r = new Random(); 
		for (int i = 0; i < num; i++){ 
			array[i] = r.nextInt(); 
			}
		
		Seleciona select = new Seleciona();
        int tam = array.length;
		select.selecao(array);
		System.out.println("Tamanho:"+tam);
	}
}
