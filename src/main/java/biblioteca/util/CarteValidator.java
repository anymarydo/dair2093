package biblioteca.util;

import biblioteca.model.Carte;

public class CarteValidator {
	
	public static boolean noSpacesStringIsOK(String s) throws Exception{
		if(!s.matches("[a-zA-Z]+"))
			throw new Exception("String invalid");
		return true;
	}
	
	public static void validateCarte(Carte c)throws Exception{
		if(Integer.parseInt(c.getAnAparitie())<=1950)
			throw new Exception("Anul trebuie sa fie mai mare de 1950!");
		if(c.getTitlu().length()>=35)
			throw new Exception("Titlul nu poate avea lungimea mai mare de 35!");
		if(c.getCuvinteCheie()==null){
			throw new Exception("Lista cuvinte cheie vida!");
		}
		if(c.getReferenti()==null){
			throw new Exception("Lista autori vida!");
		}
		if(!isOKString(c.getTitlu()))
			throw new Exception("Titlu invalid!");
		for(String s:c.getReferenti()){
			if(!isOKString(s))
				throw new Exception("Autor invalid!");
		}
		for(String s:c.getCuvinteCheie()){
			if(!isOKString(s))
				throw new Exception("Cuvant cheie invalid!");
		}
		if(!CarteValidator.isNumber(c.getAnAparitie()))
			throw new Exception("Editura invalid!");
	}
	
	public static boolean isNumber(String s){
		return s.matches("[0-9]+");
	}
	
	private static boolean isOKString(String s){
		String []t = s.split(" ");
		boolean ok = true;
		for(int i=0; i<t.length && ok; i++) {
			if (!t[i].matches("[a-zA-Z]+")) {
				ok=false;
			}
		}
		return ok;
	}

	public static void validateAutor(String autor)throws Exception{
		if(!isOKString(autor)){
			throw new Exception("Autor invalid!");
		}
	}
	
}
