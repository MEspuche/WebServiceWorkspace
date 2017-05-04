package serveur;

import javax.xml.ws.Endpoint;

import ws.BanqueService;

public class ServeurWS {

	public static void main(String[] args) {
		//creation du serveur
		String url = "http://localhost:8585/";
		//publication du webservice
		Endpoint.publish(url, new BanqueService());
		System.out.println(url);
	}

}
