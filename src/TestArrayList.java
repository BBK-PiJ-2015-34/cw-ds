import java.util.Arrays;

/**
 * Created by davidwright on 09/01/2016.
 */
public class TestArrayList {


    public static void main(String[] args) {
        TestArrayList tal = new TestArrayList();
        tal.launch();
    }

    public  void  launch(){
        ArrayList al1 = new ArrayList();
        System.out.println("Test 1 - test for empty arraylist");
        System.out.println("Is the arraylist empty? " + al1.isEmpty());
        System.out.println();

        System.out.println("Test 2 - what is the size of an empty arraylist");
        System.out.println("The size of an empty arraylist is: " + al1.size());
        System.out.println();

        System.out.println("Test 3 - what is the value of the first element of an empty arraylist");
        System.out.println("The element at index 0 is: " + al1.get(0).getReturnValue());
        System.out.println();

        System.out.println("Test 4 - when getting the first element from an empty arraylist what error do I get");
        System.out.println("The error is: " + al1.get(0).getError());
        System.out.println();

        System.out.println("Test 5 - What value do I get if I remove the first element from an empty arraylist");
        System.out.println("The value is: " + al1.remove(0).getReturnValue());
        System.out.println();

        System.out.println("Test 6 - when removing the first element from an empty arraylist what error do I get");
        System.out.println("The error is: " + al1.remove(0).getError());
        System.out.println();

        System.out.println("Test 7 - what error do I get adding an item to position zero of an empty arraylist");
        System.out.println("The error is: " + al1.add(0,42).getError());
        System.out.println();

        System.out.println("Test 8 - what error do I get adding an null item to position zero of an empty arraylist");
        System.out.println("The error is: " + al1.add(0,null).getError());
        System.out.println();

        ArrayList al2 = new ArrayList();
        System.out.println("Test 9 - what error do I get adding an null item to the end of an empty arraylist");
        System.out.println("The error is: " + al2.add(null).getError());
        System.out.println();

        System.out.println("Test 10 - what error do I get adding an item to the end of an empty arraylist");
        System.out.println("The error is " + al2.add("Hello").getError());
        System.out.println();

        System.out.println("Test 11 - What is the size of the list when adding item to end of empty arraylist");
        System.out.println("The size of the list is: " + al2.size());
        System.out.println();

        System.out.println("Test 12 - What is value of item zero when adding an item to an empty arraylist");
        System.out.println("The value of the item is: " + al2.get(0).getReturnValue().toString());
        System.out.println();

        ArrayList al3 = new ArrayList();
        al3.add(42);
        al3.add(16);
        System.out.println("Test 13 - add second item to arraylist");
        System.out.println("The size of the list is now: " + al3.size());
        System.out.println();

        al3.add("santa");
        double[] doubleArray = {45.6,0.78,3.142};
        al3.add(doubleArray);
        System.out.println("Test 14 - two more items of different types added to the arraylist");
        System.out.println("The size of the list is now: " + al3.size());
        System.out.println();

        System.out.println("Test 15 - get the fourth item added to the arraylist");
        System.out.println("The value of the fourth item is: " + Arrays.toString((double[])al3.get(3).getReturnValue()));
        System.out.println();


        System.out.println("Test 16 - add item at position zero");
        System.out.println("The item at position zero before adding new item is: " + al3.get(0).getReturnValue().toString());
        al3.add(0,"First");
        System.out.println("After adding new item at position zero, the new item is: " + al3.get(0).getReturnValue().toString());
        System.out.println();

        System.out.println("Test 17 - add item at position 2");
        System.out.println("The item at position 2 before adding new item is: " + al3.get(2).getReturnValue().toString());
        al3.add(2,3.00);
        System.out.println("After adding new item at position 2, the new item is: " + al3.get(2).getReturnValue().toString());
        System.out.println("The item at position 3: " + al3.get(3).getReturnValue().toString());
        System.out.println();

        System.out.println("Test 18 - add item to end and see if arraylist has grown by 1");
        System.out.println("The size of the list before adding item at end is: " + al3.size());
        al3.add(al3.size(),"The end");
        System.out.println("The size of the list after trying to add item at end is: " + al3.size());
        System.out.println("After adding new item at end, the new item is: " +  al3.get(al3.size()-1).getReturnValue());
        //System.out.println("After adding new item at end, the new item is: " +  Arrays.toString((double[])al3.get(al3.size()).getReturnValue()));
        System.out.println();

        System.out.println("Test 19 - remove an item from arraylist at position zero");
        System.out.println("The size of the list before removal is: " + al3.size());
        ReturnObject to = al3.remove(0);
        System.out.println("The size of the list after removal is: " + al3.size());
        System.out.println("The object removed is: " + to.getReturnValue().toString());
        System.out.println();

        System.out.println("Test 20 - remove an item from arraylist at position 2");
        System.out.println("The size of the list before removal is: " + al3.size());
        to = al3.remove(2);
        System.out.println("The size of the list after removal is: " + al3.size());
        System.out.println("The object removed is: " + to.getReturnValue().toString());
        System.out.println();

        System.out.println("Test 21 - remove last in arraylist");
        System.out.println("The size of the list before removal is: " + al3.size());
        to = al3.remove(al3.size()-1);
        System.out.println("The size of the list after removal is: " + al3.size());
        System.out.println("The object removed is: " + Arrays.toString((double[])to.getReturnValue()));
        System.out.println();

    }
}
