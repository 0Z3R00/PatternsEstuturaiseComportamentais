package ex6_2;

public class Ordem {
	/*
	 * Bubble sort
	 */
	public static int[] bolha(int v[]) {
		for (int i = v.length - 1; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (v[j] > v[j + 1]) {
					int aux = v[j + 1];
					v[j + 1] = v[j];
					v[j] = aux;
				}
			}
		}
		return v;
	}
	/*
	 * Insertion sort
	 */
	public static int[] insercao(int v[]) {
		int i, j, x;
		for (j = 1; j < v.length; ++j) {
			x = v[j];
			for (i = j - 1; i >= 0 && v[i] > x; --i) {
				v[i + 1] = v[i];
			}
			v[i + 1] = x;
		}
		return v;
	}
	/*
	 * Selection sort
	 */
	public static int[] selecao(int v[]) {
		int i, j, min, x;
		for (i = 0; i < v.length - 1; ++i) {
			min = i;
			for (j = i + 1; j < v.length; ++j) {
				if (v[j] < v[min])
					min = j;
			}
			x = v[i];
			v[i] = v[min];
			v[min] = x;
		}
		return v;
	}
	/*
	 * Quicksort - particionamento
	 * 
	 * */
	private int separa(int v[], int p, int r) {
		int c = v[p + ((int) (Math.random() *
				(1 + r - p) * 1000) % (1 + r - p))];
		int i = p + 1, j = r, t;
		while (true) {
			while (i <= r && v[i] <= c)
				++i;
			while (c < v[j])
				--j;
			if (i >= j)
				break;
			t = v[i];
			v[i] = v[j];
			v[j] = t;
			++i;
			--j;
		}
		v[p] = v[j];
		v[j] = c;
		return j;
	}
	/*
	 * Quicksort - principal (chama o metodo separa)
	 */
	public void quicksort(int v[], int p, int r) {
		int j;
		if (p < r) {
			j = separa(v, p, r);
			quicksort(v, p, j - 1);
			quicksort(v, j + 1, r);
		}
	}
}

