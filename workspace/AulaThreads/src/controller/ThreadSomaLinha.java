package controller;

public class ThreadSomaLinha extends Thread{
	
	int[] vetor;
	
	public ThreadSomaLinha(int[] vetor) {
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		somaLinhas();
	}
	
	public void somaLinhas() {
		int soma = 0;
		for(int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i < (vetor.length-1)) {
				System.out.print(" + ");
			}
			soma += vetor[i];
		}
		System.out.print(" = " + soma);
		System.out.println();
	}
}
