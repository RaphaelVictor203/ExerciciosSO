package controller;

public class VetorPosCorridaSapo {
	private int[] vetPos;
	private int last = 0;
	
	public VetorPosCorridaSapo(int numMax) {
		vetPos = new int[numMax];
	}
	
	public void inserir(int sapo) {
		if(last < (vetPos.length)) {
			vetPos[last] = sapo;
			last += 1;
		}else {
			System.err.println("Não ha mais espaço");
		}
	}
	
	public void imprimirPosicoes() {
		int cont = 1;
		System.out.println("\n\nCLASSIFICAÇÃO");
		System.out.println("---------------------------------------");
		for(int i=0; i<vetPos.length; i++) {
			System.out.println(cont + "° lugar: Sapo " + vetPos[i]);
			cont++;
		}
		System.out.println("---------------------------------------");
	}
	
	public boolean checaDupPosicoes(int numSapo){
		for(int i=0; i<vetPos.length; i++) {
			if(vetPos[i] == numSapo) {
				return true;
			}
		}
		return false;
	}
	
	public void imprime() {
		for(int i=0; i<vetPos.length; i++) {
			System.out.println(vetPos[i]);
		}
	}
}
