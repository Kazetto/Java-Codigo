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
				System.out.println("Sua posição na fila: " + filaProcessos.getClass());
				break;

			case 2:
				if (!filaProcessos.isEmpty()) {
					processo = filaProcessos.dequeue();
					System.out.print("Processo ID que será atendido agora: " + processo);
				} else
					System.out.println("Não há alunos na fila de atendimento");
				break;

			case 3:
				if (!filaProcessos.isEmpty()) {
					System.out.println("Não pode encerrar há alunos na fila");
					opcao = 0;
				}

				break;

			default:
				System.out.println("Opcao inválida");
			}

		} while (opcao != 3);
		System.out.println("Concluído o atendimento aos alunos");
		le.close();
	}

}