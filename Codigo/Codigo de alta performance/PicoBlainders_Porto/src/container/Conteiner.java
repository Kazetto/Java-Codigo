package container;

import java.util.Scanner;

import porto.TipoPilhaConteiner;

public class Conteiner {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		TipoPilhaConteiner container = new TipoPilhaConteiner();
		TipoPilhaConteiner dest = new TipoPilhaConteiner();

		container.init();
		dest.init();

		int pilha01[] = new int[container.N];
		int pilha02[] = new int[dest.N];

		int numero = 5;
		int contMove01 = 0;
		int contMove02 = 0;
		System.out.println("Bem-Vindo ao Menu");
		while (numero != 0) {
			System.out.println("\n0 - Encerrar programa");
			System.out.println("1 - Insere conteiner no pátio");
			System.out.println("2 - Retira conteiner do pátio");
			System.out.println("3 - Cálculo do custo da movimentação dos conteineres");
			System.out.println("4 - Apresenta os conteineres em cada pilha do pátio");
			System.out.println("5 - Apresenta planilhas de conteineres de cada pilha do pátio");
			numero = leitor.nextInt();

			if (numero >= 6)
				System.out.println("Número Inválido");

			switch (numero) {
			case 0:
				System.out.println("******* Programa encerrado********\n");
				break;
			case 1:
				System.out.println("******* Insere Conteiner no pátio ********\n");
				// Só adciona o ID do Conteiner - Pronto

				int valor = 0;

				for (int i = 0; (valor >= 0); i++) {
					System.out.println("Informe código de identificação do conteiner: ");
					valor = leitor.nextInt();
					pilha01[i] = valor;
					container.push(valor);
					if (valor < 0) {
						container.pop();
					}
					System.out.println("Identificação número negativo processo é cancelado");
					System.out.println("Informe código de identificação do conteiner: ");
					valor = leitor.nextInt();
					pilha02[i] = valor;
					dest.push(valor);
					if (valor < 0) {
						dest.pop();
					}
				}

				break;
			case 2:
				System.out.println("******* Retira conteiner do pátio ********\n");
				

				System.out.println("Informe código de identificação do conteiner para retirar: ");
				int valorRemover = leitor.nextInt();

				container.busca(valorRemover, pilha01);
				if (container.busca(valorRemover, pilha01) != false) {
					for (int i = 0; i < pilha01.length; i++) {

						if (pilha01[i] == valorRemover) {
							pilha01[i] = 0;

							// Retirando
							for (int x = 0; x < pilha01.length; x++) {
								if (pilha01[x] >= x) {
									contMove01++;
								}

							}

							pilha01[i] = pilha01[i + 1];
							pilha01[i + 1] = pilha01[i + 2];
							pilha01[i + 2] = pilha01[i + 3];
							pilha01[i + 3] = pilha01[i + 4];
							container.pop();

							// Colocando de volta
							for (int x = 0; x < pilha01.length; x++) {
								if (pilha01[x] >= x) {
									contMove01++;
								}

							}
						}
					}
					System.out.println("Retira com sucesso!!!");

				} else {
					System.out.println("Pilha #1: ID inválido");
				}

				// Pilha #2

				if (container.busca(valorRemover, pilha02) != false) {
					for (int i = 0; i < pilha02.length; i++) {

						if (pilha02[i] == valorRemover) {
							for (int x = 0; x < pilha02.length; x++) {
								if (pilha02[x] >= x) {
									contMove02++;

								}

							}

							pilha02[i] = 0;
							pilha02[i] = pilha02[i + 1];
							pilha02[i + 1] = pilha02[i + 2];
							pilha02[i + 2] = pilha02[i + 3];
							pilha02[i + 3] = pilha02[i + 4];
							dest.pop();
						}
					}
					System.out.println("Retira com sucesso!!!");

				} else {
					System.out.println("Pilha #2: ID inválido");
				}
				container.ocupacao01(pilha01, contMove01);
				dest.ocupacao02(pilha02, contMove02);
				break;
			case 3:
				System.out.println("******* Cálculo do custo da movimentação dos conteineres ********\n");
				// Calculo
				int movimentoTotal;
				movimentoTotal = contMove01 + contMove02;

				System.out.println("Número de movimentações: " + movimentoTotal);

				break;
			case 4:
				System.out.println("******* Apresenta os conteineres em cada pilha do pátio ********\n");

				container.show(pilha01, contMove01);
				dest.show02(pilha02, contMove02);
				break;
			case 5:
				System.out.println("******* Apresenta planilhas de conteineres de cada pilha do pátio ********\n");
				// Pronta
				container.planilha(pilha01);
				dest.planilha02(pilha02);
			}
		}

		leitor.close();

	}

}
