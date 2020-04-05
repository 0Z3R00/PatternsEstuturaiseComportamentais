package ex7_2;

public class ComparadorDouble extends Number implements Comparable<ComparadorDouble>{
	
	private static final long serialVersionUID = 1L;	

	private Double valor;

	public ComparadorDouble (Double valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(ComparadorDouble dbl) {
		if(this == dbl) {
			return 0;
		}
		if(dbl == null) {
			return 1;
		}

		double decimal = valor - valor.intValue();
		double dblDecimal = dbl.doubleValue() - dbl.intValue();

		if (decimal < dblDecimal) {
			return -1;
		}else if(decimal == dblDecimal) {
			return 0;
		}else {
			return 1;
		}
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return valor.intValue();
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return valor.longValue();
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return valor.floatValue();
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return valor.doubleValue();
	}

	@Override
	public String toString() {
		return "Valor:"+valor;
	}
}
