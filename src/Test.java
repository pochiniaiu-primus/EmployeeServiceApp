public class Test {

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee[] employees = employeeFactory.generateEmployees(7);
        EmployeeService service = new EmployeeService(employees);

        //void printEmployees()
        service.printEmployees();
        System.out.println("====================================");
        //getById
        Employee employeeById = service.getById(5);
        System.out.println(employeeById);
        System.out.println("====================================");
        // calculateSalaryAndBonus
        int calculateSalaryAndBonus = (int) service.sumSalaryAndBonus();
        System.out.println(calculateSalaryAndBonus);
        System.out.println("====================================");

    }
}