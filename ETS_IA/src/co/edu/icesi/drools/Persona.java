package co.edu.icesi.drools;

import java.util.HashMap;

public class Persona {

	private HashMap<String,String> p;
	
	private String nombrePersona;
	private String diagnostico;
	
	private String dolorOrinar;
	private String dolorSexo;
	private String flujoVaginal;
	private String olorFlujo;
	private String colorFlujo;
	private String sangrado;
	private String inflamacionTesticulos;
	private String sensibilidadTesticulos;
	private String dolorAno;
	private String secrecionPene;
	private String cansancio;
	private String dolorVientre;
	private String apetito;
	private String nauseas;
	private String vomitos;
	private String dolorArticulaciones;
	private String dolorCabeza;
	private String fiebre;
	private String urticaria;
	private String colorOrina;
	private String colorHeces;
	private String ictericia;
	private String picazon;
	private String lugarPicazon;//ano, vagina
	private String secrecionAno;
	private String dolorDefecar;
	private String llagas;
	private String ubicacionLlagas;
	private String ardorOrinar;
	private String dificultadOrinar;
	private String dolorAreaGenital;
	private String escalofrios;
	private String inflamacionGlandulaPelvis;
	private String inflamacionGlandulaGarganta;
	private String inflamacionGlandulaAxilas;
	private String aftas;
	private String dolorGarganta;
	private String infeccionHongos;
	private String infecciones;
	private String enfermedadPelvica;
	private String mareos;
	private String aturdimiento;
	private String perdidaPeso;
	private String formacionHematomas;
	private String diarrea;
	private String sudores;
	private String tos;
	private String respiracion;
	private String lugarSangrado; //boca, nariz,ano, vagina
	private String fuerzaMuscular;

	public Persona() {
		
//		cargarDatosAnalisis();
		
	}
	public void cargarDatosAnalisis() {
		dolorOrinar=p.get("dolorOrinar");
		secrecionPene=p.get("secrecionPene");
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
