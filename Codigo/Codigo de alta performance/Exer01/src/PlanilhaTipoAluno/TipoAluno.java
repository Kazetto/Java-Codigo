package PlanilhaTipoAluno;

import java.util.Scanner;

public class TipoAluno {

	public double notas[] = new double[3];

	public void leNotas(Scanner leitor) {

		for (int i = 0; i < 3; i++) {
			System.out.println("Por favor, digita a " + (i + 1) + "° " + "a nota");
			notas[i] = leitor.nextDouble();
		}

	}

	public double calcularMedia() {
		double soma = 0;
		for (int i = 0; i < 3; i++) {
			soma = soma + notas[i];
		}

		return (soma / 3);
	}

}
