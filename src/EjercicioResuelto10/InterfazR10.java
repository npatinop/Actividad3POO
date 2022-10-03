package EjercicioResuelto10;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class InterfazR10 extends JFrame {

	private JPanel contentPane;
	private JTextField textResultado;
	private JTextField textNumero;
	private JTextField textNombre;
	private JTextField textPatrimonio;
	private JTextField textEstrato;
	private JButton btnBorrar;
	private JButton btnCerrar;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

	/**
	 * Create the frame.
	 */
	public InterfazR10() {
		// setBounds -> dimensiones, setFound -> fuentes
		this.setTitle("Ejercicio Resuelto 10"); // para título de la interfaz
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 352);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// indicadores
		JLabel lblNewLabel = new JLabel("Número de matrícula");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel.setBounds(38, 129, 150, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(38, 104, 184, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Patrimonio ($)");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(38, 185, 150, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Estrato social");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(38, 241, 150, 14);
		contentPane.add(lblNewLabel_3);

		textResultado = new JTextField();
		textResultado.setForeground(new Color(255, 255, 255));
		textResultado.setBackground(new Color(128, 0, 0));
		textResultado.setFont(new Font("Verdana", Font.ITALIC, 12));
		textResultado.setHorizontalAlignment(SwingConstants.CENTER);
		textResultado.setBounds(213, 170, 602, 44);
		contentPane.add(textResultado);
		textResultado.setColumns(10);

		// botón para encontrar el patrimonio
		JButton btnNewButton = new JButton("Determinar");
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// variables pedidas por teclado
					double numero;
					String nombre;
					double patrimonio;
					double estrato;

					// leer los datos ingresados
					nombre = textNombre.getText();
					numero = Double.parseDouble(textNumero.getText());
					estrato = Double.parseDouble(textEstrato.getText());
					patrimonio = Double.parseDouble(textPatrimonio.getText());

					// mostrar resultados
					textResultado.setText("El/la estudiante " + nombre + ",con número de matricula " + (int) numero
							+ ",debe pagar este semestre $" + MetodosR10.pagoMatricula(patrimonio, estrato));
				}
				// excepciones
				catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"Los valores ingresados no concuerdan con el formato. Intente nuevamente.");

				}
			}

		});
		btnNewButton.setBounds(301, 232, 115, 23);
		contentPane.add(btnNewButton);

		// ingresar por teclado
		textNumero = new JTextField();
		textNumero.setForeground(new Color(255, 255, 255));
		textNumero.setBackground(new Color(128, 0, 0));
		textNumero.setFont(new Font("Verdana", Font.PLAIN, 12));
		textNumero.setHorizontalAlignment(SwingConstants.CENTER);
		textNumero.setBounds(38, 154, 150, 20);
		contentPane.add(textNumero);
		textNumero.setColumns(10);

		textNombre = new JTextField();
		textNombre.setForeground(new Color(255, 255, 255));
		textNombre.setBackground(new Color(128, 0, 0));
		textNombre.setFont(new Font("Verdana", Font.PLAIN, 12));
		textNombre.setHorizontalAlignment(SwingConstants.CENTER);
		textNombre.setBounds(126, 101, 689, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);

		textPatrimonio = new JTextField();
		textPatrimonio.setForeground(new Color(255, 255, 255));
		textPatrimonio.setBackground(new Color(128, 0, 0));
		textPatrimonio.setFont(new Font("Verdana", Font.PLAIN, 12));
		textPatrimonio.setHorizontalAlignment(SwingConstants.CENTER);
		textPatrimonio.setBounds(38, 210, 150, 20);
		contentPane.add(textPatrimonio);
		textPatrimonio.setColumns(10);

		textEstrato = new JTextField();
		textEstrato.setForeground(new Color(255, 255, 255));
		textEstrato.setBackground(new Color(128, 0, 0));
		textEstrato.setFont(new Font("Verdana", Font.PLAIN, 12));
		textEstrato.setHorizontalAlignment(SwingConstants.CENTER);
		textEstrato.setBounds(38, 266, 150, 20);
		contentPane.add(textEstrato);
		textEstrato.setColumns(10);

		// botón para eliminar los contenidos
		btnBorrar = new JButton("Borrar");
		btnBorrar.setForeground(new Color(128, 0, 0));
		btnBorrar.setFont(new Font("Verdana", Font.BOLD, 13));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// dejar espacios en blanco
				textEstrato.setText("");
				textPatrimonio.setText("");
				textNombre.setText("");
				textNumero.setText("");
				textResultado.setText("");
			}
		});
		btnBorrar.setBounds(468, 232, 89, 23);
		contentPane.add(btnBorrar);

		// para salir del programa con un botón
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH); // comando para cerrar el programa
			}
		});
		btnCerrar.setForeground(new Color(128, 0, 0));
		btnCerrar.setFont(new Font("Verdana", Font.BOLD, 13));
		btnCerrar.setBounds(614, 232, 89, 23);
		contentPane.add(btnCerrar);

		// encabezados de la interfaz
		lblNewLabel_4 = new JLabel("Pago de matrícula");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_4.setBounds(271, 11, 197, 23);
		contentPane.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("Universidad Nacional de Colombia - Sede Medellín");
		lblNewLabel_5.setForeground(new Color(128, 0, 0));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_5.setBounds(186, 36, 390, 23);
		contentPane.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("¡Bienvenido!");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_6.setBounds(186, 70, 390, 23);
		contentPane.add(lblNewLabel_6);
	}

}
