package curso_java;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class RegraDeTres extends JFrame {

	private JPanel contentPane;
	private JTextField valor1;
	private JTextField valor2;
	private JTextField valor3;
	private JTextField resultado;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegraDeTres frame = new RegraDeTres();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegraDeTres() {
		setTitle("Regra de três simples");
		
		int v1, v2, v3;
		int r;
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		valor1 = new JTextField();
		valor1.setBounds(50, 58, 114, 19);
		contentPane.add(valor1);
		valor1.setColumns(10);
		valor1.getText();
		
		
		valor2 = new JTextField();
		valor2.setBounds(50, 135, 114, 19);
		contentPane.add(valor2);
		valor2.setColumns(10);
		valor2.getText();
		
		
		valor3 = new JTextField();
		valor3.setBounds(230, 58, 114, 19);
		contentPane.add(valor3);
		valor3.setColumns(10);
		valor3.getText();

		
		resultado = new JTextField();
		resultado.setText("X");
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setForeground(Color.BLACK);
		resultado.setEditable(false);
		resultado.setBounds(230, 135, 114, 19);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{

				   
				}catch(NumberFormatException ex) {
				   //cairá aqui se a string não for um valor 
				   //que possa ser convertido em inteiro
				}
				
			}
		});
		btnCalcular.setBounds(227, 180, 117, 25);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				valor1.setText(null);
				valor2.setText(null);
				valor3.setText(null);
				resultado.setText("X");
				
			}
		});
		btnLimpar.setBounds(47, 180, 117, 25);
		contentPane.add(btnLimpar);
		
		JLabel label = new JLabel("_____");
		label.setForeground(Color.WHITE);
		label.setBounds(182, 60, 47, 15);
		contentPane.add(label);
		
		label_1 = new JLabel("_____");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(182, 137, 47, 15);
		contentPane.add(label_1);
	}
}
