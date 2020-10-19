package classkedvez2;

import org.junit.Test;
import org.junit.Assert;

public class RendelhetoTermekTest  {

    @Test
    public void testRendelhetoTermek() {
        RendelhetoTermek rendelhetoTermek = new RendelhetoTermek("téliszalámi",2000,"K23");
        Assert.assertEquals(true, "Rendelhető termék: téliszalámi (egységár: 2000, kedv.típus: K23)".equals(rendelhetoTermek.toString()));

    }
}