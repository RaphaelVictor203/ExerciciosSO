package controller;

public class ThreadSapo extends Thread{
	
	private int puloMax;
	private int distMax;
	private int posAtual = 0;
	private int numSapo;
	
	public ThreadSapo(int puloMax, int distMax, int numSapo) {
		this.puloMax = puloMax;
		this.distMax = distMax;
		this.numSapo = numSapo;
	}
	
	@Override
	public void run() {
		corre();
	}
	
	public void corre() {
		int salto;
		while(posAtual < distMax) {
			salto = (int)(Math.random()*(puloMax+1));
			posAtual += salto;
			System.out.println("O sapo " + numSapo + " pulou " + salto + " metros.");
			System.out.println("O sapo " + numSapo + " percorreu " + posAtual + " metros de " + distMax + " metros.");
			System.out.println("");
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("O sapo " + numSapo + " chegou POSATUAL: " + posAtual);
		
	}
	
	public int getNumSapo() {
		return numSapo;
	}
	
}
