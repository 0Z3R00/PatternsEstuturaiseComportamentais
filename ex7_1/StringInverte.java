package ex7_1;

public class StringInverte implements StringGeral {

	@Override
	public String Texto(String texto) {
		return new StringBuilder(texto).reverse().toString();
	}

}
