public class SingleLinkedList18 {
    Node18 head;
    Node18 tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node18 tmp = head;
            System.out.println("LinkedList Data:");
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("LinkedList is empty!!");
        }
    }

    void addFirst(Student18 std) {
        Node18 newNode = new Node18(std, null);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(Student18 std) {
        Node18 newNode = new Node18(std, null);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAfter(Student18 std, String key) {
        Node18 newNode = new Node18(std, null);
        Node18 temp = head;

        while (temp != null) {
            if (temp.data.name.equalsIgnoreCase(key)) {
                newNode.next = temp.next;
                temp.next = newNode;

                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, Student18 std) {
        if (index < 0) {
            System.out.println("Wrong index!!");
        } else if (index == 0) {
            addFirst(std);
        } else {
            Node18 temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = new Node18 (std, temp.next);

            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}