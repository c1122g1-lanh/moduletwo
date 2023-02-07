package ss17_io_binary.bai1;

import ss_12_collection.controller.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Control {
    static Scanner scanner = new Scanner(System.in);
    private static final String FILE_PATH = "D:\\module_2\\moduletwo\\src\\ss17_io_binary\\bai1\\Menuproduct.dat";
    static List<ProductManagement> productManagementList = new ArrayList<>();

    public static void writeObject(List<ProductManagement> productManagementList) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oss = new ObjectOutputStream(fos);
        oss.writeObject(productManagementList);
        oss.close();
    }

    public static List<ProductManagement> readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<ProductManagement> productList = (List<ProductManagement>) ois.readObject();
        for (ProductManagement productManagement: productList) {
            System.out.println(productManagement);
        }
        return productList;

    }

    public static void addProduct() throws IOException, ClassNotFoundException {

        System.out.println("nhap ma san pham : ");
        String code = scanner.nextLine();
        System.out.println("nhap ten san pham : ");
        String name = scanner.nextLine();
        System.out.println("nhap hang san xuat : ");
        String nameManufacturer = scanner.nextLine();
        System.out.println(" nhap gia san pham : ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap ten quoc gia : ");
        String country = scanner.nextLine();
        ProductManagement productManagement = new ProductManagement(code, name, nameManufacturer, price, country);
        productManagementList.add(productManagement);
        writeObject(productManagementList);
    }

    public static void disPlay() throws IOException, ClassNotFoundException {
        System.out.println(readObject());

    }

    public static void seachProduct() throws IOException, ClassNotFoundException {
        String codeProduct = scanner.nextLine();
        boolean flag = false;
        for (ProductManagement pr : readObject()) {
            if (codeProduct.equals(pr.getCode())) {
                System.out.println(pr);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("khong tim thay");
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String select = null;
        do {
            System.out.println("Menu select\n " +
                    "1 . add product \n" +
                    " 2 . display product\n" +
                    " 3 . seach product\n" +
                    " 4 . exit \n " +
                    "moi ban chon : ");
            select = scanner.nextLine();
            switch (select) {
                case "1":
                    System.out.println("moi ban them san pham: ");
                    addProduct();
                    break;
                case "2":
                    System.out.println("danh sach san pham : ");
                    disPlay();
                    break;
                case "3":
                    System.out.println("nhap code san pham can tim : ");
                    seachProduct();
                    break;
                case "4":
                    System.out.println("exit");
                    System.exit(1);
                    break;
                default:
                    System.out.println("yeu cau ban nhap 1-3");
            }
        } while (true);

    }


}
