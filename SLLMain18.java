public class SLLMain18 {
    public static void main(String[] args) {

        SingleLinkedList18 sll = new SingleLinkedList18();

        Student18 std1 = new Student18("001", "Student 1", "TI-1I", 3.89);
        Student18 std2 = new Student18("002", "Student 2", "TI-1I", 3.45);
        Student18 std3 = new Student18("003", "Student 3", "TI-1I", 3.20);
        Student18 std4 = new Student18("004", "Student 4", "TI-1I", 3.00);

        sll.addFirst(std1);
        sll.addLast(std4);
        sll.insertAfter(std3, "Student 1");
        sll.insertAt(1, std2);

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
    }
}