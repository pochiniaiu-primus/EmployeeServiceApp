import java.util.Random;

public class EmployeeFactory {
    static private long id = 0;

    static public Employee generate() {
        Random random = new Random();
        String[] names = {"Serhii", "Petr", "Tolik", "Ivan", "Sveta", "Anya", "Mariya"};

        String name = names[random.nextInt(names.length - 1)];
        int age = random.nextInt(30)+10;
        double salary =  random.nextDouble() * 1000;
        char gender = random.nextBoolean() ? 'f' : 'm';
        int fixedBugs = random.nextInt(15);
        double defaultBugRate = 7;

        return new Employee(id++, name, age, salary, gender, fixedBugs, defaultBugRate);
    }

    static public Employee[] generateEmployees(int size) {
        Employee[] employees = new Employee[size];
        for (int i = 0; i < employees.length; i++) {//++i
            employees[i] = generate();
        }
        return employees;
    }
}