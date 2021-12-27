package Pass_The_Technical_Interview;

public class Node {

    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

    public Node getNextNode() {
        return this.next;
    }

    public static void main(String[] args) {
        /* TESTING
        Node firstNode = new Node("I am a Node!");
        System.out.println(firstNode.data);
        System.out.println(firstNode.next);
        Node secondNode = new Node("I am the second Node!");
        firstNode.setNextNode(secondNode);
        System.out.println(firstNode.next.data);
        System.out.println(firstNode.getNextNode().data);
        */



    }
}
