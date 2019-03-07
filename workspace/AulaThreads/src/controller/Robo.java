package controller;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.KeyStroke;


public class Robo {
	
	static Toolkit tk = Toolkit.getDefaultToolkit();
	static Dimension d = tk.getScreenSize();
	private Robot robo;
	
	public Robo() {
		try {
			robo = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void search() {		
		String search = JOptionPane.showInputDialog(null, "Oque você deseja pesquisar no google ?", "SEARCH", JOptionPane.QUESTION_MESSAGE);
		String browser = JOptionPane.showInputDialog(null, "Insira o nome do navegador que será utilizado \nOBS.: O mesmo deve estar instalado no seu desktop");
		JOptionPane.showMessageDialog(null, "Por favor, até o termino da procura, não aperte nenhum botão ou utilize o mouse.", "AVISO", JOptionPane.WARNING_MESSAGE);
		
		//robozin.mouseMove(60, d.height - 10);
		
		this.robo.delay(100);
		this.robo.setAutoDelay(100);
		
		//robozin.mousePress(InputEvent.BUTTON1_MASK);
		//robozin.mouseRelease(InputEvent.BUTTON1_MASK);
		
		timeWait(4000);
		
		openExec();
		
		writeWord("CMD");
		
		enter();
		
		timeWait(2000);
		
		writeWord("START " + browser + " WWW.GOOGLE.COM");
		
		timeWait(2000);
		
		enter();
		
		timeWait(5000);
		
		writeWord(search);
		
		enter();
		
		JOptionPane.showMessageDialog(null, "Procura realizada com sucesso", "PRONTO", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void createFolder() {
		String path = JOptionPane.showInputDialog(null, "Insira o caminho absoluto até o local que deseja criar a pasta\nEX.: users/yourUser/desktop", "CREATE FOLDER", JOptionPane.INFORMATION_MESSAGE);
		String folderName = JOptionPane.showInputDialog(null, "Insira o nome da pasta\nOBS.: Caso o nome contenha mais de uma palavra\npor favor separalas com \"-\"", "CREATE FOLDER", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Por favor, até o termino da criação da pasta, não aperte nenhum botão ou utilize o mouse.", "AVISO", JOptionPane.WARNING_MESSAGE);
		
		this.robo.delay(100);
		this.robo.setAutoDelay(100);
		
		timeWait(4000);
		
		openExec();
		
		timeWait(2000);
		
		writeWord("CMD");
		enter();

		timeWait(2000);
		
		writeWord("CD\\");
		enter();
		
		timeWait(100);
		
		String[] dirs = path.split("/");
		for(int i=0; i<dirs.length; i++) {
			writeWord("CD " + dirs[i]);
			enter();
		}
		
		timeWait(100);
		
		writeWord("MKDIR " + folderName);
		enter();
		
		JOptionPane.showMessageDialog(null, "Pasta criada com sucesso", "CREATE FOLDER", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void writeWord(String word) {
		int[] letters = returnLetters(word.toUpperCase());
		for(int i=0; i<letters.length; i++) {
			this.robo.keyPress(letters[i]);
			this.robo.keyRelease(letters[i]);
		}
	}

	private static int[] returnLetters(String word) {
		int[] letters = new int[word.length()];
		for(int i=0; i<word.length(); i++) {
			letters[i] = (int) word.charAt(i);
		}
		return letters;
	}
	
	public void timeWait(int milissegundos) {
		try {
			Thread.sleep(milissegundos);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enter() {
		this.robo.keyPress(KeyEvent.VK_ENTER);
		this.robo.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void openExec() {
		this.robo.keyPress(KeyEvent.VK_WINDOWS);
		this.robo.keyPress(KeyEvent.VK_R);
		this.robo.keyRelease(KeyEvent.VK_WINDOWS);
		this.robo.keyRelease(KeyEvent.VK_R);
	}
}
