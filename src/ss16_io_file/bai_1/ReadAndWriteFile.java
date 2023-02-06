package ss16_io_file.bai_1;

import java.io.*;
import java.util.List;

public class ReadAndWriteFile {
    public static void copyFile(String sourceFile, String targetFile) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileReader = new FileReader(sourceFile);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(targetFile);
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
        String sourceFile = "D:\\module_2\\moduletwo\\src\\ss16_io_file\\source.csv";
        String targetFile = "D:\\module_2\\moduletwo\\src\\ss16_io_file\\target.csv";
        copyFile(sourceFile, targetFile);
    }
}
