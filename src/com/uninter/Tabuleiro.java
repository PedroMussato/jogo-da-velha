package com.uninter;

public class Tabuleiro {
	//1 - X - Jogador humano
	//-1 - O - Computador
	//0 - Espaço vazio
	
	public char l1c1;
	public char l1c2;
    public char l1c3;
    public char l2c1;
    public char l2c2;
    public char l2c3;
    public char l3c1;
    public char l3c2;
    public char l3c3;
	public int casas_restantes = 9;
	
	Tabuleiro() {
		l1c1 = '_';
		l1c2 = '_';
		l1c3 = '_';
		l2c1 = '_';
		l2c2 = '_';
		l2c3 = '_';
		l3c1 = '_';
		l3c2 = '_';
		l3c3 = '_';
	}
	
	public int situacao() {
		//criar logica de verificar quem venceu ou se empatou ou se o jogo continua
		
		int estado = 0;
		// verificar se ainda hão casas para jogar
		if (casas_restantes == 0) {
        	estado = 3;
        }
		
        // VERIFICAR SE O HUMANO GANHOU
		// HORIZONTAIS
        if (l1c1 == 'X' && l1c2 == 'X' && l1c3 == 'X') {
            estado = 1; // vitória do jogador humano
        } else if (l2c1 == 'X' && l2c2 == 'X' && l2c3 == 'X') {
            estado = 1;
        } else if (l3c1 == 'X' && l3c2 == 'X' && l3c3 == 'X') {
            estado = 1; // vitória do jogador humano
        
        // VERTICAIS
        } else if (l1c1 == 'X' && l2c1 == 'X' && l3c1 == 'X') {
            estado = 1; // vitória do jogador humano
        } else if (l1c2 == 'X' && l2c2 == 'X' && l3c2 == 'X') {
            estado = 1; // vitória do jogador humano
        } else if (l1c3 == 'X' && l2c3 == 'X' && l3c3 == 'X') {
            estado = 1; // vitória do jogador humano
            
        // TRANSVERSAIS
        } else if (l1c1 == 'X' && l2c2 == 'X' && l3c3 == 'X') {
            estado = 1; // vitória do jogador humano
        } else if (l3c1 == 'X' && l2c2 == 'X' && l1c3 == 'X') {
            estado = 1; // vitória do jogador humano
        
        // VERIFICAR SE O COMPUTADOR GANHOU
        // HORIZONTAIS
        } else if (l1c1 == 'O' && l1c2 == 'O' && l1c2 == 'O') {
            estado = 2; // vitória do computador
        } else if (l2c1 == 'O' && l2c2 == 'O' && l2c3 == 'O') {
            estado = 2;
        } else if (l3c1 == 'O' && l3c2 == 'O' && l3c3 == 'O') {
            estado = 2; // vitória do computador
        
        // VERTICAIS
        } else if (l1c1 == 'O' && l2c1 == 'O' && l3c1 == 'O') {
            estado = 2; // vitória do computador
        } else if (l1c2 == 'O' && l2c2 == 'O' && l3c2 == 'O') {
            estado = 2; // vitória do computador
        } else if (l1c3 == 'O' && l2c3 == 'O' && l3c3 == 'O') {
            estado = 2; // vitória do computador
            
        // TRANSVERSAIS
        } else if (l1c1 == 'O' && l2c2 == 'O' && l3c3 == 'O') {
            estado = 2; // vitória do computador
        } else if (l3c1 == 'O' && l2c2 == 'O' && l1c3 == 'O') {
            estado = 2; // vitória do computador
        }
        
		return estado;
	}
	
	public void visualizar() {
		System.out.println("~|1|2|3");
		System.out.println("1|" + l1c1 + "|" + l1c2 + "|" + l1c3);
		System.out.println("2|" + l2c1 + "|" + l2c2 + "|" + l2c3);
		System.out.println("3|" + l3c1 + "|" + l3c2 + "|" + l3c3);	
	}
}
