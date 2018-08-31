package view;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;


public class Robo {

	public static void main(String[] args) {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		try {
			Robot robozin = new Robot();
			
			//robozin.mouseMove(60, d.height - 10);
			
			robozin.delay(100);
			robozin.setAutoDelay(100);
			
			//robozin.mousePress(InputEvent.BUTTON1_MASK);
			//robozin.mouseRelease(InputEvent.BUTTON1_MASK);
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			robozin.keyPress(KeyEvent.VK_WINDOWS);
			robozin.keyPress(KeyEvent.VK_R);
			robozin.keyRelease(KeyEvent.VK_R);
			robozin.keyRelease(KeyEvent.VK_WINDOWS);
			
			//ESCREVE CMD
			robozin.keyPress(KeyEvent.VK_C);
			robozin.keyRelease(KeyEvent.VK_C);
			
			robozin.keyPress(KeyEvent.VK_M);
			robozin.keyRelease(KeyEvent.VK_M);
			
			robozin.keyPress(KeyEvent.VK_D);
			robozin.keyRelease(KeyEvent.VK_D);
			//FIM
			
			
			robozin.keyPress(KeyEvent.VK_ENTER);
			robozin.keyRelease(KeyEvent.VK_ENTER);
			
			//ESCREVE START
			robozin.keyPress(KeyEvent.VK_S);
			robozin.keyRelease(KeyEvent.VK_S);
			
			robozin.keyPress(KeyEvent.VK_T);
			robozin.keyRelease(KeyEvent.VK_T);
			
			robozin.keyPress(KeyEvent.VK_A);
			robozin.keyRelease(KeyEvent.VK_A);
			
			robozin.keyPress(KeyEvent.VK_R);
			robozin.keyRelease(KeyEvent.VK_R);
			
			robozin.keyPress(KeyEvent.VK_T);
			robozin.keyRelease(KeyEvent.VK_T);
			//FIM
			
			robozin.keyPress(KeyEvent.VK_SPACE);
			robozin.keyRelease(KeyEvent.VK_SPACE);
			
			//ESCREVE FIREFOX
			robozin.keyPress(KeyEvent.VK_F);
			robozin.keyRelease(KeyEvent.VK_F);
			
			robozin.keyPress(KeyEvent.VK_I);
			robozin.keyRelease(KeyEvent.VK_I);
			
			robozin.keyPress(KeyEvent.VK_R);
			robozin.keyRelease(KeyEvent.VK_R);
			
			robozin.keyPress(KeyEvent.VK_E);
			robozin.keyRelease(KeyEvent.VK_E);
			
			robozin.keyPress(KeyEvent.VK_F);
			robozin.keyRelease(KeyEvent.VK_F);
			
			robozin.keyPress(KeyEvent.VK_O);
			robozin.keyRelease(KeyEvent.VK_O);
			
			robozin.keyPress(KeyEvent.VK_X);
			robozin.keyRelease(KeyEvent.VK_X);
			//FIM
			
			
			robozin.keyPress(KeyEvent.VK_SPACE);
			robozin.keyRelease(KeyEvent.VK_SPACE);
			
			
			//GOOGLE.COM
			robozin.keyPress(KeyEvent.VK_G);
			robozin.keyRelease(KeyEvent.VK_G);
			
			robozin.keyPress(KeyEvent.VK_O);
			robozin.keyRelease(KeyEvent.VK_O);
			
			robozin.keyPress(KeyEvent.VK_O);
			robozin.keyRelease(KeyEvent.VK_O);
			
			robozin.keyPress(KeyEvent.VK_G);
			robozin.keyRelease(KeyEvent.VK_G);
			
			robozin.keyPress(KeyEvent.VK_L);
			robozin.keyRelease(KeyEvent.VK_L);
			
			robozin.keyPress(KeyEvent.VK_E);
			robozin.keyRelease(KeyEvent.VK_E);
			
			robozin.keyPress(KeyEvent.VK_PERIOD);
			robozin.keyRelease(KeyEvent.VK_PERIOD);
			
			robozin.keyPress(KeyEvent.VK_C);
			robozin.keyRelease(KeyEvent.VK_C);
			
			robozin.keyPress(KeyEvent.VK_O);
			robozin.keyRelease(KeyEvent.VK_O);
			
			robozin.keyPress(KeyEvent.VK_M);
			robozin.keyRelease(KeyEvent.VK_M);
			//FIM
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			robozin.keyPress(KeyEvent.VK_ENTER);
			robozin.keyRelease(KeyEvent.VK_ENTER);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//ESCREVE JAVA
			robozin.keyPress(KeyEvent.VK_R);
			robozin.keyRelease(KeyEvent.VK_R);
			
			robozin.keyPress(KeyEvent.VK_A);
			robozin.keyRelease(KeyEvent.VK_A);
			
			robozin.keyPress(KeyEvent.VK_P);
			robozin.keyRelease(KeyEvent.VK_P);
			
			robozin.keyPress(KeyEvent.VK_H);
			robozin.keyRelease(KeyEvent.VK_H);
			
			robozin.keyPress(KeyEvent.VK_A);
			robozin.keyRelease(KeyEvent.VK_A);
			
			robozin.keyPress(KeyEvent.VK_E);
			robozin.keyRelease(KeyEvent.VK_E);
			
			robozin.keyPress(KeyEvent.VK_L);
			robozin.keyRelease(KeyEvent.VK_L);
			
			robozin.keyPress(KeyEvent.VK_SPACE);
			robozin.keyRelease(KeyEvent.VK_SPACE);
			
			robozin.keyPress(KeyEvent.VK_V);
			robozin.keyRelease(KeyEvent.VK_V);
			
			robozin.keyPress(KeyEvent.VK_I);
			robozin.keyRelease(KeyEvent.VK_I);
			
			robozin.keyPress(KeyEvent.VK_C);
			robozin.keyRelease(KeyEvent.VK_C);
			
			robozin.keyPress(KeyEvent.VK_T);
			robozin.keyRelease(KeyEvent.VK_T);
			
			robozin.keyPress(KeyEvent.VK_O);
			robozin.keyRelease(KeyEvent.VK_O);
			
			robozin.keyPress(KeyEvent.VK_R);
			robozin.keyRelease(KeyEvent.VK_R);
			
			robozin.keyPress(KeyEvent.VK_ENTER);
			robozin.keyRelease(KeyEvent.VK_ENTER);
			//FIM
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
