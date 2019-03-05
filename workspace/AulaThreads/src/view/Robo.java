package view;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.KeyStroke;


public class Robo {

	public static void main(String[] args) {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		try {
			Robot robo = new Robot();
			char[] letters;
			String search = JOptionPane.showInputDialog(null, "Oque você deseja pesquisar no google ?", "SEARCH", JOptionPane.QUESTION_MESSAGE);
			
			//robozin.mouseMove(60, d.height - 10);
			
			robo.delay(100);
			robo.setAutoDelay(100);
			
			//robozin.mousePress(InputEvent.BUTTON1_MASK);
			//robozin.mouseRelease(InputEvent.BUTTON1_MASK);
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			robo.keyPress(KeyEvent.VK_WINDOWS);
			robo.keyPress(KeyEvent.VK_R);
			robo.keyRelease(KeyEvent.VK_R);
			robo.keyRelease(KeyEvent.VK_WINDOWS);
			
			writeWord(robo, "CMD");
			
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			
			writeWord(robo, "START FIREFOX WWW.GOOGLE.COM");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			writeWord(robo, search.toUpperCase());
			
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void writeWord(Robot robo, String word) {
		int[] letters = retornLetters(word);
		for(int i=0; i<letters.length; i++) {
			robo.keyPress(letters[i]);
			robo.keyRelease(letters[i]);
		}
	}

	private static int[] retornLetters(String word) {
		int[] letters = new int[word.length()];
		for(int i=0; i<word.length(); i++) {
			letters[i] = (int) word.charAt(i);
		}
		return letters;
	}
}
