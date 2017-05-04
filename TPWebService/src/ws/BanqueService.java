package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;
@WebService(serviceName="BanqueWS")
public class BanqueService {

	@WebMethod(operationName="ConversionED")
	public double conversionEuroDollard(
			@WebParam(name="mt")
			double montant)
	{
		return 1.09*montant;
	}
	
	@WebMethod
	public Compte getCompte(@WebParam(name="code")int code)
	{
		Compte c = new Compte();
		c.setCode(code);
		c.setDateCreation(new Date());
		c.setSolde(10000);
		return c;
	}
	
	@WebMethod
	public List<Compte> getComptes()
	{
		List<Compte> cptes = new ArrayList<>();
		Compte c1 = new Compte();
		c1.setCode(2);
		c1.setDateCreation(new Date());
		c1.setSolde(2000);
		Compte c2 = new Compte(3,3000,new Date());
		cptes.add(c1);
		cptes.add(c2);
		return cptes;
	}
	
}
