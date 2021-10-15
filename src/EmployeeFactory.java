import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EmployeeFactory {
    static private long id = 1;
//    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("Serhii", "Male");
//        map.put("Petr", "Male");
//        map.put("Serhii", "Male");
//        map.put("Tolik", "Male");
//        map.put("Ivan", "Male");
//        map.put("Kolya", "Male");
//        map.put("Andrii", "Male");
//        map.put("Roman", "Male");
//        map.put("Sveta", "Female");
//        map.put("Anya", "Female");
//        map.put("Mariya", "Female");
//        map.put("Lisa", "Female");
//        map.put("Daryna", "Female");
//        map.put("Katya", "Female");
//        map.put("Vika", "Female");
//
//
//        for (Map.Entry<String, String> elements : map.entrySet()) {
//            name = elements.getKey();
//            gender = elements.getValue();
//        }
//    }



    public String generateName(String gender) {
        String[] manNames = {"Serhii", "Petr", "Tolik", "Ivan", "Kolya", "Andrii", "Roman"};
        String[] womanNames = {"Sveta", "Anya", "Mariya", "Lisa", "Daryna", "Katya", "Vika"};
        Random random = new Random();
        int index = random.nextInt(7);
        String name = "";
        if (gender.equals("Male")) {
            name = manNames[index];
        } else {
            name = womanNames[index];
        }
        return name;
    }

    public String generateGender() {
        String[] genders = {"Male", "Female"};
        Random random = new Random();
        int index = random.nextInt(2);
        return genders[index];
    }

    public Employee generateFields() {
        int minSalary = 200;
        int maxSalary = 1000;
        Random random = new Random();
        int age = random.nextInt(30) + 18;
        double salary = (int) (minSalary + (Math.random() * maxSalary));
        int fixedBugs = random.nextInt(15);
        double defaultBugRate = 7;
        return new Employee(id++, generateName(generateGender()), age, salary, generateGender(), fixedBugs, defaultBugRate);
    }

    public Employee[] generateEmployees(int size) {
        Employee[] employees = new Employee[size];
        for (int i = 0; i < employees.length; i++) {//++i
            employees[i] = generateFields();
        }
        return employees;
    }
}