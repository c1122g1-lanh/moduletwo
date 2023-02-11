package services;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("m123", "Nguyen Van Minh", 1998, "BD", 123456, 123456, "minhbede@gmail.com", "DH", "PTGD", 1200));
        employeeList.add(new Employee("m124", "Le Van Chinh", 2003, "BD", 123457, 123457, "chinhbede@gmail.com", "DH", "TGD", 2400));
        employeeList.add(new Employee("m125", "Nguyen Minh Lanh", 1990, "BD", 123458, 123458, "lanhbede@gmail.com", "DH", "LX", 200));
    }

    public void addEmployee() {
        boolean flag = false;
        String maNhanVien;
        do {
            System.out.println("nhap ma nhan vien :");
            maNhanVien = scanner.nextLine();
            for (int i = 0; i < employeeList.size(); i++) {
                if (maNhanVien.equals(employeeList.get(i).getMaNhanVien())) {
                    System.out.println("nhan vien da ton tai\n" +
                            "moi nhap lai ");
                    flag = true;
                    break;
                }
            }
        } while (flag);
        System.out.println("nhap ten");
        String hoVaTen = scanner.nextLine();
        System.out.println("nhap ngay sinh");
        int ngaySinh = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap gioi tinh :");
        String gioiTinh = scanner.nextLine();
        System.out.println("nhap so CMND");
        int soCMND = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhap so dien thoai :");
        int soDienThoai = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap email :");
        String email = scanner.nextLine();
        System.out.println("nhap trinh do nhan vien :");
        String trinhDo = scanner.nextLine();
        System.out.println("nhap vi tri nhan vien :");
        String viTri = scanner.nextLine();
        System.out.println("nhap luong nhan vien :");
        double luong = Double.parseDouble(scanner.nextLine());
        employeeList.add(new Employee(maNhanVien, hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, trinhDo, viTri, luong));
    }

    public void disPlayEmployee() {
        for (Employee eList : employeeList) {
            System.out.println(eList);
        }
    }

    public void deleteEmplyee(String maNhanVien) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (maNhanVien == employeeList.get(i).getMaNhanVien()) {
                employeeList.remove(i);
                break;
            }
        }
        System.out.println(" nhan vien co so CMND " + maNhanVien + " da bi xoa khoi danh sach ");
    }

    public void editEmployee() {
        do {
            System.out.println(
                    "1. sua ten\n" +
                            "2. sua ngay sinh\n" +
                            "3. sua gioi tinh\n" +
                            "4. sua soCMND\n" +
                            "5. sua soDIenThoai\n" +
                            "6. sua email\n" +
                            "7. sua maNhanVien\n" +
                            "8. sua tring do\n" +
                            "9. sua vi tri\n" +
                            "10. sua luong\n" +
                            "11. ve menu chinh\n" +
                            " moi ban chon : \n");
            String select = scanner.nextLine();
            switch (select) {
                case "1":
                    System.out.println("nhap so ma so cua nhan vien can thay doi ten ");
                    String maNhanVien = scanner.nextLine();
                    System.out.println("nhap ten moi");
                    String tenMOi = scanner.nextLine();
                    int i;
                    boolean flag = false;
                    for (i = 0; i < employeeList.size(); i++) {
                        if (maNhanVien == employeeList.get(i).getMaNhanVien()) {
                            employeeList.get(i).setHoVaten(tenMOi);
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        System.out.println("ten moi cua nhan vien la " + employeeList.get(i).getHoVaten());
                    } else {
                        System.out.println("nhan vien khong ton tai ");
                    }
                    break;
                case "2":
                    System.out.println("nhap so ma so cua nhan vien can thay doi ten ");
                    String maNhanVien1 = scanner.nextLine();
                    System.out.println("nhap ngay sinh moi ");
                    int ngaySinhMoi = Integer.parseInt(scanner.nextLine());
                    int i2;
                    boolean flag2 = false;
                    for (i2 = 0; i2 < employeeList.size(); i2++) {
                        if (maNhanVien1 == employeeList.get(i2).getMaNhanVien()) {
                            employeeList.get(i2).setNgaySinh(ngaySinhMoi);
                            flag2 = true;
                            break;
                        }
                    }
                    if (flag2) {
                        System.out.println("ngay sinh moi cua nhan vien la " + employeeList.get(i2).getNgaySinh());
                    } else {
                        System.out.println("nhan vien khong ton tai ");
                    }
                    break;
                case "3":
                    System.out.println("nhap so ma so cua nhan vien can thay doi ten ");
                    String maNhanVien3 = scanner.nextLine();
                    System.out.println("nhap gioi tinh moi ");
                    String gioiTinh = scanner.nextLine();
                    int i3;
                    boolean flag3 = false;
                    for (i3 = 0; i3 < employeeList.size(); i3++) {
                        if (maNhanVien3 == employeeList.get(i3).getMaNhanVien()) {
                            employeeList.get(i3).setGioiTinh(gioiTinh);
                            flag3 = true;
                            break;
                        }
                    }
                    if (flag3) {
                        System.out.println("gioi tinh moi cua nhan vien la " + employeeList.get(i3).getGioiTinh());
                    } else {
                        System.out.println("nhan vien khong ton tai ");
                    }
                    break;
                case "4":
                    System.out.println("nhap so ma so cua nhan vien can thay doi ten ");
                    String maNhanVien4 = scanner.nextLine();
                    System.out.println("nhap ngay sinh moi ");
                    int soCMNDMoi = Integer.parseInt(scanner.nextLine());
                    int i1;
                    boolean flag4 = false;
                    for (i1 = 0; i1 < employeeList.size(); i1++) {
                        if (maNhanVien4 == employeeList.get(i1).getMaNhanVien()) {
                            employeeList.get(i1).setSoCMND(soCMNDMoi);
                            flag4 = true;
                            break;
                        }
                    }
                    if (flag4) {
                        System.out.println("so cmnd moi cua nhan vien la " + employeeList.get(i1).getSoCMND());
                    } else {
                        System.out.println("nhan vien khong ton tai ");
                    }
                    break;
                case "5":
                    System.out.println("nhap so ma so cua nhan vien can thay doi ten ");
                    String maNhanVien5 = scanner.nextLine();
                    System.out.println("nhap ngay sinh moi ");
                    int soDienThoaiMoi = Integer.parseInt(scanner.nextLine());
                    int i4;
                    boolean flag5 = false;
                    for (i4 = 0; i4 < employeeList.size(); i4++) {
                        if (maNhanVien5 == employeeList.get(i4).getMaNhanVien()) {
                            employeeList.get(i4).setSoDienThoai(soDienThoaiMoi);
                            flag5 = true;
                            break;
                        }
                    }
                    if (flag5) {
                        System.out.println("so dien thoai moi cua nhan vien la " + employeeList.get(i4).getSoDienThoai());
                    } else {
                        System.out.println("nhan vien khong ton tai ");
                    }
                    break;
                case "6":
                    System.out.println("nhap so ma so cua nhan vien can thay doi ten ");
                    String maNhanVien6 = scanner.nextLine();
                    System.out.println("nhap email moi nhan vien ");
                    String emailMoi = scanner.nextLine();
                    int i6;
                    boolean flag6 = false;
                    for (i6 = 0; i6 < employeeList.size(); i6++) {
                        if (maNhanVien6 == employeeList.get(i6).getMaNhanVien()) {
                            employeeList.get(i6).setEmail(emailMoi);
                            flag6 = true;
                            break;
                        }
                    }
                    if (flag6) {
                        System.out.println("ma nhan vien moi cua nhan vien la " + employeeList.get(i6).getEmail());
                    } else {
                        System.out.println("nhan vien khong ton tai ");
                    }
                    break;

                case "7":
                    System.out.println("nhap so ma so cua nhan vien can thay doi ten ");
                    String maNhanVien7 = scanner.nextLine();
                    System.out.println("nhap ma nhan vien moi ");
                    String maNhanVienMoi = scanner.nextLine();
                    int i7;
                    boolean flag7 = false;
                    for (i7 = 0; i7 < employeeList.size(); i7++) {
                        if (maNhanVien7 == employeeList.get(i7).getMaNhanVien()) {
                            employeeList.get(i7).setMaNhanVien(maNhanVienMoi);
                            flag7 = true;
                            break;
                        }
                    }
                    if (flag7) {
                        System.out.println("ma nhan vien moi cua nhan vien la " + employeeList.get(i7).getMaNhanVien());
                    } else {
                        System.out.println("nhan vien khong ton tai ");
                    }
                    break;
                case "8":
                    System.out.println("nhap so ma so cua nhan vien can thay doi ten ");
                    String maNhanVien8 = scanner.nextLine();
                    System.out.println("nhap trinh do moi ");
                    String trinhDo = scanner.nextLine();
                    int i8;
                    boolean flag8 = false;
                    for (i8 = 0; i8 < employeeList.size(); i8++) {
                        if (maNhanVien8 == employeeList.get(i8).getMaNhanVien()) {
                            employeeList.get(i8).setTrinhDo(trinhDo);
                            flag8 = true;
                            break;
                        }
                    }
                    if (flag8) {
                        System.out.println("ngay sinh moi cua nhan vien la " + employeeList.get(i8).getTrinhDo());
                    } else {
                        System.out.println("nhan vien khong ton tai ");
                    }
                    break;
                case "9":
                    System.out.println("nhap so ma so cua nhan vien can thay doi ten ");
                    String maNhanVien9 = scanner.nextLine();
                    System.out.println("nhap vi tri moi nhan vien ");
                    String viTriMoi = scanner.nextLine();
                    int i9;
                    boolean flag9 = false;
                    for (i9 = 0; i9 < employeeList.size(); i9++) {
                        if (maNhanVien9 == employeeList.get(i9).getMaNhanVien()) {
                            employeeList.get(i9).setViTri(viTriMoi);
                            flag9 = true;
                            break;
                        }
                    }
                    if (flag9) {
                        System.out.println("vi tri moi cua nhan vien la " + employeeList.get(i9).getViTri());
                    } else {
                        System.out.println("nhan vien khong ton tai ");
                    }
                    break;
                case "10":
                    System.out.println("nhap so ma so cua nhan vien can thay doi ten ");
                    String maNhanVien10 = scanner.nextLine();
                    System.out.println("nhap luong moi nhan vien ");
                    double luongMoi = Double.parseDouble(scanner.nextLine());
                    int i10;
                    boolean flag10 = false;
                    for (i10 = 0; i10 < employeeList.size(); i10++) {
                        if (maNhanVien10 == employeeList.get(i10).getMaNhanVien()) {
                            employeeList.get(i10).setLuong(luongMoi);
                            flag10 = true;
                            break;
                        }
                    }
                    if (flag10) {
                        System.out.println("luong moi cua nhan vien la " + employeeList.get(i10).getLuong());
                    } else {
                        System.out.println("nhan vien khong ton tai ");
                    }
                    break;
                case "11":
                    return;
                default:
                    System.err.println("lua chon sai\n" +
                            "moi chon lai ");
            }
        } while (true);
    }

    @Override
    public void disPlayFacility() {

    }

    @Override
    public void disPlayFacilityMaintenance() {

    }
}
