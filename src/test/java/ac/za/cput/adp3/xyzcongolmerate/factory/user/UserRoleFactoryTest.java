package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
/* Ryan Petersen 217027806 */
public class UserRoleFactoryTest {


    @Test
    public void buildUserRole() {
        UserRole userRole = UserRoleFactory.buildUserRole("OF-555","666@mycput.ac.za","888");
        Assert.assertNotNull(userRole);
        System.out.println(userRole.toString());
    }
}