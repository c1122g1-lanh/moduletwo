package ss_12_collection.controller;

import ss_12_collection.service.IProductService;
import ss_12_collection.service.ProductImpl;

import java.util.Scanner;

public class Product {
    public static void menuController() {
        IProductService iProductService = new ProductImpl();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nQuan li san pham:\n" +
                    "1. Them san pham.\n" +
                    "2. Sua thong tin theo id.\n" +
                    "3. Xoa san pham theo id.\n" +
                    "4. Hien thi danh sach san pham.\n" +
                    "5. Tim kiem san pham theo ten.\n" +
                    "6. Sap xep san pham thoe thứ tự tang,giam.\n" +
                    "7. Thoat chuong trinh.\n");
            System.out.println("enter choose :");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.edit();
                    break;
                case 3:
                    iProductService.delete();
                    break;
                case 4:
                    iProductService.displays();
                    break;
                case 5:
                    iProductService.search();
                    break;
                case 6:
                    iProductService.sort();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("nhap sai, moi nhap lai ");
            }
        }
        while (true);
    }
}
