package ex5_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class IOFacade {
    private static String nomeArquivo;
    private static String mensagem;
	/*
	 * Cria arquivo txt, realiza a leitura
	 * */
	public void ArquivoTxt(String nome, String msg) throws IOException {
		nomeArquivo = nome+".txt";
		mensagem = msg;
		CriaArquivo();
		leitor();
	}
	
	public void ArquivoBinario(String nome, String msg) throws IOException {
		nomeArquivo = nome+".bin";
		mensagem = msg;
		CriaArquivo();
		leitor();
		
	}
	public void ArquivoObjeto(String nome, String msg) throws IOException {
		nomeArquivo = nome+".obj";
		mensagem = msg;
		CriaArquivo();
		leitor();
		
	}
	
	
	private static void CriaArquivo() {
		try (PrintWriter writer = new PrintWriter(new File(nomeArquivo))) {
			writer.println(mensagem);
		} catch (FileNotFoundException e) {
			System.out.println("Deu erro ao escrever o arquivo");
			e.printStackTrace();
		}
	}
	
	 public static void leitor() throws IOException {
	        BufferedReader buffRead = new BufferedReader(new FileReader(nomeArquivo));
	        String linha = "";
	        while (true) {
	            if (linha != null) {
	                System.out.println(linha);
	 
	            } else
	                break;
	            linha = buffRead.readLine();
	        }
	        buffRead.close();
	    }

	 
}