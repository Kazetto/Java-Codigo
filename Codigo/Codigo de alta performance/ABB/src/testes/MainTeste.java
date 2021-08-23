package testes;

import java.util.Scanner;

import utils.ABBint;

public class MainTeste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ABBint abb = new ABBint();
		// Inserir a Arvore
		abb.root = abb.inserir(abb.root, 23);
		abb.root = abb.inserir(abb.root, 45);
		abb.root = abb.inserir(abb.root, 10);
		
		abb.EM_Ordem(abb.root);
		//Contar a Arvores
		System.out.println(abb.contaNos(abb.root, 0));
		
		
		//Sistema de Consulta 
		int valor;
		System.out.println("Qual é valor da consultar");
		valor = leitor.nextInt();
		
		
		System.out.println(abb.consulta(abb.root, valor));
		
		System.out.println(abb.contaConsulta(abb.root, valor,0));
	}

}
