package co.edu.icesi.drools;

import java.util.HashMap;

public class Enfermedad {

	private HashMap<String,String> p;
	
	private String nombrePersona;
	
	private String fiebre;
	private String flujo;
	private String sangrado;
	public Enfermedad() {
		
		
		
	}
	public void cargarDatosAnalisis() {
		fiebre=p.get("fiebre");
		flujo=p.get("flujo");
		sangrado=p.get("sangrado");
	}
	public HashMap<String, String> getP() {
		return p;
	}
	public void setP(HashMap<String, String> p) {
		this.p = p;
	}
	
}
