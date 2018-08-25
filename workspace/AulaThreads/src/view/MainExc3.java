/*
 * 		Fazer uma aplicação de uma corrida de sapos, com 5
	Threads, cada Thread controlando 1 sapo. Deve haver um
	tamanho máximo para cada pulo do sapo (em metros) e a
	distância máxima para que os sapos percorram. A cada salto,
	um sapo pode dar uma salto de 0 até o tamanho máximo do
	salto (valor aleatório). Após dar um salto, a Thread, para cada
	sapo, deve mostrar no console, qual foi o tamanho do salto e
	quanto o sapo percorreu. Assim que o sapo percorrer a
	distância máxima, a Thread deve apresentar que o sapo
	chegou e qual sua colocação.
 * */
package view;

import controller.ThreadSapo;
import controller.VetorPosCorridaSapo;

public class MainExc3 {

	static VetorPosCorridaSapo posicoes;
	
	public static void main(String[] args) {
		int numSapos = 5;
		int puloMax = 10;
		int distMax = 100;
		boolean corrida = true;
		ThreadSapo[] sapos = new ThreadSapo[numSapos];
		posicoes = new VetorPosCorridaSapo(sapos.length);
		int cont = 1;
		for(int i=0; i<sapos.length; i++) {
			ThreadSapo sapo = new ThreadSapo(puloMax, distMax, cont);
			sapo.start();
			sapos[i] = sapo;
			cont++;
		}
		while(corrida) {
			checaSapos(sapos);
			if(checaTerminoCorrida(sapos)) {
				posicoes.imprimirPosicoes();
				corrida = false;
			}
		}
	}
	
	public static void checaSapos(ThreadSapo[] sapos) {
		for(int i=0; i<sapos.length; i++) {
			if(sapos[i].isAlive() == false && posicoes.checaDupPosicoes(sapos[i].getNumSapo()) == false) {
				posicoes.inserir(sapos[i].getNumSapo());
			}
		}
	}
	
	public static boolean checaTerminoCorrida(Thread[] sapos) {
		boolean acabou = false;
		int cont = 0;
		for(int i=0; i<sapos.length; i++) {
			if(sapos[i].isAlive() == false) {
				cont++;
			}
		}
		if(cont == sapos.length) {
			
			acabou = true;
		}
		return acabou;
	}
}
