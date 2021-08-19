package aula08;

import java.util.Scanner;

public class Processos {

	public static void main(String[] args) {
		TipoFilaInt filaProcessos = new TipoFilaInt();
		filaProcessos.init();
		Scanner le = new Scanner(System.in);
		int processo, opcao;
		do {

			System.out.println("\n 1-inserir processos na fila\n 2-executar processos\n 3-sair");
			opcao = le.nextInt();
			switch (opcao) {

			case 1:
				System.out.print("inserir processo (entra na fila): ");
				processo = le.nextInt();
				filaProcessos.enqueue(processo);
				System.out.println("Sua posi��o na fila: " + filaProcessos.getClass());
				break;

			case 2:
				if (!filaProcessos.isEmpty()) {
					processo = filaProcessos.dequeue();
					System.out.print("Processo ID que ser� atendido agora: " + processo);
				} else
					System.out.println("N�o h� alunos na fila de atendimento");
				break;

			case 3:
				if (!filaProcessos.isEmpty()) {
					System.out.println("N�o pode encerrar h� alunos na fila");
					opcao = 0;
				}

				break;

			default:
				System.out.println("Opcao inv�lida");
			}

		} while (opcao != 3);
		System.out.println("Conclu�do o atendimento aos alunos");
		le.close();
	}

}