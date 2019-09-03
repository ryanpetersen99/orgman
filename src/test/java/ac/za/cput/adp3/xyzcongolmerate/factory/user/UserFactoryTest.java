package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
/* Ryan Petersen 217027806 */
public class UserFactoryTest {

    @Test
    public void buildUser() {
        User user = UserFactory.buildUser("666@mycput.ac.za","Ryan","Petersen");
        Assert.assertNotNull(user);
        System.out.println(user.toString());
    }
}