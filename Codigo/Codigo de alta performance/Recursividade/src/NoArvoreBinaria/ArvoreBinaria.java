package NoArvoreBinaria;

public class ArvoreBinaria {

	private class NO {
		int dado;
		NO esq;
		NO dir;

	}

	public static void EM_Ordem(NO p) {
		if (p != null) {
			if (p.esq != null)
				EM_Ordem(p.esq);
			System.out.println("valor: " + p.dado);
			if (p.dir != null)
				EM_Ordem(p.dir);
		}
	}

	public static void PRE_Ordem(NO p) {
		if (p != null) {
			System.out.println("valor: " + p.dado);
			if (p.esq != null)
				PRE_Ordem(p.esq);
			if (p.dir != null)
				PRE_Ordem(p.dir);

		}
	}

	public static void POS_Ordem(NO p) {
		if (p != null) {
			if (p.esq != null)
				POS_Ordem(p.esq);
			if (p.dir != null)
				POS_Ordem(p.dir);
			System.out.println("dado: " + p.dado);
		}
	}

	public static void main(String[] args) {
		NO root = null;
		// insere alguns nós
		EM_Ordem(root);
	}
}
