package com.uninter;

import java.util.Random;
import java.util.Scanner;

public class Computador extends Jogador {
	private int type;
	private Scanner teclado = new Scanner(System.in);

	Computador (int type) { // CONSTRUTOR
		this.type = type;
		}
	
	private boolean validaC (char celula) { // Valida se a célula é válida para o jogador O jogar, se sim retorna true, se não retorna false.
		boolean retorno;
		if (celula != '_') {
			retorno = false;
		} else {
			retorno = true;
		}
		return retorno;
	}
	
	private boolean validaJ (char celula) { // Valida se a célula é válida para o jogador X jogar, se sim retorna true, se não retorna false.
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
	
	private Tabuleiro tipo1 (Tabuleiro tab) { // tipo de jogada 1, computador responde aleatoriamente.
		boolean jogada = true;
		
		while (jogada) { // LOOP DA JOGADA
			Random gerador = new Random();
			char celula;
			int linha = gerador.nextInt(4);
			int coluna = gerador.nextInt(4);
			
			if (linha == 1 && coluna == 1) {
				celula = tab.l1c1;
				if (validaC(celula)) {
					tab.l1c1 = 'O';
					jogada = false;
				}
			} else if (linha == 1 && coluna ==2) {
				celula = tab.l1c2;
				if (validaC(celula)) {
					tab.l1c2 = 'O';
					jogada = false;
				}
			} else if (linha == 1 && coluna ==3) {
				celula = tab.l1c3;
				if (validaC(celula)) {
					tab.l1c3 = 'O';
					jogada = false;
				}
			} else if (linha == 2 && coluna ==1) {
				celula = tab.l2c1;
				if (validaC(celula)) {
					tab.l2c1 = 'O';
					jogada = false;
				}
			} else if (linha == 2 && coluna ==2) {
				celula = tab.l2c2;
				if (validaC(celula)) {
					tab.l2c2 = 'O';
					jogada = false;
				}
			} else if (linha == 2 && coluna ==3) {
				celula = tab.l2c3;
				if (validaC(celula)) {
					tab.l2c3 = 'O';
					jogada = false;
				}
			} else if (linha == 3 && coluna ==1) {
				celula = tab.l3c1;
				if (validaC(celula)) {
					tab.l3c1 = 'O';
					jogada = false;
				}
			} else if (linha == 3 && coluna ==2) {
				celula = tab.l3c2;
				if (validaC(celula)) {
					tab.l3c2 = 'O';
					jogada = false;
				}
			} else if (linha == 3 && coluna ==3) {
				celula = tab.l3c3;
				if (validaC(celula)) {
					tab.l3c3 = 'O';
					jogada = false;
				}
			}
		} // FIM DO LOOP DA JOGADA
		
		// retorna o tabuleiro com a jogada realizada.
		return tab;
	}
	
	private Tabuleiro tipo2 (Tabuleiro tab) { // Tipo de jogada 2, computador começa pelos cantos, depois de os cantos serem preenchidos inicia o modo aleatorio
		// verificar todos os cantos se estão vazios
		int cantos = 0;
		if (tab.l1c1 == '_') {
			cantos = cantos + 1;
		}
		if (tab.l1c3 == '_') {
			cantos = cantos + 1;
		}
		if (tab.l3c1 == '_') {
			cantos = cantos + 1;
		}
		if (tab.l3c3 == '_') {
			cantos = cantos + 1;
		}
		// se cantos vazios for menor que 1 jogar em um dos cantos
		if (cantos > 0) {
			if (tab.l1c1 == '_') {
				tab.l1c1 = 'O';
			} else if (tab.l1c3 == '_') {
				tab.l1c3 = 'O';
			} else if (tab.l3c1 == '_') {
				tab.l3c1 = 'O';
			} else if (tab.l3c3 == '_') {
				tab.l3c3 = 'O';
			}
		} else {
			tab = tipo1(tab);
		}
		return tab;
	}
	
    private Tabuleiro tipo3 (Tabuleiro tab) { // Tipo 3, é uma réplica da jogada do jogador X, ou seja, multiplayer, onde o O é o segundo jogador ao invéz do computador
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
                    tab.l1c1 = 'O';
                    jogada = false;
                }
            } else if (linha == 1 && coluna ==2) {
                celula = tab.l1c2;
                if (validaJ(celula)) {
                    tab.l1c2 = 'O';
                    jogada = false;
                }
            } else if (linha == 1 && coluna ==3) {
                celula = tab.l1c3;
                if (validaJ(celula)) {
                    tab.l1c3 = 'O';
                    jogada = false;
                }
            } else if (linha == 2 && coluna ==1) {
                celula = tab.l2c1;
                if (validaJ(celula)) {
                    tab.l2c1 = 'O';
                    jogada = false;
                }
            } else if (linha == 2 && coluna ==2) {
                celula = tab.l2c2;
                if (validaJ(celula)) {
                    tab.l2c2 = 'O';
                    jogada = false;
                }
            } else if (linha == 2 && coluna ==3) {
                celula = tab.l2c3;
                if (validaJ(celula)) {
                    tab.l2c3 = 'O';
                    jogada = false;
                }
            } else if (linha == 3 && coluna ==1) {
                celula = tab.l3c1;
                if (validaJ(celula)) {
                    tab.l3c1 = 'O';
                    jogada = false;
                }
            } else if (linha == 3 && coluna ==2) {
                celula = tab.l3c2;
                if (validaJ(celula)) {
                    tab.l3c2 = 'O';
                    jogada = false;
                }
            } else if (linha == 3 && coluna ==3) {
                celula = tab.l3c3;
                if (validaJ(celula)) {
                    tab.l3c3 = 'O';
                    jogada = false;
                }
            } else {
                System.out.println("Essa não é uma jogada válida! Tente novamente.");
            }
        }
        // devolver o tabuleiro alterado
        return tab;
    }
	
	public Tabuleiro jogar (Tabuleiro tab) {
		System.out.println("Jogador O");
		// primeiro tipo de jogo
		if (this.type == 1) {
			tab = tipo1(tab);
		// segundo tipo de jogo
		} else if (this.type == 2) {
			//
			// configurar segundo modo de jogo
			//
			tab = tipo2(tab);
		} else if (this.type == 3) {
			//
			// configurar terceiro modo de jogo
			//
			tab = tipo3(tab);
		}
		// subtrair jogada
		tab.casas_restantes = tab.casas_restantes - 1;
		// retornar tabuleiro
		return tab;
	}
}
