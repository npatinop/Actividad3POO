package EjercicioPropuesto22;

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
import javax.swing.JTextPane;

public class InterfazP22 extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textSalario;
	private JTextField textHoras;
	private JTextField textResultado;

	/**
	 * Create the frame.
	 */
	public InterfazP22() { // muestra en ventana
		// siempre que sale Bounds son las medidas
		this.setTitle("Ejercicio Propuesto 22"); // poner título a la interfaz
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 331);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 193, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombre"); // indicador de nombre
		lblNewLabel.setFont(new Font("SimSun-ExtB", Font.BOLD, 13));
		lblNewLabel.setBounds(33, 39, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblSalarioPorHora = new JLabel("Salario por hora ($)"); // indicador de salario
		lblSalarioPorHora.setFont(new Font("SimSun-ExtB", Font.BOLD, 13));
		lblSalarioPorHora.setBounds(33, 64, 187, 14);
		contentPane.add(lblSalarioPorHora);

		JLabel lblCantidadHorasTrabajadas = new JLabel("Cantidad de horas trabajadas (mes)"); // indicador horas
																								// trabajadas
		lblCantidadHorasTrabajadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidadHorasTrabajadas.setFont(new Font("SimSun-ExtB", Font.BOLD, 13));
		lblCantidadHorasTrabajadas.setBounds(33, 89, 339, 14);
		contentPane.add(lblCantidadHorasTrabajadas);

		textNombre = new JTextField(); // ingreso valor por teclado
		textNombre.setBounds(140, 36, 258, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);

		textSalario = new JTextField(); // ingreso valor por teclado
		textSalario.setColumns(10);
		textSalario.setBounds(236, 61, 162, 20);
		contentPane.add(textSalario);

		textHoras = new JTextField(); // ingreso valor por teclado
		textHoras.setColumns(10);
		textHoras.setBounds(140, 114, 162, 20);
		contentPane.add(textHoras);

		textResultado = new JTextField(); // salida del resultado en espacio de texto
		textResultado.setHorizontalAlignment(SwingConstants.CENTER);
		textResultado.setFont(new Font("SimSun", Font.BOLD, 13));
		textResultado.setForeground(new Color(255, 255, 255));
		textResultado.setBackground(new Color(64, 0, 64));
		textResultado.setBounds(33, 187, 365, 28);
		contentPane.add(textResultado);
		textResultado.setColumns(10);

		// para el botón de calcular que determina los valores requeridos
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("SimSun", Font.BOLD, 14));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double salarioHora; // por hora
					String nombre; // del empleado
					double horasMes; // trabajadas mensuales

					// capturar valores ingresados
					nombre = textNombre.getText();
					salarioHora = Double.parseDouble(textSalario.getText());
					horasMes = Double.parseDouble(textHoras.getText());

					// condicional para saber lo que se debe imprimir
					if (MetodosP22.determinarPago(salarioHora, horasMes) == 0) {
						textResultado.setText(nombre); // solo entrega el nombre
					} else {
						textResultado
								.setText(nombre + " su salario es " + MetodosP22.determinarPago(salarioHora, horasMes));
						; // si el pago es mayor a 450 mil
					}
				} catch (NumberFormatException ex) {
					// en caso de que se ingresen valores que no sean numéricos, no se puede hacer
					// el programa
					JOptionPane.showMessageDialog(null,
							"Los parámetros ingresados no son valores numéricos, intente de nuevo.");
				}
			}
		});
		btnCalcular.setBounds(33, 226, 117, 35);
		contentPane.add(btnCalcular);

		JButton btnLimpiar = new JButton("Limpiar"); // botón para volver a rellenar campos
		btnLimpiar.setFont(new Font("SimSun", Font.BOLD, 14));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// eliminar el contenido de los cambos ingresados y entregados(resultado)
				textResultado.setText("");
				textSalario.setText("");
				textNombre.setText("");
				textHoras.setText("");
			}
		});
		btnLimpiar.setBounds(160, 226, 117, 35);
		contentPane.add(btnLimpiar);

		// de acá en adelante, son partes que se añaden para hacer más amigable la
		// interfaz con el usuario
		JLabel lblNewLabel_1 = new JLabel("Información para empleados");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SimSun", Font.BOLD, 18));
		lblNewLabel_1.setBounds(73, 11, 263, 23);
		contentPane.add(lblNewLabel_1);

		JTextPane txtpnAContinuacinPuede = new JTextPane(); // explicación del ejercicio
		txtpnAContinuacinPuede.setFont(new Font("SimSun", Font.BOLD, 11));
		txtpnAContinuacinPuede.setText(
				"A continuación puede ver el salario que recibirá siempre y cuando el resultado sea mayor a $450.000:");
		txtpnAContinuacinPuede.setBounds(33, 146, 365, 35);
		contentPane.add(txtpnAContinuacinPuede);

		// para que el empleado pueda cerrar la interfaz mediante un botón
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH); // comando para cerrar el programa
			}
		});
		btnCerrar.setFont(new Font("SimSun", Font.BOLD, 14));
		btnCerrar.setBounds(287, 226, 117, 35);
		contentPane.add(btnCerrar);
	}
}
