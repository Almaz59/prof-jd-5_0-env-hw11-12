package pro.sky.java.course2.profjd5_0envhw1112.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import pro.sky.java.course2.profjd5_0envhw1112.data.Employee;
import pro.sky.java.course2.profjd5_0envhw1112.exeption.BadRequestExeption;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public Employee addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(StringUtils.capitalize(StringUtils.lowerCase(firstName)), StringUtils.capitalize(StringUtils.lowerCase(lastName)));
        if (!StringUtils.isAlpha(employee.getFirstName()) || !StringUtils.isAlpha(employee.getLastName())) {
            throw new BadRequestExeption();
        }
        employees.add(employee);
        return employee;
    }


    @Override
    public List<Employee> showList() {
        return employees;
    }
}
