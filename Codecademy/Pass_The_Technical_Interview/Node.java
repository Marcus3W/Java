package Pass_The_Technical_Interview;

public class Node {

    public String data;
    public Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }


    public static void main(String[] args) {

        Node firstNode = new Node("I am a Node!");
        System.out.println(firstNode.data);
        System.out.println(firstNode.next);
    }
}
