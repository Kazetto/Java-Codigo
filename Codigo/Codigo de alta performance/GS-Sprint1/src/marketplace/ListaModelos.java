package marketplace;

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
		} else if (novo.dado.getBairro().compareToIgnoreCase(lista.dado.getBairro()) < 0) {
			novo.prox = lista;
			lista = novo;

		} else {
			NO aux = lista;
			boolean achou = false;
			while (aux.prox != null && !achou) {
				if (aux.prox.dado.getBairro().compareToIgnoreCase(novo.dado.getBairro()) < novo.dado.getBairro()
						.compareTo(novo.dado.getBairro()))
					aux = aux.prox;
				else
					achou = true;

			}
			novo.prox = aux.prox;
			aux.prox = novo;

		}
	}

	public boolean remove(String elem) {
		boolean ok = false;
		if (!isEmpty()) {
			if (elem == lista.dado.getBairro()) {
				lista = lista.prox;
				ok = true;
			} else {
				NO aux = lista;
				while (aux.prox != null && !ok) {
					if (aux.prox.dado.getBairro() != elem)
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

	public PontoDeVenda buscaBairro(String palavra) {
		int i = 0;
		NO aux = lista;
		while (aux != null) {
			if (aux.dado.getBairro().equalsIgnoreCase(palavra)) {
				System.out.println(aux.dado);
				return aux.dado;
			}
			i++;
			aux = aux.prox;
		}
		return null;

	}

	public PontoDeVenda addLista(int elem, String bairro) {
		int i = 0;
		int reserva = 0;
		String dadoBairro, dadoLoja;
		NO aux = lista;
		while (aux != null) {
			if (aux.dado.getBairro().equalsIgnoreCase(bairro)) {
				remove(aux.dado.getBairro());
				reserva = aux.dado.getEstoque()- elem;
				dadoLoja = aux.dado.getLoja();
				dadoBairro = aux.dado.getBairro();
				add(new PontoDeVenda(dadoLoja, dadoBairro, reserva));

				return aux.dado;

			}
			i++;
			aux = aux.prox;
		}
		return null;

	}

	public PontoDeVenda busca(String bairro) {
		int i = 0;
		int reserva = 0;
		String dadoBairro, dadoLoja;
		NO aux = lista;
		while (aux != null) {
			if (aux.dado.getBairro().equalsIgnoreCase(bairro)) {
				reserva = aux.dado.getEstoque();
				dadoLoja = aux.dado.getLoja();
				dadoBairro = aux.dado.getBairro();
				if (reserva < 0) {
					System.out.println("Erro");

				}
				if (reserva == 0) {
					remove(aux.dado.getBairro());
				}

				return aux.dado;
			}
			i++;
			aux = aux.prox;
		}
		return null;

	}

}
