package EjercicioPropuesto40;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.FormatterClosedException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class InterfazP40 extends JFrame {
	private JPanel contentPane;
	private JTextField text3;
	private JTextField text1;
	private JTextField text2;
	private JTextField text4;
	private JTextField text5;
	private JTextField text6;
	private JTextField text7;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField textR1;
	private JTextField textP21;
	private JTextField textP31;
	private JTextField textR2;
	private JTextField textP22;
	private JTextField textP32;
	private JTextField textR3;
	private JTextField textP23;
	private JTextField textP33;
	private JTextField textR4;
	private JTextField textP24;
	private JTextField textP34;
	private JTextField textR5;
	private JTextField textP25;
	private JTextField textP35;
	private JTextField textR6;
	private JTextField textP26;
	private JTextField textP36;
	private JTextField textR7;
	private JTextField textP27;
	private JTextField textP37;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_11;
	private JButton btnCerrar;
	private JSeparator separator;
	private JLabel lblNewLabel_10;

	/**
	 * Create the frame.
	 */
	public InterfazP40() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 432);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(174, 174, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("7");
		lblNewLabel_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setBounds(33, 277, 83, 14);
		contentPane.add(lblNewLabel_6);

		text3 = new JTextField();
		text3.setHorizontalAlignment(SwingConstants.CENTER);
		text3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		text3.setColumns(10);
		text3.setBounds(126, 152, 86, 20);
		contentPane.add(text3);

		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(43, 92, 73, 14);
		contentPane.add(lblNewLabel);

		text1 = new JTextField();
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		text1.setColumns(10);
		text1.setBounds(126, 90, 86, 20);
		contentPane.add(text1);

		text2 = new JTextField();
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		text2.setColumns(10);
		text2.setBounds(126, 121, 86, 20);
		contentPane.add(text2);

		text4 = new JTextField();
		text4.setHorizontalAlignment(SwingConstants.CENTER);
		text4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		text4.setColumns(10);
		text4.setBounds(126, 183, 86, 20);
		contentPane.add(text4);

		text5 = new JTextField();
		text5.setHorizontalAlignment(SwingConstants.CENTER);
		text5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		text5.setColumns(10);
		text5.setBounds(126, 214, 86, 20);
		contentPane.add(text5);

		text6 = new JTextField();
		text6.setHorizontalAlignment(SwingConstants.CENTER);
		text6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		text6.setColumns(10);
		text6.setBounds(126, 244, 86, 20);
		contentPane.add(text6);

		text7 = new JTextField();
		text7.setHorizontalAlignment(SwingConstants.CENTER);
		text7.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		text7.setColumns(10);
		text7.setBounds(126, 275, 86, 20);
		contentPane.add(text7);

		lblNewLabel_7 = new JLabel("RAÍZ CUADRADA");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		lblNewLabel_7.setBounds(222, 64, 125, 14);
		contentPane.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("POTENCIA CUADRADA");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		lblNewLabel_8.setBounds(357, 64, 145, 14);
		contentPane.add(lblNewLabel_8);

		lblNewLabel_9 = new JLabel("POTENCIA CÚBICA");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		lblNewLabel_9.setBounds(516, 64, 117, 14);
		contentPane.add(lblNewLabel_9);

		textR1 = new JTextField();
		textR1.setHorizontalAlignment(SwingConstants.CENTER);
		textR1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textR1.setColumns(10);
		textR1.setBounds(241, 90, 86, 20);
		contentPane.add(textR1);

		textP21 = new JTextField();
		textP21.setHorizontalAlignment(SwingConstants.CENTER);
		textP21.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP21.setColumns(10);
		textP21.setBounds(388, 90, 86, 20);
		contentPane.add(textP21);

		textP31 = new JTextField();
		textP31.setHorizontalAlignment(SwingConstants.CENTER);
		textP31.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP31.setColumns(10);
		textP31.setBounds(526, 90, 86, 20);
		contentPane.add(textP31);

		textR2 = new JTextField();
		textR2.setHorizontalAlignment(SwingConstants.CENTER);
		textR2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textR2.setColumns(10);
		textR2.setBounds(241, 121, 86, 20);
		contentPane.add(textR2);

		textP22 = new JTextField();
		textP22.setHorizontalAlignment(SwingConstants.CENTER);
		textP22.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP22.setColumns(10);
		textP22.setBounds(388, 121, 86, 20);
		contentPane.add(textP22);

		textP32 = new JTextField();
		textP32.setHorizontalAlignment(SwingConstants.CENTER);
		textP32.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP32.setColumns(10);
		textP32.setBounds(526, 121, 86, 20);
		contentPane.add(textP32);

		textR3 = new JTextField();
		textR3.setHorizontalAlignment(SwingConstants.CENTER);
		textR3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textR3.setColumns(10);
		textR3.setBounds(241, 152, 86, 20);
		contentPane.add(textR3);

		textP23 = new JTextField();
		textP23.setHorizontalAlignment(SwingConstants.CENTER);
		textP23.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP23.setColumns(10);
		textP23.setBounds(388, 152, 86, 20);
		contentPane.add(textP23);

		textP33 = new JTextField();
		textP33.setHorizontalAlignment(SwingConstants.CENTER);
		textP33.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP33.setColumns(10);
		textP33.setBounds(526, 152, 86, 20);
		contentPane.add(textP33);

		textR4 = new JTextField();
		textR4.setHorizontalAlignment(SwingConstants.CENTER);
		textR4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textR4.setColumns(10);
		textR4.setBounds(241, 183, 86, 20);
		contentPane.add(textR4);

		textP24 = new JTextField();
		textP24.setHorizontalAlignment(SwingConstants.CENTER);
		textP24.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP24.setColumns(10);
		textP24.setBounds(388, 183, 86, 20);
		contentPane.add(textP24);

		textP34 = new JTextField();
		textP34.setHorizontalAlignment(SwingConstants.CENTER);
		textP34.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP34.setColumns(10);
		textP34.setBounds(526, 183, 86, 20);
		contentPane.add(textP34);

		textR5 = new JTextField();
		textR5.setHorizontalAlignment(SwingConstants.CENTER);
		textR5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textR5.setColumns(10);
		textR5.setBounds(241, 214, 86, 20);
		contentPane.add(textR5);

		textP25 = new JTextField();
		textP25.setHorizontalAlignment(SwingConstants.CENTER);
		textP25.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP25.setColumns(10);
		textP25.setBounds(388, 214, 86, 20);
		contentPane.add(textP25);

		textP35 = new JTextField();
		textP35.setHorizontalAlignment(SwingConstants.CENTER);
		textP35.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP35.setColumns(10);
		textP35.setBounds(526, 214, 86, 20);
		contentPane.add(textP35);

		textR6 = new JTextField();
		textR6.setHorizontalAlignment(SwingConstants.CENTER);
		textR6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textR6.setColumns(10);
		textR6.setBounds(241, 244, 86, 20);
		contentPane.add(textR6);

		textP26 = new JTextField();
		textP26.setHorizontalAlignment(SwingConstants.CENTER);
		textP26.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP26.setColumns(10);
		textP26.setBounds(388, 244, 86, 20);
		contentPane.add(textP26);

		textP36 = new JTextField();
		textP36.setHorizontalAlignment(SwingConstants.CENTER);
		textP36.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP36.setColumns(10);
		textP36.setBounds(526, 244, 86, 20);
		contentPane.add(textP36);

		textR7 = new JTextField();
		textR7.setHorizontalAlignment(SwingConstants.CENTER);
		textR7.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textR7.setColumns(10);
		textR7.setBounds(241, 275, 86, 20);
		contentPane.add(textR7);

		textP27 = new JTextField();
		textP27.setHorizontalAlignment(SwingConstants.CENTER);
		textP27.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP27.setColumns(10);
		textP27.setBounds(388, 275, 86, 20);
		contentPane.add(textP27);

		textP37 = new JTextField();
		textP37.setHorizontalAlignment(SwingConstants.CENTER);
		textP37.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		textP37.setColumns(10);
		textP37.setBounds(526, 275, 86, 20);
		contentPane.add(textP37);

		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// determinar los valores necesarios
				try {
					double numero;
					if (text1.getText() != "") {

						numero = Double.parseDouble(text1.getText());
						textR1.setText(String.valueOf(MetodosP40.raiz(numero)));
						textP21.setText(String.valueOf(MetodosP40.potencia2(numero)));
						textP31.setText(String.valueOf(MetodosP40.potencia3(numero)));
					}

					if (text2.getText() != "") {
						// leer lo ingresado por teclado en el número 2
						numero = Double.parseDouble(text2.getText());
						//// mostrar resultados en los campos del número 2
						textR2.setText(String.valueOf(MetodosP40.raiz(numero)));
						textP22.setText(String.valueOf(MetodosP40.potencia2(numero)));
						textP32.setText(String.valueOf(MetodosP40.potencia3(numero)));
					}

					if (text3.getText() != "") {
						// leer lo ingresado por teclado en el número 3
						numero = Double.parseDouble(text3.getText());
						// mostrar resultados en los campos del número 3
						textR3.setText(String.valueOf(MetodosP40.raiz(numero)));
						textP23.setText(String.valueOf(MetodosP40.potencia2(numero)));
						textP33.setText(String.valueOf(MetodosP40.potencia3(numero)));
					}

					if (text4.getText() != "") {
						// leer lo ingresado por teclado en el número 4
						numero = Double.parseDouble(text4.getText());
						//// mostrar resultados en los campos del número 4
						textR4.setText(String.valueOf(MetodosP40.raiz(numero)));
						textP24.setText(String.valueOf(MetodosP40.potencia2(numero)));
						textP34.setText(String.valueOf(MetodosP40.potencia3(numero)));
					}

					if (text5.getText() != "") {
						// leer lo ingresado por teclado en el número 5
						numero = Double.parseDouble(text5.getText());
						// mostrar resultados en los campos del número 5
						textR5.setText(String.valueOf(MetodosP40.raiz(numero)));
						textP25.setText(String.valueOf(MetodosP40.potencia2(numero)));
						textP35.setText(String.valueOf(MetodosP40.potencia3(numero)));
					}

					if (text6.getText() != "") {
						// leer lo ingresado por teclado en el número 6
						numero = Double.parseDouble(text6.getText());
						// mostrar resultados en los campos del número 6
						textR6.setText(String.valueOf(MetodosP40.raiz(numero)));
						textP26.setText(String.valueOf(MetodosP40.potencia2(numero)));
						textP36.setText(String.valueOf(MetodosP40.potencia3(numero)));
					}

					if (text7.getText() != "") {
						// leer lo ingresado por teclado en el número 7
						numero = Double.parseDouble(text7.getText());
						// mostrar resultados en los campos del número 7
						textR7.setText(String.valueOf(MetodosP40.raiz(numero)));
						textP27.setText(String.valueOf(MetodosP40.potencia2(numero)));
						textP37.setText(String.valueOf(MetodosP40.potencia3(numero)));
					}
				} catch (NumberFormatException ex) {
					// en caso de excepciones, no se pueden hacer las operaciones
					JOptionPane.showMessageDialog(null,
							"Complete todos los campos o verifique que los valores ingresados sí sean números.");

				}
			}
		});
		btnNewButton.setBounds(328, 324, 110, 23);
		contentPane.add(btnNewButton);

		// volver a escribir los 7 números eliminando lo ingresado con un botón
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setBackground(new Color(0, 0, 255));
		btnBorrar.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// eliminar el contenido de los campos
				textR1.setText("");
				textP21.setText("");
				textP31.setText("");

				textR2.setText("");
				textP22.setText("");
				textP32.setText("");

				textR3.setText("");
				textP23.setText("");
				textP33.setText("");

				textR4.setText("");
				textP24.setText("");
				textP34.setText("");

				textR5.setText("");
				textP25.setText("");
				textP35.setText("");

				textR6.setText("");
				textP26.setText("");
				textP36.setText("");

				textR7.setText("");
				textP27.setText("");
				textP37.setText("");

				text1.setText("");
				text2.setText("");
				text3.setText("");
				text4.setText("");
				text5.setText("");
				text6.setText("");
				text7.setText("");
			}
		});
		btnBorrar.setBounds(219, 324, 89, 23);
		contentPane.add(btnBorrar);

		// el indicativo de cada número
		lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(33, 123, 83, 14);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("3");
		lblNewLabel_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 154, 104, 14);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("4");
		lblNewLabel_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(33, 185, 83, 14);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("5");
		lblNewLabel_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(33, 216, 83, 14);
		contentPane.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("6");
		lblNewLabel_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(33, 246, 83, 14);
		contentPane.add(lblNewLabel_5);

		// encabezado
		lblNewLabel_11 = new JLabel("NÚMERO");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		lblNewLabel_11.setBounds(126, 65, 86, 14);
		contentPane.add(lblNewLabel_11);

		// para cerrar la calculadora con un botón
		btnCerrar = new JButton("CERRAR");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH); // comando para cerrar el programa
			}
		});
		btnCerrar.setBackground(new Color(0, 0, 255));
		btnCerrar.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
		btnCerrar.setBounds(457, 324, 89, 23);
		contentPane.add(btnCerrar);

		// para poner estética la interfaz
		separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 255));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(53, 64, 2, 283);
		contentPane.add(separator);

		lblNewLabel_10 = new JLabel("RAÍZ CUADRADA, POTENCIA CUADRADA Y POTENCIA CÚBICA DE UN GRUPO DE 7 NÚMEROS");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 13));
		lblNewLabel_10.setBounds(53, 21, 580, 14);
		contentPane.add(lblNewLabel_10);

	}
}
