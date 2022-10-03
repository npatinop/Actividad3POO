package EjercicioResuelto7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class InterfazR7 extends JFrame {

	private JPanel contentPane;
	private JTextField textA;
	private JTextField textB;
	private JTextField textResultado;

	/**
	 * Create the frame.
	 */
	public InterfazR7() {
		this.setTitle("Ejercicio Resuelto 7"); // para título de la interfaz
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300); // dimensiones
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// titulo dentro del panel
		JLabel lblNewLabel = new JLabel("Comparar dos números");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		lblNewLabel.setBounds(40, 33, 352, 32);
		contentPane.add(lblNewLabel);

		// indicador A
		JLabel lblNewLabel_1 = new JLabel("A");
		lblNewLabel_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(40, 98, 46, 14);
		contentPane.add(lblNewLabel_1);

		// indicador B
		JLabel lblNewLabel_2 = new JLabel("B");
		lblNewLabel_2.setForeground(new Color(0, 128, 0));
		lblNewLabel_2.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(247, 98, 46, 14);
		contentPane.add(lblNewLabel_2);

		// donde se ingresa A
		textA = new JTextField();
		textA.setBackground(new Color(128, 255, 128));
		textA.setForeground(new Color(0, 0, 0));
		textA.setHorizontalAlignment(SwingConstants.CENTER);
		textA.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		textA.setBounds(85, 95, 86, 20);
		contentPane.add(textA);
		textA.setColumns(10);

		// donde se ingresa B
		textB = new JTextField();
		textB.setBackground(new Color(128, 255, 128));
		textB.setForeground(new Color(0, 0, 0));
		textB.setHorizontalAlignment(SwingConstants.CENTER);
		textB.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		textB.setText("");
		textB.setBounds(286, 95, 86, 20);
		contentPane.add(textB);
		textB.setColumns(10);

		// crear botón comparación
		JButton btnComparar = new JButton("Comparar");
		btnComparar.setFont(new Font("Kristen ITC", Font.BOLD, 13));
		btnComparar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// definir variables
					double A;
					double B;

					// leerlas de los valores ingresados por el usuario
					A = Double.parseDouble(textA.getText());
					B = Double.parseDouble(textB.getText());

					// condicional
					if (MetodosR7.comparar(A, B) == A) {
						textResultado.setText("A es mayor que B");
					} else if (MetodosR7.comparar(A, B) == B) {
						textResultado.setText("B es mayor que A");
					} else {
						textResultado.setText("A es igual a B");
						;
					}
				}
				// excepciones
				catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Los valores de A y B ingresados, no son numéricos");
				}
			}
		});
		btnComparar.setBounds(62, 215, 109, 23);
		contentPane.add(btnComparar);

		// lugar para que aparezca el resultado
		textResultado = new JTextField();
		textResultado.setBackground(new Color(128, 255, 128));
		textResultado.setForeground(new Color(0, 0, 0));
		textResultado.setHorizontalAlignment(SwingConstants.CENTER);
		textResultado.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		textResultado.setBounds(85, 158, 256, 32);
		contentPane.add(textResultado);
		textResultado.setColumns(10);

		// indicador resultado
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setForeground(new Color(0, 128, 0));
		lblNewLabel_3.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(179, 132, 69, 14);
		contentPane.add(lblNewLabel_3);

		// eliminar los valores ingresados y obtenidos
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Kristen ITC", Font.BOLD, 13));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// dejar espacios en blanco
				textResultado.setText("");
				textA.setText("");
				textB.setText("");
			}
		});
		btnBorrar.setBounds(181, 215, 89, 23);
		contentPane.add(btnBorrar);

		// botón para cerrar interfaz
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH); // comando para cerrar el programa
			}
		});
		btnSalir.setFont(new Font("Kristen ITC", Font.BOLD, 13));
		btnSalir.setBounds(280, 216, 89, 23);
		contentPane.add(btnSalir);
	}
}
