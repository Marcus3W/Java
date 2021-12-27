package Pass_The_Technical_Interview;

public class LinkedList {

    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;

        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data) {
        Node tail = this.head;
        if (tail == null) {
            this.head = new Node(data);
        }
        else {
            while (tail.getNextNode() != null) {
                tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }

    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }



    public static void main(String[] args) {

        LinkedList strawberry = new LinkedList();
        LinkedList banana = new LinkedList();
        LinkedList coconut = new LinkedList();

        strawberry.addToHead("Head");
        banana.addToTail("Tail");

    }
}
