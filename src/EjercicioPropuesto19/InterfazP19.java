package EjercicioPropuesto19;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class InterfazP19 extends JFrame {

	private JPanel contentPane;
	private JTextField txtLado;
	private JTextField txtPerimetro;
	private JTextField txtArea;

	/**
	 * Create the frame.
	 */
	public InterfazP19() {
		// siempre que sale Bounds son las medidas
		this.setTitle("Ejercicio Propuesto 19"); // poner título a la interfaz
		// setBounds son medidas
		// setBackground son el color de fondo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 352);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Lado del triángulo"); // espacio creado para indicar lo que se debe ingresar
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 13)); // tipo de letra y tamaño
		lblNewLabel.setBounds(43, 74, 139, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Perímetro"); // resultado del perímetro, indicación
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(70, 136, 83, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Altura"); // resultado de la altura, indicación
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER); // tipo de letra y tamaño
		lblNewLabel_2.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(70, 192, 83, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Área"); // resultado del area, indicación
		lblNewLabel_3.setFont(new Font("Stencil", Font.PLAIN, 13)); // tipo de letra y tamaño
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(87, 248, 46, 14);
		contentPane.add(lblNewLabel_3);

		// los valores siguientes son para ingresar los datos por teclado
		txtLado = new JTextField();
		txtLado.setHorizontalAlignment(SwingConstants.LEFT);
		txtLado.setFont(new Font("Stencil", Font.PLAIN, 13));
		txtLado.setBounds(192, 70, 168, 20);
		contentPane.add(txtLado);
		txtLado.setColumns(10);

		txtPerimetro = new JTextField();
		txtPerimetro.setHorizontalAlignment(SwingConstants.CENTER);
		txtPerimetro.setFont(new Font("Stencil", Font.PLAIN, 13));
		txtPerimetro.setColumns(10);
		txtPerimetro.setBounds(24, 161, 168, 20);
		contentPane.add(txtPerimetro);

		JTextField txtAltura = new JTextField();
		txtAltura.setHorizontalAlignment(SwingConstants.CENTER);
		txtAltura.setFont(new Font("Stencil", Font.PLAIN, 13));
		txtAltura.setColumns(10);
		txtAltura.setBounds(24, 217, 168, 20);
		contentPane.add(txtAltura);

		txtArea = new JTextField();
		txtArea.setHorizontalAlignment(SwingConstants.CENTER);
		txtArea.setFont(new Font("Stencil", Font.PLAIN, 13));
		txtArea.setColumns(10);
		txtArea.setBounds(24, 273, 168, 20);
		contentPane.add(txtArea);

		// para el boton de calcular
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(new Color(255, 128, 0));
		btnCalcular.setFont(new Font("Stencil", Font.ITALIC, 13));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double lado;
				try {
					// obtener el valor que entró el usuario
					lado = Double.parseDouble(txtLado.getText());
					// mostrar los resultados
					txtPerimetro.setText(String.valueOf(MetodosP19.calcularPerimetro(lado)));
					txtAltura.setText(String.valueOf(MetodosP19.calcularAltura(lado)));
					txtArea.setText(String.valueOf(MetodosP19.calcularArea(lado)));
				}
				// excepciones cuando ingresan un lado que NO es numérico
				catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"El parámetro ingresado no es un valor numérico, intente de nuevo.");
				}
			}
		});
		btnCalcular.setBounds(290, 157, 112, 30);
		contentPane.add(btnCalcular);

		// para el botón de borrar que elimina el contenido de todos los campos de la
		// interfaz
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBackground(new Color(255, 128, 0));
		btnBorrar.setFont(new Font("Stencil", Font.ITALIC, 13));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// dejar los espacios en blanco
				txtPerimetro.setText("");
				txtAltura.setText("");
				txtArea.setText("");
				txtLado.setText("");
			}
		});
		btnBorrar.setBounds(290, 213, 112, 30);
		contentPane.add(btnBorrar);

		// un separaddor pero creado de manera manual
		JLabel lblNewLabel_4 = new JLabel(
				"Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ Δ");
		lblNewLabel_4.setForeground(new Color(255, 128, 0));
		lblNewLabel_4.setBackground(new Color(240, 240, 240));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(24, 95, 432, 30);
		contentPane.add(lblNewLabel_4);

		// titulo dentro del panel de la interfaz
		JLabel lblNewLabel_5 = new JLabel("Cálculos para un triángulo equilátero");
		lblNewLabel_5.setFont(new Font("Stencil", Font.PLAIN, 19));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(37, 25, 419, 35);
		contentPane.add(lblNewLabel_5);

		// para cerrar la calculadora mediante un botón
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH); // comando para cerrar el programa
			}
		});
		btnSalir.setFont(new Font("Stencil", Font.ITALIC, 13));
		btnSalir.setBackground(new Color(255, 128, 0));
		btnSalir.setBounds(290, 269, 112, 30);
		contentPane.add(btnSalir);
	}

}
