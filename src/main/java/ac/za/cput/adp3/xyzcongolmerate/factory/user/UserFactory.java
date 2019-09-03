package ac.za.cput.adp3.xyzcongolmerate.factory.user;
/* Ryan Petersen 217027806 */
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;

public class UserFactory {

    //TODO: implement method body ONLY!
    public static User buildUser(String userEmail, String firstName, String lastName) {
        return new User.Builder().firstName(firstName).lastName(lastName).userEmail(userEmail).build();
    }
}
