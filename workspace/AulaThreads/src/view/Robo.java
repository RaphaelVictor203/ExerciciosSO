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
			
			robozin.mouseMove((d.width - 15), 10);
			
			robozin.mousePress(InputEvent.BUTTON1_MASK);
			robozin.mouseRelease(InputEvent.BUTTON1_MASK);
			
			robozin.keyPress(KeyEvent.VK_ENTER);
			robozin.keyRelease(KeyEvent.VK_ENTER);
			
			JOptionPane.showMessageDialog(null, "TROLEEEEEEEEEEI :)", "TROLADO!!!", JOptionPane.WARNING_MESSAGE);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
