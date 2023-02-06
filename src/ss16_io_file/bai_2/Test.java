package ss16_io_file.bai_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        Country country = new Country(5, "JP", "Japan");
        Country country1 = new Country(6, "CN", "China");
        Country country2 = new Country(7, "JP", "Japan");
        Country country3 = new Country(8, "TH", "Thailand");
        List<Country> countryList = new ArrayList<>();
        countryList.add(country);
        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);
        ReadFile readFile = new ReadFile();
        readFile.writeFile(countryList);
    }
}
