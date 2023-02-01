package ss_12_collection.service;

import ss_12_collection.controller.Product;
import ss_12_collection.model.ProductModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements IProductService {
    Scanner scanner = new Scanner(System.in);
    List<ProductModel> productModelList = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("enter id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(" enter name :");
        String name = scanner.nextLine();
        System.out.println(" enter price");
        int price = Integer.parseInt(scanner.nextLine());
        productModelList.add(new ProductModel(id, name, price));
        System.out.println(" enter success ");
    }

    @Override
    public void edit() {
        System.out.println("Nhap id san pham can sua : ");
        int idSet = Integer.parseInt(scanner.nextLine());
        boolean isExist = false;

        for (int i = 0; i < productModelList.size(); i++) {
            if (productModelList.get(i).getId() == idSet) {
                System.out.println("san pham can sua: \n" + productModelList.get(i));
                int chooseYesNo = Integer.parseInt(scanner.nextLine());

                if (chooseYesNo == 1) {
                    System.out.print("enter new name: ");
                    String name = scanner.nextLine();

                    System.out.print("enter new price (VNĐ): ");
                    int price = Integer.parseInt(scanner.nextLine());

                    productModelList.set(i, new ProductModel(productModelList.get(i).getId(), name, price));
                    System.out.println("Success ");
                }
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("enter false");
        }
    }

    @Override
    public void delete() {
        System.out.println(" nhap id san phan can xoa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isExist = false;

        for (ProductModel product : productModelList) {
            if (product.getId() == idRemove) {
                System.out.println("ban co muon xoa khong? \n" +
                        "1. yes \n" +
                        "2. no");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());

                if (chooseYesNo == 1) {
                    productModelList.remove(product);
                    System.out.println("delete success!");
                }
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("enter false");
        }

    }

    @Override
    public void displays() {
        for (ProductModel product : productModelList) {
            System.out.println(product);
        }

    }

    @Override
    public void sort() {
        int choose;
        do {
            System.out.println("Sắp xếp: \n" +
                    "1. Tăng dần.\n" +
                    "2. Giảm dần.");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose != 1 && choose != 2) {
                System.out.println("Nhập lại!");
            }
        } while (choose != 1 && choose != 2);

        ProductUp productUp = new ProductUp();
        ProductDown productDown = new ProductDown();
        if (choose == 1) {
            productModelList.sort(productUp);
            System.out.println("sap xep san pahm tang dan: ");
        } else {
            productModelList.sort(productDown);
            System.out.println("sap xep san phan giam: ");
        }

        for (ProductModel product : productModelList) {
            System.out.println(product);
        }
    }

    @Override
    public void search() {
        System.out.println("enter name seach: ");
        String nameFind = scanner.nextLine();
        boolean isExist = false;

        for (ProductModel product : productModelList) {
            if (product.getName().toLowerCase().contains(nameFind.toLowerCase())) {
                System.out.println(product);
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println("no seach!");
        }
    }
}
