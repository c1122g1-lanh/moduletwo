package controllers;

import services.CustomerServiceImpl;
import services.CustomerServiceImpl;
import services.EmployeeServiceImpl;
import services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String select;
        try {
            do {
                System.out.println("1.\tEmployee Management\n" +
                        "2.\tCustomer Management\n" +
                        "3.\tFacility Management \n" +
                        "4.\tBooking Management\n" +
                        "5.\tPromotion Management\n" +
                        "6.\tExit\n" +
                        "Moi ban chon :");
                select = scanner.nextLine();
                switch (select) {
                    case "1":
                        String select1;
                        do {
                            System.out.println("1\tDisplay list employees\n" +
                                    "2\tAdd new employee\n" +
                                    "3\tDelete employee\n" +
                                    "4\tEdit employee\n" +
                                    "5\tReturn main menu\n");
                            select1 = scanner.nextLine();
                            switch (select1) {
                                case "1":
                                    System.out.println("danh sach nhan vien : ");
                                    employeeService.disPlayEmployee();
                                    break;
                                case "2":
                                    System.out.println("moi nhap thong tin nhan vien :");
                                    employeeService.addEmployee();
                                    break;
                                case "3":
                                    System.out.println("moi nhap ma nhan vien :");
                                    String maNhanVien = scanner.nextLine();
                                    employeeService.deleteEmplyee(maNhanVien);
                                    System.out.println();
                                case "4":
                                    employeeService.editEmployee();
                                    break;
                                case "5":
                                    return;
                                default:
                                    System.err.println("lua chon khon ton tai.\n" +
                                            "moi nhap lai");
                            }
                        } while (true);
                    case "2":
                        String select2;
                        do {
                            System.out.println("1.\tDisplay list customers\n" +
                                    "2.\tAdd new customer\n" +
                                    "3.\tEdit customer\n" +
                                    "4.\tReturn main menu\n" +
                                    "moi ban chon :");
                            select2 = scanner.nextLine();
                            switch (select2) {
                                case "1":
                                    System.out.println("danh sach khach hang la : \n");
                                    customerService.disPlayCustomer();
                                    break;
                                case "2":
                                    customerService.addCustomer();
                                    break;
                                case "3":
                                    customerService.editCustomer();
                                    break;
                                case "4":
                                    return;
                                case "5":
                                    System.err.println("chon sai moi chon lai ");
                            }
                        } while (true);
                    case "3":
                        String select3;
                        do {
                            select3 = scanner.nextLine();
                            System.out.println("1\tDisplay list facility\n" +
                                    "2\tAdd new facility\n" +
                                    "3\tDisplay list facility maintenance\n" +
                                    "4\tReturn main menu\n" +
                                    "moi ban chon:");
                            switch (select3) {
                                case "1":
                                    System.out.println("danh sach facility :");
                                    facilityService.disPlayFacility();
                                    break;
                                case "2":
                                    String select4;
                                    do {
                                        select4 = scanner.nextLine();
                                        System.out.println("1.\tAdd New Villa\n" +
                                                "2.\tAdd New Room\n" +
                                                "3.\tBack to menu\n" +
                                                "moi ban chon");
                                        switch (select4) {
                                            case "1":
                                                facilityService.addVilla();
                                                break;
                                            case "2":
                                                facilityService.addRoom();
                                                break;
                                            case "3":
                                                return;
                                            default:
                                                System.err.println("lua chon sai\n" +
                                                        "moi nhap lai");
                                        }

                                    } while (true);
                            }
                        } while (true);
                    case "4":
                        System.out.println("1.\tAdd new booking\n" +
                                "2.\tDisplay list booking\n" +
                                "3.\tReturn main menu\n");
                        break;
                    case "5":
                        System.out.println("1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3.\tReturn main menu\n");
                        break;
                    case "6":
                        System.exit(1);
                    case "7":
                        return;
                    default:
                        System.out.println(" Ban da chon sai moi chon lai ");
                }
            } while (true);

        }catch (Exception e){
            System.out.println(" chon sai");
        }

    }
}
