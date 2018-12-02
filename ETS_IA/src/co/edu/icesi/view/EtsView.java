package co.edu.icesi.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import javafx.scene.control.RadioButton;

public class EtsView extends JPanel {

	public static String route = "./src/datos.txt";

	public ArrayList<BotonesEnfermedad> arr;
	public int numColumns;

	public EtsView() {

		numColumns = 2;

		arr = new ArrayList<BotonesEnfermedad>();
		cargarDatos();
		setLayout(new GridLayout(arr.size(), numColumns + 1));
		for (int i = 0; i < arr.size(); i++) {

			BotonesEnfermedad beAct = arr.get(i);

			add(beAct.descr);

			for (int j = 0; j < beAct.arrRD.size(); j++) {

				// ButtonGroup bgAct=beAct.bg;
				JRadioButton rbAct = beAct.arrRD.get(j);

				add(rbAct);

			}
			for (int j = beAct.arrRD.size(); j <= numColumns; j++) {
				add(new JLabel(" "));
			}

		}

	}

	public HashMap<String, String> obtenerDatos() {

		HashMap<String, String> hm = new HashMap<String, String>();

		for (int i = 0; i < arr.size(); i++) {

			BotonesEnfermedad beAct = arr.get(i);

			for (int j = 0; j < beAct.arrRD.size(); j++) {

				// ButtonGroup bgAct=beAct.bg;
				JRadioButton rbAct = beAct.arrRD.get(j);

				if (rbAct.isSelected()) {
					String valorSintoma = rbAct.getText();
					hm.put(beAct.id, valorSintoma);

				}
			}

		}

		return hm;

	}

	public void cargarDatos() {

		try {
			BufferedReader in = new BufferedReader(new FileReader(route));
			String act;
			while ((act = in.readLine()) != null) {

				String[] arr = act.split(";");

				BotonesEnfermedad beAct = new BotonesEnfermedad();

				String descripcion = arr[0];
				beAct.descr.setText(descripcion);
				String id = arr[1];
				beAct.id = id;
				beAct.numOpciones= arr.length - 2;
				if (beAct.numOpciones > numColumns)
					numColumns = beAct.numOpciones;
				for (int i = 2; i < arr.length; i++) {
					String sintomaActual = arr[i];
					beAct.arrRD.add(new JRadioButton(sintomaActual));
				}
				beAct.agregarABG();

				this.arr.add(beAct);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static class BotonesEnfermedad {

		JLabel descr;
		String id;
		ArrayList<JRadioButton> arrRD;
		ButtonGroup bg;
		//Si,No(2)-Normal,Fuerte,Leve(3)
		int numOpciones;

		public BotonesEnfermedad() {
			descr = new JLabel();
			arrRD = new ArrayList<JRadioButton>();
			bg = new ButtonGroup();
		}

		public void agregarABG() {

			for (int i = 0; i < arrRD.size(); i++) {
				if (i == 0)
					arrRD.get(i).setSelected(true);
				bg.add(arrRD.get(i));
			}
		}

	}
}
