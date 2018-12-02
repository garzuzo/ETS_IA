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
import javax.swing.JPanel;

import co.edu.icesi.drools.Persona;

public class MainView extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EtsView eView;
	private JButton button;

	private Persona enfermedad;

	public MainView() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(Color.white);
		enfermedad=new Persona();
		eView = new EtsView();
		setLayout(new BorderLayout());
		add(eView, BorderLayout.CENTER);
		JLabel banner=new JLabel(new ImageIcon("./src/main/resources/banner.png"));
		banner.setSize(200, 300);
	banner.setBackground(Color.white);
	JPanel pAux2=new JPanel();
	pAux2.setBackground(Color.WHITE);
	pAux2.add(banner);
		add(pAux2,BorderLayout.NORTH);
		button = new JButton();
		button.setText("Aceptar");
		button.addActionListener(this);
		button.setActionCommand("aceptar");
		JPanel pAux=new JPanel();
		pAux.setLayout(new FlowLayout());
		pAux.add(button);
		pAux.setBackground(Color.white);
		add(pAux, BorderLayout.SOUTH);
		setBackground(Color.white);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainView mv = new MainView();
		
		mv.setVisible(true);
		mv.setSize(1300, 950);

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
