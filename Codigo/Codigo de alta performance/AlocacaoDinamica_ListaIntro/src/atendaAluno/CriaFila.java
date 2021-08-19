package atendaAluno;

public class CriaFila {
	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno();
		a1.duvida = 3;
		a1.prox = null;
		
		Aluno a2 = new Aluno();
		a2.duvida = 1;
		a2.prox = null;
		
		a1.prox = a2;
		
		System.out.println("a1" + a1 +"\t a1.duvida: " + a1.duvida +"\t a1.prox: " + a1.prox);
		System.out.println("a2" + a2 +"\t a2.duvida: " + a2.duvida + "\t a2.prox: " + a2.prox);
	}
	
}
