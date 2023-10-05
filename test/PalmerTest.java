import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmerTest {

    @Test
    void mängdenVätskaUtskrift_Palmer() {
        VäxtNamn laura = new Palmer("Palmen Laura", 5);
        double expectedValue = 0.5 * 5;
        double actualValue = 0.5 * laura.höjd;
        Assertions.assertEquals(expectedValue, actualValue);

    }
   @Test
    void mängdenVätskaUtskrift_KöttätandeVäxter() {
       KöttätandeVäxter meatloaf = new KöttätandeVäxter("Köttätande växten Meatloaf", 0.7);
        double expectedValue = 0.1 + (0.2 * 0.7);
        double actualValue = 0.1 + (0.2 * meatloaf.höjd);
       Assertions.assertEquals(expectedValue, actualValue);



   }


}
