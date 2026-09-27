package projetidm.miniLanguage.toJavaSFT;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import projetidm.miniLanguage.MiniLanguage;
import projetidm.miniLanguage.MiniLanguagePackage;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import projetIDM.javaSFT.JavaSFT;
import projetIDM.javaSFT.JavaSFTFactory;

public class MiniLanguageToJavaSFT {

	// chargement du package MiniLanguage afin de l'enregistrer dans le registre d'Eclipse
	MiniLanguagePackage packageInstance = MiniLanguagePackage.eINSTANCE;
	
	// enregistrer l'extension ".xmi" comme devant être ouverte à l'aide
	// d'un objet "XMIResourceFactoryImpl"
	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	Map<String, Object> m = reg.getExtensionToFactoryMap();
	m.put("xmi", new XMIResourceFactoryImpl());
	
	// créer des objets resourceSetImpl qui contiendrons des ressources emf (nos modèles source et résultat)
	ResourceSet resSetMiniLanguage = new ResourceSetImpl();
	ResourceSet resSetJavaSFT = new ResourceSetImpl();
	
	// définir la ressource de JavaScriptForTable (modèle résultat)
	URI modelURIJavaSFT = URI.createURI("");
	Resource resourceJavaSFT = resSetJavaSFT.createResource(modelURIJavaSFT);
	
	// définir la ressource de MiniLanguage (modèle source)
	URI modelURIMiniLanguage = URI.createURI("");
	Resource resourceMiniLanguage = resSetJavaSFT.createResource(modelURIMiniLanguage);
	
	// récupérer premier élément du modèle source
	MiniLanguage miniLanguage = (MiniLanguage) resourceMiniLanguage.getContents().get(0);
	
	// fabrique pour fabriquer les éléments de JavaScriptForTable
	JavaSFTFactory javaSFTFactory = JavaSFTFactory.eINSTANCE;
	
	// création de l'élément racine de JavaSFT
	JavaSFT javaSFT = javaSFTFactory.createJavaSFT();
	
	

}
