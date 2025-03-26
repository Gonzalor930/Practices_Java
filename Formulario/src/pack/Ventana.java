package pack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtXxxxxxxxxxxx;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TIENE UN VIRUS, INGRESE LOS DATOS DE SU TARJETA!!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 0, 426, 50);
		contentPane.add(lblNewLabel);
		
		txtXxxxxxxxxxxx = new JTextField();
		txtXxxxxxxxxxxx.setText("XXXX-XXXX-XXXX");
		txtXxxxxxxxxxxx.setBounds(10, 60, 137, 19);
		contentPane.add(txtXxxxxxxxxxxx);
		txtXxxxxxxxxxxx.setColumns(10);
		
		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.setBounds(10, 105, 118, 28);
		contentPane.add(btnNewButton);
	}
}
