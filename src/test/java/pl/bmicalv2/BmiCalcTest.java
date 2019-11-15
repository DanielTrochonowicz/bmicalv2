package pl.bmicalv2;


import org.junit.Test;
import pl.bmicalv2.models.BmiCalc;

import static org.junit.Assert.assertEquals;

public class BmiCalcTest {

    @Test
    public void testGetBmi(){
        BmiCalc bmiCalc = new BmiCalc(85,178);
        assertEquals(26.82742078020452,bmiCalc.getBmi(),0);

        BmiCalc bmiCalc2 = new BmiCalc(65,165);
        assertEquals(23.875114784205692,bmiCalc2.getBmi(),0);

    }

}
