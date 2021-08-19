
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		int codigo[] = { 6247296, 4548121, 2385203 };
		double preco[] = { 699.99, 1059.00, 765.39 };

		ListaModelos listaCod1 = new ListaModelos();
		ListaModelos listaCod2 = new ListaModelos();
		ListaModelos listaCod3 = new ListaModelos();
		/*
		 * Cria lista encadeada do modelo 6247296 (listaCod1) onde cada elemento
		 * armazena: loja, bairro e estoque. A lista deve ser ordenada em ordem
		 * alfab�tica de bairro.
		 */
		System.out.println("Modelo 6247296\n----------------------");
		listaCod1.add(new PontoDeVenda("Zezinho's Store", "Casa Verde", 10));
		listaCod1.add(new PontoDeVenda("Zezinho's Store", "Barra Funda", 3));
		listaCod1.add(new PontoDeVenda("Zezinho's Store", "Santa Cec�lia", 17));
		listaCod1.add(new PontoDeVenda("XYZ Eletronics", "Pari", 28));
		listaCod1.add(new PontoDeVenda("XYZ Eletronics", "Br�s", 25));
		listaCod1.add(new PontoDeVenda("XYZ Eletronics", "Mooca", 12));
		listaCod1.add(new PontoDeVenda("XYZ Eletronics", "Cambuci", 4));
		listaCod1.add(new PontoDeVenda("XYZ Eletronics", "Tatuap�", 22));
		listaCod1.add(new PontoDeVenda("Lojas C�u", "Campo Belo", 7));
		listaCod1.add(new PontoDeVenda("Lojas C�u", "Cursino", 44));
		listaCod1.add(new PontoDeVenda("Lojas C�u", "Jabaquara", 5));

		/*
		 * Cria lista encadeada do modelo 4548121 (listaCod2) onde cada elemento
		 * armazena: loja, bairro e estoque. A lista deve ser ordenada em ordem
		 * alfab�tica de bairro.
		 */
		System.out.println("Modelo 4548121\n----------------------");
		listaCod2.add(new PontoDeVenda("Fones Smart", "Barra Funda", 4));
		listaCod2.add(new PontoDeVenda("Fones Smart", "Bom Retiro", 2));
		listaCod2.add(new PontoDeVenda("Fones Smart", "Lim�o", 4));
		listaCod2.add(new PontoDeVenda("Lojas C�u", "Sa�de", 10));
		listaCod2.add(new PontoDeVenda("Lojas C�u", "Sacom�", 15));
		listaCod2.add(new PontoDeVenda("Lojas C�u", "Ipiranga", 18));

		/*
		 * Cria lista encadeada do modelo 2385203 (listaCod3) onde cada elemento
		 * armazena: loja, bairro e estoque. A lista deve ser ordenada em ordem
		 * alfab�tica de bairro.
		 */
		System.out.println("Modelo 2385203\n----------------------");
		listaCod3.add(new PontoDeVenda("Zezinho's Store", "Lapa", 16));
		listaCod3.add(new PontoDeVenda("Zezinho's Store", "Lim�o", 8));
		listaCod3.add(new PontoDeVenda("Zezinho's Store", "Pedizes", 8));
		listaCod3.add(new PontoDeVenda("XYZ Eletronics", "S�", 4));
		listaCod3.add(new PontoDeVenda("XYZ Eletronics", "Bel�m", 17));
		listaCod3.add(new PontoDeVenda("XYZ Eletronics", "Bom Retiro", 52));
		listaCod3.add(new PontoDeVenda("XYZ Eletronics", "�gua Rasa", 9));
		listaCod3.add(new PontoDeVenda("Fones Smart", "Santa Cec�lia", 5));
		listaCod3.add(new PontoDeVenda("Fones Smart", "Casa Verde", 9));
		listaCod3.add(new PontoDeVenda("Fones Smart", "Santana", 8));
		listaCod3.add(new PontoDeVenda("Lojas C�u", "Vila Mariana", 23));
		listaCod3.add(new PontoDeVenda("Lojas C�u", "Moema", 41));

		/*
		 * Cria fila de 30 compradores inscritos na pre venda. Cada comprador inserido
		 * na fila: idCliente,modelo, bairro e quantidade desejada.
		 */

		int opcao;
		do {
			System.out.println("Bem vindo ao Aplica��o de cadastro na Pre Venda");
			System.out.println(" \n 0- para sair do sistema ");
			System.out.println(" 1- Zezinho's Store");
			System.out.println(" 2- XYZ Eletronics");
			System.out.println(" 3- Fones Smart");
			System.out.println(" 4- Lojas C�u");
			System.out.print("Digite op��o: ");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Finalizado o atendimento");
				break;
			case 1:
				listaCod1.buscaBairro("Zezinho's Store");
				for(int i = 0; i > codigo.length; i++) {
					System.out.println(codigo[i]);
				}

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			default:
				System.out.println("Op��o inv�lida!");
			}
		} while (opcao != 0);

		System.out.println("Venda de promo��o iniciada");
		/*
		 * Esvazia a fila de pre venda buscando produto na lista espec�fica do modelo Na
		 * lista � feita a busca por bairro para efetuar a venda. Venda s� ocorre se
		 * alguma loja puder ser atender no bairro do comprador.
		 */

		// BUSCA DUVIDA

		char resp;
		do {
			System.out.println("Fazendo a Compra do Cliente");
			/*
			 * l� informa��es do comprador: idCliente,modelo,bairro e quantidade desejada.*
			 * Seleciona a lista do espec�fico modeloe faz procura pelo bairro do
			 * comprador.A venda s� ocorre se alguma loja puder atender no bairro do *
			 * comprador
			 */

			System.out.println("A promo��o ainda est� ativa? (S/N):");
			resp = le.next().charAt(0);
		} while (resp == 'S' || resp == 's');

		System.out.println("As vendas ocorrem das 7h da manh� at� as \r\n"
				+ "17h, quando a promo��o � encerrada e depois s� no pr�ximo m�s.");

	}
}
