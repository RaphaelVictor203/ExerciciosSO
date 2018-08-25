/*
 *	Fazer uma aplicação que rode 5 Threads que
	cada uma delas imprima no console o seu
	número. 
 */
package view;

import controller.NumThread;

public class MainExc1 {

	public static void main(String[] args) {
		Thread numThread;
		for(int i=0; i<5; i++) {
			numThread = new NumThread((int)(Math.random()*51));
			numThread.start();
			try {
				numThread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
