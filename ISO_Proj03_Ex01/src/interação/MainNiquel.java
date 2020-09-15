package interação;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controle.CacaNiquel;
import controle.ControleNiquel;

public class MainNiquel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainNiquel frame = new MainNiquel();
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
	
	JButton btnStart = new JButton("Girar");
	JTextField txtDireito;
	JTextField txtCentro;
	JTextField txtEsquerdo;
	
	public MainNiquel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnStart.setToolTipText("Clique para jogar");
		
		btnStart.setFont(new Font("Arial", Font.PLAIN, 15));
		btnStart.setBounds(220, 260, 120, 30);
		contentPane.add(btnStart);
		
		txtDireito = new JTextField();
		txtDireito.setEditable(false);
		txtDireito.setHorizontalAlignment(SwingConstants.CENTER);
		txtDireito.setFont(new Font("Arial", Font.BOLD, 50));
		txtDireito.setText("0");
		txtDireito.setBounds(385, 85, 75, 80);
		contentPane.add(txtDireito);
		txtDireito.setColumns(10);
		
		txtCentro = new JTextField();
		txtCentro.setEditable(false);
		txtCentro.setText("0");
		txtCentro.setHorizontalAlignment(SwingConstants.CENTER);
		txtCentro.setFont(new Font("Arial", Font.BOLD, 50));
		txtCentro.setColumns(10);
		txtCentro.setBounds(240, 85, 75, 80);
		contentPane.add(txtCentro);
		
		txtEsquerdo = new JTextField();
		txtEsquerdo.setEditable(false);
		txtEsquerdo.setText("0");
		txtEsquerdo.setHorizontalAlignment(SwingConstants.CENTER);
		txtEsquerdo.setFont(new Font("Arial", Font.BOLD, 50));
		txtEsquerdo.setColumns(10);
		txtEsquerdo.setBounds(95, 85, 75, 80);
		contentPane.add(txtEsquerdo);
		
		ActionListener insert = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				inicio();
			}
		};
		
		btnStart.addActionListener(insert);
		
	}
	
	public void inicio() {
		
		btnStart.setEnabled(false);
		for(int i = 1; i <= 3; i++) {
			CacaNiquel niquel = new CacaNiquel(i);
			niquel.start();
		}
		
		Random rand = new Random();
		int Giros = rand.nextInt(150+1);
		new ControleNiquel(txtEsquerdo, txtCentro, txtDireito, Giros, btnStart);
		
	}
	
}

