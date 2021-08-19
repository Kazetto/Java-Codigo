
public class ListaModelos {

	private class NO {
		PontoDeVenda dado;
		NO prox;
	}

	private NO lista = null;

	public boolean isEmpty() {
		return lista == null;
	}

	public void add(PontoDeVenda elem) {
		NO novo = new NO();
		novo.dado = elem;
		if (isEmpty()) {
			lista = novo;
			novo.prox = null;
		} else if (novo.dado.getBairro().equalsIgnoreCase(lista.dado.getBairro())) {
			novo.prox = lista;
			lista = novo;
		} else {
			NO aux = lista;
			boolean achou = false;
			while (aux.prox != null && !achou) {
				if (aux.prox.dado.getBairro().equalsIgnoreCase(novo.dado.getBairro()))
					aux = aux.prox;
				else
					achou = true;
			}
			novo.prox = aux.prox;
			aux.prox = novo;
		}
	}

	public boolean remove(PontoDeVenda elem) {
		boolean ok = false;
		if (!isEmpty()) {
			if (elem == lista.dado) {
				lista = lista.prox;
				ok = true;
			} else {
				NO aux = lista;
				while (aux.prox != null && !ok) {
					if (aux.prox.dado != elem)
						aux = aux.prox;
					else
						ok = true;
				}
				if (ok)
					aux.prox = aux.prox.prox;
			}
		}
		return ok;
	}

	public void show() {
		NO aux = lista;
		System.out.println("\nLista Ordenada Simples:");
		while (aux != null) {
			System.out.print("  " + aux.dado);
			aux = aux.prox;
		}
		System.out.println("\n------------------------------------");
	}

	public int count() {
		int cont = 0;
		NO aux = lista;
		while (aux != null) {
			cont++;
			aux = aux.prox;
		}
		return cont;
	}

	public void buscaBairro(String palavra) {

		int i = 0;
		NO aux = lista;
		while (aux != null) {

			if (aux.dado.getLoja().equalsIgnoreCase(palavra)) {
				System.out.println(aux.dado);
				aux = aux.prox;
			}

		}
	}

	public PontoDeVenda buscaEstoque(int elem, String bairro) {
		boolean acho = false;
		int i = 0;
		NO aux = lista;
		while (aux != null) {
			if (aux.dado.getBairro().equalsIgnoreCase(bairro)) {
				add(new PontoDeVenda(aux.dado.getLoja(), aux.dado.getBairro(), aux.dado.getEstoque() - elem));
				return aux.dado;
			}
			i++;
			aux = aux.prox;
			acho = true;

		}

		return null;
	}
}
