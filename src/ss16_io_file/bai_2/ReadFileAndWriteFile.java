package ss16_io_file.bai_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileAndWriteFile {

    List<Country> countryList = new ArrayList<>();

    public List<Country> readFile() {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("D:\\module_2\\moduletwo\\src\\ss16_io_file\\bai_2\\country.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Country country;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];
                country = new Country(id, code, name);
                countryList.add(country);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return countryList;
    }

    public void writeFile(List<Country> countryList) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\module_2\\moduletwo\\src\\ss16_io_file\\bai_2\\country.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < countryList.size(); i++) {
            bufferedWriter.write(countryList.get(i).getId() + "," + countryList.get(i).getCode() + "," + countryList.get(i).getName() + "\n");
        }
        bufferedWriter.close();
    }
}

