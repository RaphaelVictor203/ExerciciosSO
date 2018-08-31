package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCar;

public class Park {

	public static void main(String[] args) {
		
		int permissoes = 3;
		Semaphore semaforo = new Semaphore(permissoes);
		for(int i=1; i<=10; i++){
			Thread carro = new ThreadCar(i, semaforo);
			carro.start();
		}
	}

}
