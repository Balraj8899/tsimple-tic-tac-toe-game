/*
 * Created by JFormDesigner on Sat Jan 22 19:20:19 IST 2022
 */

package xo;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.*;
import javax.swing.*;

import bal.stdb;

/**
 * @author balraj
 */
public class XO extends JFrame {
	private JFrame frame;
	
	private int xcount1=0;
	private int ycount1=0;
	private int c=0;
	private String startgame="x";
	private int b3=10;
	private int b4=10;
	private int b5=10;
	private int b6=10;
	private int b7=10;
	private int b8=10;
	private int b9=10;
	private int b10=10;
	private int b11=10;
	
	public XO() {
		initComponents();
	}
	private void clear() {
		button3.setText(null);
		   button4.setText(null);
		   button5.setText(null);
		   button6.setText(null);
		   button7.setText(null);
		   button8.setText(null);
		   button9.setText(null);
		   button10.setText(null);
		   button11.setText(null);
		   b3=10;
		   b4=10;
		   b5=10;
		   b6=10;
		   b7=10;
		   b8=10;
		   b9=10;
		   b10=10;
		   b11=10;
		   c=0;
	}
	private void winningGame() {
		//player x
		if(b3==1&&b4==1&&b5==1)
		{
			JOptionPane.showMessageDialog(frame,"player X wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			textField1.setText(String.valueOf(xcount1));
			clear();
		}
		else if(b3==1&&b6==1&&b9==1)
		{
			JOptionPane.showMessageDialog(frame,"player X wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			textField1.setText(String.valueOf(xcount1));
			clear();
		}
		else if(b6==1&&b7==1&&b8==1)
		{
			JOptionPane.showMessageDialog(frame,"player X wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			textField1.setText(String.valueOf(xcount1));
			clear();
		}
		else if(b9==1&&b10==1&&b11==1)
		{
			JOptionPane.showMessageDialog(frame,"player X wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			textField1.setText(String.valueOf(xcount1));
			clear();
		}
		else if(b5==1&&b8==1&&b11==1)
		{
			JOptionPane.showMessageDialog(frame,"player X wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			textField1.setText(String.valueOf(xcount1));
			clear();
		}
		else if(b3==1&&b7==1&&b11==1)
		{
			JOptionPane.showMessageDialog(frame,"player X wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			textField1.setText(String.valueOf(xcount1));
			clear();
		}
		else if(b5==1&&b7==1&&b9==1)
		{
			JOptionPane.showMessageDialog(frame,"player X wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			textField1.setText(String.valueOf(xcount1));
			clear();
		}
		else if(b4==1&&b7==1&&b10==1)
		{
			JOptionPane.showMessageDialog(frame,"player X wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			xcount1++;
			textField1.setText(String.valueOf(xcount1));
			clear();
		}
		
		//player o
		
		else if(b3==0&&b4==0&&b5==0)
		{
			JOptionPane.showMessageDialog(frame,"player O wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			ycount1++;
			textField2.setText(String.valueOf(ycount1));
			clear();
			
		}
		else if(b3==0&&b6==0&&b9==0)
		{
			JOptionPane.showMessageDialog(frame,"player O wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			ycount1++;
			textField1.setText(String.valueOf(ycount1));
			clear();
		}
		else if(b6==0&&b7==0&&b8==0)
		{
			JOptionPane.showMessageDialog(frame,"player O wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			ycount1++;
			textField2.setText(String.valueOf(ycount1));
			clear();
		}
		else if(b9==0&&b10==0&&b11==0)
		{
			JOptionPane.showMessageDialog(frame,"player O wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			ycount1++;
			textField2.setText(String.valueOf(ycount1));
			clear();
		}
		else if(b5==0&&b8==0&&b11==0)
		{
			JOptionPane.showMessageDialog(frame,"player O wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			ycount1++;
			textField2.setText(String.valueOf(ycount1));
			clear();
		}
		else if(b3==0&&b7==0&&b11==0)
		{
			JOptionPane.showMessageDialog(frame,"player O wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			ycount1++;
			textField2.setText(String.valueOf(ycount1));
			clear();
		}
		else if(b5==0&&b7==0&&b9==0)
		{
			JOptionPane.showMessageDialog(frame,"player O wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			ycount1++;
			textField2.setText(String.valueOf(ycount1));
			clear();
		}
		else if(b4==0&&b7==0&&b10==0)
		{
			JOptionPane.showMessageDialog(frame,"player O wins","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			ycount1++;
			textField2.setText(String.valueOf(ycount1));
			clear();
		}
		else if(c==9)
		{
			JOptionPane.showMessageDialog(frame,"MATCH DRAW","XO GAME",JOptionPane.INFORMATION_MESSAGE);
			clear();
		}
	}
	private void choosePlayer() {
		if(startgame.equalsIgnoreCase("x")) {
			startgame="o";
		}
		else {
			startgame="x";
		}
	}

	private void button1(ActionEvent e) {
		
		// TODO add your code here
		System.exit(0);
	}

	private void button2(ActionEvent e) {
		// TODO add your code here
		
		//RESET BUTTON
		xcount1=0;
		ycount1=0;
	   textField1.setText(String.valueOf(xcount1));
	   textField2.setText(String.valueOf(ycount1));
	   button3.setText(null);
	   button4.setText(null);
	   button5.setText(null);
	   button6.setText(null);
	   button7.setText(null);
	   button8.setText(null);
	   button9.setText(null);
	   button10.setText(null);
	   button11.setText(null);
	   b3=10;
	   b4=10;
	   b5=10;
	   b6=10;
	   b7=10;
	   b8=10;
	   b9=10;
	   b10=10;
	   b11=10;
	   c=0;
	}

	private void button3(ActionEvent e) {
		// TODO add your code here
		button3.setText(startgame);
		if(startgame.equalsIgnoreCase("x")) {
			
			 //button3.setEnabled(false);
			button3.setForeground(Color.RED);
			 b3=1;
		}
		else {
			button3.setForeground(Color.BLUE);
			 b3=0;
		}
		c++;
		choosePlayer();
		winningGame();
		
		
	}

	private void button4(ActionEvent e) {
		// TODO add your code here
		button4.setText(startgame);
		if(startgame.equalsIgnoreCase("x")) {
			button4.setForeground(Color.RED);
			b4=1;
		}
		else {
			button4.setForeground(Color.BLUE);
			b4=0;
		}
		c++;
		choosePlayer();
		winningGame();
		
		
	}

	private void button5(ActionEvent e) {
		// TODO add your code here
		button5.setText(startgame);
		if(startgame.equalsIgnoreCase("x")) {
			button5.setForeground(Color.RED);
			b5=1;
		}
		else {
			button5.setForeground(Color.BLUE);
			b5=0;
		}
		c++;
		choosePlayer();
		winningGame();
		
		
	}

	private void button6(ActionEvent e) {
		// TODO add your code her
		button6.setText(startgame);
		if(startgame.equalsIgnoreCase("x")) {
			button6.setForeground(Color.RED);
			b6=1;
		}
		else {
			button6.setForeground(Color.BLUE);
			b6=0;
		}
		c++;
		choosePlayer();
		winningGame();
		
		
	}

	private void button7(ActionEvent e) {
		// TODO add your code here
		button7.setText(startgame);
		if(startgame.equalsIgnoreCase("x")) {
			button7.setForeground(Color.RED);
			b7=1;
		}
		else {
			button7.setForeground(Color.BLUE);
			b7=0;
		}
		c++;
		choosePlayer();
		winningGame();
		
		
	}

	private void button8(ActionEvent e) {
		// TODO add your code here
		button8.setText(startgame);
		if(startgame.equalsIgnoreCase("x")) {
			button8.setForeground(Color.RED);
			b8=1;
		}
		else {
			button8.setForeground(Color.BLUE);
			b8=0;
		}
		c++;
		choosePlayer();
		winningGame();
		
		
	}

	private void button9(ActionEvent e) {
		// TODO add your code here
		button9.setText(startgame);
		if(startgame.equalsIgnoreCase("x")) {
			button9.setForeground(Color.RED);
			b9=1;
		}
		else {
			button9.setForeground(Color.BLUE);
			b9=0;
		}
		c++;
		choosePlayer();
		winningGame();
		
		
	}

	private void button10(ActionEvent e) {
		// TODO add your code here
		button10.setText(startgame);
		if(startgame.equalsIgnoreCase("x")) {
			button10.setForeground(Color.RED);
			b10=1;
		}
		else {
			button10.setForeground(Color.BLUE);
			b10=0;
		}
		c++;
		choosePlayer();
		winningGame();
		
		
	}

	private void button11(ActionEvent e) {
		// TODO add your code here
		button11.setText(startgame);
		if(startgame.equalsIgnoreCase("x")) {
			button11.setForeground(Color.RED);
			b11=1;
		}
		else {
			button11.setForeground(Color.BLUE);
			b11=0;
		}
		c++;
		choosePlayer();
		winningGame();
		
		
	}

	



	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  
		// Generated using JFormDesigner Evaluation license - balraj
		label10 = new JLabel();
		label11 = new JLabel();
		button1 = new JButton();
		button2 = new JButton();
		label14 = new JLabel();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();
		button10 = new JButton();
		button11 = new JButton();
		textField1 = new JTextField();
		textField2 = new JTextField();

		//======== this ========
		setFont(new Font("Tahoma", Font.BOLD, 20));
		var contentPane = getContentPane();

		//---- label10 ----
		label10.setText("PLAYER X");
		label10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label10.setBackground(Color.red);

		//---- label11 ----
		label11.setText("PLAYER O");
		label11.setFont(new Font("Tahoma", Font.BOLD, 11));
		label11.setBackground(Color.blue);

		//---- button1 ----
		button1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button1.setText("EXIT");
		button1.setBackground(new Color(102, 255, 255));
		button1.addActionListener(e -> button1(e));

		//---- button2 ----
		button2.setText("RESET");
		button2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button2.setBackground(new Color(51, 255, 255));
		button2.addActionListener(e -> button2(e));

		//---- label14 ----
		label14.setText("TIC TOC GAME");
		label14.setFont(new Font("Tahoma", Font.BOLD, 14));
		label14.setBackground(new Color(102, 255, 255));

		//---- button3 ----
		button3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button3.addActionListener(e -> button3(e));

		//---- button4 ----
		button4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button4.addActionListener(e -> button4(e));

		//---- button5 ----
		button5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button5.addActionListener(e -> button5(e));

		//---- button6 ----
		button6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button6.addActionListener(e -> button6(e));

		//---- button7 ----
		button7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button7.addActionListener(e -> button7(e));

		//---- button8 ----
		button8.setFont(new Font("Tahoma", Font.BOLD, 20));
		button8.addActionListener(e -> button8(e));

		//---- button9 ----
		button9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button9.addActionListener(e -> button9(e));

		//---- button10 ----
		button10.setFont(new Font("Tahoma", Font.BOLD, 20));
		button10.addActionListener(e -> button10(e));

		//---- button11 ----
		button11.setFont(new Font("Tahoma", Font.BOLD, 20));
		button11.addActionListener(e -> button11(e));

		//---- textField1 ----
		textField1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField1.setText("0");
		textField1.addActionListener(e -> textField1(e));

		//---- textField2 ----
		textField2.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField2.setText("0");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(button3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(button4, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(button5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(button6, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(button7, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(button8, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
							.addGap(26, 26, 26)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(label11, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(label10, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
								.addComponent(label14, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
							.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(button9, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addComponent(button10, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addComponent(button11, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(15, 15, 15)
							.addComponent(button2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(button1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap(149, Short.MAX_VALUE)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label11, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(53, 53, 53)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(button1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(38, 38, 38))
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(button3, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addComponent(button4, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addComponent(button5, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(label10, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(17, 17, 17)
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(button6, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addComponent(button7, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addComponent(button8, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))))
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(button9, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addComponent(button10, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addComponent(button11, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
					.addGap(0, 20, Short.MAX_VALUE))
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(37, 37, 37)
					.addComponent(label14, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pack();
		setLocationRelativeTo(getOwner());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}
	private Object textField1(ActionEvent e) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new XO();
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - balraj
	private JLabel label10;
	private JLabel label11;
	private JButton button1;
	private JButton button2;
	private JLabel label14;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button10;
	private JButton button11;
	private JTextField textField1;
	private JTextField textField2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
