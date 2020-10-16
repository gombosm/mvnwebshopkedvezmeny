package classkedvez2;

import java.util.ArrayList;
import java.util.List;

public class TermekFeltoltes {

    List<RendelhetoTermek> rendelhetoTermekList = new ArrayList<>();

    public TermekFeltoltes() {
    }

    public void TermekKezdetiFeltoltes() {
        rendelhetoTermekList.add(new RendelhetoTermek("téliszalámi",2000,"K23"));
        rendelhetoTermekList.add(new RendelhetoTermek("gumikacsa",3000,"K23"));
        rendelhetoTermekList.add(new RendelhetoTermek("uborka",2800,"K12"));
        rendelhetoTermekList.add(new RendelhetoTermek("gesztenye",1000,"K12"));
        //
        rendelhetoTermekList.add(new RendelhetoTermek("probababa",10000,"K34"));
    }

    /*
    Teliszalami(2000, "K23"),//2000
    Gumikacsa(3000, "K23"),//3000
    Uborka(2800, "K12"),//2800
    Gesztenye(1000, "K12");//1000
    */

    public List<RendelhetoTermek> getRendelhetoTermekList() {
        return rendelhetoTermekList;
    }
}
