package assignment7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Convertor extends JFrame {

	private JPanel contentPane;
	private JTextField textField_mile;
	private JTextField textField_pound;
	private JTextField textField_gallon;
	private JTextField textField_fahrenheit;
	private JTextField textField_kilometer;
	private JTextField textField_kilogram;
	private JTextField textField_liters;
	private JTextField textField_centigrade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Convertor frame = new Convertor();
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
	public Convertor() {
		setTitle("Metric Convertor Assistant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mile:");
		lblNewLabel.setBounds(58, 43, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pound:");
		lblNewLabel_1.setBounds(58, 68, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gallon:");
		lblNewLabel_2.setBounds(58, 93, 64, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fahrenheit:");
		lblNewLabel_3.setBounds(58, 118, 64, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_mile = new JTextField();
		textField_mile.setBounds(132, 40, 86, 20);
		contentPane.add(textField_mile);
		textField_mile.setColumns(10);
		
		textField_pound = new JTextField();
		textField_pound.setBounds(132, 65, 86, 20);
		contentPane.add(textField_pound);
		textField_pound.setColumns(10);
		
		textField_gallon = new JTextField();
		textField_gallon.setBounds(132, 90, 86, 20);
		contentPane.add(textField_gallon);
		textField_gallon.setColumns(10);
		
		textField_fahrenheit = new JTextField();
		textField_fahrenheit.setBounds(132, 115, 86, 20);
		contentPane.add(textField_fahrenheit);
		textField_fahrenheit.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Kilometer:");
		lblNewLabel_4.setBounds(251, 43, 76, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Kilogram:");
		lblNewLabel_5.setBounds(251, 68, 64, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Liters:");
		lblNewLabel_6.setBounds(251, 93, 64, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Centigrade:");
		lblNewLabel_7.setBounds(251, 118, 76, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_kilometer = new JTextField();
		textField_kilometer.setEditable(false);
		textField_kilometer.setBounds(337, 40, 86, 20);
		contentPane.add(textField_kilometer);
		textField_kilometer.setColumns(10);
		
		textField_kilogram = new JTextField();
		textField_kilogram.setEditable(false);
		textField_kilogram.setBounds(337, 65, 86, 20);
		contentPane.add(textField_kilogram);
		textField_kilogram.setColumns(10);
		
		textField_liters = new JTextField();
		textField_liters.setEditable(false);
		textField_liters.setBounds(337, 90, 86, 20);
		contentPane.add(textField_liters);
		textField_liters.setColumns(10);
		
		textField_centigrade = new JTextField();
		textField_centigrade.setEditable(false);
		textField_centigrade.setBounds(337, 115, 86, 20);
		contentPane.add(textField_centigrade);
		textField_centigrade.setColumns(10);
		
		JButton btnNewButton = new JButton("Convertor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_mile.getText().isEmpty() == false) {
					double mile = Double.parseDouble(textField_mile.getText());
					double km = 1.60934 * mile;
					textField_kilometer.setText(String.format("%.2f", km));
				} else {
					textField_kilometer.setText("");
				}
				if (textField_pound.getText().isEmpty() == false) {
					double pound = Double.parseDouble(textField_pound.getText());
					double kilogram = 0.453592 * pound;
					
					textField_kilogram.setText(String.format("%.2f",kilogram));
				} else {  
					textField_kilogram.setText("");
				}
				if (textField_gallon.getText().isEmpty() == false) {
					double gallon = Double.parseDouble(textField_gallon.getText());
					double liters = 4.54609 * gallon;
					textField_liters.setText(String.format("%.2f",liters));
				} else {
					textField_liters.setText("");
				}
				if (textField_fahrenheit.getText().isEmpty() == false) {
					double fahrenheit = Double.parseDouble(textField_fahrenheit.getText());
					double centigrades = (fahrenheit - 32) * 0.5556;
					textField_centigrade.setText(String.format("%.2f",centigrades));
				} else {
					textField_centigrade.setText("");
				}
				
			}
		});
		btnNewButton.setBounds(178, 164, 100, 34);
		contentPane.add(btnNewButton);
	}
}
