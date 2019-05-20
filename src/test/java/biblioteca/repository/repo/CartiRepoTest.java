package biblioteca.repository.repo;

import biblioteca.control.BibliotecaCtrl;
import biblioteca.model.Carte;
import biblioteca.repository.repoInterfaces.CartiRepoInterface;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CartiRepoTest {
    private CartiRepoInterface cartiRepoInterface=new CartiRepo();
    private BibliotecaCtrl bibliotecaCtrl=new BibliotecaCtrl(cartiRepoInterface);

//    @Test
//    public void TC1()throws Exception {
//        Integer size=bibliotecaCtrl.getCarti().size();
//        List<String> a=new ArrayList<String>();
//        a.add("a");
//        List<String> c=new ArrayList<String>();
//        c.add("c");
//        Carte c1=new Carte("Titlu", a,"2010","editura",c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals(size+1,bibliotecaCtrl.getCarti().size());
//    }
//
//    @Test (expected = Exception.class)
//    public void TC2()throws Exception {
//        List<String> a=new ArrayList<String>();
//        a.add("a");
//        List<String> c=new ArrayList<String>();
//        c.add("c");
//        Carte c1=new Carte("", a,"2010","editura",c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals("Titlu invalid!",0,bibliotecaCtrl.getCarti().size());
//    }
//    @Test (expected = Exception.class)
//    public void TC3()throws Exception {
//        List<String> a = new ArrayList<String>();
//        a.add("");
//        List<String> c = new ArrayList<String>();
//        c.add("c");
//        Carte c1 = new Carte("Titlu", a, "2010", "editura", c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals("Autor invalid!", 0, bibliotecaCtrl.getCarti().size());
//
//    }
//
//    @Test (expected = Exception.class)
//    public void TC4()throws Exception {
//        List<String> a = new ArrayList<String>();
//        a.add("a");
//        List<String> c = new ArrayList<String>();
//        c.add("c");
//        Carte c1 = new Carte("Titlu", a, "douamii", "editura", c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals("An aparitie invalid!", 0, bibliotecaCtrl.getCarti().size());
//    }
//
//    @Test (expected = Exception.class)
//    public void TC5()throws Exception {
//        List<String> a = new ArrayList<String>();
//        a.add("");
//        List<String> c = new ArrayList<String>();
//        c.add("c");
//        Carte c1 = new Carte("Titlu", a, "2010", "", c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals("Autor invalid!", 0, bibliotecaCtrl.getCarti().size());
//
//    }
//    @Test (expected = Exception.class)
//    public void TC6()throws Exception {
//        List<String> a = new ArrayList<String>();
//        a.add("a");
//        List<String> c = new ArrayList<String>();
//        c.add("");
//        Carte c1 = new Carte("Titlu", a, "2010", "editura", c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals("Cuvant cheie invalid!", 0, bibliotecaCtrl.getCarti().size());
//
//    }
//
//    @Test
//    public void TC7()throws Exception {
//        Integer size=bibliotecaCtrl.getCarti().size();
//        List<String> a=new ArrayList<String>();
//        a.add("a");
//        List<String> c=new ArrayList<String>();
//        c.add("c");
//        Carte c1=new Carte("T", a,"2010","editura",c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals(size+1,bibliotecaCtrl.getCarti().size());
//    }
//
//    @Test
//    public void TC8()throws Exception {
//        Integer size=bibliotecaCtrl.getCarti().size();
//        List<String> a=new ArrayList<String>();
//        a.add("A");
//        List<String> c=new ArrayList<String>();
//        c.add("c");
//        Carte c1=new Carte("Titlu", a,"2010","editura",c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals(size+1,bibliotecaCtrl.getCarti().size());
//    }
//
//    @Test (expected = Exception.class)
//    public void TC9()throws Exception {
//        Integer size=bibliotecaCtrl.getCarti().size();
//        List<String> a=new ArrayList<String>();
//        a.add("a");
//        List<String> c=new ArrayList<String>();
//        c.add("c");
//        Carte c1=new Carte("Titlu", a,"1950","editura",c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals("Anul trebuie sa fie mai mare de 1500!",0,bibliotecaCtrl.getCarti().size());
//    }
//
//    @Test
//    public void TC10()throws Exception {
//        Integer size=bibliotecaCtrl.getCarti().size();
//        List<String> a=new ArrayList<String>();
//        a.add("a");
//        List<String> c=new ArrayList<String>();
//        c.add("c");
//        Carte c1=new Carte("Titlu", a,"1951","editura",c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals(size+1,bibliotecaCtrl.getCarti().size());
//    }
//
//    @Test (expected = Exception.class)
//    public void TC11()throws Exception {
//        Integer size=bibliotecaCtrl.getCarti().size();
//        List<String> a=new ArrayList<String>();
//        a.add("a");
//        List<String> c=new ArrayList<String>();
//        c.add("c");
//        Carte c1=new Carte("Titlu", a,"1499","editura",c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals("Anul trebuie sa fie mai mare de 1500!",0,bibliotecaCtrl.getCarti().size());
//    }
//
//    @Test
//    public void TC12()throws Exception {
//        Integer size=bibliotecaCtrl.getCarti().size();
//        List<String> a=new ArrayList<String>();
//        a.add("a");
//        List<String> c=new ArrayList<String>();
//        c.add("c");
//        Carte c1=new Carte("Titlu", a,"2010","E",c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals(size+1,bibliotecaCtrl.getCarti().size());
//    }
//
//    @Test
//    public void TC13()throws Exception {
//        Integer size=bibliotecaCtrl.getCarti().size();
//        List<String> a=new ArrayList<String>();
//        a.add("a");
//        List<String> c=new ArrayList<String>();
//        c.add("c");
//        Carte c1=new Carte("Titlu", a,"2010","editura",c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals(size+1,bibliotecaCtrl.getCarti().size());
//    }
//
//    @Test
//    public void TC14()throws Exception {
//        Integer size=bibliotecaCtrl.getCarti().size();
//        List<String> a=new ArrayList<String>();
//        a.add("a");
//        List<String> c=new ArrayList<String>();
//        c.add("c");
//        Carte c1=new Carte("aaaaaaaaaaaaaaaaaaaa", a,"2010","editura",c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals(size+1,bibliotecaCtrl.getCarti().size());
//    }
//    @Test(expected = Exception.class)
//    public void TC15()throws Exception {
//        Integer size=bibliotecaCtrl.getCarti().size();
//        List<String> a=new ArrayList<String>();
//        a.add("a");
//        List<String> c=new ArrayList<String>();
//        c.add("c");
//        Carte c1=new Carte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", a,"2010","editura",c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals("Titlul nu poate avea lungimea mai mare de 35!",0,bibliotecaCtrl.getCarti().size());
//    }
//    @Test(expected = Exception.class)
//    public void TC16()throws Exception {
//        Integer size=bibliotecaCtrl.getCarti().size();
//        List<String> a=new ArrayList<String>();
//        a.add("a");
//        List<String> c=new ArrayList<String>();
//        c.add("c");
//        Carte c1=new Carte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", a,"2010","editura",c);
//        bibliotecaCtrl.adaugaCarte(c1);
//        assertEquals("Titlul nu poate avea lungimea mai mare de 35!",0,bibliotecaCtrl.getCarti().size());
//    }
//
//
//
//    @Test
//    public void TCWBT1()throws Exception {
//        List<Carte> carti=new ArrayList<Carte>();
//        Integer size=carti.size();
//        List<String> a=new ArrayList<String>();
//        a.add("George");
//        carti=bibliotecaCtrl.cautaCarteDupaAutor("George");
//        assertEquals(carti.size(),1);
//    }
//    @Test
//    public void TCWBT2()throws Exception {
//        List<Carte> carti=new ArrayList<Carte>();
//        Integer size=carti.size();
//        List<String> a=new ArrayList<String>();
//        a.add("Autor");
//        carti=bibliotecaCtrl.cautaCarteDupaAutor("Autor");
//        assertEquals(carti.size(),0);
//    }
//
//    @Test
//    public void TCWBT3()throws Exception {
//        List<Carte> carti=new ArrayList<Carte>();
//        Integer size=carti.size();
//        List<String> a=new ArrayList<String>();
//        a.add("Sadoveanu");
//        carti=bibliotecaCtrl.cautaCarteDupaAutor("Sadoveanu");
//        assertEquals(carti.size(),1);
//    }
//
//    @Test
//    public void TCWBT4()throws Exception {
//        List<Carte> carti=new ArrayList<Carte>();
//        Integer size=carti.size();
//        List<String> a=new ArrayList<String>();
//        a.add("Autorul");
//        carti=bibliotecaCtrl.cautaCarteDupaAutor("Autorul");
//        assertEquals(carti.size(),0);
//    }
//
//    @Test
//    public void TCWBT5()throws Exception {
//        List<Carte> carti=new ArrayList<Carte>();
//        Integer size=carti.size();
//        List<String> a=new ArrayList<String>();
//        a.add("Duma");
//        carti=bibliotecaCtrl.cautaCarteDupaAutor("Duma");
//        assertEquals(carti.size(),0);
//    }

    @Test
    public void TestValidF03() throws Exception {
        List<Carte> carti = bibliotecaCtrl.getCartiOrdonateDinAnul("1973");
        assertTrue(carti.size() > 0);
    }

    @Test (expected = Exception.class)
    public void TestNevalidF03() throws Exception {
        List<Carte> carti = bibliotecaCtrl.getCartiOrdonateDinAnul("3001");
        assertEquals("An invalid!", 0, carti.size());
    }
}

