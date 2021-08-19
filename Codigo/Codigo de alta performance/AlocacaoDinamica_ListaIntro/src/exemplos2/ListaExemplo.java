package exemplos2;

public class ListaExemplo {

	public static void main(String[] args) {

		NoLista lista = new NoLista();
		lista.dados = 68;
		lista.prox = null;
		
		NoLista novo = new NoLista();
		novo.dados = 32;
		novo.prox = null;
		
		lista.prox = novo;
		
		NoLista novo2 = new NoLista();
		novo2.dados = 24;
		novo2.prox = lista;
		
		
		lista.prox = novo2;
		// Percorre lista apresentando valor do dados de cada nó
		NoLista aux = lista;
		
		while(aux != null) {
		System.out.println(aux.dados);
		aux = aux.prox;
		}
		
	}

}
