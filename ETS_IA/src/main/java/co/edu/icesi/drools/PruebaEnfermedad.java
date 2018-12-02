package co.edu.icesi.drools;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.List;

import org.drools.compiler.compiler.DroolsParserException;
import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.WorkingMemory;

import org.drools.core.rule.Package;
import org.kie.api.io.ResourceType;

//import org.drools.RuleBase;

//import org.kie.api.KieServices;
//import org.drools.RuleBaseFactory;
//import org.drools.WorkingMemory;
//import org.drools.compiler.PackageBuilder;
//import org.drools.rule.Package; 
//import org.kie.api.runtime.KieContainer;
//import org.kie.api.runtime.KieSession;

public class PruebaEnfermedad {

	public void execute1()  {
		try {
		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/hepatitisReglas.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		packageBuilder.addPackageFromDrl(reader);
		Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);
		
		WorkingMemory workingMemory = ruleBase.newStatefulSession();
	

		Persona p1 = new Persona();
		p1.setNombrePersona("Persona1");
		p1.setDolorOrinar("Si");
		p1.setDolorSexo("Si");
		p1.setFlujoVaginal("anormal");
		p1.setColorFlujo("con sangre");
		p1.setDolorVientre("Si");
		p1.setOlorFlujo("fuerte");
		p1.setSangrado("Si");
		p1.setLugarSangrado("vagina");
		p1.setDolorAno("Si");
		p1.setSecrecionAno("Si");

		workingMemory.insert(p1);

		Persona p2 = new Persona();
		p2.setNombrePersona("Persona2");
		p2.setDolorOrinar("Si");
		p2.setArdorOrinar("Si");
		p2.setDolorSexo("Si");
		p2.setFlujoVaginal("anormal");
		p2.setColorFlujo("amarillento");
		p2.setOlorFlujo("fuerte");
		p2.setSangrado("Si");
		p2.setLugarSangrado("vagina");
		p2.setPicazon("No");
		p2.setSecrecionAno("No");
		p2.setDolorDefecar("No");

		workingMemory.insert(p2);

		Persona p3 = new Persona();
		p3.setNombrePersona("Persona3");
		p3.setCansancio("Si");
		p3.setApetito("poco");
		p3.setNauseas("Si");
		p3.setDolorVientre("Si");
		p3.setDolorArticulaciones("Si");
		p3.setDolorCabeza("fuerte");
		p3.setFiebre("Si");
		p3.setUrticaria("Si");
		p3.setColorOrina("oscura");
		p3.setColorHeces("grisaceo");
		p3.setIctericia("Si");

		workingMemory.insert(p3);

		Persona p4 = new Persona();
		p4.setNombrePersona("Persona4");
		p4.setInflamacionGlandulaPelvis("Si");
		p4.setInflamacionGlandulaGarganta("Si");
		p4.setInflamacionGlandulaAxilas("Si");
		p4.setFiebre("Si");
		p4.setEscalofrios("Si");
		p4.setDolorCabeza("Si");
		p4.setCansancio("Si");

		workingMemory.insert(p4);

		Persona p5 = new Persona();
		p5.setNombrePersona("Persona5");
		p5.setFlujoVaginal("normal");
		p5.setColorFlujo("normal");
		p5.setColorFlujo("normal");
		p5.setSangrado("No");
		p5.setPicazon("No");
		p5.setDolorSexo("No");

		workingMemory.insert(p5);

		Persona p6 = new Persona();
		p6.setNombrePersona("Persona6");
		p6.setAftas("No");
		p6.setDolorGarganta("Si");
		p6.setInfeccionHongos("Si");
		p6.setInfecciones("recurrentes");
		p6.setCansancio("Si");
		p6.setMareos("Si");
		p6.setDolorCabeza("Si");
		p6.setPerdidaPeso("No");
		p6.setFormacionHematomas("poco");
		p6.setDiarrea("No");
		p6.setFiebre("Si");
		p6.setSudores("Si");
		p6.setInflamacionGlandulaGarganta("Si");
		p6.setTos("seca");
		p6.setRespiracion("falta de aire");
		p6.setLlagas("Si");
		p6.setUbicacionLlagas("boca");
		p6.setSangrado("No");
		p6.setFuerzaMuscular("debil");

		workingMemory.insert(p6);
		workingMemory.fireAllRules();
		workingMemory.clearAgenda();
		System.out.println(p1.getNombrePersona() + "segun tus sintomas, tu diagnostico es:" + p1.getDiagnostico());
		System.out.println(p2.getNombrePersona() + "segun tus sintomas, tu diagnostico es:" + p2.getDiagnostico());
		System.out.println(p3.getNombrePersona() + "segun tus sintomas, tu diagnostico es:" + p3.getDiagnostico());
		System.out.println(p4.getNombrePersona() + "segun tus sintomas, tu diagnostico es:" + p4.getDiagnostico());
		System.out.println(p5.getNombrePersona() + "segun tus sintomas, tu diagnostico es:" + p5.getDiagnostico());
		System.out.println(p6.getNombrePersona() + "segun tus sintomas, tu diagnostico es:" + p6.getDiagnostico());
		// logger.close();
	} catch (Throwable t) {

		t.printStackTrace();
	}
		
	}
	public void execute() {
		try {

			PackageBuilder packageBuilder = new PackageBuilder();

			String ruleFile = "/hepatitisReglas.drl";
			InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

			Reader reader = new InputStreamReader(resourceAsStream);
			packageBuilder.addPackageFromDrl(reader);
			Package rulesPackage = packageBuilder.getPackage();
			RuleBase ruleBase = RuleBaseFactory.newRuleBase();
			ruleBase.addPackage(rulesPackage);
			
			
//			
//			 ruleFile = "/gonorreaReglas.drl";
//			 resourceAsStream = getClass().getResourceAsStream(ruleFile);
//			 reader = new InputStreamReader(resourceAsStream);
//			packageBuilder.addPackageFromDrl(reader);
//			 rulesPackage = packageBuilder.getPackage();
//			 ruleBase = RuleBaseFactory.newRuleBase();
//			ruleBase.addPackage(rulesPackage);
//			
//			 ruleFile = "/hepatitisReglas.drl";
//			 resourceAsStream = getClass().getResourceAsStream(ruleFile);
//			 reader = new InputStreamReader(resourceAsStream);
//			packageBuilder.addPackageFromDrl(reader);
//			 rulesPackage = packageBuilder.getPackage();
//			 ruleBase = RuleBaseFactory.newRuleBase();
//			ruleBase.addPackage(rulesPackage);
//			
//			 ruleFile = "/herpesReglas.drl";
//			 resourceAsStream = getClass().getResourceAsStream(ruleFile);
//			 reader = new InputStreamReader(resourceAsStream);
//			packageBuilder.addPackageFromDrl(reader);
//			 rulesPackage = packageBuilder.getPackage();
//			 ruleBase = RuleBaseFactory.newRuleBase();
//			ruleBase.addPackage(rulesPackage);
//			
//			 ruleFile = "/tricomoniasis.drl";
//			 resourceAsStream = getClass().getResourceAsStream(ruleFile);
//			 reader = new InputStreamReader(resourceAsStream);
//			packageBuilder.addPackageFromDrl(reader);
//			 rulesPackage = packageBuilder.getPackage();
//			 ruleBase = RuleBaseFactory.newRuleBase();
//			ruleBase.addPackage(rulesPackage);
//			
//
//			 ruleFile = "/VIHReglas.drl";
//			 resourceAsStream = getClass().getResourceAsStream(ruleFile);
//			 reader = new InputStreamReader(resourceAsStream);
//			packageBuilder.addPackageFromDrl(reader);
//			 rulesPackage = packageBuilder.getPackage();
//			 ruleBase = RuleBaseFactory.newRuleBase();
//			ruleBase.addPackage(rulesPackage);
			
			
			WorkingMemory workingMemory = ruleBase.newStatefulSession();
		

			Persona p1 = new Persona();
			p1.setNombrePersona("Persona1");
			p1.setDolorOrinar("Si");
			p1.setDolorSexo("Si");
			p1.setFlujoVaginal("anormal");
			p1.setColorFlujo("con sangre");
			p1.setDolorVientre("Si");
			p1.setOlorFlujo("fuerte");
			p1.setSangrado("Si");
			p1.setLugarSangrado("vagina");
			p1.setDolorAno("Si");
			p1.setSecrecionAno("Si");

			workingMemory.insert(p1);

			Persona p2 = new Persona();
			p2.setNombrePersona("Persona2");
			p2.setDolorOrinar("Si");
			p2.setArdorOrinar("Si");
			p2.setDolorSexo("Si");
			p2.setFlujoVaginal("anormal");
			p2.setColorFlujo("amarillento");
			p2.setOlorFlujo("fuerte");
			p2.setSangrado("Si");
			p2.setLugarSangrado("vagina");
			p2.setPicazon("No");
			p2.setSecrecionAno("No");
			p2.setDolorDefecar("No");

			workingMemory.insert(p2);

			Persona p3 = new Persona();
			p3.setNombrePersona("Persona3");
			p3.setCansancio("Si");
			p3.setApetito("poco");
			p3.setNauseas("Si");
			p3.setDolorVientre("Si");
			p3.setDolorArticulaciones("Si");
			p3.setDolorCabeza("fuerte");
			p3.setFiebre("Si");
			p3.setUrticaria("Si");
			p3.setColorOrina("oscura");
			p3.setColorHeces("grisaceo");
			p3.setIctericia("Si");

			workingMemory.insert(p3);

			Persona p4 = new Persona();
			p4.setNombrePersona("Persona4");
			p4.setInflamacionGlandulaPelvis("Si");
			p4.setInflamacionGlandulaGarganta("Si");
			p4.setInflamacionGlandulaAxilas("Si");
			p4.setFiebre("Si");
			p4.setEscalofrios("Si");
			p4.setDolorCabeza("Si");
			p4.setCansancio("Si");

			workingMemory.insert(p4);

			Persona p5 = new Persona();
			p5.setNombrePersona("Persona5");
			p5.setFlujoVaginal("normal");
			p5.setColorFlujo("normal");
			p5.setColorFlujo("normal");
			p5.setSangrado("No");
			p5.setPicazon("No");
			p5.setDolorSexo("No");

			workingMemory.insert(p5);

			Persona p6 = new Persona();
			p6.setNombrePersona("Persona6");
			p6.setAftas("No");
			p6.setDolorGarganta("Si");
			p6.setInfeccionHongos("Si");
			p6.setInfecciones("recurrentes");
			p6.setCansancio("Si");
			p6.setMareos("Si");
			p6.setDolorCabeza("Si");
			p6.setPerdidaPeso("No");
			p6.setFormacionHematomas("poco");
			p6.setDiarrea("No");
			p6.setFiebre("Si");
			p6.setSudores("Si");
			p6.setInflamacionGlandulaGarganta("Si");
			p6.setTos("seca");
			p6.setRespiracion("falta de aire");
			p6.setLlagas("Si");
			p6.setUbicacionLlagas("boca");
			p6.setSangrado("No");
			p6.setFuerzaMuscular("debil");

			workingMemory.insert(p6);
			workingMemory.fireAllRules();

			System.out.println(p1.getNombrePersona() + "segun tus sintomas, tu diagnostico es:" + p1.getDiagnostico());
			System.out.println(p2.getNombrePersona() + "segun tus sintomas, tu diagnostico es:" + p2.getDiagnostico());
			System.out.println(p3.getNombrePersona() + "segun tus sintomas, tu diagnostico es:" + p3.getDiagnostico());
			System.out.println(p4.getNombrePersona() + "segun tus sintomas, tu diagnostico es:" + p4.getDiagnostico());
			System.out.println(p5.getNombrePersona() + "segun tus sintomas, tu diagnostico es:" + p5.getDiagnostico());
			System.out.println(p6.getNombrePersona() + "segun tus sintomas, tu diagnostico es:" + p6.getDiagnostico());
			// logger.close();
		} catch (Throwable t) {

			t.printStackTrace();
		}

	}

	public static void main(String[] args) {
		PruebaEnfermedad pe=new PruebaEnfermedad();
		pe.execute();
		//pe.execute1();
//		try {
//
//			// load up the knowledge base
//			KnowledgeBase kbase = readKnowledgeBase();
//			StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
//
//		} catch (Throwable t) {
//			t.printStackTrace();
//		}
	}

}
