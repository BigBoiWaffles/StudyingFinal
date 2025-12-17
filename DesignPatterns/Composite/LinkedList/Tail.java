package LinkedList;

public class Tail implements Component{
    private int head;

    public Tail(int head){
        this.head = head;
    }

    @Override
    public void print(){
        System.out.print(this.head);
    }
}
