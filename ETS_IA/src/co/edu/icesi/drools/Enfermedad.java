package co.edu.icesi.drools;

import java.util.HashMap;

public class Enfermedad {

	private HashMap<String,String> p;
	
	private String nombrePersona;
	
	private String fiebre;
	private String flujo;
	private String sangrado;
	
	private String dolorOrinar;
	private String SecrecionPene;
	private String dolorSexo;
	public Enfermedad() {
		
		
		
	}
	public void cargarDatosAnalisis() {
		dolorOrinar=p.get("dolorOrinar");
		SecrecionPene=p.get("SecrecionPene");
		dolorSexo=p.get("dolorSexo");
		System.out.println(dolorOrinar);
	}
	public HashMap<String, String> getP() {
		return p;
	}
	public void setP(HashMap<String, String> p) {
		this.p = p;
	}
	
}
