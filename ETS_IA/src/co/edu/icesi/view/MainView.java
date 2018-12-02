package co.edu.icesi.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import co.edu.icesi.drools.Enfermedad;

public class MainView extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EtsView eView;
	private JButton button;

	private Enfermedad enfermedad;

	public MainView() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		eView = new EtsView();
		setLayout(new BorderLayout());
		add(eView, BorderLayout.CENTER);
		JLabel banner=new JLabel(new ImageIcon("./src/banner.png"));
		banner.setSize(200, 300);
	
		add(banner,BorderLayout.NORTH);
		button = new JButton();
		button.setText("Aceptar");
		button.addActionListener(this);
		button.setActionCommand("aceptar");
		add(button, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainView mv = new MainView();
		mv.setVisible(true);
		mv.setSize(900, 800);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String evento = e.getActionCommand();

		if (evento.equals("aceptar")) {
			HashMap<String, String> hm = eView.obtenerDatos();
			System.out.println("RESULTADOS:");
			for (String act : hm.keySet()) {

				System.out.println(act + " " + hm.get(act));
			}
			enfermedad.setP(hm);
			enfermedad.cargarDatosAnalisis();
		}

	}

}
