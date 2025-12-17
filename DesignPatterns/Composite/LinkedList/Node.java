package LinkedList;

public class Node implements Component{
    private int head;
    private Component component;

    public Node(int head, Component component){
        this.head = head;
        this.component = component;
    }

    @Override
    public void print(){
        System.out.print(this.head + "->");
        this.component.print();
    }
}
