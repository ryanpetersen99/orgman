package ac.za.cput.adp3.xyzcongolmerate.factory.misc;
/* Ryan Petersen 217027806 */
import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Assert;
import org.junit.Test;

public class RoleFactoryTest {

    @Test
    public void buildRole() {
        Role role = RoleFactory.buildRole("Lecturer");
        Assert.assertNotNull(role.getRoleId());
        System.out.println(role.toString());
    }
}