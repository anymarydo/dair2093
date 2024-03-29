package biblioteca.repository.repo;


import biblioteca.model.Carte;
import biblioteca.repository.repoInterfaces.CartiRepoInterface;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CartiRepo implements CartiRepoInterface {
	
	private String file = "cartiBD.dat";
	
	public CartiRepo(){
		URL location = CartiRepo.class.getProtectionDomain().getCodeSource().getLocation();
        System.out.println(location.getFile());
	}

	public void adaugaCarte(String titlu,List<String> referenti, String an,String editura,List<String> cuvinteCheie) {
		BufferedWriter bw = null;
		try {
			String ref = "";
			String cuvCheie = "";
			bw = new BufferedWriter(new FileWriter(file,true));
			for(int i=0;i<referenti.size();i++){
				if(i==referenti.size()-1)
					ref+=referenti.get(i);
				else
					ref+=referenti.get(i)+",";
			}

			for(int i=0;i<cuvinteCheie.size();i++){
				if(i==cuvinteCheie.size()-1)
					cuvCheie+=cuvinteCheie.get(i);
				else
					cuvCheie+=cuvinteCheie.get(i)+",";
			}
			bw.write(titlu+";"+ref+";"+an+";"+editura+";"+cuvCheie);
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	@Override
//	public void adaugaCarte(Carte c) {
//		BufferedWriter bw = null;
//		try {
//			bw = new BufferedWriter(new FileWriter(file,true));
//			bw.write(c.toString());
//			bw.newLine();
//
//			bw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

	@Override
	public List<Carte> getCarti() {
		List<Carte> lc = new ArrayList<Carte>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = null;
			while((line=br.readLine())!=null){
				lc.add(Carte.getCarteFromString(line));
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Input file is not found");;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return lc;
	}

	@Override
	public void modificaCarte(Carte nou, Carte vechi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stergeCarte(Carte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Carte> cautaCarteDupaAutor(String ref) {
		List<Carte> carti = getCarti();
		List<Carte> cartiGasite = new ArrayList<Carte>();
		int i=0;
		while (i<carti.size()){
			boolean flag = false;
			List<String> lref = carti.get(i).getCuvinteCheie();
			int j = 0;
			while(j<lref.size()){
				if(lref.get(j).toLowerCase().contains(ref.toLowerCase())){
					flag = true;
					break;
				}
				j++;
			}
			if(flag == true){
				cartiGasite.add(carti.get(i));
			}
			i++;
		}
		return cartiGasite;
	}

	@Override
	public List<Carte> getCartiOrdonateDinAnul(String an) {
		List<Carte> lc = getCarti();
		List<Carte> lca = new ArrayList<Carte>();
		for(Carte c:lc){
			if(c.getAnAparitie().equals(an) == true){
				lca.add(c);
			}
		}
		
		Collections.sort(lca,new Comparator<Carte>(){

			@Override
			public int compare(Carte a, Carte b) {
				if(a.getTitlu().compareTo(b.getTitlu())==0){
					return a.getReferenti().get(0).compareTo(b.getReferenti().get(0));
				}
				
				return a.getTitlu().compareTo(b.getTitlu());
			}
		
		});
		
		return lca;
	}

}
