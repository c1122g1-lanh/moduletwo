package utils;

import models.Employee;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employeeList = ReadAndWriteFileEmployee.readFileEmployee();
        for (Employee employee : employeeList){
            System.out.println(employee+"\n");
        }
    }
}
