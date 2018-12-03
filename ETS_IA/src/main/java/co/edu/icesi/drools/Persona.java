package co.edu.icesi.drools;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

import org.drools.compiler.compiler.DroolsParserException;
import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.WorkingMemory;
import org.drools.core.rule.Package;

public class Persona {

	private HashMap<String, String> p;

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
	private String lugarPicazon;// ano, vagina
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
	private String lugarSangrado; // boca, nariz,ano, vagina
	private String fuerzaMuscular;
	private String pusPene;

	public Persona() {

		//cargarDatosAnalisis();

	}
	public static void main(String args[]) {
		
	}

	public String diagnosticarVIH() {

		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/co/edu/icesi/rules/VIHReglas.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		try {
			packageBuilder.addPackageFromDrl(reader);
		} catch (DroolsParserException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);

		WorkingMemory workingMemory = ruleBase.newStatefulSession();

		workingMemory.insert(this);
		workingMemory.fireAllRules();
workingMemory.dispose();
		String answ = "Análisis para VIH:" + diagnostico;
		diagnostico="Sano";
		return answ;
	}

	public String diagnosticarTricomoniasis() {
		
		
		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/co/edu/icesi/rules/tricomoniasisReglas.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		try {
			packageBuilder.addPackageFromDrl(reader);
		} catch (DroolsParserException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);

		WorkingMemory workingMemory = ruleBase.newStatefulSession();

		workingMemory.insert(this);
		workingMemory.fireAllRules();
		workingMemory.dispose();
		String answ = "Análisis para Tricomoniasis:" + diagnostico;
		diagnostico="Sano";
		return answ;
	}
	
	
	public String diagnosticarHerpes() {

		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/co/edu/icesi/rules/herpesReglas.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		try {
			packageBuilder.addPackageFromDrl(reader);
		} catch (DroolsParserException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);

		WorkingMemory workingMemory = ruleBase.newStatefulSession();

		workingMemory.insert(this);
		workingMemory.fireAllRules();
		workingMemory.dispose();
		String answ = "Análisis para Herpes:" + diagnostico;
		diagnostico="Sano";
		return answ;
	}
	public String diagnosticarHepatitis() {

		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/co/edu/icesi/rules/hepatitisReglas.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		try {
			packageBuilder.addPackageFromDrl(reader);
		} catch (DroolsParserException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);

		WorkingMemory workingMemory = ruleBase.newStatefulSession();

		workingMemory.insert(this);
		workingMemory.fireAllRules();
		workingMemory.dispose();
		String answ = "Análisis para Hepatitis-B:" + diagnostico;
		diagnostico="Sano";
		return answ;
	}
	
	public String diagnosticarClamidia() {

		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/co/edu/icesi/rules/clamidiaReglas.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		try {
			packageBuilder.addPackageFromDrl(reader);
		} catch (DroolsParserException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);

		WorkingMemory workingMemory = ruleBase.newStatefulSession();

		workingMemory.insert(this);
		workingMemory.fireAllRules();
		workingMemory.dispose();
		String answ = "Análisis para Clamidia:" + diagnostico;
		diagnostico="Sano";
		return answ;
	}
	
