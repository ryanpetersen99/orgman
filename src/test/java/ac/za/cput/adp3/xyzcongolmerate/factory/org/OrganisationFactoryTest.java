package ac.za.cput.adp3.xyzcongolmerate.factory.org;
/* Ryan Petersen 217027806 */
import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {


    @Test
    public void buildOrganisation() {
        Organisation organisation = OrganisationFactory.buildOrganisation("University");
        Assert.assertNotNull(organisation.getOrgCode());
        System.out.println(organisation.toString());
    }
}