package aulaSomatorio;

public class Ex01 {

	public static void main(String[] args) {
		int soma;
		soma = somatorio(5);
		System.out.println("Somatório = " + soma);

	}

	public static int somatorio(int n) {
		if (n != 0)
			return (n + somatorio(n - 1));
		else
			return (1);
	}

}
