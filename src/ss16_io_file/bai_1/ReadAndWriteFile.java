package ss16_io_file.bai_1;

import java.io.*;
import java.util.List;

public class ReadAndWriteFile {
    private static final String FILE_PATH = "D:\\module_2\\moduletwo\\src\\ss16_io_file\\bai_1\\source.csv";

    private static final String FILE_PATH1 = "D:\\module_2\\moduletwo\\src\\ss16_io_file\\bai_1\\target.csv";


    public static void copyFile() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(FILE_PATH1);
            bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        copyFile();
    }
}
