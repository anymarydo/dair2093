package biblioteca.repository.repo;

import biblioteca.control.BibliotecaCtrl;
import biblioteca.model.Carte;
import biblioteca.repository.repoInterfaces.CartiRepoInterface;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Integrare_big_bang {
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
    public void TestPABC() throws Exception {
        Integer size=bibliotecaCtrl.getCarti().size();
        List<String> a=new ArrayList<String>();
        a.add("Martin");
        List<String> c=new ArrayList<String>();
        c.add("martin");
        Carte c1=new Carte("GOT", a,"2009","editura",c);
        bibliotecaCtrl.adaugaCarte(c1);
        assertEquals(size+1,bibliotecaCtrl.getCarti().size());
        List<Carte> carti=bibliotecaCtrl.cautaCarteDupaAutor("Martin");
        assertEquals(carti.size(),1);
        carti = bibliotecaCtrl.getCartiOrdonateDinAnul("2009");
        assertEquals(carti.size(), 1);
    }

}
