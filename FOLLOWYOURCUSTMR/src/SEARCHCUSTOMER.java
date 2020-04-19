import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SEARCHCUSTOMER extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtGay;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JTextField txtDfdf;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_16;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SEARCHCUSTOMER frame = new SEARCHCUSTOMER();
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
	public SEARCHCUSTOMER() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 624);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0130D");
		lblNewLabel.setBounds(57, 39, 200, 22);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.ORANGE);
		textField.setBounds(135, 74, 192, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.ORANGE);
		textField_1.setColumns(10);
		textField_1.setBounds(135, 109, 192, 22);
		contentPane.add(textField_1);
		
		txtGay = new JTextField();
		txtGay.setText("G/A/Y");
		txtGay.setForeground(Color.ORANGE);
		txtGay.setColumns(10);
		txtGay.setBounds(135, 144, 192, 22);
		contentPane.add(txtGay);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.ORANGE);
		textField_3.setColumns(10);
		textField_3.setBounds(135, 179, 192, 22);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.ORANGE);
		textField_4.setColumns(10);
		textField_4.setBounds(135, 214, 192, 22);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(463, 74, 192, 22);
		contentPane.add(textField_5);
		
		lblNewLabel_1 = new JLabel("CitizenShip Number*");
		lblNewLabel_1.setBounds(12, 77, 125, 16);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("HomeLand*");
		lblNewLabel_2.setBounds(12, 112, 97, 16);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Year Of Born*");
		lblNewLabel_3.setBounds(12, 147, 97, 16);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Job*");
		lblNewLabel_4.setBounds(12, 182, 97, 16);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Monthly Earnings*");
		lblNewLabel_5.setBounds(12, 217, 111, 16);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Phone*");
		lblNewLabel_6.setBounds(377, 77, 56, 16);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Fax");
		lblNewLabel_7.setBounds(377, 112, 56, 16);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Mail*");
		lblNewLabel_8.setBounds(377, 147, 56, 16);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Social Media");
		lblNewLabel_9.setBounds(377, 182, 74, 16);
		contentPane.add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(463, 109, 192, 22);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(463, 144, 192, 22);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(463, 179, 192, 22);
		contentPane.add(textField_8);
		
		lblNewLabel_10 = new JLabel("Contact");
		lblNewLabel_10.setBounds(387, 39, 165, 22);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Build*");
		lblNewLabel_11.setBounds(27, 321, 56, 16);
		contentPane.add(lblNewLabel_11);
		
		txtDfdf = new JTextField();
		txtDfdf.setBackground(Color.RED);
		txtDfdf.setColumns(10);
		txtDfdf.setBounds(116, 315, 192, 22);
		contentPane.add(txtDfdf);
		
		textField_10 = new JTextField();
		textField_10.setBackground(Color.RED);
		textField_10.setColumns(10);
		textField_10.setBounds(116, 350, 192, 22);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setBackground(Color.RED);
		textField_11.setColumns(10);
		textField_11.setBounds(116, 388, 192, 22);
		contentPane.add(textField_11);
		
		lblNewLabel_12 = new JLabel("Vehicle*");
		lblNewLabel_12.setBounds(26, 353, 56, 16);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("Land*");
		lblNewLabel_13.setBounds(27, 391, 56, 16);
		contentPane.add(lblNewLabel_13);
		
		lblNewLabel_16 = new JLabel("Products Owned*");
		lblNewLabel_16.setBounds(57, 280, 165, 16);
		contentPane.add(lblNewLabel_16);
		
		btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(493, 441, 97, 25);
		contentPane.add(btnNewButton);
	}

}
