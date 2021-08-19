
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
		 * alfabética de bairro.
		 */
		System.out.println("Modelo 6247296\n----------------------");
		listaCod1.add(new PontoDeVenda("Zezinho's Store", "Casa Verde", 10));
		listaCod1.add(new PontoDeVenda("Zezinho's Store", "Barra Funda", 3));
		listaCod1.add(new PontoDeVenda("Zezinho's Store", "Santa Cecília", 17));
		listaCod1.add(new PontoDeVenda("XYZ Eletronics", "Pari", 28));
		listaCod1.add(new PontoDeVenda("XYZ Eletronics", "Brás", 25));
		listaCod1.add(new PontoDeVenda("XYZ Eletronics", "Mooca", 12));
		listaCod1.add(new PontoDeVenda("XYZ Eletronics", "Cambuci", 4));
		listaCod1.add(new PontoDeVenda("XYZ Eletronics", "Tatuapé", 22));
		listaCod1.add(new PontoDeVenda("Lojas Céu", "Campo Belo", 7));
		listaCod1.add(new PontoDeVenda("Lojas Céu", "Cursino", 44));
		listaCod1.add(new PontoDeVenda("Lojas Céu", "Jabaquara", 5));

		/*
		 * Cria lista encadeada do modelo 4548121 (listaCod2) onde cada elemento
		 * armazena: loja, bairro e estoque. A lista deve ser ordenada em ordem
		 * alfabética de bairro.
		 */
		System.out.println("Modelo 4548121\n----------------------");
		listaCod2.add(new PontoDeVenda("Fones Smart", "Barra Funda", 4));
		listaCod2.add(new PontoDeVenda("Fones Smart", "Bom Retiro", 2));
		listaCod2.add(new PontoDeVenda("Fones Smart", "Limão", 4));
		listaCod2.add(new PontoDeVenda("Lojas Céu", "Saúde", 10));
		listaCod2.add(new PontoDeVenda("Lojas Céu", "Sacomã", 15));
		listaCod2.add(new PontoDeVenda("Lojas Céu", "Ipiranga", 18));

		/*
		 * Cria lista encadeada do modelo 2385203 (listaCod3) onde cada elemento
		 * armazena: loja, bairro e estoque. A lista deve ser ordenada em ordem
		 * alfabética de bairro.
		 */
		System.out.println("Modelo 2385203\n----------------------");
		listaCod3.add(new PontoDeVenda("Zezinho's Store", "Lapa", 16));
		listaCod3.add(new PontoDeVenda("Zezinho's Store", "Limão", 8));
		listaCod3.add(new PontoDeVenda("Zezinho's Store", "Pedizes", 8));
		listaCod3.add(new PontoDeVenda("XYZ Eletronics", "Sé", 4));
		listaCod3.add(new PontoDeVenda("XYZ Eletronics", "Belém", 17));
		listaCod3.add(new PontoDeVenda("XYZ Eletronics", "Bom Retiro", 52));
		listaCod3.add(new PontoDeVenda("XYZ Eletronics", "Água Rasa", 9));
		listaCod3.add(new PontoDeVenda("Fones Smart", "Santa Cecília", 5));
		listaCod3.add(new PontoDeVenda("Fones Smart", "Casa Verde", 9));
		listaCod3.add(new PontoDeVenda("Fones Smart", "Santana", 8));
		listaCod3.add(new PontoDeVenda("Lojas Céu", "Vila Mariana", 23));
		listaCod3.add(new PontoDeVenda("Lojas Céu", "Moema", 41));

		/*
		 * Cria fila de 30 compradores inscritos na pre venda. Cada comprador inserido
		 * na fila: idCliente,modelo, bairro e quantidade desejada.
		 */

		int opcao;
		do {
			System.out.println("Bem vindo ao Aplicação de cadastro na Pre Venda");
			System.out.println(" \n 0- para sair do sistema ");
			System.out.println(" 1- Zezinho's Store");
			System.out.println(" 2- XYZ Eletronics");
			System.out.println(" 3- Fones Smart");
			System.out.println(" 4- Lojas Céu");
			System.out.print("Digite opção: ");
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
				System.out.println("Opção inválida!");
			}
		} while (opcao != 0);

		System.out.println("Venda de promoção iniciada");
		/*
		 * Esvazia a fila de pre venda buscando produto na lista específica do modelo Na
		 * lista é feita a busca por bairro para efetuar a venda. Venda só ocorre se
		 * alguma loja puder ser atender no bairro do comprador.
		 */

		// BUSCA DUVIDA

		char resp;
		do {
			System.out.println("Fazendo a Compra do Cliente");
			/*
			 * lê informações do comprador: idCliente,modelo,bairro e quantidade desejada.*
			 * Seleciona a lista do específico modeloe faz procura pelo bairro do
			 * comprador.A venda só ocorre se alguma loja puder atender no bairro do *
			 * comprador
			 */

			System.out.println("A promoção ainda está ativa? (S/N):");
			resp = le.next().charAt(0);
		} while (resp == 'S' || resp == 's');

		System.out.println("As vendas ocorrem das 7h da manhã até as \r\n"
				+ "17h, quando a promoção é encerrada e depois só no próximo mês.");

	}
}
