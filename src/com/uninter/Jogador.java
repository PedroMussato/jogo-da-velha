package com.uninter;

import java.util.Scanner;

public class Jogador {

	private char player = 'X';

	private Scanner teclado = new Scanner(System.in);
	
	char marca = player;
	
	void Jogador () {
		
	}
	private boolean validaJ (char celula) {
		boolean retorno;
		if (celula != '_') {
			System.out.println("Essa casa ja foi marcada. Tente novamente.");
			retorno = false;
		} else {
			System.out.println("Ok!");
			retorno = true;
		}
		return retorno;
	}
	
	public Tabuleiro jogar (Tabuleiro tab) {
		System.out.println("Jogador X");
		boolean jogada = true;	
		while (jogada) {
			// receber jogada
			System.out.println("Sua jogada é em qual linha? (1, 2 ou 3)");
			int linha =  teclado.nextInt();
			System.out.println("Sua jogada é em qual coluna? (1, 2 ou 3)");
			int coluna =  teclado.nextInt();
			
			// verificar célula da jogada
			char celula;
			if (linha == 1 && coluna == 1) {
				celula = tab.l1c1;
				if (validaJ(celula)) {
					tab.l1c1 = this.player;
					jogada = false;
				}
			} else if (linha == 1 && coluna ==2) {
				celula = tab.l1c2;
				if (validaJ(celula)) {
					tab.l1c2 = this.player;
					jogada = false;
				}
			} else if (linha == 1 && coluna ==3) {
				celula = tab.l1c3;
				if (validaJ(celula)) {
					tab.l1c3 = this.player;
					jogada = false;
				}
			} else if (linha == 2 && coluna ==1) {
				celula = tab.l2c1;
				if (validaJ(celula)) {
					tab.l2c1 = this.player;
					jogada = false;
				}
			} else if (linha == 2 && coluna ==2) {
				celula = tab.l2c2;
				if (validaJ(celula)) {
					tab.l2c2 = this.player;
					jogada = false;
				}
			} else if (linha == 2 && coluna ==3) {
				celula = tab.l2c3;
				if (validaJ(celula)) {
					tab.l2c3 = this.player;
					jogada = false;
				}
			} else if (linha == 3 && coluna ==1) {
				celula = tab.l3c1;
				if (validaJ(celula)) {
					tab.l3c1 = this.player;
					jogada = false;
				}
			} else if (linha == 3 && coluna ==2) {
				celula = tab.l3c2;
				if (validaJ(celula)) {
					tab.l3c2 = this.player;
					jogada = false;
				}
			} else if (linha == 3 && coluna ==3) {
				celula = tab.l3c3;
				if (validaJ(celula)) {
					tab.l3c3 = this.player;
					jogada = false;
				}
			} else {
				System.out.println("Essa não é uma jogada válida! Tente novamente.");
			}
		}
		
		// subtrair jogada
		tab.casas_restantes = tab.casas_restantes - 1;
		// devolver o tabuleiro alterado
		return tab;
			
	}
}
