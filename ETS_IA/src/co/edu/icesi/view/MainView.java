package co.edu.icesi.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainView extends JFrame implements ActionListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EtsView eView;
	private JButton button;
	public MainView() {
		
		eView=new EtsView();
		setLayout(new BorderLayout());
		add(eView,BorderLayout.CENTER);
		button=new JButton();
		button.setText("Aceptar");
		button.addActionListener(this);
		button.setActionCommand("aceptar");
		add(button,BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MainView mv=new MainView();
mv.setVisible(true);
mv.setSize(600, 500);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String evento=e.getActionCommand();
		
		if(evento.equals("aceptar")) {
			HashMap<String,String> hm=eView.obtenerDatos();
			System.out.println("RESULTADOS:");
			for(String act:hm.keySet()) {
				
				System.out.println(act+" "+hm.get(act));
			}
			
		}
	}

}
