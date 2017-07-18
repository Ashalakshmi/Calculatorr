package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	private JButton btn9;
	private JButton btnplus;
	
	double firstnumber;
	double secondnumber;
	double result;
	String operation;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 320, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(12, 13, 280, 31);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//Row1
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(12, 57, 61, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(85, 57, 61, 50);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(158, 57, 61, 50);
		frame.getContentPane().add(btn9);
		
		btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnplus.setBounds(231, 57, 61, 50);
		frame.getContentPane().add(btnplus);
		
		//Row2
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(12, 120, 61, 50);
		frame.getContentPane().add(btn4);
			
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(85, 120, 61, 50);
		frame.getContentPane().add(btn5);
				
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(158, 120, 61, 50);
		frame.getContentPane().add(btn6);
				
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnsub.setBounds(231, 120, 61, 50);
		frame.getContentPane().add(btnsub);
		
		//Row3
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(12, 182, 61, 50);
		frame.getContentPane().add(btn1);
					
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(85, 182, 61, 50);
		frame.getContentPane().add(btn2);
						
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(158, 182, 61, 50);
		frame.getContentPane().add(btn3);
						
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnmul.setBounds(233, 182, 61, 50);
		frame.getContentPane().add(btnmul);
		
		//Row4	
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(12, 244, 61, 50);
		frame.getContentPane().add(btn0);
					
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDot.setBounds(85, 244, 61, 50);
		frame.getContentPane().add(btnDot);
						
		JButton btnPM = new JButton("+-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=ops*(-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPM.setBounds(158, 245, 63, 50);
		frame.getContentPane().add(btnPM);
						
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDiv.setBounds(233, 244, 61, 50);
		frame.getContentPane().add(btnDiv);
		
		//Row5
		JButton btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bs=null;
				if(txtDisplay.getText().length()>0)
				{
					StringBuilder strb=new StringBuilder(txtDisplay.getText());
					strb.deleteCharAt(txtDisplay.getText().length()-1);
					bs=strb.toString();
					txtDisplay.setText(bs);											
				}
					
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDel.setBounds(12, 307, 61, 50);
		frame.getContentPane().add(btnDel);
							
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(85, 307, 61, 50);
		frame.getContentPane().add(btnClear);
							
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="%";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMod.setBounds(158, 307, 61, 50);
		frame.getContentPane().add(btnMod);
						
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnumber=Double.parseDouble(txtDisplay.getText());
				if(operation=="+")
				{
				  result=firstnumber+secondnumber;
				  answer=String.format("%.2f",result);
				  txtDisplay.setText(answer);
				}
				else if(operation=="-")
				{
					result=firstnumber-secondnumber;
				    answer=String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operation=="*")
				{
					result=firstnumber*secondnumber;
				    answer=String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operation=="/")
				{
					result=firstnumber/secondnumber;
				    answer=String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operation=="%")
				{
					result=firstnumber%secondnumber;
				    answer=String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEqual.setBounds(231, 307, 61, 50);
		frame.getContentPane().add(btnEqual);
	}
		
	}