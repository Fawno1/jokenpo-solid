package com.jokenpo;

public class ValidaJogada {
	
	public int jogada1;
	public int jogada2;

	
		public boolean validaJogada (int jogada1, int jogada2) {
			
			if(jogada1 != 0 && jogada1 != 1 && jogada1 !=2) {
				
				return false;
				
				
			}
			
			if(jogada2 != 0 && jogada2 !=1 && jogada2 !=2) {
				
				return false;
				
				
			}
			
			return true;
			
		}
}
