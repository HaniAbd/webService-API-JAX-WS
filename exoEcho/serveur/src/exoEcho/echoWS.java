package exoEcho;

import javax.ejb.WebService;

@WebService
public class echoWS {
	public echoWS(){}

	public String echo(String chaine) {
		return chaine;
	}
	
}
