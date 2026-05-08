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
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(Student18 std) {
        Node18 newNode = new Node18(std, null);

        if (isEmpty()) {
            head = tail = newNode;
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

            temp.next = new Node18(std, temp.next);

            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    Student18 getData(int idx) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
            return null;
        }

        Node18 tmp = head;
        for (int i = 0; i < idx; i++) {
            tmp = tmp.next;
        }

        return tmp.data;
    }

    int indexOf(String key) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
            return -1;
        }

        Node18 tmp = head;
        int idx = 0;

        while (tmp != null && !tmp.data.name.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            idx++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return idx;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node18 tmp = head;

            while (tmp.next != tail) {
                tmp = tmp.next;
            }

            tmp.next = null;
            tail = tmp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
        } else if (head.data.name.equalsIgnoreCase(key)) {
            removeFirst();
        } else {
            Node18 temp = head;

            while (temp.next != null) {
                if (temp.next.data.name.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;

                    if (temp.next == null) {
                        tail = temp;
                    }

                    break;
                }

                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node18 temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}