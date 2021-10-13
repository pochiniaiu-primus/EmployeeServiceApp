public class EmployeeService {
    public Employee[] employees;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public double sumSalaryAndBonus() {
        double sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.salaryOfAllEmployees();
        }
        return sumSalary;
    }

    public Employee getById(long id) {
        for(Employee employee : employees) {
            if(employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}