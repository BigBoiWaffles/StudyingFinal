package LinkedList;

public class demo {
    public static void main(String[] args){
        Node head = new Node(1, new Node(2, new Node(3, new Tail(4))));
        head.print();
    }
}
