package java_gui_1;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// TODO create graphical interface
		JFrame jf = new JFrame("Hello World"); 
		jf.setSize(300,200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		jf.setContentPane(new Simple4());
		
		jf.setVisible(true);

	}

}