	public String diagnosticarGonorrea() {

		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/co/edu/icesi/rules/gonorreaReglas.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		try {
			packageBuilder.addPackageFromDrl(reader);
		} catch (DroolsParserException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);

		WorkingMemory workingMemory = ruleBase.newStatefulSession();

		workingMemory.insert(this);
		workingMemory.fireAllRules();
		workingMemory.dispose();
		String answ = "Análisis para Gonorrea:" + diagnostico;
		diagnostico="Sano";
		return answ;
	}
	
	
	public void cargarDatosAnalisis() {
		diagnostico = "Sano";
		pusPene = p.get("pusPene");
		dolorOrinar = p.get("dolorOrinar");
		dolorSexo = p.get("dolorSexo");
		flujoVaginal = p.get("flujoVaginal");
		olorFlujo = p.get("olorFlujo");
		colorFlujo = p.get("colorFlujo");
		sangrado = p.get("sangrado");
		inflamacionTesticulos = p.get("inflamacionTesticulos");
		sensibilidadTesticulos = p.get("sensibilidadTesticulos");
		dolorAno = p.get("dolorAno");
		secrecionPene = p.get("secrecionPene");
		cansancio = p.get("cansancio");
		dolorVientre = p.get("dolorVientre");
		apetito = p.get("apetito");
		nauseas = p.get("nauseas");
		vomitos = p.get("vomitos");
		dolorArticulaciones = p.get("dolorArticulaciones");
		dolorCabeza = p.get("dolorCabeza");
		fiebre = p.get("fiebre");
		urticaria = p.get("urticaria");
		colorOrina = p.get("colorOrina");
		colorHeces = p.get("colorHeces");
		ictericia = p.get("ictericia");
		picazon = p.get("picazon");
		lugarPicazon = p.get("lugarPicazon");
		secrecionAno = p.get("secrecionAno");
		dolorDefecar = p.get("dolorDefecar");
		llagas = p.get("llagas");
		ubicacionLlagas = p.get("ubicacionLlagas");
		ardorOrinar = p.get("ardorOrinar");
		dificultadOrinar = p.get("dificultadOrinar");
		dolorAreaGenital = p.get("dolorAreaGenital");
		escalofrios = p.get("escalofrios");
		inflamacionGlandulaPelvis = p.get("inflamacionGlandulaPelvis");
		inflamacionGlandulaGarganta = p.get("inflamacionGlandulaGarganta");
		inflamacionGlandulaAxilas = p.get("inflamacionGlandulaAxilas");
		aftas = p.get("aftas");
		dolorGarganta = p.get("dolorGarganta");
		infeccionHongos = p.get("infeccionHongos");
		infecciones = p.get("infecciones");
		enfermedadPelvica = p.get("enfermedadPelvica");
		mareos = p.get("mareos");
		aturdimiento = p.get("aturdimiento");
		perdidaPeso = p.get("perdidaPeso");
		formacionHematomas = p.get("formacionHematomas");
		diarrea = p.get("diarrea");
		sudores = p.get("sudores");
		tos = p.get("tos");
		respiracion = p.get("respiracion");
		lugarSangrado = p.get("lugarSangrado");
		fuerzaMuscular = p.get("fuerzaMuscular");
		System.out.println(dolorOrinar);
	}

	public HashMap<String, String> getP() {
		return p;
	}

	public void setP(HashMap<String, String> p) {
		this.p = p;
	}

	/**
	 * GETTERS AND SETTERS
	 */
	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public String getPusPene() {
		return pusPene;
	}

