package co.edu.icesi.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import co.edu.icesi.drools.Persona;

public class MainView extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EtsView eView;
	private JButton button;

	private Persona persona;

	public MainView() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(Color.white);

		eView = new EtsView();
		setLayout(new BorderLayout());
		add(eView, BorderLayout.CENTER);
		JLabel banner = new JLabel(new ImageIcon("./src/main/resources/banner.png"));
		banner.setSize(300, 250);
		banner.setBackground(Color.white);
		JPanel pAux2 = new JPanel();
		pAux2.setBackground(Color.WHITE);
		pAux2.add(banner);
		add(pAux2, BorderLayout.NORTH);
		button = new JButton();
		button.setText("Aceptar");
		button.addActionListener(this);
		button.setActionCommand("aceptar");
		JPanel pAux = new JPanel();
		pAux.setLayout(new FlowLayout());
		pAux.add(button);
		pAux.setBackground(Color.white);
		add(pAux, BorderLayout.SOUTH);
		setBackground(Color.white);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainView mv = new MainView();
		JOptionPane.showMessageDialog(null,
				"Por favor marque los sintomas que ha presentado\npara evaluar las posiblidades de tener las\n siguientes enfermedades:\n-Clamidia\n-Gonorrea\n-Hepatitis-B\n-Herpes\n-Tricomoniasis\n-VIH");
		mv.setVisible(true);
		mv.setSize(1340, 950);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String evento = e.getActionCommand();

		if (evento.equals("aceptar")) {
			HashMap<String, String> hm = eView.obtenerDatos();

			persona = new Persona();

			persona.setP(hm);
			persona.cargarDatosAnalisis();
			String analisis = persona.diagnosticarClamidia() + "\n";
			analisis += persona.diagnosticarGonorrea() + "\n";
			analisis += persona.diagnosticarHepatitis() + "\n";
			analisis += persona.diagnosticarHerpes() + "\n";
			analisis += persona.diagnosticarTricomoniasis() + "\n";
			analisis += persona.diagnosticarVIH();
			System.out.println(analisis);
			JOptionPane.showMessageDialog(null, analisis, "Resultados del análisis", JOptionPane.WARNING_MESSAGE);
		}

	}

}
