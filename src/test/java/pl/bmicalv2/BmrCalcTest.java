package pl.bmicalv2;

import org.junit.Test;
import pl.bmicalv2.models.BmrCalc;

import static org.junit.Assert.assertEquals;


public class BmrCalcTest {

    @Test
    public void testGetBmr() {
        BmrCalc bmrCalc = new BmrCalc(178, 85, 26, "male", "lazy");

        assertEquals(("Twoje zapotrzebowanie kaloryczne wynosi: 2206,476 kalorii"),
                bmrCalc.getBmrDescription());
    }
}
