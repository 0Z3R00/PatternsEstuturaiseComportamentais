package ex4_2;

import java.util.ArrayList;
import java.util.List;

public class AdapterSomador implements SomadorEsperado{
	public final SomadorExistente soma;  

	public AdapterSomador(SomadorExistente soma) {
		this.soma = soma;
	}

	@Override
	public int somaVetor(int[] vetor) {

		List<Integer> lista = new ArrayList<Integer>();

		for(int i: vetor){
			lista.add(i);
		}
		return soma.somaLista(lista);
	}
}
