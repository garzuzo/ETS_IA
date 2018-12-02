package co.edu.icesi.drools;

import java.util.Collection;

//import org.drools.RuleBase;
import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.kie.api.KieServices;
//import org.drools.RuleBaseFactory;
//import org.drools.WorkingMemory;
//import org.drools.compiler.PackageBuilder;
//import org.drools.rule.Package; 
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class PruebaEnfermedad {

	public static void main(String[] args) {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");

		try {

			// load up the knowledge base
			KnowledgeBase kbase = readKnowledgeBase();
			StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();

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

			ksession.insert(p1);

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

			ksession.insert(p2);

			Persona p3 = new Persona();
			p3.setNombrePersona("Persona3");
			p3.setCansancio("Si");
			p3.setApetito("Perdida apetito");
			p3.setNauseas("Si");
			p3.setDolorVientre("Si");
			p3.setDolorArticulaciones("Si");
			p3.setDolorCabeza("fuerte");
			p3.setFiebre("Si");
			p3.setUrticaria("Si");
			p3.setColorOrina("oscura");
			p3.setColorHeces("grisaceo");
			p3.setIctericia("Si");

			ksession.insert(p3);

			Persona p4 = new Persona();
			p4.setNombrePersona("Persona4");
			p4.setInflamacionGlandulaPelvis("Si");
			p4.setInflamacionGlandulaGarganta("Si");
			p4.setInflamacionGlandulaAxilas("Si");
			p4.setFiebre("Si");
			p4.setEscalofrios("Si");
			p4.setDolorCabeza("Si");
			p4.setCansancio("Si");

			ksession.insert(p4);

			Persona p5 = new Persona();
			p5.setNombrePersona("Persona5");
			p5.setFlujoVaginal("normal");
			p5.setColorFlujo("normal");
			p5.setColorFlujo("normal");
			p5.setSangrado("No");
			p5.setPicazon("No");
			p5.setDolorSexo("No");

			ksession.insert(p5);
	
			Persona p6= new Persona();
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
			
			ksession.insert(p6);
			ksession.fireAllRules();

			System.out.println(p1.getNombrePersona() + "según tus síntomas, tu diagnóstico es:" + p1.getDiagnostico());
			System.out.println(p2.getNombrePersona() + "según tus síntomas, tu diagnóstico es:" + p2.getDiagnostico());
			System.out.println(p3.getNombrePersona() + "según tus síntomas, tu diagnóstico es:" + p3.getDiagnostico());
			System.out.println(p4.getNombrePersona() + "según tus síntomas, tu diagnóstico es:" + p4.getDiagnostico());
			System.out.println(p5.getNombrePersona() + "según tus síntomas, tu diagnóstico es:" + p5.getDiagnostico());
			System.out.println(p6.getNombrePersona() + "según tus síntomas, tu diagnóstico es:" + p6.getDiagnostico());
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	private static KnowledgeBase readKnowledgeBase() throws Exception {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

		kbuilder.add(ResourceFactory.newClassPathResource("clamidiaReglas.drl"), ResourceType.DRL);

		kbuilder.add(ResourceFactory.newClassPathResource("gonorreaReglas.drl"), ResourceType.DRL);

		kbuilder.add(ResourceFactory.newClassPathResource("hepatitisReglas.drl"), ResourceType.DRL);

		kbuilder.add(ResourceFactory.newClassPathResource("herpesReglas.drl"), ResourceType.DRL);

		kbuilder.add(ResourceFactory.newClassPathResource("triconmiasisReglas.drl"), ResourceType.DRL);

		kbuilder.add(ResourceFactory.newClassPathResource("VIHReglas.drl"), ResourceType.DRL);
		KnowledgeBuilderErrors errors = kbuilder.getErrors();

		if (errors.size() > 0) {
			for (KnowledgeBuilderError error : errors) {
				System.err.println(error);
			}
			throw new IllegalArgumentException("Could not parse knowledge.");
		}
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		return kbase;
	}
}
