package biblioteca.repository.repo;

import biblioteca.control.BibliotecaCtrl;
import biblioteca.model.Carte;
import biblioteca.repository.repoInterfaces.CartiRepoInterface;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Integrare_top_down {
    private CartiRepoInterface cartiRepoInterface=new CartiRepo();
    private BibliotecaCtrl bibliotecaCtrl=new BibliotecaCtrl(cartiRepoInterface);
    @Test
    public void TestA()throws Exception {
        Integer size=bibliotecaCtrl.getCarti().size();
        List<String> a=new ArrayList<String>();
        a.add("a");
        List<String> c=new ArrayList<String>();
        c.add("c");
        Carte c1=new Carte("Titlu", a,"2010","editura",c);
        bibliotecaCtrl.adaugaCarte(c1);
        assertEquals(size+1,bibliotecaCtrl.getCarti().size());
    }

    @Test
    public void TestB()throws Exception {
        List<Carte> carti=bibliotecaCtrl.cautaCarteDupaAutor("Sadoveanu");
        assertEquals(carti.size(),1);
    }

    @Test
    public void TestC() throws Exception {
        List<Carte> carti = bibliotecaCtrl.getCartiOrdonateDinAnul("1973");
        assertTrue(carti.size() > 0);
    }

    @Test
    public void TestPA() throws Exception {
        Integer size=bibliotecaCtrl.getCarti().size();
        List<String> a=new ArrayList<String>();
        a.add("Autor");
        List<String> c=new ArrayList<String>();
        c.add("autor");
        Carte c1=new Carte("Titlu", a,"2018","editura",c);
        bibliotecaCtrl.adaugaCarte(c1);
        assertEquals(size+1,bibliotecaCtrl.getCarti().size());
    }


    @Test
    public void TestPAB() throws Exception {
        Integer size=bibliotecaCtrl.getCarti().size();
        List<String> a=new ArrayList<String>();
        a.add("Nimeni");
        List<String> c=new ArrayList<String>();
        c.add("nimeni");
        Integer inainte = bibliotecaCtrl.cautaCarteDupaAutor("nimeni").size();
        Carte c1=new Carte("Titlu", a,"2018","editura",c);
        bibliotecaCtrl.adaugaCarte(c1);
        assertEquals(size+1,bibliotecaCtrl.getCarti().size());
        List<Carte> carti = bibliotecaCtrl.cautaCarteDupaAutor("nimeni");
        assertEquals(inainte+1, carti.size());
    }

    @Test
    public void TestPABC() throws Exception {
        Integer size=bibliotecaCtrl.getCarti().size();
        Integer sizeAutor=bibliotecaCtrl.cautaCarteDupaAutor("ana").size();
        Integer sizeAn=bibliotecaCtrl.getCartiOrdonateDinAnul("2019").size();

        List<String> a=new ArrayList<String>();
        a.add("Ana");
        List<String> c=new ArrayList<String>();
        c.add("ana");
        Carte c1=new Carte("Titlu", a,"2019","editura",c);
        bibliotecaCtrl.adaugaCarte(c1);
        assertEquals(size+1,bibliotecaCtrl.getCarti().size());
        List<Carte> carti = bibliotecaCtrl.cautaCarteDupaAutor("ana");
        assertEquals(sizeAutor+1, carti.size());
        carti = bibliotecaCtrl.getCartiOrdonateDinAnul("2019");
        assertEquals(sizeAn+1, carti.size());
    }
}
