package com.motorola.examples.arraymultidimensionais.bidimencionais;

public class VetoresTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetores vetores = new Vetores(8);
		
		vetores.adiciona("elemento 1");
		vetores.adiciona("elemento 3");
		vetores.adiciona("elemento 4");	
		
		System.out.println("Buscando valores: ");
		System.out.println(vetores.busca(1));
		
		System.out.println("Exibindo Vetor: ");
		System.out.println(vetores);
		
		vetores.adiciona(1, "elemento 2");
		
		System.out.println("Adicionando elemento no vetor: ");
		System.out.println(vetores);
	}	

}
