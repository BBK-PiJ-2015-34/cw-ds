/**
 * Created by davidwright on 10/01/2016.
 *
 * LinkedList makes use of Node objects to store data
 * and link to next node
 *
 */
public class LinkedList implements List {

    private Node head;

    public LinkedList(){
        head = null;
    }

    @Override
    public boolean isEmpty() {
        if(head == null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        int count;
        if(head == null){
            return 0;
        } else {
            //TODO - implement counting
            count = 1;
            Node currentNode = head;
            while(currentNode.getNext() != null){
                count++;
                currentNode = currentNode.getNext();
            }
            return count;
        }

    }

    @Override
    public ReturnObject get(int index) {
        if(head == null){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else if(index < 0 || index >= size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else {
            int count = 0;
            Node currentNode = head;
            while(count < index){
                currentNode = currentNode.getNext();
                count++;
            }
            return new ReturnObjectImpl(currentNode.getData());
        }
        //TODO need to implement properly
    }

    @Override
    public ReturnObject remove(int index) {
        if(isEmpty()){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else if(index < 0 || index >= size()){
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else if (index == 0) {
            //TODO this needs to be implemented
            Object returnData = head.getData();
            head = head.getNext();
            return new ReturnObjectImpl(returnData);
        } else {
            Node currentNode = head;
            Node previousNode = currentNode;
            int count = 0;
            while (count < index){
                previousNode = currentNode;
                currentNode = currentNode.getNext();
                count++;
            }
            previousNode.setNext(currentNode.getNext());
            Object returnData = currentNode.getData();
            currentNode.setNext(null);
            return new ReturnObjectImpl(returnData);
        }
    }

    @Override
    public ReturnObject add(int index, Object item) {

        if(null == item){
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else if(index < 0 || index >= size()){
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else if (index == 0){
            //TODO need to implement this
            Node newNode = new Node(item);
            newNode.setNext(head);
            head = newNode;
            return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        } else {
            Node currentNode = head;
            Node previousNode = currentNode;
            int count = 0;
            while (count < index){
                previousNode = currentNode;
                currentNode = currentNode.getNext();
                count++;
            }
            Node newNode = new Node(item);
            previousNode.setNext(newNode);
            newNode.setNext(currentNode);
            return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        }
    }

    @Override
    public ReturnObject add(Object item) {
        if (item == null){
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else if(head == null){
            head = new Node(item);
            return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node(item));

        }
        return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }
}
