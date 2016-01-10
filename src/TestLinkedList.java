import java.util.Arrays;

/**
 * Created by davidwright on 10/01/2016.
 */
public class TestLinkedList {
    public static void main(String[] args) {
        TestLinkedList tll = new TestLinkedList();
        tll.launch();
    }

    public  void  launch(){
        LinkedList ll1 = new LinkedList();
        System.out.println("Test 1 - test for empty linkedList");
        System.out.println("Is the linkedList empty? " + ll1.isEmpty());
        System.out.println();

        System.out.println("Test 2 - what is the size of an empty linkedList");
        System.out.println("The size of an empty linkedList is: " + ll1.size());
        System.out.println();

        System.out.println("Test 3 - what is the value of the first element of an empty linkedList");
        if(ll1.get(0).getError() == ErrorMessage.NO_ERROR){
            System.out.println("The element at index 0 is: " + ll1.get(0).getReturnValue());
        } else {
            System.out.println("The element at index 0 is: " + ll1.get(0).getError());
        }

        System.out.println();

        System.out.println("Test 4 - when getting the first element from an empty linkedList what error do I get");
        System.out.println("The error is: " + ll1.get(0).getError());
        System.out.println();

        System.out.println("Test 5 - What value do I get if I remove the first element from an empty linkedList");
        System.out.println("The value is: " + ll1.remove(0).getReturnValue());
        System.out.println();

        System.out.println("Test 6 - when removing the first element from an empty linkedList what error do I get");
        System.out.println("The error is: " + ll1.remove(0).getError());
        System.out.println();

        System.out.println("Test 7 - what error do I get adding an item to position zero of an empty linkedList");
        System.out.println("The error is: " + ll1.add(0,42).getError());
        System.out.println();

        System.out.println("Test 8 - what error do I get adding an null item to position zero of an empty linkedList");
        System.out.println("The error is: " + ll1.add(0,null).getError());
        System.out.println();

        LinkedList ll2 = new LinkedList();
        System.out.println("Test 9 - what error do I get adding an null item to the end of an empty linkedList");
        System.out.println("The error is: " + ll2.add(null).getError());
        System.out.println();

        System.out.println("Test 10 - what error do I get adding an item to the end of an empty linkedList");
        System.out.println("The error is " + ll2.add("Hello").getError());
        System.out.println();

        System.out.println("Test 11 - What is the size of the list when adding item to end of empty linkedList");
        System.out.println("The size of the list is: " + ll2.size());
        System.out.println();

        System.out.println("Test 12 - What is value of item zero when adding an item to an empty linkedList");
        System.out.println("The value of the item is: " + ll2.get(0).getReturnValue().toString());
        System.out.println();

        LinkedList ll3 = new LinkedList();
        ll3.add(42);
        ll3.add(16);
        System.out.println("Test 13 - add second item to linkedList");
        System.out.println("The size of the list is now: " + ll3.size());
        System.out.println();

        System.out.println("Test 14 - what is the value of the second item");
        System.out.println("The value of the second item is: " + ll3.get(1).getReturnValue().toString());
        System.out.println();

        ll3.add("santa");
        double[] doubleArray = {45.6,0.78,3.142};
        ll3.add(doubleArray);
        System.out.println("Test 15 - two more items of different types added to the linkedList");
        System.out.println("The size of the list is now: " + ll3.size());
        System.out.println();

        System.out.println("Test 16 - get the fourth item added to the linkedList");
        System.out.println("The value of the fourth item is: " + Arrays.toString((double[])ll3.get(3).getReturnValue()));
        System.out.println();


        System.out.println("Test 17 - add item at position zero");
        System.out.println("The item at position zero before adding new item is: " + ll3.get(0).getReturnValue().toString());
        ll3.add(0,"First");
        System.out.println("After adding new item at position zero, the new item is: " + ll3.get(0).getReturnValue().toString());
        System.out.println();

        System.out.println("Test 18 - add item at position 2");
        System.out.println("The item at position 2 before adding new item is: " + ll3.get(2).getReturnValue().toString());
        ll3.add(2,3.00);
        System.out.println("After adding new item at position 2, the new item is: " + ll3.get(2).getReturnValue().toString());
        System.out.println("The item at position 3: " + ll3.get(3).getReturnValue().toString());
        System.out.println();

        System.out.println("Test 19 - add item to end and see if linkedList has grown by 1");
        System.out.println("The size of the list before adding item at end is: " + ll3.size());
        ll3.add(ll3.size(),"The end");
        System.out.println("The size of the list after trying to add item at end is: " + ll3.size());
        System.out.println("After adding new item at end, the new item is: " +  ll3.get(ll3.size()-1).getReturnValue());
        //System.out.println("After adding new item at end, the new item is: " +  Arrays.toString((double[])ll3.get(ll3.size()-1).getReturnValue()));
        System.out.println();

        System.out.println("Test 20 - remove an item from linkedList at position zero");
        System.out.println("The size of the list before removal is: " + ll3.size());
        ReturnObject to = ll3.remove(0);
        System.out.println("The size of the list after removal is: " + ll3.size());
        System.out.println("The object removed is: " + to.getReturnValue().toString());
        System.out.println();

        System.out.println("Test 21 - remove an item from linkedList at position 2");
        System.out.println("The size of the list before removal is: " + ll3.size());
        to = ll3.remove(2);
        System.out.println("The size of the list after removal is: " + ll3.size());
        System.out.println("The object removed is: " + to.getReturnValue().toString());
        System.out.println();

        System.out.println("Test 22 - remove last in linkedList");
        System.out.println("The size of the list before removal is: " + ll3.size());
        to = ll3.remove(ll3.size()-1);
        System.out.println("The size of the list after removal is: " + ll3.size());
        System.out.println("The object removed is: " + Arrays.toString((double[])to.getReturnValue()));
        System.out.println();

    }
}
