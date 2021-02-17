package java_gui_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;

public class Simple4 extends JPanel {
	
	public Integer resultatCalcule=0;
	private String texte;
	private boolean initState = true;
	public int savedValue = 0;
	public char command ;
	
//	TODO Change to JtextPan
	public JTextField result = new JTextField();
	
	// TODO use HTML template
	public String template = 
			"<html>" +
	"<head> </head>" +
					"<body> <p style=\"text-align:right\"> %s </p> </body>"+
	"</html>";
	
	Simple4(){
		
    setLayout(new BorderLayout());
		
	JLabel label = new JLabel("new label");
	label.setForeground(Color.green);
	label.setFont(new Font("Arial", Font.PLAIN, 32));
	JLabel label2 = new JLabel("new label 2");
	label2.setForeground(Color.green);
	label2.setFont(new Font("Arial", Font.PLAIN, 32));
	JLabel label3 = new JLabel("new label 3");
	label3.setForeground(Color.green);
	label3.setFont(new Font("Arial", Font.PLAIN, 32));

	this.setBackground(Color.red);
    
    
    
    
    JPanel label_Result = new JPanel();
    JButton button = new JButton();
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    
    
    result.setText(this.resultatCalcule.toString());
    this.add(result, BorderLayout.NORTH);
    
    ////////// Grid
    JPanel label_Grid = new JPanel();
    
    label_Grid.setLayout(new GridLayout(3,3));
    
    
    ButtonGroup JButton1 = new ButtonGroup();    
    for(int i=0; i<9; i++)
    {
    	Integer value = i+1;
    	button = new JButton(value.toString());
    	button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
//				System.out.println(event);
				actionPerformedButKeyDetect(event);
				
			}
    	
    	});
    	JButton1.add(button);
    	label_Grid.add(button);
    }
    
    
    
    b1.setText(",");
    b1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
//			System.out.println(event);
			actionBut1Performed(event);
			
		}
	
	});
	label_Grid.add(b1);
	
	// Jbut3
    b2.setText("C");
    b2.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
//			System.out.println(event);
			actionBut2Performed(event);
			
		}
	
	});
	label_Grid.add(b2);
	
	// Jbut4
    b4.setText("=");
    b4.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
//			System.out.println(event);
			actionBut4Performed(event);
			
		}
	
	});
	label_Grid.add(b4);
	
	// Jbut2
    b3.setText("+");
    b3.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
//			System.out.println(event);
			actionBut3Performed(event);
			
		}
	
	});
	label_Grid.add(b3);
	
	
	
	
	
	
	
	
	
	
	
    
    
    this.add(label_Grid, BorderLayout.CENTER);
    
    
    JPanel Panel_Config = new JPanel();
    
    Panel_Config.setLayout(new GridLayout(4,1));
    
    JCheckBox box = new JCheckBox("Decimal");
    JCheckBox box_1 = new JCheckBox("Binaire");
    JCheckBox box_2 = new JCheckBox("Octale");
    JCheckBox box_3 =  new JCheckBox("Hex");
    
    Panel_Config.add(box);
    Panel_Config.add(box_1);
    Panel_Config.add(box_2);
    Panel_Config.add(box_3);
    
    
    this.add(Panel_Config, BorderLayout.EAST);
  
	}
	
	
	public void actionPerformedBut3(ActionEvent event) {
		
//		String eventValue = event.getActionCommand();
		result.setText("1");
		
	}
	
	
   public void actionPerformedButKeyDetect(ActionEvent event) {
		
		String eventValue = event.getActionCommand();
		
//		System.out.print(event.getActionCommand());
		addCalc(event);
		
		
		
	}

   
   
   
   private void actionBut4Performed(ActionEvent event) {
		// TODO Auto-generated method stub
	   		System.out.print(getText());
	   		funCalc(event.getActionCommand());
		
	   	}
   
   
   private void actionBut3Performed(ActionEvent event) {
		// TODO Auto-generated method stub
	   		System.out.print(getText());
	   		funCalc(event.getActionCommand());
		
	   	}
   
   
   private void actionBut2Performed(ActionEvent event) {
		// TODO Auto-generated method stub
	   		System.out.print(getText());
	   		addTedectedKey(event);
		
	   	}
   
   private void actionBut1Performed(ActionEvent event) {
		// TODO Auto-generated method stub
	   		System.out.print(getText());
	   		addTedectedKey(event);
		
	   	}
   
   private void initCalc() {
		// TODO Auto-generated method stub
	   		System.out.print(getText());
	   		setText("0");
	   		initState =true;
		
	   	}

   	private void addCalc(ActionEvent event) {
	// TODO Auto-generated method stub
   		System.out.print(getText());
   		setText(result.getText() + event.getActionCommand());
	
   	}
   	
   	
   	private void funCalc(String func) {
   		// TODO Auto-generated method stub
   		
   	   	
   		if(func.equals("+")) {
   			String lastText = getText();
   			savedValue = Integer.valueOf(lastText);
   			command = '+';
   			initCalc();
   			
   		}else if(func.equals("=")) {
   			String newValue = getText();
   			int calcule = calculeResult(newValue);
   			setText(String.valueOf(calcule));
   			
   		}
   		
   	}
   	
   	
   	

   	private int calculeResult(String newValue) {
		// TODO Auto-generated method stub
   		int result = 0;
   		switch(command) {
   		
   		case '+':
   			result = savedValue + Integer.valueOf(newValue);
   		
   		}
		return result;
	}


	private void addTedectedKey(ActionEvent event) {
		// TODO Auto-generated method stub
   		if(event.getActionCommand().charAt(0)>='0' 
				&& event.getActionCommand().charAt(0)<='9') {
			
		   
			addCalc(event);
		}else if(event.getActionCommand().charAt(0)==',') {
			if(initState || !getText().contains(",")) {
				addCalc(event);
			}
			
		   
			
		}
	}
   	

	private String getText() {
		// TODO Auto-generated method stub
		return texte;
	}
	
	private void setText(String texte) {
		// TODO Auto-generated method stub
		initState =false;
		this.texte = texte;
		// TODO use HTML template
//		result.setText(String.format(template,texte));
		result.setText(texte);
	}
	
	
	

}
