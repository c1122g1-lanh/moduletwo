package models;

public class Employee extends Person{
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private double luong;


    public Employee(String maNhanVien,String hoVaTen, int ngaySinh, String gioiTinh, int soCMND, int soDienThoai, String email,  String trinhDo, String viTri, double luong) {
        super(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return  maNhanVien + " , " + hoVaten + " , " + ngaySinh + " , " + gioiTinh + " , " + soCMND+ " , " + soDienThoai + " , " + email + " , "  + trinhDo+ " , " + viTri + " , " + luong + " . ";
    }
}
