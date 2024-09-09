import java.util.Scanner;

class Employee {
    double salary, DA, HRA, salary1;

    Employee(double salary, double DA, double HRA) {
        this.salary = salary;
        this.DA = DA;
        this.HRA = HRA;
    }

    void display() {
        System.out.println("Employee..........");
    }

    void calcSalary() {
        salary1 = salary + salary * (DA / 100) + salary * (HRA / 100);
        System.out.println("Gross salary = " + salary1);
    }
}

class Engineer extends Employee {
    Engineer(double salary, double DA, double HRA) {
        super(salary, DA, HRA);
    }

    @Override
    void display() {
        super.display();
        calcSalary(); // Call to calcSalary() to display the gross salary
        System.out.println("Engineer.......");
    }

    @Override
    void calcSalary() {
        // Call the superclass's calcSalary to calculate the gross salary
        super.calcSalary();
        // Additional calculation for Engineer
        double engineerSalary = salary1 * 2;
        System.out.println("Gross salary of the engineer = " + engineerSalary);
    }
}

public class Override {
    public static void main(String[] args) {
        double salary, DA, HRA;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary of the employee:");
        salary = sc.nextDouble();
        System.out.println("Enter DA% of Employee:");
        DA = sc.nextDouble();
        System.out.println("Enter HRA% of Employee:");
        HRA = sc.nextDouble();
        Engineer e = new Engineer(salary, DA, HRA);
        e.display();
        sc.close();
    }
}
