package ex4_2;

public class TesteCliente {
	
	public static void main(String[] args) {
		SomadorExistente somador = new SomadorExistente();
		AdapterSomador adapter = new AdapterSomador(somador);
		
		Cliente cliente = new Cliente(adapter);
		cliente.executar();
		
	}

}
