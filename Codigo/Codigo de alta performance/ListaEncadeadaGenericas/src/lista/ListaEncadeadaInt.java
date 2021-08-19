package lista;

public class ListaEncadeadaInt {

	private class NO{
		int dados;
		NO prox;
	}
	
	private NO lista = null;
	
	public boolean isEmpty() {
		return lista == null;
	}
	
	
}
