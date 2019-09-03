package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
/* Ryan Petersen 217027806 */
public class UserRoleFactoryTest {


    @Test
    public void buildUserRole() {
        Role role = RoleFactory.buildRole("Lecturer"); //Generates ID
        Organisation organisation = OrganisationFactory.buildOrganisation("University"); //Generates ID

        UserRole userRole = UserRoleFactory.buildUserRole(organisation.getOrgCode(),"666@mycput.ac.za", role.getRoleId());
        Assert.assertNotNull(userRole);
        System.out.println(userRole.toString());
    }
}