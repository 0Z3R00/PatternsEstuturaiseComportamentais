package ex7_1;

public class StringMinuscula implements StringGeral {

		@Override
		public String Texto(String texto){
			return texto.toLowerCase().trim();
		}


	}
