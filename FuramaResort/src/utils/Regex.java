package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String REGEX_MADICHVU_ROOM = "^SVRO-[0-9]{4}$";
    private static final String REGEX_MADICHVU_VILLA = "^SVVL-[0-9]{4}$";
    public Pattern pattern;
    public Matcher matcher;
    public boolean aBoolean(String code){
        pattern = Pattern.compile(REGEX_MADICHVU_ROOM);
        matcher = pattern.matcher(code);
        return matcher.matches();
    }
}
