package sol;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.Email;

public class HW0Test {

    @Test
    public void testExample() {
        Assert.assertEquals(2, 1 + 1);
    }

    @Test
    public void testDillo() {
        Dillo babyDillo = new Dillo(5, false);
        Assert.assertEquals(5, babyDillo.length);
    }

    @Test
    public void testRecord() {

       Email e1 = new Email("milda@brown.edu", "cs200 is cool", false);
       Assert.assertEquals("milda@brown.edu", e1.address());
    }
}
