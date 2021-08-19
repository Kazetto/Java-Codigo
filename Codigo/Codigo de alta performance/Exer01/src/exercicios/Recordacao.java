package exercicios;

import java.util.Scanner;

public class Recordacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Aluno 1#");
		double notasAluno1[] = new double[3];

		notasAluno1 = leNotas(leitor);

		System.out.println("A média artimedia foi: " + calcularMedia(notasAluno1));

		System.out.println("Aluno 2#");
		double notasAluno2[] = new double[3];

		notasAluno2 = leNotas(leitor);

		System.out.println("A média artimedia foi: " + calcularMedia(notasAluno2));

		System.out.println("Aluno 3#");
		double notasAluno3[] = new double[3];

		notasAluno3 = leNotas(leitor);

		System.out.println("A média artimedia foi: " + calcularMedia(notasAluno3));
	}

	public static double[] leNotas(Scanner leitor) {

		double notas[] = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Por favor, digita a " + (i + 1) + "° " + "a nota");
			notas[i] = leitor.nextDouble();
		}
		return notas;
	}

	public static double calcularMedia(double notas[]) {
		double soma = 0;
		for (int i = 0; i < 3; i++) {
			soma = soma + notas[i];
		}

		return (soma/3);
	}

}
