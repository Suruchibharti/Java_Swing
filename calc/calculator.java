package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(132, 11, 227, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name:");
		lblNewLabel_1.setBounds(31, 58, 101, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Eamil:");
		lblNewLabel_2.setBounds(31, 74, 78, 47);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setBounds(31, 118, 78, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Mobile no:");
		lblNewLabel_5.setBounds(31, 152, 78, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(109, 55, 222, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 87, 222, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(109, 118, 222, 23);
		frame.getContentPane().add(passwordField);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 149, 222, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("State:");
		lblNewLabel_4.setBounds(34, 197, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblCaste = new JLabel("caste:");
		lblCaste.setBounds(31, 234, 46, 14);
		frame.getContentPane().add(lblCaste);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("GN");
		rdbtnNewRadioButton.setBounds(109, 230, 70, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
		rdbtnNewRadioButton_2.setBounds(283, 230, 53, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OBC");
		rdbtnNewRadioButton_1.setBounds(193, 230, 70, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select State:", "Bihar", "Rajasthan", "Mumbai", "Punjab", "kerela", "tamil nadu", "odisha", "madhay pradesh", "up"}));
		comboBox.setBounds(109, 194, 230, 20);
		frame.getContentPane().add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(109, 271, 253, 47);
		frame.getContentPane().add(textArea);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(31, 273, 70, 21);
		frame.getContentPane().add(lblAddress);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(109, 341, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnNewButton = new JButton("Reset ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(223, 341, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
