package Visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import Logico.GenerateNumber;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textMin;
	private JTextField textMax;
	
	public double generar(int factMin,int factMax) {
		GenerateNumber generateNumber = new GenerateNumber();
		return generateNumber.randonNumber(factMin, factMax);
		
	}



	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 626, 476);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPresentacion = new JLabel("Genereador de numeros Aleatorios");
		lblPresentacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresentacion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblPresentacion.setBounds(136, 22, 337, 81);
		contentPane.add(lblPresentacion);
		
		JLabel lblMax = new JLabel("Max:");
		lblMax.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMax.setBounds(348, 134, 50, 28);
		contentPane.add(lblMax);
		
		JLabel lblMin = new JLabel("Min:");
		lblMin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMin.setBounds(92, 134, 50, 28);
		contentPane.add(lblMin);
		
		textMin = new JTextField();
		textMin.setBackground(new Color(224, 255, 255));
		textMin.setColumns(10);
		textMin.setBounds(137, 139, 86, 20);
		contentPane.add(textMin);
		
		JLabel lblNumeroGenereado = new JLabel("Number Generate");
		lblNumeroGenereado.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroGenereado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNumeroGenereado.setBounds(209, 246, 183, 28);
		contentPane.add(lblNumeroGenereado);
		
		JLabel lblNumeroGenerado = new JLabel("");
		lblNumeroGenerado.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroGenerado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNumeroGenerado.setBounds(251, 285, 102, 28);
		contentPane.add(lblNumeroGenerado);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					int factMin = Integer.parseInt(textMin.getText());
		            int factMax = Integer.parseInt(textMax.getText());
		            
		            if (factMin <= factMax) {
		            double numeroGenerado = generar(factMin, factMax);
		            lblNumeroGenerado.setText(String.valueOf(numeroGenerado));
		            } else {
		                lblNumeroGenerado.setText("Error: Min > Max");
		            }
		        } catch (NumberFormatException ex) {
		            lblNumeroGenerado.setText("Error");
		        }
				
			}
		});
		btnGenerate.setBackground(new Color(132, 253, 168));
		btnGenerate.setBounds(251, 198, 89, 23);
		contentPane.add(btnGenerate);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setBounds(477, 384, 89, 23);
		contentPane.add(btnSalir);
		
		textMax = new JTextField();
		textMax.setColumns(10);
		textMax.setBackground(new Color(224, 255, 255));
		textMax.setBounds(394, 139, 86, 20);
		contentPane.add(textMax);
	}
}
