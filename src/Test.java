import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee[] employees = employeeFactory.generateEmployees(10);
        EmployeeService service = new EmployeeService(employees);
        //void printEmployees()
        service.printEmployees();
        System.out.println("====================================");
        //getById
        Employee employeeById = service.getById(5);
        System.out.println(employeeById);
        System.out.println("====================================");
        // calculateSalaryAndBonus
        int calculateSalaryAndBonus = (int) service.calculateSalaryAndBonus();
        System.out.println(calculateSalaryAndBonus);
        System.out.println("====================================");
        //employeeByName
        Employee[] employeeByName1 = service.getByName("Serhii");
        Employee[] employeeByName2 = service.getByName("Petr");
        Employee[] employeeByName3 = service.getByName("Tolik");
        Employee[] employeeByName4 = service.getByName("Ivan");
        Employee[] employeeByName5 = service.getByName("Kolya");
        Employee[] employeeByName6 = service.getByName("Andrii");
        Employee[] employeeByName7 = service.getByName("Roman");
        Employee[] employeeByName8 = service.getByName("Sveta");
        Employee[] employeeByName9 = service.getByName("Anya");
        Employee[] employeeByName10 = service.getByName("Lisa");
        Employee[] employeeByName11 = service.getByName("Daryna");
        Employee[] employeeByName12 = service.getByName("Katya");
        Employee[] employeeByName13 = service.getByName("Vika");
        Employee[] employeeByName14 = service.getByName("Mariya");
        System.out.println(Arrays.toString(employeeByName1));
        System.out.println(Arrays.toString(employeeByName2));
        System.out.println(Arrays.toString(employeeByName3));
        System.out.println(Arrays.toString(employeeByName4));
        System.out.println(Arrays.toString(employeeByName5));
        System.out.println(Arrays.toString(employeeByName6));
        System.out.println(Arrays.toString(employeeByName7));
        System.out.println(Arrays.toString(employeeByName8));
        System.out.println(Arrays.toString(employeeByName9));
        System.out.println(Arrays.toString(employeeByName10));
        System.out.println(Arrays.toString(employeeByName11));
        System.out.println(Arrays.toString(employeeByName12));
        System.out.println(Arrays.toString(employeeByName13));
        System.out.println(Arrays.toString(employeeByName14));
        System.out.println();
        System.out.println("====================================");
        //remove
        Employee removedEmployee = service.remove(5);
        System.out.println(removedEmployee);
        System.out.println("====================================");
        service.sortByName();
        service.printEmployees();
        System.out.println("====================================");
        service.sortByNameAndSalary();
        service.printEmployees();
        System.out.println("====================================");
    }
}