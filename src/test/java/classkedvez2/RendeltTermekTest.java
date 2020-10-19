package classkedvez2;

import org.junit.Assert;
import org.junit.Test;

public class RendeltTermekTest {

    @Test
    public void testRendeltTermek() {
        RendeltTermek rendeltTermek = new RendeltTermek("téliszalámi",2000,"K23",0);
        Assert.assertEquals(true, "Rendelt termék: téliszalámi 0 db (egységár: 2000, kedv.típus: K23)".equals(rendeltTermek.toString()));
    }
}