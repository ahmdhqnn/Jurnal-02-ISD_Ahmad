public class Node {
    Buku data;
    Node next;

    public Node(Buku data) {
        this.data = data;
        this.next = null;
    }

    public Buku getData() {
        return data;
    }
}