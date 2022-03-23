package com.uninter;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	
	public static void main(String[] args) {
		// declarando variáveis
		Scanner teclado = new Scanner(System.in);
		char novamente = 'i';
		
		while (true) { // LOOP PRINCIPAL DO JOGO
			// verificar se é a segunda rodada, se sim perguntar se quer jogar novamente
			while (novamente != 'S' && novamente != 'N') {
				if (novamente == 'g') {
					System.out.println("Gostaria de jogar novamente? S/N");
					novamente = teclado.next().charAt(0);
				} else if (novamente == 'i') { 
					break;
				} else {
					System.out.println("Ops, essa não é uma opção válida... Responda com 'S' para sim e 'N' para não.");
					System.out.println("Gostaria de jogar novamente? S/N");
					novamente = teclado.next().charAt(0);
				}
			}
			// Verificando se o jogador deseja jogar novamente
			if (novamente == 'S') {
				novamente = 'g';
			} else if (novamente == 'N'){
				break;
			} else if (novamente == 'i') {
				novamente = 'g';
			}
			
			Tabuleiro tab = new Tabuleiro();
			Jogador jogador = new Jogador();
			Computador comp;
			int type = 4;
			boolean valido = false;
			System.out.println("Jogo da velha");
			System.out.println("O primeiro jogador é escolhido aleatoriamente.");
			while (! valido) { // LOOP DO JOGO
				System.out.println("Escolha o tipo de jogo, para single player é 1 e 2, para multiplayer é 3:");
				type = teclado.nextInt();
				
				while (type > 3 || type < 1) { // WHILE PARA CONTROLE DE ERROS
					System.out.println("Escolha o tipo de jogo, para single player é 1 e 2, para multiplayer é 3:");
					type = teclado.nextInt();
				}
				
				// Gerando segundo player (computador ou multiplayer)
				comp = new Computador(type);
				Random gerador = new Random();
				int vez = gerador.nextInt(1, 3);
				tab.visualizar();
				
				while(tab.situacao()==0) { // LOOP DA PARTIDA
					if(vez==1) { //Jogador Humano
						tab = jogador.jogar(tab);
						vez=2;
						System.out.println("");
					} else if(vez==2) {
						tab = comp.jogar(tab);
						vez=1;
					}
					
					tab.visualizar();
					
				} // FIM DO LOOP DA PARTIDA
				
				// Exibindo o ganhador da partida
				if (tab.situacao() == 1) {
					System.out.println("Vitória do Jogador X!");
					valido = true;
				} else if (tab.situacao() == 2) {
					System.out.println("Vitória do jogador O!");
					valido = true;
				} else {
					System.out.println("Empate!");
				}
				
			} // FIM DO LOOP DO JOGO
			
		} // FIM DO LOOP PRINCIPAL DO JOGO
		System.out.println("Encerrando.");
		teclado.close();
		
	} // FIM DA CLASSE PRINCIPAL

} // FIM DO PROGRAMA
