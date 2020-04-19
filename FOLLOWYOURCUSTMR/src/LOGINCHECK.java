import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.List;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class LOGINCHECK extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGINCHECK frame = new LOGINCHECK();
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
	public LOGINCHECK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Type A \u0130nfo");
		lblNewLabel.setBounds(26, 13, 116, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(26, 42, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		List list = new List();
		list.setForeground(Color.WHITE);
		list.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		list.setBackground(Color.DARK_GRAY);
		list.setBounds(245, 42, 132, 178);
		contentPane.add(list);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(83, 87, 97, 25);
		contentPane.add(btnNewButton);
	}
}
