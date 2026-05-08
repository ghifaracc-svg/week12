public class SLLMain18 {
    public static void main(String[] args) {
        SingleLinkedList18 sll = new SingleLinkedList18();

        Student18 std1 = new Student18("001", "Student 1", "TI-1I", 3.89);
        Student18 std2 = new Student18("002", "Student 2", "TI-1I", 3.45);
        Student18 std3 = new Student18("003", "Student 3", "TI-1I", 3.20);
        Student18 std4 = new Student18("004", "Student 4", "TI-1I", 3.00);

        sll.print();

        sll.addFirst(std4);
        sll.print();

        sll.addLast(std1);
        sll.print();

        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        sll.print();
    }
}