import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
	
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[20]; 
	JButton addButton, subButton, mulButton, divButton, negButton, proButton;
	JButton decButton, equButton, clrButton, squButton, wurButton, facButton, ansButton;
	JButton squyButton, modButton, sinButton, cosButton, tanButton, eButton, piButton;
	JPanel panel;
	
	
	
	double num1= 0, num2=0,result=0,ans = 0,num3=1;
	char operator;
	int deci = 0;
	
	Calculator(){
		
		
		frame = new JFrame("Calculator");
		frame.setSize(500,650);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textfield = new JTextField();
		textfield.setBounds(50, 25, 400, 50);
		
		textfield.setEditable(false);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("x");
		divButton = new JButton("/");
		negButton = new JButton("+/-");
		decButton = new JButton(",");
		equButton = new JButton("=");
		clrButton = new JButton("C");
		squButton = new JButton("x²");
		wurButton = new JButton("√x");
		proButton = new JButton("%");
		facButton = new JButton("x!");
		squyButton = new JButton("x^y");
		modButton = new JButton("mod");
		sinButton = new JButton("sin");
		cosButton = new JButton("cos");
		tanButton = new JButton("tan");
		eButton = new JButton("e");
		piButton = new JButton("pi");
		ansButton = new JButton("ans");
		
		functionButtons[0]= addButton;
		functionButtons[1]= subButton;
		functionButtons[2]= mulButton;
		functionButtons[3]= divButton;
		functionButtons[4]= decButton;
		functionButtons[5]= equButton;
		functionButtons[6]= proButton;
		functionButtons[7]= clrButton;
		functionButtons[8]= negButton;
		functionButtons[9]= squButton;
		functionButtons[10]= wurButton;
		functionButtons[11]= facButton;
		functionButtons[12]= squyButton;
		functionButtons[13]= modButton;
		functionButtons[14]= sinButton;
		functionButtons[15]= cosButton;
		functionButtons[16]= tanButton;
		functionButtons[17]= eButton;
		functionButtons[18]= piButton;
		functionButtons[19]= ansButton;
		
		
		
		
		for(int i =0;i<20;i++) {
			functionButtons[i].addActionListener(this);
			
			
			
		}
		for(int i =0;i<10;i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			
		}
		
		
		
		panel = new JPanel();
		panel.setBounds(50, 150, 400, 400);
		panel.setLayout(new GridLayout(5,5,10,10));
		
		
		
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(clrButton);
		panel.add(proButton);
		panel.add(negButton);
		panel.add(addButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(addButton);
		panel.add(subButton);
		panel.add(facButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(divButton);
		panel.add(squButton);
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(wurButton);
		panel.add(modButton);
		panel.add(squyButton);
		panel.add(sinButton);
		panel.add(cosButton);
		panel.add(tanButton);
		panel.add(eButton);
		panel.add(piButton);
		panel.add(ansButton);
		
		
		frame.add(panel);
		frame.add(textfield);
		
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i=0; i<10;i++) {
			if(e.getSource() == numberButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
				
			}
		}
		
		if(e.getSource()==decButton && deci == 0) {
			textfield.setText(textfield.getText().concat("."));
			deci+=1;
				 
		}
		if(e.getSource()==addButton) {
			num1 =Double.parseDouble(textfield.getText());
			 operator = '+';
			 textfield.setText("");
			 deci = 0;
		}
		if(e.getSource()==subButton) {
			num1 =Double.parseDouble(textfield.getText());
			 operator = '-';
			 textfield.setText("");
			 deci = 0;
		}
		if(e.getSource()==mulButton) {
			num1 =Double.parseDouble(textfield.getText());
			 operator = 'x';
			 textfield.setText("");
			 deci = 0;
		}
		if(e.getSource()==divButton) {
			num1 =Double.parseDouble(textfield.getText());
			 operator = '/';
			 textfield.setText("");
			 deci = 0;
		}
		
		if(e.getSource()==squyButton) {
			num1 =Double.parseDouble(textfield.getText());
			 operator = 's';
			 textfield.setText("");
			 deci = 0;
		}
		if(e.getSource()==modButton) {
			num1 =Double.parseDouble(textfield.getText());
			 operator = 'm';
			 textfield.setText("");
			 deci = 0;
		}
		
		if(e.getSource()== equButton) {
			num2=Double.parseDouble(textfield.getText());
			switch(operator){
			case'+':
				result= num1+num2;
				break; 
			case'-':
				result= num1-num2;
				break;
			case'x':
				result= num1*num2;
				break;
			case's':
				result = Math.pow(num1,num2);
				break;
			case'm':
				result = num1 % num2;
				break;
			case'/':
				result= num1/num2;
				 
			}
			
			textfield.setText(String.valueOf(result));
			num1=result;
			ans = result;
			
			
		}
		
		if(e.getSource()==clrButton) {
			 textfield.setText("");
			 textfield.setText(String.valueOf(""));
			 deci = 0;
		}
		
		
		if(e.getSource()==negButton) {
			 double temp = Double.parseDouble(textfield.getText());
			 temp = temp*-1;
			 textfield.setText(String.valueOf(temp));
			 
			 
		}
		if(e.getSource()==squButton) {
			 double temp = Double.parseDouble(textfield.getText());
			 temp = temp*temp;
			 textfield.setText(String.valueOf(temp));
			 
		}
		if(e.getSource()==wurButton) {
			 double temp = Double.parseDouble(textfield.getText());
			 temp = Math.sqrt(temp);
			 textfield.setText(String.valueOf(temp));
			 
		}
		if(e.getSource()==proButton) {
			 double temp = Double.parseDouble(textfield.getText());
			 temp = temp /100;
			 textfield.setText(String.valueOf(temp));
			 deci = 1;
			 
		}
		if(e.getSource()==sinButton) {
			 double temp = Double.parseDouble(textfield.getText());
			 temp =  Math.sin(temp);
			 textfield.setText(String.valueOf(temp));
			 deci = 1;
		}
		if(e.getSource()==cosButton) {
			 double temp = Double.parseDouble(textfield.getText());
			 temp =  Math.cos(temp);
			 textfield.setText(String.valueOf(temp));
			 deci = 1;
			 
		}
		if(e.getSource()==tanButton) {
			 double temp = Double.parseDouble(textfield.getText());
			 temp =   Math.tan(temp);
			 textfield.setText(String.valueOf(temp));
			 deci = 1;
			 
		}
		if(e.getSource()==facButton) {
			double temp = Double.parseDouble(textfield.getText());
		 	if(temp==1) {
		 		num3 = 1;
		 	}
		 	if(temp>0) {
		 		for(int i =1; i<= temp;i++){
		 			num3 = num3 *i;
		 		}
		 		
		 	}
		 	
		 	
		 	textfield.setText(String.valueOf(num3));
		 	num3 = 1;
		}
		if(e.getSource()==piButton) {
			 double temp = Math.PI;
			 textfield.setText(String.valueOf(temp));
			 deci = 1;
			 
		}
		if(e.getSource()==eButton) {
			 double temp = Math.E;
			 textfield.setText(String.valueOf(temp));
			 deci = 1;
			 
		}if(e.getSource()==ansButton) {
			 textfield.setText(String.valueOf(ans));
			 deci = 1;
			 
		}
		
		
	}
	

}