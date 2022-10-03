package EjercicioPropuesto23;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;

public class InterfazP23 extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtResultado;

	/**
	 * Create the frame.
	 */
	public InterfazP23() {
		// siempre que sale Bounds son las medidas
		this.setTitle("Ejercicio Propuesto 23"); // poner título a la interfaz
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 399);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(251, 170, 208));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("a"); // ingresar por teclado
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(40, 110, 26, 20);
		contentPane.add(lblNewLabel);

		JLabel lblIngreseValorDe = new JLabel("b"); // ingresar por teclado
		lblIngreseValorDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseValorDe.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		lblIngreseValorDe.setBounds(40, 141, 26, 20);
		contentPane.add(lblIngreseValorDe);

		JLabel lblIngreseValorDe_1 = new JLabel("c"); // ingresar por teclado
		lblIngreseValorDe_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseValorDe_1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		lblIngreseValorDe_1.setBounds(40, 172, 26, 20);
		contentPane.add(lblIngreseValorDe_1);

		txtA = new JTextField();
		txtA.setBounds(76, 107, 86, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);

		txtB = new JTextField();
		txtB.setBounds(76, 138, 86, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);

		txtC = new JTextField();
		txtC.setBounds(76, 172, 86, 20);
		contentPane.add(txtC);
		txtC.setColumns(10);

		// botón para encontrar el algoritmo
		JButton btnDeterminar = new JButton("Calcular");
		btnDeterminar.setForeground(new Color(255, 0, 128));
		btnDeterminar.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 13));
		btnDeterminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double A, B, C, raizpositiva, raiznegativa; // parámetros de la ecuación y respuestas
				// obtener valores ingresados por teclado en la interfaz
				A = Double.parseDouble(txtA.getText());
				B = Double.parseDouble(txtB.getText());
				C = Double.parseDouble(txtC.getText());
				double D = Math.pow(B, 2) - (4 * A * C); // con la fórmula del estudiante
				System.out.println(D); // imprimir el determinante (D)

				// condicional según el valor que tomó el determinante
				if (D < 0) {
					txtResultado.setText(
							"Las soluciones encontradas para la ecuación cuádratica son soluciones complejas.");
				} else if (D == 0) {
					txtResultado.setText(String.valueOf("x = " + MetodosP23.raizCuadrada1(A, B, D)));
				} else {
					raizpositiva = MetodosP23.raizCuadrada2(A, B, D);
					raiznegativa = MetodosP23.raizCuadrada3(A, B, D);
					txtResultado
							.setText("x1 = " + String.valueOf(raizpositiva) + ", x2 = " + String.valueOf(raiznegativa));
				}
			}
		});
		btnDeterminar.setBounds(73, 303, 89, 30);
		contentPane.add(btnDeterminar);

		// para eliminar el contenido de los campos, se inserta un botón de borrar
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setForeground(new Color(255, 0, 128));
		btnBorrar.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 13));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// dejar en blanco los textos ingresados y calculados
				txtA.setText("");
				txtB.setText("");
				txtC.setText("");
				txtResultado.setText("");

			}
		});
		btnBorrar.setBounds(210, 303, 89, 30);
		contentPane.add(btnBorrar);

		// indicador de que abajo aparecen las raices
		JLabel lblNewLabel_10 = new JLabel("Posibles raíces:");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		lblNewLabel_10.setBounds(30, 227, 440, 20);
		contentPane.add(lblNewLabel_10);

		// raices encontradas
		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		txtResultado.setBackground(new Color(251, 170, 208));
		txtResultado.setBounds(52, 258, 407, 31);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);

		// separador
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(244, 17, 125));
		separator.setBounds(30, 68, 440, 13);
		contentPane.add(separator);

		// nombre del programa y lo que permite hacer
		JLabel lblNewLabel_1 = new JLabel("RaizNath");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		lblNewLabel_1.setBounds(195, 11, 106, 23);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Su calculadora para encontrar las raíces de una ecuación cuadrática");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(76, 34, 353, 23);
		contentPane.add(lblNewLabel_1_1);

		// texto para usuario
		JLabel lblNewLabel_1_1_1 = new JLabel("Por favor, ingrese:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(30, 82, 106, 23);
		contentPane.add(lblNewLabel_1_1_1);

		// modelo de ecuación cuadrática
		JLabel lblNewLabel_1_2 = new JLabel("Ecuación cuadrática:");
		lblNewLabel_1_2.setBackground(new Color(248, 114, 177));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(248, 107, 195, 23);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("ax^2+bx+c");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_1_2_1.setBounds(248, 141, 195, 23);
		contentPane.add(lblNewLabel_1_2_1);

		// separador
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(244, 17, 125));
		separator_1.setBounds(30, 203, 440, 13);
		contentPane.add(separator_1);

		// para salir de la interfaz con un botón
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH); // comando para cerrar el programa
			}
		});
		btnCerrar.setForeground(new Color(255, 0, 128));
		btnCerrar.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 13));
		btnCerrar.setBounds(340, 304, 89, 30);
		contentPane.add(btnCerrar);
	}
}
