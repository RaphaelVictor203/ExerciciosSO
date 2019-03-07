package view;

import controller.Robo;

public class PrincipalRobo {

	public static void main(String[] args) {
		Robo robo = new Robo();
		//robo.search();
		//robo.createFolder();
		
		robo.openExec();
		robo.timeWait(1000);
		robo.writeWord("notepad");
		robo.enter();
		robo.timeWait(2000);
		robo.writeWord("Welcome to my git repositories");

	}

}
