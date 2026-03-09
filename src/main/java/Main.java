import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {

        String text = "    hello IntelliJ         ";
        String trimmed = StringUtils.trim(text);
        System.out.println(trimmed);

    }
}
