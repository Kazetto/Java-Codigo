package PlanilhaTipoAluno;

import java.util.Scanner;

public class PlanilhaTipoAluno {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("-----Aluno 1#------");
		TipoAluno aluno1 = new TipoAluno();		
		aluno1.leNotas(leitor);
		System.out.println(aluno1.notas[0]);
		System.out.println("A média do aluno é: "+ aluno1.calcularMedia());
		
		System.out.println("-----Aluno 2#------");
		TipoAluno aluno2 = new TipoAluno();		
		aluno2.leNotas(leitor);
		System.out.println("A média do aluno é: "+ aluno2.calcularMedia());
		
		System.out.println("-----Aluno 3#------");
		TipoAluno aluno3 = new TipoAluno();		
		aluno3.leNotas(leitor);
		System.out.println("A média do aluno é: "+ aluno3.calcularMedia());
		
	}

}
