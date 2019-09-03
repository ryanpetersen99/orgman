package ac.za.cput.adp3.xyzcongolmerate.factory.demography;
/* Ryan Petersen 217027806 */
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;

public class RaceFactory {

    private static final String SUFFIX = Helper.getSuffixFromClassName(RaceFactory.class); // Expecting RF from (R)ace(F)actory.

    public static Race buildRace(String raceDescription) {
        return new Race.Builder().raceId(Helper.generateRandomGivenSuffix(SUFFIX)).raceDescription(raceDescription).build();
    }
}
