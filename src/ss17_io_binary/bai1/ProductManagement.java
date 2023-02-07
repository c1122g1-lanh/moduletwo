package ss17_io_binary.bai1;

import java.io.Serializable;

public class ProductManagement implements Serializable {
    private String code;
    private String name;
    private String nameManufacturer;
    private double price;
    private String country;

    public ProductManagement() {
    }

    public ProductManagement(String code, String name, String nameManufacturer, double price, String country) {
        this.code = code;
        this.name = name;
        this.nameManufacturer = nameManufacturer;
        this.price = price;
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", nameManufacturer='" + nameManufacturer + '\'' +
                ", price=" + price +
                ", country='" + country + '\'' +
                '}';
    }
}
