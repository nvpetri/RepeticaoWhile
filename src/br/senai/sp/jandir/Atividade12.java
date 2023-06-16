package br.senai.sp.jandir;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nome;
		int valor, i;
		i = 0;
		
		System.out.println("--------------------------------------------------------");
		System.out.println("            Digite seu nome ou uma frase");
		System.out.println("--------------------------------------------------------");
		nome = teclado.nextLine();
		System.out.println("--------------------------------------------------------");
		System.out.println("  Olá " + nome + " quantas vezes você deseja repetir?");
		System.out.println("--------------------------------------------------------");
		valor = teclado.nextInt();
		
		while(valor > i ) {
			System.out.println(nome);
			i++ ;
		}
	}

}
