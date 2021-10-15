public class Employee implements Comparable<Employee> {
    long id;
    String name;
    int age;
    double salary;
    String gender;
    int fixedBugs;
    double defaultBugRate;

    public Employee(long id, String name, int age, double salary, String gender, int fixedBugs, double defaultBugRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
    }

    public double salaryOfAllEmployees() {
        return salary + (fixedBugs * defaultBugRate);
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public double getSalary() {
        return salary;
    }


    public String getGender() {
        return gender;
    }


    public int getFixedBugs() {
        return fixedBugs;
    }


    public double getDefaultBugRate() {
        return defaultBugRate;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", fixedBugs=" + fixedBugs +
                ", defaultBugRate=" + defaultBugRate +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.id - o.id);
    }
}
