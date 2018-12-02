package co.edu.icesi.model;

import java.util.ArrayList;

public class ETS {

	
	String nombre;
	String id;

	ArrayList<String> sintomas;

	public void ETS(String nombre, String id, ArrayList<String> sintomas) {
		this.nombre = nombre;
		this.id = id;
		this.sintomas = sintomas;

	}

}
