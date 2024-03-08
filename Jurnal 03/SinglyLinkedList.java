public class SinglyLinkedList<E> {
    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void addNode(Buku data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Buku berhasil ditambahkan");
    }

    public void deleteNode() {
        if (head == null) {
            System.out.println();
        } else if (head.next == null) {
            System.out.println();
        } else {
            Node current = head;
            Node previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            System.out.println("Buku berhasil dihapus");
        }

    }

    public void printList() {
        if (head == null) {
            System.out.println("tidak ada buku");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;

            }
        }
    }
}