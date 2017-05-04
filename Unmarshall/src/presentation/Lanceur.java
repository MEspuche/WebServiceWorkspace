package presentation;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		System.out.println("initialisation du marshaller");
		JAXBContext context = JAXBContext.newInstance(Compte.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Compte c = (Compte) unmarshaller.unmarshal(new File("comptes.xml"));
		System.out.println(c);

	}

}
