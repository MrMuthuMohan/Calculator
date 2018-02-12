package calc;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {
	
	JTextField inputTextfield;
	
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btn0;
	JButton btnDot;
	JButton btnClear;
	JButton btnPlus;
	JButton btnCaret;
	JButton btnSin;
	JButton btnMinus;
	JButton btnSqrRoot;
	JButton btnCos;
	JButton btnForwardSlash;
	JButton btne;
	JButton btnTan;
	JButton btnAsterisk;
	JButton btnPi;
	JButton btnNaturalLog;
	JButton btnAnswer;
	JButton btnEnter;
	
	JButton loadButton;
	JScrollPane scrollPane;
	
	JComboBox colorComboBox;
	
	JButton addButton;
	JButton delButton;
	
	JTextArea equationBox;

	private JFrame frame;
	
	private JTextField outputTextfield;
	
	private ArrayList<String> eqList = new ArrayList();

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
		frame.setBounds(100, 100, 424, 629);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel inputPanel = new JPanel();
		frame.getContentPane().add(inputPanel, BorderLayout.NORTH);
		
		JPanel mainCalc = new JPanel();
		frame.getContentPane().add(mainCalc, BorderLayout.CENTER);
		
		// Create and add components for input panel
		JLabel lblYfx = new JLabel("y=f(x):");
		inputTextfield = new JTextField();
		inputTextfield.setColumns(25);
		inputPanel.add(lblYfx);
		inputPanel.add(inputTextfield);
		mainCalc.setLayout(null);
		
		// Create components for main calc
		JLabel colorSelectLabel = new JLabel("Select Color:-");
		colorSelectLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		colorSelectLabel.setBounds(96, 9, 96, 15);
		mainCalc.add(colorSelectLabel);
		
		ButtonHandler buttonHandler = new ButtonHandler();
		
		colorComboBox = new JComboBox();
		colorComboBox.setBounds(202, 7, 102, 20);
		colorComboBox.setModel(new DefaultComboBoxModel(new String[] {"BLACK", "BLUE", "RED", "GREEN"}));
		mainCalc.add(colorComboBox);
				
		delButton = new JButton("DEL");
		delButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		delButton.addActionListener(buttonHandler);
		delButton.setBounds(119, 38, 73, 32);
		mainCalc.add(delButton);
		
		addButton = new JButton("ADD");
		addButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addButton.setBounds(202, 38, 73, 32);
		addButton.addActionListener(buttonHandler);
		mainCalc.add(addButton);
		
		loadButton = new JButton("LOAD");
		loadButton.setBounds(140, 245, 123, 27);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 97, 361, 150);
		mainCalc.add(scrollPane);
		equationBox = new JTextArea();
		scrollPane.setViewportView(equationBox);
		HistoryHandler historyHandler = new HistoryHandler(equationBox, loadButton);
		loadButton.addActionListener(historyHandler);
		equationBox.addMouseListener(historyHandler);
		// equationBox.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		equationBox.setBounds(23, 104, 362, 143);
		mainCalc.add(scrollPane);
		mainCalc.add(loadButton);
	
		
		
		JLabel lblHistory = new JLabel("History:-");
		lblHistory.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHistory.setBounds(24, 73, 73, 20);
		mainCalc.add(lblHistory);
		
		JPanel buttonArray = new JPanel();
		buttonArray.setBounds(23, 339, 362, 138);
		buttonArray.setLayout(new GridLayout(4, 6, 10, 10));
		mainCalc.add(buttonArray);
		
		btn9 = new JButton("9");
		btn9.addActionListener(buttonHandler);
		buttonArray.add(btn9);
		
		btn8 = new JButton("8");
		btn8.addActionListener(buttonHandler);
		buttonArray.add(btn8);
		
		btn7 = new JButton("7");
		btn7.addActionListener(buttonHandler);
		buttonArray.add(btn7);
		
		btn5 = new JButton("5");
		btn5.addActionListener(buttonHandler);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(buttonHandler);
		buttonArray.add(btnPlus);
		
		btnCaret = new JButton("^");
		btnCaret.addActionListener(buttonHandler);
		buttonArray.add(btnCaret);
		
		btnSin = new JButton("sin");
		btnSin.addActionListener(buttonHandler);
		buttonArray.add(btnSin);
		
		btn6 = new JButton("6");
		btn6.addActionListener(buttonHandler);
		buttonArray.add(btn6);
		buttonArray.add(btn5);
		
		btn4 = new JButton("4");
		btn4.addActionListener(buttonHandler);
		buttonArray.add(btn4);
		
		btn2 = new JButton("2");
		btn2.addActionListener(buttonHandler);
		
		btn3 = new JButton("3");
		btn3.addActionListener(buttonHandler);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(buttonHandler);
		buttonArray.add(btnMinus);
		
		btnSqrRoot = new JButton("\u221A");
		btnSqrRoot.addActionListener(buttonHandler);
		buttonArray.add(btnSqrRoot);
		
		btnCos = new JButton("cos");
		btnCos.addActionListener(buttonHandler);
		buttonArray.add(btnCos);
		buttonArray.add(btn3);
		buttonArray.add(btn2);
		
		btn1 = new JButton("1");
		btn1.addActionListener(buttonHandler);
		buttonArray.add(btn1);
		
		btnForwardSlash = new JButton("/");
		btnForwardSlash.addActionListener(buttonHandler);
		buttonArray.add(btnForwardSlash);
		
		btne = new JButton("e");
		btne.addActionListener(buttonHandler);
		buttonArray.add(btne);
		
		btnTan = new JButton("tan");
		btnTan.addActionListener(buttonHandler);
		buttonArray.add(btnTan);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(buttonHandler);
		buttonArray.add(btnDot);
		
		btn0 = new JButton("0");
		btn0.addActionListener(buttonHandler);
		buttonArray.add(btn0);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(buttonHandler);
		buttonArray.add(btnClear);
		
		btnAsterisk = new JButton("*");
		btnAsterisk.addActionListener(buttonHandler);
		buttonArray.add(btnAsterisk);
		
		btnPi = new JButton("\u03C0");
		btnPi.addActionListener(buttonHandler);
		buttonArray.add(btnPi);
		
		btnNaturalLog = new JButton("ln");
		btnNaturalLog.addActionListener(buttonHandler);
		buttonArray.add(btnNaturalLog);
		
		JPanel answerArray = new JPanel();
		answerArray.setBounds(23, 488, 362, 50);
		mainCalc.add(answerArray);
		answerArray.setLayout(new GridLayout(1, 2, 10, 5));
		
		btnAnswer = new JButton("Answer");
		btnAnswer.addActionListener(buttonHandler);
		answerArray.add(btnAnswer);
		
		btnEnter = new JButton("Enter");
		btnEnter.addActionListener(buttonHandler);
		answerArray.add(btnEnter);
		
		JPanel outputPanel = new JPanel();
		outputPanel.setBounds(23, 296, 362, 32);
		mainCalc.add(outputPanel);
		
		JLabel lblOutput = new JLabel("Output:- ");
		outputPanel.add(lblOutput);
		
		outputTextfield = new JTextField();
		outputPanel.add(outputTextfield);
		outputTextfield.setColumns(25);
		delButton.addActionListener(buttonHandler);
	}
	
	class ButtonHandler implements ActionListener {
		
		private String expr;
						
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn1) {
				inputTextfield.setText(inputTextfield.getText().concat("1"));
			}
			if(e.getSource() == btn2) {
				inputTextfield.setText(inputTextfield.getText().concat("2"));
			}
			if(e.getSource() == btn3) {
				inputTextfield.setText(inputTextfield.getText().concat("3"));
			}
			if(e.getSource() == btn4) {
				inputTextfield.setText(inputTextfield.getText().concat("4"));
			}
			if(e.getSource() == btn5) {
				inputTextfield.setText(inputTextfield.getText().concat("5"));
			}
			if(e.getSource() == btn6) {
				inputTextfield.setText(inputTextfield.getText().concat("6"));
			}
			if(e.getSource() == btn7) {
				inputTextfield.setText(inputTextfield.getText().concat("7"));
			}
			if(e.getSource() == btn8) {
				inputTextfield.setText(inputTextfield.getText().concat("8"));
			}
			if(e.getSource() == btn9) {
				inputTextfield.setText(inputTextfield.getText().concat("9"));
			}
			if(e.getSource() == btn0) {
				inputTextfield.setText(inputTextfield.getText().concat("9"));
			}
			if(e.getSource() == btnPlus) {
				inputTextfield.setText(inputTextfield.getText().concat("+"));
			}
			
			if(e.getSource() == addButton) {
				eqList.add(inputTextfield.getText()+"\n");
				equationBox.setText("");
				for(int i=0; i<eqList.size(); i++) {
						equationBox.append(eqList.get(i));
					
				}
			}
			
			if(e.getSource()==btnEnter) {
				outputTextfield.setText(Integer.toString(Calculations.doCalc(inputTextfield.getText())));
			}
	        
	        if(e.getSource()==btnClear) {
	        	inputTextfield.setText("");
	            outputTextfield.setText("");
	        }
	        
		}
	}
}
