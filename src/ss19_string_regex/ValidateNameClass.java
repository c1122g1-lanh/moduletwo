package ss19_string_regex;

import java.util.regex.Pattern;

public class ValidateNameClass {
    private static final String REGEX_NAMECLASS = "^(C|P|A)\\d{4}(G|H|I|K|L|M)$";

    public static void main(String[] args) {
        System.out.println("C@318G".matches(REGEX_NAMECLASS));

    }

}
