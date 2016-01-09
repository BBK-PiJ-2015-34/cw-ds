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
        System.out.println("Test 1 - test for empty array");
        System.out.println("Is the array empty? " + al1.isEmpty());
        System.out.println();

        System.out.println("Test 2 - what is the size of an empty array");
        System.out.println("The size of an empty array is: " + al1.size());
        System.out.println();

        System.out.println("Test 3 - what is the value of the first element of an empty array");
        System.out.println("The element at index 0 is: " + al1.get(0).getReturnValue());
        System.out.println();

        System.out.println("Test 4 - when getting the first element from an empty array what error do I get");
        System.out.println("The error is: " + al1.get(0).getError());
        System.out.println();

        System.out.println("Test 5 - What value do I get if I remove the first element from an empty array");
        System.out.println("The value is: " + al1.remove(0).getReturnValue());
        System.out.println();

        System.out.println("Test 6 - when removing the first element from an empty array what error do I get");
        System.out.println("The error is: " + al1.remove(0).getError());
        System.out.println();

        System.out.println("Test 7 - what error do I get adding an item to position zero of an empty array");
        System.out.println("The error is: " + al1.add(0,42).getError());
        System.out.println();

        System.out.println("Test 8 - what error do I get adding an null item to position zero of an empty array");
        System.out.println("The error is: " + al1.add(0,null).getError());
        System.out.println();

        ArrayList al2 = new ArrayList();
        System.out.println("Test 9 - what error do I get adding an null item to the end of an empty array");
        System.out.println("The error is: " + al2.add(null).getError());
        System.out.println();

        System.out.println("Test 10 - what error do I get adding an item to the end of an empty array");
        System.out.println("The error is " + al2.add("Hello").getError());
        System.out.println();

        System.out.println("Test 11 - What is the size of the list when adding item to end of empty array");
        System.out.println("The size of the list is: " + al2.size());
        System.out.println();

        System.out.println("Test 12 - What is value of item zero when adding an item to an empty array");
        System.out.println("The value of the item is: " + al2.get(0).getReturnValue().toString());
        System.out.println();


    }
}
