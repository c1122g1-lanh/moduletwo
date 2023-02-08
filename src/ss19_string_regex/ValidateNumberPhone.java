package ss19_string_regex;

public class ValidateNumberPhone {
    private static final String REGEX_NUMBERPHONE = "^(\\(84)\\)-(\\(0\\d{9}\\))$";

    public static void main(String[] args) {
        System.out.println("(a8)-(22222222)".matches(REGEX_NUMBERPHONE));
    }
}
