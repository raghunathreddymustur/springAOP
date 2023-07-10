package adviceTypes.repo;

import adviceTypes.pojo.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository {
    public Employee findEmployeeById(long id) {
        System.out.println("Find by Employee is called");
        if (id == -1)
            throw new IllegalArgumentException("id cannot be -1");

        return new Employee(id);
    }

    public void saveEmployee(Employee employee) {
    }

    public void deleteEmployee(Employee employee) {
    }
}
