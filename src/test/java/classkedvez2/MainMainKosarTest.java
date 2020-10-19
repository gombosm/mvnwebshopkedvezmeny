package classkedvez2;

import org.junit.Test;
import org.junit.Assert;

import java.util.List;

public class MainMainKosarTest {

    @Test
    public void testMainKosar() {

        List<Kedvezmeny> kedvezmenyList;
        List<RendelhetoTermek> rendelhetoTermekList;
        List<RendeltTermek> rendeltTermekList;

        // rendelheto aruk feltoltese
        TermekFeltoltes termekFeltoltes = new TermekFeltoltes();
        termekFeltoltes.TermekKezdetiFeltoltes();
        rendelhetoTermekList = termekFeltoltes.getRendelhetoTermekList();

        // kedvezmenyek feltoltese
        KedvezmenyFeltoltes kedvezmenyFeltoltes = new KedvezmenyFeltoltes();
        kedvezmenyFeltoltes.KedvezmenyKezdetiFeltoltes();
        kedvezmenyList = kedvezmenyFeltoltes.getKedvezmenyList();

        // darabszam bekeres
        //DarabszamBekeres darabszamBekeres = new DarabszamBekeres();
        //int osszMennyiseg = darabszamBekeres.DarabBeker(rendelhetoTermekList);
        // darabszamBekeres.DarabBeker(rendelhetoTermekList);
        //rendeltTermekList = darabszamBekeres.getRendeltTermekList();

        Assert.assertEquals("Rendelhető termék: téliszalámi (egységár: 2000, kedv.típus: K23)", rendelhetoTermekList.get(0).toString());
    }
}