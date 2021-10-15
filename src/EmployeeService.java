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

    public double calculateSalaryAndBonus() {
        double sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.salaryOfAllEmployees();
        }
        return sumSalary;
    }

    public Employee getById(long id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public Employee[] getByName(String name) {
        int size = 0;
        for (Employee emp : employees) {
            if (emp.getName().equals(name)) {
                size++;
            }
        }
        if (size == 0) {
            return null;
        }
        Employee[] array = new Employee[size];
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                array[count] = employee;
                count++;
            }
        }
        return array;
    }

    Employee remove(long id) {
        int indexToRemove = -1;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.id == id) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            return null;
        }
        //[emp1, emp2, emp3, emp4, emp5] remove(id=3)
        //[emp1, emp2, emp4, emp5]
        Employee[] newEmployeesArray = new Employee[employees.length - 1];
        int newArrayCounter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (i != indexToRemove) {
                newEmployeesArray[newArrayCounter] = employees[i];
                newArrayCounter++;
            }

        }
        Employee removedEmployee = employees[indexToRemove];
        employees = newEmployeesArray;
        return removedEmployee;
    }

    //bubble sort
    Employee[] sortByName() {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < employees.length; i++) {
                if (employees[i].getName().compareTo(employees[i - 1].getName()) < 0) {
                    Employee temp = employees[i];
                    employees[i] = employees[i - 1];
                    employees[i - 1] = temp;
                    isSorted = false;
                }
            }

        }
        return employees;
    }

    //bubble sort
    public Employee[] sortByNameAndSalary() {
        for (int i = 0; i < employees.length - 1; i++) {
            int resultAfterCompareTo = employees[i].getName().compareTo(employees[i + 1].getName());
            if (resultAfterCompareTo > 0 || resultAfterCompareTo == 0 && employees[i].getSalary() > employees[i + 1].getSalary()) {
                Employee temp = employees[i + 1];
                employees[i + 1] = employees[i];
                employees[i] = temp;
            }
        }
        return employees;
    }

}
