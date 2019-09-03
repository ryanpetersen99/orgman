package ac.za.cput.adp3.xyzcongolmerate.factory.org;
/* Ryan Petersen 217027806 */
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser() {
        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser("OF-666","person@mycput.ac.za");
        Assert.assertNotNull(organisationUser);
        System.out.println(organisationUser.toString());
    }
}