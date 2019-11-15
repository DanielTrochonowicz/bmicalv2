package pl.bmicalv2;

import org.junit.Test;
import pl.bmicalv2.models.PerfectWeight;

import static org.junit.Assert.assertEquals;

public class PerfectWeightTest {

    @Test
    public void testPerfectWeight(){
        PerfectWeight perfectWeight= new PerfectWeight(178, 85);
        assertEquals("Idealna waga dla Twojego wzrostu (178.0 cm) wynosi: 58,615kg - 79,21kg",
                perfectWeight.getPerfectWeight());
    }
}
