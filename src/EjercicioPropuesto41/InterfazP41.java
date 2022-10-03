package EjercicioPropuesto41;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class InterfazP41 extends JFrame {

	private JPanel contentPane;
	private JTextField textValores;
	protected double cosa;
	private JTextField textResultado;

	/**
	 * Create the frame.
	 */
	public InterfazP41() {
		this.setTitle("Ejercicio Propuesto 41"); // para título de la interfaz
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 301); // dimensiones
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 221, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// ingresar números por teclado
		textValores = new JTextField();
		textValores.setHorizontalAlignment(SwingConstants.CENTER);
		textValores.setFont(new Font("Sylfaen", Font.PLAIN, 13));// setFond hace referencia a todo lo de las fuentes
		textValores.setBounds(21, 90, 415, 20);
		contentPane.add(textValores);
		textValores.setColumns(10);

		// botón para comparar los números
		JButton btnComparar = new JButton("Comparar");
		btnComparar.setBackground(new Color(255, 255, 255));
		btnComparar.setForeground(new Color(255, 0, 0));
		btnComparar.setFont(new Font("Sylfaen", Font.BOLD, 13));
		btnComparar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String numeros; // entran como una cadena de caracteres
					// se leen del campo
					numeros = textValores.getText();
					// se imprime el valor
					textResultado.setText("El mayor valor entre los ingresados " + MetodosP41.mayorN(numeros));
				} catch (NumberFormatException ex) {
					// en caso de excepciones
					JOptionPane.showMessageDialog(null,
							"Los valores ingresados no son válidos, intente nuevamente. Recuerde escribir los números de la siguiente manera: 1,2,3,4");

				}
			}
		});

		btnComparar.setBounds(163, 121, 110, 23);
		contentPane.add(btnComparar);

		// para eliminar lo ingresado en caso de ser necesario
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBackground(new Color(255, 255, 255));
		btnBorrar.setForeground(new Color(255, 0, 0));
		btnBorrar.setFont(new Font("Sylfaen", Font.BOLD, 13));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// dejar los campos completados en blanco
				textValores.setText("");
				textResultado.setText("");
			}
		});
		btnBorrar.setBounds(58, 215, 110, 23);
		contentPane.add(btnBorrar);

		JTextPane txtpntexto = new JTextPane();
		txtpntexto.setForeground(new Color(255, 255, 255));
		txtpntexto.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		txtpntexto.setBackground(new Color(238, 83, 83));
		txtpntexto.setText("Ingrese los números (separados por comas):");
		txtpntexto.setBounds(21, 58, 415, 20);
		contentPane.add(txtpntexto);

		// para indicar que sigue el resultado
		textResultado = new JTextField();
		textResultado.setHorizontalAlignment(SwingConstants.CENTER);
		textResultado.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		textResultado.setBounds(21, 184, 415, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);

		// titulo de la interfaz
		JLabel lblNewLabel = new JLabel("Número mayor");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 15));
		lblNewLabel.setBounds(145, 11, 147, 20);
		contentPane.add(lblNewLabel);

		// separador hecho a mano
		JLabel lblNewLabel_1 = new JLabel("~~~~~~~~~~~~~~~~~~~~~~~~");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD, 15));
		lblNewLabel_1.setBounds(114, 22, 218, 40);
		contentPane.add(lblNewLabel_1);

		// mostrar resultado
		JTextPane txtpnResultado = new JTextPane();
		txtpnResultado.setText("Resultado:");
		txtpnResultado.setForeground(Color.WHITE);
		txtpnResultado.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		txtpnResultado.setBackground(new Color(238, 83, 83));
		txtpnResultado.setBounds(21, 155, 415, 20);
		contentPane.add(txtpnResultado);

		// cerrar la interfaz con un botón
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH); // comando para cerrar el programa
			}
		});
		btnSalir.setBackground(new Color(255, 255, 255));
		btnSalir.setForeground(new Color(255, 0, 0));
		btnSalir.setFont(new Font("Sylfaen", Font.BOLD, 13));
		btnSalir.setBounds(289, 215, 110, 23);
		contentPane.add(btnSalir);
	}
}
