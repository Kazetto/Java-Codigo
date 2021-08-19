package aula08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TipoFilaInt filaAlunos = new TipoFilaInt();
		filaAlunos.init();
		Scanner le = new Scanner(System.in);
		int alunoRM, opcao;
		do {

			System.out.println("\n 1-inserir aluno na fila\n 2-atender aluno\n 3-sair");
			opcao = le.nextInt();
			switch (opcao) {

			case 1:
				System.out.print("Digite RM do aluno para ser atendido (entra na fila): ");
				alunoRM = le.nextInt();
				filaAlunos.enqueue(alunoRM);
				System.out.println("Sua posição na fila: " + filaAlunos.getClass());
				break;

			case 2:
				if (!filaAlunos.isEmpty()) {
					alunoRM = filaAlunos.dequeue();
					System.out.print("Aluno que será atendido agora: " + alunoRM);
				} else
					System.out.println("Não há alunos na fila de atendimento");
				break;

			case 3:
				if (!filaAlunos.isEmpty()) {
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