package view;

import controller.Robo;

public class PrincipalRobo {

	public static void main(String[] args) {
		Robo robo = new Robo();
		//robo.search();
		//robo.createFolder();
		
		//FUNNY PRESENTATION
		robo.openExec();
		robo.timeWait(1000);
		robo.writeWord("notepad");
		robo.enter();
		robo.timeWait(2000);
		robo.writeWord("Welcome to my git repositories");
		robo.timeWait(2000);
		robo.enter();
		robo.writeWord("My name is Raphael and here you will find");
		robo.enter();
		robo.writeWord("some scripts that i made.");
		robo.timeWait(1000);
		robo.enter();
		robo.writeWord("so");
		robo.timeWait(1000);
		robo.writeWord(".");
		robo.timeWait(1000);
		robo.writeWord(".");
		robo.timeWait(1000);
		robo.writeWord(".");
		robo.enter();
		robo.writeWord("Enjoy yourself");
		//END PRESENTATION
	}

}
