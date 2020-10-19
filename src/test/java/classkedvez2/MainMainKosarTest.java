package classkedvez2;

import org.junit.Test;
import org.junit.Assert;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
        DarabszamBekeres darabszamBekeres = new DarabszamBekeres();
        int osszMennyiseg = darabszamBekeres.DarabBeker(rendelhetoTermekList);
        // darabszamBekeres.DarabBeker(rendelhetoTermekList);
        rendeltTermekList = darabszamBekeres.getRendeltTermekList();

        Assert.assertEquals(true,
            "Rendelhető termék: téliszalámi (egységár: 2000, kedv.típus: K23)".equals(
                    rendelhetoTermekList.get(0).toString()));

        Assert.assertEquals(true,
                "Rendelt termék: 0 db téliszalámi (egységár: 2000, kedv.típus: K23)".equals(
                    rendeltTermekList.get(0).toString()));
    }
}