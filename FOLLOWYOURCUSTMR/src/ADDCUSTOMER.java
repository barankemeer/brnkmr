import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;


public class ADDCUSTOMER extends JFrame {

	private JPanel contentPane;
	private JTextField Username_txt;
	private JPasswordField Password_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADDCUSTOMER frame = new ADDCUSTOMER();
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
	JLabel CHECKBOX_txt;
	public ADDCUSTOMER() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 277);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please Login");
		lblNewLabel.setBounds(123, 13, 171, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    String url = "jdbc:sqlserver://localhost:1433;databaseName=Follow.your.customer;user=admin;password=admin";
                    Connection con = DriverManager.getConnection(url);
                    String sql = "Select * from Admin_Table where Username=admin and Password=admin"; //veritabanındaki kullancılar tablomuzdan kullanıcıadı şifre kontrolü yapıyoruz
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1,Username_txt.getText());//kontrol1
                    pst.setString(2,Password_txt.getText());//kontrol2
                    ResultSet rs = pst.executeQuery();//kodu execute ediyoruz.
                    if(rs.next()){//eğer ilgili sorgu sonrası bir veri geliyor ise
                        JOptionPane.showMessageDialog(null,"ACCESS ACCEPT.");
                        SEARCHCUSTOMER frm2 = new SEARCHCUSTOMER();

                        frm2.setVisible(true);
                  

                    }else{
                        JOptionPane.showMessageDialog(null,"Wrong USERNAME or PASSWORD! Try again.");
                        
                    }
                      con.close();
                  }
                catch(Exception es){
                      JOptionPane.showMessageDialog(null, es);
                  }

			
				}
			
					
			
		});
		btnNewButton.setBounds(279, 134, 97, 25);
		contentPane.add(btnNewButton);
		
		Username_txt = new JTextField();
		Username_txt.setBounds(38, 84, 184, 22);
		contentPane.add(Username_txt);
		Username_txt.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(38, 110, 107, 25);
		contentPane.add(lblPassword);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(38, 60, 126, 25);
		contentPane.add(lblUsername);
		
		CHECKBOX_txt = new JLabel("");
		CHECKBOX_txt.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		CHECKBOX_txt.setForeground(Color.RED);
		CHECKBOX_txt.setBounds(38, 170, 325, 32);
		contentPane.add(CHECKBOX_txt);
		
		Password_txt = new JPasswordField();
		Password_txt.setBounds(38, 135, 184, 22);
		contentPane.add(Password_txt);
	}
}
