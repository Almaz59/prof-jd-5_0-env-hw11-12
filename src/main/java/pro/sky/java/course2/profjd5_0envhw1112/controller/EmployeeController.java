package pro.sky.java.course2.profjd5_0envhw1112.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.profjd5_0envhw1112.data.Employee;
import pro.sky.java.course2.profjd5_0envhw1112.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("firstName") String firstName,
                                @RequestParam("lastName") String lastName) {

        return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping("/list")
    public List<Employee> showList() {
        return employeeService.showList();
    }

}
