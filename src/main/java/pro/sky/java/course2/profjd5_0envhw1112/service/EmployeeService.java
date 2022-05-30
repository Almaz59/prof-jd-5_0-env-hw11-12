package pro.sky.java.course2.profjd5_0envhw1112.service;

import pro.sky.java.course2.profjd5_0envhw1112.data.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName);

    List<Employee> showList();
}