	public void setPusPene(String pusPene) {
		this.pusPene = pusPene;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getDolorOrinar() {
		return dolorOrinar;
	}

	public void setDolorOrinar(String dolorOrinar) {
		this.dolorOrinar = dolorOrinar;
	}

	public String getDolorSexo() {
		return dolorSexo;
	}

	public void setDolorSexo(String dolorSexo) {
		this.dolorSexo = dolorSexo;
	}

	public String getFlujoVaginal() {
		return flujoVaginal;
	}

	public void setFlujoVaginal(String flujoVaginal) {
		this.flujoVaginal = flujoVaginal;
	}

	public String getOlorFlujo() {
		return olorFlujo;
	}

	public void setOlorFlujo(String olorFlujo) {
		this.olorFlujo = olorFlujo;
	}

	public String getColorFlujo() {
		return colorFlujo;
	}

	public void setColorFlujo(String colorFlujo) {
		this.colorFlujo = colorFlujo;
	}

	public String getSangrado() {
		return sangrado;
	}

	public void setSangrado(String sangrado) {
		this.sangrado = sangrado;
	}

	public String getInflamacionTesticulos() {
		return inflamacionTesticulos;
	}

	public void setInflamacionTesticulos(String inflamacionTesticulos) {
		this.inflamacionTesticulos = inflamacionTesticulos;
	}

	public String getSensibilidadTesticulos() {
		return sensibilidadTesticulos;
	}

	public void setSensibilidadTesticulos(String sensibilidadTesticulos) {
		this.sensibilidadTesticulos = sensibilidadTesticulos;
	}

	public String getDolorAno() {
		return dolorAno;
	}

	public void setDolorAno(String dolorAno) {
		this.dolorAno = dolorAno;
	}

	public String getSecrecionPene() {
		return secrecionPene;
	}

	public void setSecrecionPene(String secrecionPene) {
		this.secrecionPene = secrecionPene;
	}

	public String getCansancio() {
		return cansancio;
	}

	public void setCansancio(String cansancio) {
		this.cansancio = cansancio;
	}

	public String getDolorVientre() {
		return dolorVientre;
	}

	public void setDolorVientre(String dolorVientre) {
		this.dolorVientre = dolorVientre;
	}

	public String getApetito() {
		return apetito;
	}

	public void setApetito(String apetito) {
		this.apetito = apetito;
	}

	public String getNauseas() {
		return nauseas;
	}

	public void setNauseas(String nauseas) {
		this.nauseas = nauseas;
	}

	public String getVomitos() {
		return vomitos;
	}

	public void setVomitos(String vomitos) {
		this.vomitos = vomitos;
	}

	public String getDolorArticulaciones() {
		return dolorArticulaciones;
	}

	public void setDolorArticulaciones(String dolorArticulaciones) {
		this.dolorArticulaciones = dolorArticulaciones;
	}

	public String getDolorCabeza() {
		return dolorCabeza;
	}

	public void setDolorCabeza(String dolorCabeza) {
		this.dolorCabeza = dolorCabeza;
	}

	public String getFiebre() {
		return fiebre;
	}

	public void setFiebre(String fiebre) {
		this.fiebre = fiebre;
	}

	public String getUrticaria() {
		return urticaria;
	}

	public void setUrticaria(String urticaria) {
		this.urticaria = urticaria;
	}

	public String getColorOrina() {
		return colorOrina;
	}

	public void setColorOrina(String colorOrina) {
		this.colorOrina = colorOrina;
	}

	public String getColorHeces() {
		return colorHeces;
	}

	public void setColorHeces(String colorHeces) {
		this.colorHeces = colorHeces;
	}

	public String getIctericia() {
		return ictericia;
	}

	public void setIctericia(String ictericia) {
		this.ictericia = ictericia;
	}

	public String getPicazon() {
		return picazon;
	}

	public void setPicazon(String picazon) {
		this.picazon = picazon;
	}

	public String getLugarPicazon() {
		return lugarPicazon;
	}

	public void setLugarPicazon(String lugarPicazon) {
		this.lugarPicazon = lugarPicazon;
	}

	public String getSecrecionAno() {
		return secrecionAno;
	}

	public void setSecrecionAno(String secrecionAno) {
		this.secrecionAno = secrecionAno;
	}

	public String getDolorDefecar() {
		return dolorDefecar;
	}

	public void setDolorDefecar(String dolorDefecar) {
		this.dolorDefecar = dolorDefecar;
	}

	public String getLlagas() {
		return llagas;
	}

	public void setLlagas(String llagas) {
		this.llagas = llagas;
	}

	public String getUbicacionLlagas() {
		return ubicacionLlagas;
	}

	public void setUbicacionLlagas(String ubicacionLlagas) {
		this.ubicacionLlagas = ubicacionLlagas;
	}

	public String getArdorOrinar() {
		return ardorOrinar;
	}

	public void setArdorOrinar(String ardorOrinar) {
		this.ardorOrinar = ardorOrinar;
	}

	public String getDificultadOrinar() {
		return dificultadOrinar;
	}

	public void setDificultadOrinar(String dificultadOrinar) {
		this.dificultadOrinar = dificultadOrinar;
	}

	public String getDolorAreaGenital() {
		return dolorAreaGenital;
	}

	public void setDolorAreaGenital(String dolorAreaGenital) {
		this.dolorAreaGenital = dolorAreaGenital;
	}

	public String getEscalofrios() {
		return escalofrios;
	}

	public void setEscalofrios(String escalofrios) {
		this.escalofrios = escalofrios;
	}

	public String getInflamacionGlandulaPelvis() {
		return inflamacionGlandulaPelvis;
	}

	public void setInflamacionGlandulaPelvis(String inflamacionGlandulaPelvis) {
		this.inflamacionGlandulaPelvis = inflamacionGlandulaPelvis;
	}

	public String getInflamacionGlandulaGarganta() {
		return inflamacionGlandulaGarganta;
	}

	public void setInflamacionGlandulaGarganta(String inflamacionGlandulaGarganta) {
		this.inflamacionGlandulaGarganta = inflamacionGlandulaGarganta;
	}

	public String getInflamacionGlandulaAxilas() {
		return inflamacionGlandulaAxilas;
	}

	public void setInflamacionGlandulaAxilas(String inflamacionGlandulaAxilas) {
		this.inflamacionGlandulaAxilas = inflamacionGlandulaAxilas;
	}

	public String getAftas() {
		return aftas;
	}

	public void setAftas(String aftas) {
		this.aftas = aftas;
	}

	public String getDolorGarganta() {
		return dolorGarganta;
	}

	public void setDolorGarganta(String dolorGarganta) {
		this.dolorGarganta = dolorGarganta;
	}

	public String getInfeccionHongos() {
		return infeccionHongos;
	}

	public void setInfeccionHongos(String infeccionHongos) {
		this.infeccionHongos = infeccionHongos;
	}

	public String getInfecciones() {
		return infecciones;
	}

	public void setInfecciones(String infecciones) {
		this.infecciones = infecciones;
	}

	public String getEnfermedadPelvica() {
		return enfermedadPelvica;
	}

	public void setEnfermedadPelvica(String enfermedadPelvica) {
		this.enfermedadPelvica = enfermedadPelvica;
	}

	public String getMareos() {
		return mareos;
	}

	public void setMareos(String mareos) {
		this.mareos = mareos;
	}

	public String getAturdimiento() {
		return aturdimiento;
	}

	public void setAturdimiento(String aturdimiento) {
		this.aturdimiento = aturdimiento;
	}

	public String getPerdidaPeso() {
		return perdidaPeso;
	}

	public void setPerdidaPeso(String perdidaPeso) {
		this.perdidaPeso = perdidaPeso;
	}

	public String getFormacionHematomas() {
		return formacionHematomas;
	}

	public void setFormacionHematomas(String formacionHematomas) {
		this.formacionHematomas = formacionHematomas;
	}

	public String getDiarrea() {
		return diarrea;
	}

	public void setDiarrea(String diarrea) {
		this.diarrea = diarrea;
	}

	public String getSudores() {
		return sudores;
	}

	public void setSudores(String sudores) {
		this.sudores = sudores;
	}

	public String getTos() {
		return tos;
	}

	public void setTos(String tos) {
		this.tos = tos;
	}

	public String getRespiracion() {
		return respiracion;
	}

	public void setRespiracion(String respiracion) {
		this.respiracion = respiracion;
	}

	public String getLugarSangrado() {
		return lugarSangrado;
	}

	public void setLugarSangrado(String lugarSangrado) {
		this.lugarSangrado = lugarSangrado;
	}

	public String getFuerzaMuscular() {
		return fuerzaMuscular;
	}

	public void setFuerzaMuscular(String fuerzaMuscular) {
		this.fuerzaMuscular = fuerzaMuscular;
	}
}
