package com.jokenpo;

public class ResultadoDoJogo {
	
	public String analisaJogo(String nomeJogada1, String nomeJogada2) {
		
		String resultado = "Resultado invalido!";
		
		if (nomeJogada1 == nomeJogada2) {
			resultado = "Empate";
		} else if (nomeJogada1 == "PEDRA" && nomeJogada2 == "PAPEL") {
			resultado = "Papel venceu!";
		} else if (nomeJogada1 == "PEDRA" && nomeJogada2 == "TESOURA") {
			resultado = "Pedra venceu!";
		} else if (nomeJogada1 == "PAPEL" && nomeJogada2 == "PEDRA") {
			resultado = "Papel venceu!";
		} else if (nomeJogada1 == "PAPEL" && nomeJogada2 == "TESOURA") {
			resultado = "Tesoura venceu!";
		} else if (nomeJogada1 == "TESOURA" && nomeJogada2 == "PEDRA") {
			resultado = "Pedra venceu!";
		} else if (nomeJogada1 == "TESOURA" && nomeJogada2 == "PAPEL") {
			resultado = "Tesoura venceu!";
		}

        return resultado;

	}
		
	}
