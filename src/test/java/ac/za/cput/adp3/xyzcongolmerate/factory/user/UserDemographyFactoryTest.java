package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
/* Ryan Petersen 217027806 */
public class UserDemographyFactoryTest {


    @Test
    public void buildUserDemography() {
        Date date = new Date();
        UserDemography userDemography = UserDemographyFactory.buildUserDemography("666@mycput.ac.za","Lecturer","GF-666","RF-666",date);
        Assert.assertNotNull(userDemography);
        System.out.println(userDemography.toString());


    }
}