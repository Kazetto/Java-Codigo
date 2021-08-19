package exemplo3;

public class ListaIntroducao {

	public static void main(String[] args) {

		NoLista lista = new NoLista();
		lista.dados = 1;
		lista.prox = null;
		
		NoLista novo = new NoLista();
		novo.dados = 2;
		novo.prox = null;
		
		lista.prox = novo;
		


		
		
		
	}

}
