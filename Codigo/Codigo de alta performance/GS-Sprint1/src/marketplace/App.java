package marketplace;

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

		listaCod1.show();
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

		listaCod2.show();

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
		listaCod3.add(new PontoDeVenda("XYZ Eletronics", "Agua Rasa", 9));
		listaCod3.add(new PontoDeVenda("Fones Smart", "Santa Cecília", 5));
		listaCod3.add(new PontoDeVenda("Fones Smart", "Casa Verde", 9));
		listaCod3.add(new PontoDeVenda("Fones Smart", "Santana", 8));
		listaCod3.add(new PontoDeVenda("Lojas Céu", "Vila Mariana", 23));
		listaCod3.add(new PontoDeVenda("Lojas Céu", "Moema", 41));

		listaCod3.show();

		/*
		 * Cria fila de 30 compradores inscritos na pre venda. Cada comprador inserido
		 * na fila: idCliente,modelo, bairro e quantidade desejada.
		 */

		FilaPreVenda preVendas = new FilaPreVenda();
		preVendas.init();
		Cliente clientes[] = new Cliente[30];
		int n = 0;
		// Opcional prevenda --------
		// loop de 30 compradores
		char respost;
		int opcao;
		do {
			System.out.println(
					"\n 1- Para Cadastrar Pre Venda no sistema \n 2- Para efectuar a Pre-Venda \n 3-Para progredir o sistema ");
			System.out.print("Digite opção: ");
			opcao = le.nextInt();
			switch (opcao) {
			// Cadastrar a Pre Venda
			case 1:

				if (preVendas.isFull()) {
					System.out.println("Está fila Cheia!!!");
				} else {

					System.out.print("Digite seu id cliente:");
					int id = le.nextInt();
					int x;
					boolean achou = false;
					x = 0;
					while (x < n && !achou) {
						if (clientes[x].getIdCliente() == id)
							achou = true;
						else
							x++;
					}

					// Repetiu o id

					if (!achou) {
						System.out.println("Fazendo o cadastro deste id...");
						System.out.println("Modelo: 6247296 --- 4548121 --- 2385203");
						System.out.print("Digite o modelo: ");
						String modelo = le.next();

						if (modelo.equals("6247296")) {
							System.out.println("Preço do Modelo: " + preco[0]);
							System.out.print("Digite o Bairro:");
							le.nextLine();
							String bairro = le.nextLine();
							listaCod1.buscaBairro(bairro);

							System.out.print("Digite o Quantidade:");
							int quant = le.nextInt();
							if (quant <= 3) {
								System.out.println("Quantidade com sucesso!!!");

								
								if (listaCod1.addLista(quant, bairro) != null)
									listaCod1.busca(bairro);
								else
									System.out.println("ERRO!!!");

								Cliente venda = new Cliente(id, bairro, quant, modelo);

								preVendas.enqueue(venda);
								listaCod1.show();

								clientes[n] = venda;
								n++;
								System.out.println("Números de Pre Vendas: " + preVendas.getCont() + "\n");

							} else
								System.out.println("Erro!!!");

						} else if (modelo.equals("4548121")) {
							System.out.println("Preço do Modelo: " + preco[1]);
							System.out.print("Digite o Bairro:");
							le.nextLine();
							String bairro = le.nextLine();
							listaCod2.buscaBairro(bairro);

							System.out.print("Digite o Quantidade:");
							int quant = le.nextInt();
							if (quant <= 3) {
								System.out.println("Quantidade com sucesso!!!");

								if (listaCod2.addLista(quant, bairro) != null)
									listaCod2.busca(bairro);

								Cliente venda = new Cliente(id, bairro, quant, modelo);

								preVendas.enqueue(venda);
								listaCod2.show();

								clientes[n] = venda;
								n++;
								System.out.println("Números de Pre Vendas: " + preVendas.getCont() + "\n");

							} else
								System.out.println("Erro!!!");

						} else if (modelo.equals("2385203")) {
							System.out.println("Preço do Modelo: " + preco[2]);
							System.out.print("Digite o Bairro:");
							le.nextLine();
							String bairro = le.nextLine();

							listaCod3.buscaBairro(bairro);
							if (listaCod3.buscaBairro(bairro) == null) {
								System.out.println("Não foi encontrado");
							} else {

								System.out.print("Digite o Quantidade:");
								int quant = le.nextInt();
								if (quant <= 3) {
									System.out.println("Quantidade com sucesso!!!");
									if (listaCod3.addLista(quant, bairro) != null)
										listaCod3.busca(bairro);
									else
										System.out.println("ERRO!!!");

									Cliente venda = new Cliente(id, bairro, quant, modelo);
									preVendas.enqueue(venda);
									listaCod3.show();
									clientes[n] = venda;
									n++;
									System.out.println("Números de Pre Vendas: " + preVendas.getCont() + "\n");
								}

							}

						} else
							System.out.println("Erro no Modelo!!!");

					}

				}

				break;

			case 2:

				if (!preVendas.isEmpty()) {
					Cliente venda = preVendas.dequeue();
					System.out.println("Enviado pelo cliente: " + venda.getIdCliente());
					System.out.println("Modelo: " + venda.getModelo());
					System.out.println("Bairro: " + venda.getBairroCliente());
					System.out.println("Quantidade: " + venda.getQuantidadeCliente());

					System.out.println("Efectuando o processo de pre Venda");

				} else
					System.out.println("Não há processos na fila para serem executados");
				break;

			// Prosseguir o sistema
			case 3:

				System.out.println("Progredindo o Sistema . . . \n");
				if (!preVendas.isEmpty()) {
					System.out.print("Não pode encerrar. Há processos na fila, deseja fechar todos (s/n): ");
					respost = le.next().charAt(0);
					if (respost == 'n' || respost == 'N')
						opcao = 0;
					else {
						while (!preVendas.isEmpty()) {
							System.out.println("Fechado o processo " + preVendas.getCont());
							preVendas.dequeue();
						}
					}
				}
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 3);

		System.out.println("Venda de promoção iniciada");
		/*
		 * Esvazia a fila de pre venda buscando produto na lista específica do modelo Na
		 * lista é feita a busca por bairro para efetuar a venda. Venda só ocorre se
		 * alguma loja puder ser atender no bairro do comprador.
		 */

		preVendas.init();
		
		
		System.out.println("Bem vindo ao Sistema da comprar!!!");

		do {
			System.out.println(
					"\n 1- Verificar a busca por bairro \n 2- Para efectuar a Pre-Venda \n 3- Para progredir o sistema ");
			System.out.print("Digite opção: ");
			opcao = le.nextInt();

			switch (opcao) {
			case 1:
				if (preVendas.isFull()) {
					System.out.println("Está fila Cheia!!!");
				} else {

					System.out.print("Digite seu id cliente:");
					int id = le.nextInt();
					int x;
					boolean achou = false;
					x = 0;
					while (x < n && !achou) {
						if (clientes[x].getIdCliente() == id)
							achou = true;
						else
							x++;
					}

					// Repetiu o id
					
					if (!achou) {
						System.out.println("Qual é modelo deseja ver:\n  '6247296','4548121','2385203'");
						String modelo = le.next();
						// FAZER A BUSCA POR BAIRRO!!!
						if (modelo.equals("6247296")) {
							System.out.println("Preço do Modelo: " + preco[0]);
							System.out.print("Digite o Bairro:");
							le.nextLine();
							String bairro = le.nextLine();

							
							if (listaCod1.buscaBairro(bairro) == null) {
								System.out.println("Não foi encontrado");
							} else {

								System.out.print("Digite o Quantidade:");
								int quant = le.nextInt();
								if (quant <= 3) {
									System.out.println("Quantidade com sucesso!!!");
									
									 if (listaCod1.addLista(quant, bairro) != null)
										listaCod1.busca(bairro);
								else
										System.out.println("ERRO!!!");

									Cliente venda = new Cliente(id, bairro, quant, modelo);
									preVendas.enqueue(venda);
									listaCod1.show();
									clientes[n] = venda;
									n++;
									System.out.println("Números de Pre Vendas: " + preVendas.getCont() + "\n");
								}
						
							
							}

						} else if (modelo.equals("4548121")) {
							System.out.println("Preço do Modelo: " + preco[1]);
							System.out.print("Digite o Bairro:");
							le.nextLine();
							String bairro = le.nextLine();

						
							if (listaCod2.buscaBairro(bairro) == null) {
								System.out.println("Não foi encontrado");
							} else {

								System.out.print("Digite o Quantidade:");
								int quant = le.nextInt();
								if (quant <= 3) {
									System.out.println("Quantidade com sucesso!!!");
									
									 if (listaCod2.addLista(quant, bairro) != null)
										listaCod2.busca(bairro);
								else
										System.out.println("ERRO!!!");

									Cliente venda = new Cliente(id, bairro, quant, modelo);
									preVendas.enqueue(venda);
									listaCod2.show();
									clientes[n] = venda;
									n++;
									System.out.println("Números de Pre Vendas: " + preVendas.getCont() + "\n");
								}
						
							}

						} else if (modelo.equals("2385203")) {
							System.out.println("Preço do Modelo: " + preco[2]);
							System.out.print("Digite o Bairro:");
							le.nextLine();
							String bairro = le.nextLine();

							listaCod3.buscaBairro(bairro);
							if (listaCod3.buscaBairro(bairro) == null) {
								System.out.println("Não foi encontrado");
							} else {

								System.out.print("Digite o Quantidade:");
								int quant = le.nextInt();
								if (quant <= 3) {
									System.out.println("Quantidade com sucesso!!!");
									
									 if (listaCod3.addLista(quant, bairro) != null)
										listaCod3.busca(bairro);
								else
										System.out.println("ERRO!!!");

									Cliente venda = new Cliente(id, bairro, quant, modelo);
									preVendas.enqueue(venda);
									listaCod3.show();
									clientes[n] = venda;
									n++;
									System.out.println("Números de Pre Vendas: " + preVendas.getCont() + "\n");
								}
						
							}

						} else
							System.out.println("Erro no Modelo!!!");
					}
				}
				break;

			default:
				break;
			}

		} while (opcao != 3);

		char resp;
		do {
			/*
			 * lê informações do comprador: idCliente, modelo, bairro e quantidade desejada.
			 * Seleciona a lista do específico modelo e faz procura pelo bairro do
			 * comprador. A venda só ocorre se alguma loja puder atender no bairro do
			 * comprador.
			 */

		} while (opcao != 0);

		System.out.println("A promoção ainda está ativa? (S/N):");
		resp = le.next().charAt(0);
		while (resp == 'S' || resp == 's')
			;

		if (resp == 's' || resp == 'S') {
			System.out.println("As vendas ocorrem das 7h da manhã até as \r\n"
					+ "17h, quando a promoção é encerrada e depois só no próximo mês.");
		}
	}

}
