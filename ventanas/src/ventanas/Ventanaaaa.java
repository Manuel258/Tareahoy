package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventanaaaa extends JFrame {

	JLabel label = new JLabel("Introduce tu nombre");
	JButton button = new JButton("Saludar");
	JTextField textField = new JTextField();
	JLabel greetingLabel = new JLabel();

	public Ventanaaaa(String titulo) {

		super(titulo);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label.setBounds(50, 50, 150, 20);
		textField.setBounds(200, 50, 150, 20);
		button.setBounds(150, 100, 100, 20);
		greetingLabel.setBounds(50, 150, 300, 20);

		
/*ESCUCHA CUANDO SE LE PASA UNA ACCION, EN ESTE CASO EL CLICK AL BOTON*/
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre = textField.getText();
				String saludo = "Chinga tu madre " + nombre;
				greetingLabel.setText(saludo);

			}
		});
		
		MiEvento evento = new MiEvento();
		button.addActionListener(evento);
		textField.addKeyListener(evento);

		this.add(button);
		this.add(textField);
		this.add(label);
		this.add(greetingLabel);

		this.setLayout(null);
		this.setVisible(true);
	}

}
