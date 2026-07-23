import java.util.Scanner;
class Student {
    int id;
    String name;
    void getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }
}
class Marks extends Student {
    int m1, m2;
    void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks 1: ");
        m1 = sc.nextInt();
        System.out.print("Enter marks 2: ");
        m2 = sc.nextInt();
    }
}
class Result extends Marks {
    void showResult() {
        int total = m1 + m2;
        double avg = total / 2.0;
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}
public class program2 {
    public static void main(String[] args) {
        Result r = new Result();
        r.getStudent();  
        r.getMarks();    
        r.showResult();  
    }
}
