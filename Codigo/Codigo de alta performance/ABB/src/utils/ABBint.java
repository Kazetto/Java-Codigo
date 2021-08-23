package utils;

import NoArvoreBinaria.ArvoreBinaria.NO;

public class ABBint {

	private class ARVORE {
		int dado;
		ARVORE esq, dir;
	}

	public ARVORE root = null;

	public void EM_Ordem(ARVORE p) {
		if (p != null) {
			if (p.esq != null)
				EM_Ordem(p.esq);
			System.out.println("valor: " + p.dado);
			if (p.dir != null)
				EM_Ordem(p.dir);
		}
	}

	public static void PRE_Ordem(ARVORE p) {
		if (p != null) {
			System.out.println("valor: " + p.dado);
			if (p.esq != null)
				PRE_Ordem(p.esq);
			if (p.dir != null)
				PRE_Ordem(p.dir);

		}
	}

	public static void POS_Ordem(ARVORE p) {
		if (p != null) {
			if (p.esq != null)
				POS_Ordem(p.esq);
			if (p.dir != null)
				POS_Ordem(p.dir);
			System.out.println("dado: " + p.dado);
		}
	}
	
	
	public ARVORE inserir(ARVORE p, int info) {
		// insere elemento em uma ABB
		if (p == null) {
			p = new ARVORE();
			p.dado = info;
			p.esq = null;
			p.dir = null;
		} else if (info < p.dado)
			p.esq = inserir(p.esq, info);
		else
			p.dir = inserir(p.dir, info);
		return p;
	}

	public int contaNos(ARVORE p, int cont) {
		if (p != null) {
			cont++;
			if (p.esq != null)
				cont = contaNos(p.esq, cont);

			if (p.dir != null)
				cont = contaNos(p.dir, cont);
		}

		return cont;
	}

	public boolean consulta(ARVORE p, int valor) {

		if (p != null) {
			if (valor == p.dado)
				return true;
			else if (valor < p.dado)
				return consulta(p.esq, valor);
			else
				return consulta(p.dir, valor);
		}
		return false;
	}

	public int contaConsulta(ARVORE p, int valor, int cont) {
		if (p != null) {
			cont++;
			if (valor == p.dado)
				return cont;

			else if (valor < p.dado)
				cont = contaConsulta(p.esq, valor, cont);
			else
				cont = contaConsulta(p.dir, valor, cont);
		}

		return cont;
	}

}
