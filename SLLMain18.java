import java.util.Scanner;

public class SLLMain18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SingleLinkedList18 sll = new SingleLinkedList18();

        System.out.print("Input number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nStudent Data " + i);

            System.out.print("NIM        : ");
            String nim = sc.nextLine();

            System.out.print("Name       : ");
            String name = sc.nextLine();

            System.out.print("Class Name : ");
            String className = sc.nextLine();

            System.out.print("GPA        : ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            Student18 std = new Student18(nim, name, className, gpa);

            sll.addLast(std);
        }

        System.out.println("\nLinked List Result:");
        sll.print();

        System.out.println("\nData at index 1 is:");
        Student18 data = sll.getData(1);
        data.print();

        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();

        sc.close();
    }
}