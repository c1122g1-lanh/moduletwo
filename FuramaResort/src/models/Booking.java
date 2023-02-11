package models;

import java.util.Objects;

public class Booking {
    private String maBooking;
    private int ngayBatDau;
    private int ngayKetThuc;
    private String maKhachHang;
    private String tenDichVu;

    public Booking() {
    }

    public Booking(String maBooking, int ngayBatDau, int ngayKetThuc, String maKhachHang, String tenDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public int getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(int ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public int getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(int ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking='" + maBooking + '\'' +
                ", ngayBatDau=" + ngayBatDau +
                ", ngayKetThuc=" + ngayKetThuc +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return ngayBatDau == booking.ngayBatDau && ngayKetThuc == booking.ngayKetThuc && Objects.equals(maBooking, booking.maBooking) && Objects.equals(maKhachHang, booking.maKhachHang) && Objects.equals(tenDichVu, booking.tenDichVu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maBooking, ngayBatDau, ngayKetThuc, maKhachHang, tenDichVu);
    }
}
