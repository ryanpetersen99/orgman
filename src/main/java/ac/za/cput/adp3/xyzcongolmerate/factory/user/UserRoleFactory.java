package ac.za.cput.adp3.xyzcongolmerate.factory.user;
/* Ryan Petersen 21702806 */
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;

public class UserRoleFactory {

    public static UserRole buildUserRole(String orgCode, String userEmail, String roleId) {
        return new UserRole(orgCode,userEmail,roleId);
    }
}
