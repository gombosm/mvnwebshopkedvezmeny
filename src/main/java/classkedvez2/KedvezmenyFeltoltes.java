package classkedvez2;

import java.util.ArrayList;
import java.util.List;

public class KedvezmenyFeltoltes {

    List<Kedvezmeny> kedvezmenyList = new ArrayList<>();

    public KedvezmenyFeltoltes() {
    }

    public void KedvezmenyKezdetiFeltoltes() {
        kedvezmenyList.add(new KedvezmenyK23("K23","(K23) 2=3: kett�t fizet, h�rmat kap",3));
        kedvezmenyList.add(new KedvezmenyK12("K12","(K12) megapack -6000",12, 6000));
        //
        kedvezmenyList.add(new KedvezmenyK34("K34","(K34) 3=4: h�rmat fizet, n�gyet kap",4));
    }
    public List<Kedvezmeny> getKedvezmenyList() {
        return kedvezmenyList;
    }
}
