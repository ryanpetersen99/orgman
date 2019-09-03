package ac.za.cput.adp3.xyzcongolmerate.util;
/* Ryan Petersen 217027806 */
import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);
        String capitals = "";

        for (int i = 0; i < className.length(); i++) {
            if (Character.isUpperCase(className.charAt(i)))
                capitals = capitals + className.charAt(i);
        }
        return capitals;
    }
}
