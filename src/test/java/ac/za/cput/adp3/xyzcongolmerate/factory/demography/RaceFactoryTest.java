package ac.za.cput.adp3.xyzcongolmerate.factory.demography;
/* Ryan Petersen 217027806 */
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {


    @Test
    public void buildRace() {
        Race race = RaceFactory.buildRace("Coloured");
        Assert.assertNotNull(race.getRaceId());
        System.out.println(race.toString());

    }
}