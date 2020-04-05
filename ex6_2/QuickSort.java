package ex6_2;

public class QuickSort implements Ordenacao{

	public static int particao(int vet[], int ini, int fim) {
		int pivo = vet[ini]; int esq = ini+1; int dir = fim; int aux;
		while (esq <= dir) 
		{
			while (esq <= dir && vet[esq] <= pivo) esq++;
			while (vet[dir] > pivo) dir--;
			if (esq < dir) 
			{
				aux = vet[esq]; vet[esq] = vet[dir]; vet[dir] = aux;
				esq++; dir--;
			}
		}
		vet[ini] = vet[dir]; vet[dir] = pivo;
		return dir;
	}

	public static void quicksort(int vet[], int ini, int fim) {
		if (ini < fim){
			int pivo = particao(vet, ini, fim);
			quicksort(vet, ini, pivo-1);
			quicksort(vet, pivo+1, fim);
		}
	}


	@Override
	public int[] ordena(int[] vet) {
		int fim = vet.length-1;
		quicksort(vet, 0, fim);
		return vet;
	}

}
