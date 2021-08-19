package exercicios02;

import java.util.Scanner;

import filasEncadeadas.FilaInt;



public class Processamento {

	public static void main(String[] args) {
		FilaInt filaProcessos = new FilaInt();
		filaProcessos.init();
		
		Scanner le = new Scanner(System.in);
		char resp;
		int opcao, pid; //pid = process identifier
		do {
			System.out.println("\n 1-inserir processo na fila\n 2-Executar 1 Processo\n 3-sair");
			opcao = le.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Digite pid do processo para iniciado (entra na fila): ");
				pid = le.nextInt();
				filaProcessos.enqueue(pid);
				break;
			case 2:
				if (!filaProcessos.isEmpty()) {
					pid = filaProcessos.dequeue();
					System.out.println("Processo que será executado agora: " + pid);
					System.out.print("Processo "+ pid + "  foi concluido? (s/n): ");
					resp = le.next().charAt(0);
					if (resp == 'n' || resp == 'N')
						filaProcessos.enqueue(pid);
					else
						System.out.println("O processo "+ pid + " foi concluído");
				} 
				else
					System.out.println("Não há processos na fila para serem executados");
				break;
			case 3:
				if (!filaProcessos.isEmpty()) {
					System.out.print("Não pode encerrar. Há processos na fila, deseja fechar todos (s/n): ");
					resp = le.next().charAt(0);
					if (resp == 'n' || resp == 'N')
						opcao = 0;
					else {
						while(!filaProcessos.isEmpty()) {
							pid = filaProcessos.dequeue();
							System.out.println("Fechado o processo "+ pid);
						}
					}
				}
				break;
			default:
				System.out.println("Opcao inválida");
			}
		} while (opcao != 3);
		System.out.println("shutdown ...");
		le.close();

	}

}
