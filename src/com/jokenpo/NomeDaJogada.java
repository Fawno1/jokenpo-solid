package com.jokenpo;

public class NomeDaJogada {
	
	public String nomeDaJogada(int jogada) {
		
		String nomeJogada = "A jogada � inv�lida.";
		
		if(jogada == 0) {
			
			nomeJogada = "PEDRA";
			
		} else if(jogada == 1) {
			
			nomeJogada = "PAPEL";
			
		} else if(jogada == 2) {
			
			nomeJogada = "TESOURA";
		}
		
		return nomeJogada;
		
	}

}
