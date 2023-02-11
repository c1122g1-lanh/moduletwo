package utils;

import models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFileEmployee{
    private static final String FILE_PATH = "D:\\module_2\\FuramaResort\\src\\data\\employee.csv";
    public static List<Employee> readFileEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
             fileReader = new FileReader(FILE_PATH);
             bufferedReader = new BufferedReader(fileReader);
             String line ;
             String temp[];
             Employee employee;
             while ((line = bufferedReader.readLine())!= null){
                 temp = line.split(",");
                 String maNhanVien = temp[0];
                 String hoVaTen = temp[1];
                 int ngaySinh = Integer.parseInt(temp[2]);
                 String gioiTinh = temp[3];
                 int soCMND = Integer.parseInt(temp[4]);
                 int soDienThoai = Integer.parseInt(temp[5]);
                 String email = temp[6];
                 String trinhDo = temp[7];
                 String viTri = temp[8];
                 double luong = Double.parseDouble(temp[9]);
                 employee = new Employee(maNhanVien,hoVaTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,trinhDo,viTri,luong);
                 employeeList.add(employee);
             }
        } catch (FileNotFoundException e) {
            System.err.println(" khong tim thay file ");
        } catch (IOException e) {
            System.err.println(" khong doc duoc file ");
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return employeeList;
    }
    public static void writeEmployee(Employee employee) throws IOException {

            FileWriter fileWriter = new FileWriter(FILE_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(employee.getMaNhanVien() + "," + employee.getHoVaten() + "," + employee.getNgaySinh() + "," + employee.getGioiTinh() + "," + employee.getSoCMND() + "," + employee.getSoDienThoai() + "," + employee.getEmail() + "," + employee.getTrinhDo() + "," + employee.getViTri() + "," + employee.getLuong());
            bufferedWriter.close();
    }
}
