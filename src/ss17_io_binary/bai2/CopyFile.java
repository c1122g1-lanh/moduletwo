package ss17_io_binary.bai2;

import java.io.*;
import java.util.List;

public class CopyFile {
    public static void copyFile() throws IOException, ClassNotFoundException {
        File file = new File("D:\\module_2\\moduletwo\\src\\ss17_io_binary\\bai1\\menuproduct.dat");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        FileOutputStream fos = new FileOutputStream("D:\\module_2\\moduletwo\\src\\ss17_io_binary\\bai2\\targetfile.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        List list = (List) ois.readObject();
        oos.writeObject(list);
        System.out.println(file.length());
        ois.close();
        oos.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        copyFile();
    }

}
