package ex7_1;


public class StringMaiuscula implements StringGeral {

	@Override
	public String Texto(String texto){
		return texto.toUpperCase().trim();
	}


}
