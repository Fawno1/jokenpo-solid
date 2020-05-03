package com.jokenpo;

public class GetNomeDaJogada {
	
	public String getNomeDaJogada(int jogada) {
		
		String nomeJogada = "A jogada é inválida.";
		
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
