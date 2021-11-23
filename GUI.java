import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class GUI {

	private JFrame frame;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel logo = new JLabel("WARTEK");
		logo.setBounds(513, 90, 500, 100);
		logo.setFont(new java.awt.Font("Serif", 1, 50));
		frame.getContentPane().add(logo);
		
		JLabel logo2 = new JLabel("I want it; I got it");
		logo2.setBounds(550, 170, 200, 30);
		logo2.setFont(new java.awt.Font("Noto Sans MS", 1, 19));
		frame.getContentPane().add(logo2);

		JLabel lblName = new JLabel("UserName:");
		lblName.setBounds(500, 250, 100, 14);
		lblName.setFont(new java.awt.Font("Noto Sans UI",1,18));
		frame.getContentPane().add(lblName);

		JLabel lblpass = new JLabel("Password:");
		lblpass.setBounds(500, 350, 100, 14);
		lblpass.setFont(new java.awt.Font("Noto Sans UI",1,18));
		frame.getContentPane().add(lblpass);
		
		JButton btnSubmit = new JButton("Log In");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Log In Berhasil!");
			}
		});
		btnSubmit.setBounds(580, 430, 89, 40);
		frame.getContentPane().add(btnSubmit);
		
		textField = new JTextField();
		textField.setBounds(500, 275, 250, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField = new JTextField();
		textField.setBounds(500, 375, 250, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
