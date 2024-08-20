import java.util.Scanner;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double bonus) {
        super(name, id);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return 5000 + bonus;
    }
}

class Programmer extends Employee {
    private int experience;

    public Programmer(String name, int id, int experience) {
        super(name, id);
        this.experience = experience;
    }

    @Override
    public double calculateSalary() {
        return 3000 + (experience * 100);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the employee type (1 for Manager, 2 for Programmer): ");
            int type = sc.nextInt();

            if (type == 1) {
                System.out.println("Enter the name, ID, and bonus for the Manager: ");
                String name = sc.next();
                int id = sc.nextInt();
                double bonus = sc.nextDouble();
                employees[i] = new Manager(name, id, bonus);
            } else if (type == 2) {
                System.out.println("Enter the name, ID, and experience for the Programmer: ");
                String name = sc.next();
                int id = sc.nextInt();
                int experience = sc.nextInt();
                employees[i] = new Programmer(name, id, experience);
            } else {
                System.out.println("Invalid employee type.");
            }
        }

        System.out.println("Employee Information: ");
        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();
        }
    }
}