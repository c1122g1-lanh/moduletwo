package services;

import models.Facility;
import models.Room;
import models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    static Map<Room, Integer> facilityRoom = new LinkedHashMap();

    static {
        facilityRoom.put(new Room("room1", 50, 1200, 3, "ngay", "khong"), 2);
        facilityRoom.put(new Room("room2", 40, 1100, 2, "ngay", "khong"), 3);
        facilityRoom.put(new Room("room3", 30, 1000, 2, "ngay", "khong"), 4);
    }

    static Map<Villa, Integer> facilityVilla = new LinkedHashMap();

    static {
        facilityVilla.put(new Villa("villa1", 50, 1200, 3, "ngay", 5, 5, 2), 2);
        facilityVilla.put(new Villa("villa2", 40, 1100, 2, "ngay", 4, 5, 2), 3);
        facilityVilla.put(new Villa("villa3", 30, 1000, 2, "ngay", 3, 4, 2), 4);
    }

    static Map<Villa, Integer> facilityVillaMaintenance = new LinkedHashMap();

    static {
        facilityVillaMaintenance.put(new Villa("villa3", 30, 1000, 2, "ngay", 3, 4, 2), 4);
    }

    @Override
    public void addRoom() {
        System.out.println("nhap ten room");
        String room = scanner.nextLine();
        System.out.println("nhap dien tich room");
        double dienTich = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap chi phi thue room");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.println(" nhap so nguoi toi da");
        int soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap kieu thue");
        String kieuThue = scanner.nextLine();
        System.out.println("nhap dich vu mien phi di kem");
        String dichVuDiKem = scanner.nextLine();
    }

    @Override
    public void addVilla() {
        System.out.println("nhap ten villa");
        String villa = scanner.nextLine();
        System.out.println("nhap dien tich villa");
        double dienTich = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap chi phi thue villa");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap kieu thue");
        String kieuThue = scanner.nextLine();
        System.out.println("nhap tieu chuan phong");
        int tieuChuan = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap dien tich ho boi");
        double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap so tang");
        int soTang = Integer.parseInt(scanner.nextLine());
        String select = scanner.nextLine();

    }

    @Override
    public void disPlayFacility() {
        for (Map.Entry<Room, Integer> entry : facilityRoom.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        for (Map.Entry<Villa, Integer> entry1 : facilityVilla.entrySet()) {
            System.out.println(entry1.getKey() + " - " + entry1.getValue());
        }
    }

    @Override
    public void disPlayFacilityMaintenance() {
        for (Map.Entry<Villa, Integer> entry1 : facilityVillaMaintenance.entrySet()) {
            System.out.println(entry1.getKey() + " - " + entry1.getValue());
        }
    }
}
