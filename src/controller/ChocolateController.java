package controller;

import br.edu.fateczl.Lista;
public class ChocolateController {
	
	Lista<Integer>[] tabelaHashChocolates;
	String[] doces = {"brigadeiros", "bolos", "bombons", "pavês", "ovos de páscoa"};
	
	@SuppressWarnings("unchecked")
	public ChocolateController() {
		this.tabelaHashChocolates = new Lista[5];
		inicializarTabelaHash();
	}
	
	private void inicializarTabelaHash() {
		for(int i = 0, length = tabelaHashChocolates.length; i < length; i++) {
			tabelaHashChocolates[i] = new Lista<>();
		}
		
	}

	public int hashCode(int peso) {
		if(peso >= 280) {
			return 4;
		}
		return (peso/10)%4;
	}

	public void add(int vol) throws Exception {
		int hash = hashCode(vol);
		tabelaHashChocolates[hash].addLast(vol);
	}

	public void calcular() {
		
		for(int i = 0, length = tabelaHashChocolates.length; i < length; i++) {
			System.out.println("É possível fazer " + tabelaHashChocolates[i].size() + " " + doces[i]);
		}
		
	}



	
	

}
