import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TicTacToe extends JFrame {
	JButton one = new JButton("");
	JButton two = new JButton("");
	JButton three = new JButton("");
	JButton four = new JButton("");
	JButton five = new JButton("");
	JButton six = new JButton("");
	private boolean isXorZero = false;
	public static void main(String[] args) {
		
					TicTacToe frame = new TicTacToe();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public TicTacToe() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XorZero(one);
			}
		});
		one.setFont(new Font("Tahoma", Font.BOLD, 18));
		one.setBounds(30, 42, 100, 49);
		getContentPane().add(one);
		
		
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XorZero(two);
			}
		});
		two.setFont(new Font("Tahoma", Font.BOLD, 18));
		two.setBounds(171, 42, 100, 49);
		getContentPane().add(two);
		
		
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			XorZero(three);
			}
		});
		three.setFont(new Font("Tahoma", Font.BOLD, 18));
		three.setBounds(300, 42, 100, 49);
		getContentPane().add(three);
		
		
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XorZero(four);
			}
		});
		four.setFont(new Font("Tahoma", Font.BOLD, 18));
		four.setBounds(30, 131, 100, 49);
		getContentPane().add(four);
		
		
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XorZero(five);
			}
		});
		five.setFont(new Font("Tahoma", Font.BOLD, 18));
		five.setBounds(171, 131, 100, 49);
		getContentPane().add(five);
		
		
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XorZero(six);
			}
		});
		six.setFont(new Font("Tahoma", Font.BOLD, 18));
		six.setBounds(300, 131, 100, 49);
		getContentPane().add(six);
		
	}
	
	private boolean isNotBlank(JButton b1){
		if(b1.getText().trim().length()!=0){
			return true;
		}
		else{
			return false;
		}
	}
	
	private boolean isWin(){
		boolean isGameOver = false;
		if(isNotBlank(one) && isNotBlank(two) && isNotBlank(three)){
			if(one.getText().equals(two.getText()) && one.getText().equals(three.getText())){
				isGameOver = true;
			}
			
		}
		return isGameOver;
	}
	private void XorZero(JButton button){
		
		if(button.getText().trim().length()==0){
		if(isXorZero){
			button.setText("0");
			//isXorZero = false;
		}
		else
		{
			button.setText("X");
			//isXorZero = true;
		}
		isXorZero = !isXorZero;
		
		if(isWin())
		{
			JOptionPane.showMessageDialog(this, "Game Over");
		}
		}
		
	}
}
