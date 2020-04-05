package ex5_1;

import java.io.IOException;

public class testeIO {

	public static void main(String[] args) throws IOException {
		
		IOFacade io = new IOFacade();
		io.ArquivoTxt("ArquivoTXT", "um arquivo tipo texto");
		io.ArquivoBinario("ArquivoBin","um arquivo do tipo binario");
		io.ArquivoObjeto("ArquivoObj","um arquivo do tipo Objeto");
	}
}
