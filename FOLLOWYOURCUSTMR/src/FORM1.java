import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;

public class FORM1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FORM1 frame = new FORM1();
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
	public FORM1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Follow Your Customer");
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setFont(new Font("SimSun-ExtB", Font.BOLD, 43));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(57, 29, 542, 38);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add New Customer ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ADDCUSTOMER frm1=new ADDCUSTOMER();
				frm1.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(47, 139, 259, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search Your Customer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGINCHECK frm2=new LOGINCHECK();
				frm2.setVisible(true);
			
			}
		});
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setBounds(367, 139, 242, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("You Should Have Admin Account");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setBounds(57, 177, 226, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Y\u0131lmaz Construction");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.ITALIC, 23));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(378, 203, 249, 25);
		contentPane.add(lblNewLabel_2);
	}
}
