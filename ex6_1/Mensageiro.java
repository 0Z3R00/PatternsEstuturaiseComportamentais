package ex6_1;

import java.util.Calendar;
import java.util.Date;
//import java.util.Random;

public class Mensageiro {
	public void mensagem() {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		Mensagem mensagem = null;
		
		/*
		Mensagem mensagem = null;
		Random gerador = new Random();		
		int dayOfWeek = gerador.nextInt(7); 
		*/
		
		switch(dayOfWeek) {
		case 0:
			mensagem = new MensagemDom();
			break;
		case 1:
			mensagem = new MensagemSeg();
			break;
		case 2:
			mensagem = new MensagemTer();
			break;
		case 3:
			mensagem = new MensagemQua();
			break;
		case 4:
			mensagem = new MensagemQui();
			break;
		case 5:
			mensagem = new MensagemSex();
			break;
		case 6:
			mensagem = new MensagemSab();
			break;
		}
		System.out.println(mensagem.mensagem());
	}

}