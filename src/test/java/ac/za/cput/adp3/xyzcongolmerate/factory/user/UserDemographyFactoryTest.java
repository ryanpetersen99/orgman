package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
/* Ryan Petersen 217027806 */
public class UserDemographyFactoryTest {


    @Test
    public void buildUserDemography() {
        Date date = new Date();
        Race race = RaceFactory.buildRace("Coloured"); //Generates ID
        Gender gender = GenderFactory.buildGender("Male"); //Generates ID

        UserDemography userDemography = UserDemographyFactory.buildUserDemography("666@mycput.ac.za","Lecturer",gender.getGenderId(),race.getRaceId(),date);
        Assert.assertNotNull(userDemography);
        System.out.println(userDemography.toString());


    }
}