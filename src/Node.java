/**
 * Created by davidwright on 10/01/2016.
 */
public class Node {

    private Object data;
    private Node next;

    public Node(Object data){
        this.data = data;
        next = null;
    }

    public void setNext(Node node){
        this.next = node;
    }

    public Object getData(){
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }
}
