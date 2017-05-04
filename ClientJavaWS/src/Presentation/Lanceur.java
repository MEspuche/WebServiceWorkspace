package Presentation;

import java.util.List;

import ws.BanqueService;
import ws.BanqueWS;
import ws.Compte;

public class Lanceur {

	public static void main(String[] args) {
		BanqueService banqueservice = new BanqueWS().getBanqueServicePort();
		System.out.println("conversion");
		double montant = banqueservice.conversionED(100);
		System.out.println(montant);
		System.out.println("consulter un compte");
		Compte c = banqueservice.getCompte(10);
		System.out.println(c);
		System.out.println("lister les comptes");
		List<Compte> l = banqueservice.getComptes();
		for (Compte cp:l)
		{
			System.out.println(cp);
		}
	}

}
