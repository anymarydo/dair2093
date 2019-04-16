package biblioteca.control;


import biblioteca.model.Carte;
import biblioteca.repository.repoInterfaces.CartiRepoInterface;
import biblioteca.util.CarteValidator;

import java.util.List;

public class BibliotecaCtrl {

	private CartiRepoInterface cr;
	
	public BibliotecaCtrl(CartiRepoInterface cr){
		this.cr = cr;
	}
	
	public void adaugaCarte(Carte c) throws Exception{
		CarteValidator.validateCarte(c);
		cr.adaugaCarte(c.getTitlu(),c.getReferenti(),c.getAnAparitie(),c.getEditura(),c.getCuvinteCheie());
	}
	
	public void modificaCarte(Carte nou, Carte vechi) throws Exception{
		cr.modificaCarte(nou, vechi);
	}
	
	public void stergeCarte(Carte c) throws Exception{
		cr.stergeCarte(c);
	}

	public List<Carte> cautaCarteDupaAutor(String autor) throws Exception{
		CarteValidator.validateAutor(autor);
		return cr.cautaCarteDupaAutor(autor);
	}
	
	public List<Carte> getCarti() throws Exception{
		return cr.getCarti();
	}
	
	public List<Carte> getCartiOrdonateDinAnul(String an) throws Exception{
		if(!CarteValidator.isNumber(an))
			throw new Exception("Nu e numar!");
		return cr.getCartiOrdonateDinAnul(an);
	}
	
	
}
