package services;

import models.Customer;
import models.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
     Scanner scanner = new Scanner(System.in);
     static List<Customer> customerList = new LinkedList<>();
    static {
        customerList.add(new Customer("k123", "Nguyen Van A", 1998, "Nam", 123456, 123456, "minh@gmail.com", "Gold", "QN"));
        customerList.add(new Customer("m124", "Le Van B", 2003, "Nu", 123457, 123457, "chinh@gmail.com", "silver", "DN" ));
        customerList.add(new Customer("m125", "Nguyen Minh C", 1990, "Nam", 123458, 123458, "lanh@gmail.com", "member", "HCM"));
    }
     public void disPlayCustomer(){
         for (Customer eList : customerList) {
             System.out.println(eList);
         }
     }
     public void addCustomer(){
         System.out.println("nhap ma khach hang ");
         String maKhachHang = scanner.nextLine();
         System.out.println("nhap ten ");
         String ten = scanner.nextLine();
         System.out.println("nhap ngay sinh ");
         int ngaySinh = Integer.parseInt(scanner.nextLine());
         System.out.println("nhap gioi tinh ");
         String gioiTinh = scanner.nextLine();
         System.out.println("nhap so CMND ");
         int soCMND = Integer.parseInt(scanner.nextLine());
         System.out.println("nhap so dien thoai ");
         int soDienThoai = Integer.parseInt(scanner.nextLine());
         System.out.println("nhap email ");
         String email = scanner.nextLine();
         System.out.println("nhap loai khach ");
         String loaiKhach = scanner.nextLine();
         System.out.println("nhap dia chi ");
         String diaChi = scanner.nextLine();
         customerList.add(new Customer(maKhachHang,ten,ngaySinh,gioiTinh,soCMND,soDienThoai,email,loaiKhach,diaChi));
     }
    public void editCustomer() {
        do {
            System.out.println(
                            "1. sua ten\n" +
                            "2. sua ngay sinh\n" +
                            "3. sua gioi tinh\n" +
                            "4. sua soCMND\n" +
                            "5. sua soDIenThoai\n" +
                            "6. sua email\n" +
                            "7. sua ma khach hang\n" +
                            "8. sua loai khach\n" +
                            "9. sua dia chi\n" +
                            " moi ban chon : \n");
            String select = scanner.nextLine();
            switch (select) {
                case "1":
                    System.out.println("nhap ma so cua khach hang can thay doi ten ");
                    String maKhachHang = scanner.nextLine();
                    System.out.println("nhap ten moi");
                    String tenMOi = scanner.nextLine();
                    int i;
                    boolean flag = false;
                    for (i = 0; i < customerList.size(); i++) {
                        if (maKhachHang.equals(customerList.get(i).getMaKhachHang())) {
                            customerList.get(i).setHoVaten(tenMOi);
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        System.out.println("ten moi cua khach hang co ma " + maKhachHang +" la :" + customerList.get(i).getHoVaten());
                    } else {
                        System.out.println("chua co khach hang nay \n" +
                                "moi nhap lai ");
                        return;
                    }
                    break;
                case "2":
                    System.out.println("nhap ma so cua khach hang can thay doi ngay sinh ");
                    String maKhachHang2 = scanner.nextLine();
                    System.out.println("nhap ngay sinh moi ");
                    int ngaySinhMoi = Integer.parseInt(scanner.nextLine());
                    int i2;
                    boolean flag2 = false;
                    for (i2 = 0; i2 < customerList.size(); i2++) {
                        if (maKhachHang2 == customerList.get(i2).getMaKhachHang()) {
                            customerList.get(i2).setNgaySinh(ngaySinhMoi);
                            flag2 = true;
                            break;
                        }
                    }
                    if (flag2) {
                            System.out.println("ngay sinh moi cua khach hang "+ maKhachHang2 +" la " + customerList.get(i2).getNgaySinh());
                        } else {
                            System.out.println("khach hang khong ton tai ");
                        }
                        break;
                case "3":
                    System.out.println("nhap  ma so cua khach hang can thay doi ");
                    String maKhachHang3 = scanner.nextLine();
                    System.out.println("nhap gioi tinh moi ");
                    String gioiTinh = scanner.nextLine();
                    int i3;
                    boolean flag3 = false;
                    for (i3 = 0; i3 < customerList.size(); i3++) {
                        if (maKhachHang3 == customerList.get(i3).getMaKhachHang()) {
                            customerList.get(i3).setGioiTinh(gioiTinh);
                            flag3 = true;
                            break;
                        }
                    }
                    if (flag3) {
                        System.out.println("gioi tinh moi cua khach hang "+ maKhachHang3 +" la " + customerList.get(i3).getGioiTinh());
                    } else {
                        System.out.println("khach hang khong ton tai ");
                    }
                    break;
                case "4":
                    System.out.println("nhap  ma so cua khach hang can thay doi ");
                    String maKhachHang4 = scanner.nextLine();
                    System.out.println("nhap so CMND moi ");
                    int soCMNDMoi = Integer.parseInt(scanner.nextLine());
                    int i1;
                    boolean flag4 = false;
                    for (i1 = 0; i1 < customerList.size(); i1++) {
                        if (maKhachHang4 == customerList.get(i1).getMaKhachHang()) {
                            customerList.get(i1).setSoCMND(soCMNDMoi);
                            flag4 = true;
                            break;
                        }
                    }
                    if (flag4) {
                        System.out.println("so cmnd moi cua khach hang "+ maKhachHang4 + " la " + customerList.get(i1).getSoCMND());
                    } else {
                        System.out.println("nhan vien khong ton tai ");
                    }
                    break;
                case "5":
                    System.out.println("nhap ma so cua khach hang can thay doi ");
                    String maKhachHang5 = scanner.nextLine();
                    System.out.println("nhap so dien thoai moi ");
                    int soDienThoaiMoi = Integer.parseInt(scanner.nextLine());
                    int i4;
                    boolean flag5 = false;
                    for (i4 = 0; i4 < customerList.size(); i4++) {
                        if (maKhachHang5 == customerList.get(i4).getMaKhachHang()) {
                            customerList.get(i4).setSoDienThoai(soDienThoaiMoi);
                            flag5 = true;
                            break;
                        }
                    }
                    if (flag5) {
                        System.out.println("so dien thoai moi cua khach hang "+ maKhachHang5 + " la " + customerList.get(i4).getSoDienThoai());
                    } else {
                        System.out.println("khach hang khong ton tai ");
                    }
                    break;
                case "6":
                    System.out.println("nhap ma khach hang can thay doi ");
                    String maKhachHang6 = scanner.nextLine();
                    System.out.println("nhap email moi khach hang ");
                    String emailMoi = scanner.nextLine();
                    int i6;
                    boolean flag6 = false;
                    for (i6 = 0; i6 < customerList.size(); i6++) {
                        if (maKhachHang6 == customerList.get(i6).getMaKhachHang()) {
                            customerList.get(i6).setEmail(emailMoi);
                            flag6 = true;
                            break;
                        }
                    }
                    if (flag6) {
                        System.out.println("email  moi cua khach hang "+ maKhachHang6 +" la " + customerList.get(i6).getEmail());
                    } else {
                        System.out.println("khach hang khong ton tai ");
                    }
                    break;

                case "7":
                    System.out.println("nhap  ma so cua khach hang can thay doi ");
                    String maKhachHang7 = scanner.nextLine();
                    System.out.println("nhap ma khach hang moi ");
                    String maKhachHangMoi = scanner.nextLine();
                    int i7;
                    boolean flag7 = false;
                    for (i7 = 0; i7 < customerList.size(); i7++) {
                        if (maKhachHang7 == customerList.get(i7).getMaKhachHang()) {
                            customerList.get(i7).setMaKhachHang(maKhachHang7);
                            flag7 = true;
                            break;
                        }
                    }
                    if (flag7) {
                        System.out.println("ma khach hang moi cua khach hang "+ maKhachHang7 +" la " + customerList.get(i7).getMaKhachHang());
                    } else {
                        System.out.println("khach hang khong ton tai ");
                    }
                    break;
                case "8":
                    System.out.println("nhap ma so cua khach hang can thay doi ");
                    String maKhachHang8 = scanner.nextLine();
                    System.out.println("nhap trinh do moi ");
                    String loaiKhach = scanner.nextLine();
                    int i8;
                    boolean flag8 = false;
                    for (i8 = 0; i8 < customerList.size(); i8++) {
                        if (maKhachHang8 == customerList.get(i8).getMaKhachHang()) {
                            customerList.get(i8).setLoaiKhach(loaiKhach);
                            flag8 = true;
                            break;
                        }
                    }
                    if (flag8) {
                        System.out.println("loai khach moi la " + customerList.get(i8).getLoaiKhach());
                    } else {
                        System.out.println("khach hang khong ton tai ");
                    }
                    break;
                case "9":
                    System.out.println("nhap ma khach hang can thay doi  ");
                    String maKhachHang9 = scanner.nextLine();
                    System.out.println("nhap dia chi moi khach hang ");
                    String diaChi = scanner.nextLine();
                    int i9;
                    boolean flag9 = false;
                    for (i9 = 0; i9 < customerList.size(); i9++) {
                        if (maKhachHang9 == customerList.get(i9).getMaKhachHang()) {
                            customerList.get(i9).setDiaChi(diaChi);
                            flag9 = true;
                            break;
                        }
                    }
                    if (flag9) {
                        System.out.println("diq chi moi cua khach hang "+ maKhachHang9 +" la " + customerList.get(i9).getDiaChi());
                    } else {
                        System.out.println("khanh hang khong ton tai ");
                    }
                    break;
                case "10":
                    return;
                default:
                    System.err.println("lua chon sai\n" +
                            "moi chon lai ");
            }
        }while (true);
    }

    @Override
    public void disPlayFacility() {

    }

    @Override
    public void disPlayFacilityMaintenance() {

    }
}
