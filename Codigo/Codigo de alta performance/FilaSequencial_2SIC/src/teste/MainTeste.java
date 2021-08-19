package teste;

import filaSequenciais.FilaInt;

public class MainTeste {

	public static void main(String[] args) {
		FilaInt fila = new FilaInt();

		fila.init();

		fila.enqueue(23);
		fila.enqueue(66);

		System.out.println("Valor retirado: " + fila.dequeue());

		fila.enqueue(17);
		fila.enqueue(32);
		fila.enqueue(86);
		
		while(!fila.isEmpty())
			System.out.println("Valor retirado: " + fila.dequeue());
	}

}
