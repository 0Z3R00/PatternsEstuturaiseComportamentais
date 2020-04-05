package ex7_1;

import java.util.Scanner;

public class templateString {
	private String string = "";
	private String condicao = "", msg;
	private StringGeral texto;

	public templateString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		string = sc.nextLine();
		sc.close();
		for(int i = 0; i < 4; i++) {
			Seleciona(i);
		}
	}


	public void Seleciona(int condicao) {
		switch(condicao){
		case 0:
			texto = new StringMaiuscula();
			msg = texto.Texto(string);
			System.out.println(msg);
			break;
		case 1:
			texto = new StringMinuscula();
			msg = texto.Texto(string);
			System.out.println(msg);
			break;	
		case 2:
			texto = new StringDuplica();
			msg = texto.Texto(string);
			System.out.println(msg);
			break;
		case 3:
			texto = new StringInverte();
			msg = texto.Texto(string);
			System.out.println(msg);
			break;	
		}

	}
}
