package EjercicioPropuesto18;

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
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;

public class InterfazP18 extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNombre;
	private JTextField textHoras;
	private JTextField textValorHora;
	private JTextField textPorcentajeRetencion;
	private JTextField textSalarioBruto;
	private JTextField textSalarioNeto;

	/**
	 * Create the frame.
	 */
	public InterfazP18() {
		// siempre que sale Bounds son las medidas
		this.setTitle("Ejercicio Propuesto 18"); // poner título a la interfaz
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 394);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 227, 179)); // color del fondo de la interfaz
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// donde se indica setFont es el tipo de letra y el tamaño
		JLabel lblNewLabel = new JLabel("Código"); // indicador
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 13));
		lblNewLabel.setBounds(35, 101, 89, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre"); // indicador
		lblNewLabel_1.setFont(new Font("Rockwell", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(35, 138, 89, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Número de horas trabajadas"); // indicador
		lblNewLabel_2.setFont(new Font("Rockwell", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(35, 180, 179, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Valor por hora trabajada ($)"); // indicador
		lblNewLabel_3.setFont(new Font("Rockwell", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(35, 214, 179, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Retencion(%)"); // indicador
		lblNewLabel_4.setFont(new Font("Rockwell", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(35, 256, 89, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Salario bruto ($)"); // indicador
		lblNewLabel_5.setFont(new Font("Rockwell", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(366, 138, 114, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Salario neto ($)"); // indicador
		lblNewLabel_6.setFont(new Font("Rockwell", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(366, 214, 114, 14);
		contentPane.add(lblNewLabel_6);

		textCodigo = new JTextField(); // ingresar por teclado
		textCodigo.setFont(new Font("Rockwell", Font.PLAIN, 12));
		textCodigo.setBounds(134, 98, 211, 20);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);

		textNombre = new JTextField(); // ingresar por teclado
		textNombre.setFont(new Font("Rockwell", Font.PLAIN, 12));
		textNombre.setColumns(10);
		textNombre.setBounds(134, 135, 211, 20);
		contentPane.add(textNombre);

		textHoras = new JTextField(); // ingresar por teclado
		textHoras.setFont(new Font("Rockwell", Font.PLAIN, 12));
		textHoras.setColumns(10);
		textHoras.setBounds(242, 177, 103, 20);
		contentPane.add(textHoras);

		textValorHora = new JTextField(); // ingresar por teclado
		textValorHora.setFont(new Font("Rockwell", Font.PLAIN, 12));
		textValorHora.setColumns(10);
		textValorHora.setBounds(242, 211, 103, 20);
		contentPane.add(textValorHora);

		textPorcentajeRetencion = new JTextField(); // ingresar por teclado
		textPorcentajeRetencion.setFont(new Font("Rockwell", Font.PLAIN, 12));
		textPorcentajeRetencion.setColumns(10);
		textPorcentajeRetencion.setBounds(134, 253, 211, 20);
		contentPane.add(textPorcentajeRetencion);

		textSalarioBruto = new JTextField(); // calculado
		textSalarioBruto.setFont(new Font("Rockwell", Font.PLAIN, 12));
		textSalarioBruto.setColumns(10);
		textSalarioBruto.setBounds(490, 136, 186, 20);
		contentPane.add(textSalarioBruto);

		textSalarioNeto = new JTextField(); // calculado
		textSalarioNeto.setFont(new Font("Rockwell", Font.PLAIN, 12));
		textSalarioNeto.setColumns(10);
		textSalarioNeto.setBounds(490, 212, 186, 20);
		contentPane.add(textSalarioNeto);

		// definición del botón calcular que permite efectuar las operaciones
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(new Color(165, 205, 120));
		btnCalcular.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// para determinar el salario bruto y salario neto
				try {
					double horas, valorHora, porcentajeRetenido, salarioRetenido, salarioBruto; // tipo
					// tomar entradas y cálculos hechos con los métodos
					horas = Double.parseDouble(textHoras.getText());
					valorHora = Double.parseDouble(textValorHora.getText());
					porcentajeRetenido = Double.parseDouble(textPorcentajeRetencion.getText());
					textSalarioBruto.setText(String.valueOf(MetodosP18.metodoSalarioBruto(horas, valorHora)));
					salarioBruto = MetodosP18.metodoSalarioBruto(horas, valorHora);
					salarioRetenido = MetodosP18.metodoSalarioRetenido(horas, valorHora, porcentajeRetenido);
					textSalarioNeto
							.setText(String.valueOf(MetodosP18.metodoSalarioNeto(salarioRetenido, salarioBruto)));
				}
				// para excepciones
				catch (NumberFormatException ex) {
					// en caso de que se ingresen valores que no sean apropiados, no se puede hacer
					// el programa
					JOptionPane.showMessageDialog(null,
							"Los parámetros ingresados no concuerdan con lo solicitado, intente de nuevo.");
				}
			}
		});
		btnCalcular.setBounds(182, 304, 89, 23); // botón para presionar y determinar el salario bruto y salario neto
		contentPane.add(btnCalcular);

		JButton btnBorrar = new JButton("Borrar"); // botón para eliminar el contenido de los campos
		btnBorrar.setBackground(new Color(165, 205, 120));
		btnBorrar.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 12));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// borra el contenido de todos los campos ingresados o entregados (JField)
				textSalarioBruto.setText("");
				textSalarioNeto.setText("");
				textCodigo.setText("");
				textNombre.setText("");
				textHoras.setText("");
				textPorcentajeRetencion.setText("");
				textValorHora.setText("");
			}
		});
		btnBorrar.setBounds(292, 304, 89, 23);
		contentPane.add(btnBorrar);

		// los dos JLabel siguientes son para hacer más estética la interfaz
		JLabel lblNewLabel_7 = new JLabel("Empresa Chimuelito S.A.\r\n");
		lblNewLabel_7.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 16));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(192, 48, 308, 20);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_7_1 = new JLabel("Base de datos nómina");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 20));
		lblNewLabel_7_1.setBounds(182, 17, 308, 20);
		contentPane.add(lblNewLabel_7_1);

		JTextPane txtpnUstedRecibir = new JTextPane();
		txtpnUstedRecibir.setFont(new Font("Rockwell", Font.PLAIN, 13));
		txtpnUstedRecibir.setText("Usted recibirá:");
		txtpnUstedRecibir.setBackground(new Color(0, 128, 64));
		txtpnUstedRecibir.setBounds(459, 174, 93, 20);
		contentPane.add(txtpnUstedRecibir);

		// para que el usuario pueda salir de la interfaz
		JButton btnSalir = new JButton("Cerrar");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH); // comando para cerrar el programa
			}
		});
		btnSalir.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 12));
		btnSalir.setBackground(new Color(165, 205, 120));
		btnSalir.setBounds(411, 305, 89, 23);
		contentPane.add(btnSalir);
		// siempre que aparece setBounds son las medidas que ocupa cada aspecto en el
		// panel
	}
}
