import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;  


public class LoginSystem {

	private JFrame frame;
	private JPasswordField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem window = new LoginSystem();
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
	public LoginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(113, 100
				, 469, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel(" Login System");
		lblLogin.setFont(new Font("Gabriola", Font.BOLD, 40));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(121, 23, 226, 49);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Gabriola", Font.BOLD, 25));
		lblUsername.setBounds(47, 122, 103, 31);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Gabriola", Font.BOLD, 25));
		lblPassword.setBounds(47, 179, 103, 31);
		frame.getContentPane().add(lblPassword);
		
		txtUsername = new JPasswordField();
		txtUsername.setBounds(178, 124, 195, 19);
		frame.getContentPane().add(txtUsername);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(177, 181, 196, 19);
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Gabriola", Font.BOLD, 25));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if (password.contains("Intern") && username.contains("SCADS"))
				{
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
			}
		});
		btnLogin.setBounds(125, 273, 100, 31);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Gabriola", Font.BOLD, 25));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(247, 273, 100, 31);
		frame.getContentPane().add(btnReset);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 233, 436, 7);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 93, 436, 7);
		frame.getContentPane().add(separator_1);
	}

}

/*public class Display extends LoginSystem {  
	  
	  Image picture;  
	  
	  public void init() {  
	    picture = getImage(getDocumentBase(),"download.jpeg");  
	  }  
	    
	  private Image getImage(Object documentBase, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getDocumentBase() {
		// TODO Auto-generated method stub
		return null;
	}

	public void paint(Graphics g) {  
	    g.drawImage(picture, 30,30, this);  
	  }  
	
	      
}  
*/