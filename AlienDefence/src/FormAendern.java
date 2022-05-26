import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FormAendern extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormAendern frame = new FormAendern();
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
	public FormAendern() {
		setTitle("Form_aendern");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 7, 424, 82);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dieser Text soll ver\u00E4ndert werden.");
		lblNewLabel.setBounds(129, 35, 167, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Aufgabe 2: Text formatieren");
		lblNewLabel_1.setBounds(5, 164, 424, 23);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 114, 424, 46);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Rot");
		btnNewButton.setBounds(0, 0, 141, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Gr\u00FCn");
		btnNewButton_1.setBounds(142, 0, 141, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Blau");
		btnNewButton_3.setBounds(283, 0, 141, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Gelb");
		btnNewButton_4.setBounds(0, 23, 141, 23);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("Standartfarbe");
		btnNewButton_1_1.setBounds(142, 23, 141, 23);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_3_1 = new JButton("Farbe w\u00E4hlen");
		btnNewButton_3_1.setBounds(283, 23, 141, 23);
		panel_1.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_2 = new JLabel("Aufgabe 3: Schriftfarbe \u00E4ndern");
		lblNewLabel_2.setBounds(5, 260, 424, 23);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 284, 424, 23);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_5_1 = new JButton("Rot");
		btnNewButton_5_1.setBounds(0, 0, 141, 23);
		panel_2.add(btnNewButton_5_1);
		
		JButton btnNewButton_1_2_1 = new JButton("Blau");
		btnNewButton_1_2_1.setBounds(142, 0, 141, 23);
		panel_2.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_3_2_1 = new JButton("Schwarz");
		btnNewButton_3_2_1.setBounds(283, 0, 141, 23);
		panel_2.add(btnNewButton_3_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Aufgabe 4: Schriftgr\u00F6\u00DFe ver\u00E4ndern");
		lblNewLabel_3.setBounds(5, 318, 424, 23);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(5, 341, 424, 23);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_6_2 = new JButton("+");
		btnNewButton_6_2.setBounds(0, 0, 211, 23);
		panel_3.add(btnNewButton_6_2);
		
		JButton btnNewButton_6_1_1 = new JButton("-");
		btnNewButton_6_1_1.setBounds(213, 0, 211, 23);
		panel_3.add(btnNewButton_6_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Aufgaben 5: Textausrichtung");
		lblNewLabel_4.setBounds(5, 375, 424, 23);
		contentPane.add(lblNewLabel_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(5, 395, 424, 23);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_5_1_1 = new JButton("linksb\u00FCndig");
		btnNewButton_5_1_1.setBounds(0, 0, 141, 23);
		panel_4.add(btnNewButton_5_1_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("zentriert");
		btnNewButton_1_2_1_1.setBounds(142, 0, 141, 23);
		panel_4.add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_3_2_1_1 = new JButton("rechtsb\u00FCndig");
		btnNewButton_3_2_1_1.setBounds(283, 0, 141, 23);
		panel_4.add(btnNewButton_3_2_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("Aufgabe 6: Programm beenden");
		lblNewLabel_5.setBounds(5, 429, 424, 23);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setBounds(5, 451, 424, 63);
		contentPane.add(btnNewButton_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(5, 185, 424, 73);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("Arial");
		btnNewButton_5.setBounds(0, 0, 141, 23);
		panel_2_1.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("Comic Sans MS");
		btnNewButton_1_2.setBounds(142, 0, 141, 23);
		panel_2_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_3_2 = new JButton("Courier New");
		btnNewButton_3_2.setBounds(283, 0, 141, 23);
		panel_2_1.add(btnNewButton_3_2);
		
		textField = new JTextField();
		textField.setBounds(0, 25, 424, 23);
		panel_2_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Ins Label schreiben");
		btnNewButton_6.setBounds(0, 50, 211, 23);
		panel_2_1.add(btnNewButton_6);
		
		JButton btnNewButton_6_1 = new JButton("Text im Label l\u00F6schen");
		btnNewButton_6_1.setBounds(213, 50, 211, 23);
		panel_2_1.add(btnNewButton_6_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Aufgabe 1: Hintergrundfarbe \u00E4ndern");
		lblNewLabel_1_2.setBounds(5, 91, 424, 23);
		contentPane.add(lblNewLabel_1_2);
	}
}
