/**
 * Created by davidwright on 10/01/2016.
 */
public class TestFunctionalLinkedList {
    public static void main(String[] args) {
        TestFunctionalLinkedList tfll = new TestFunctionalLinkedList();
        tfll.launch();
    }

    public void launch(){
        FunctionalLinkedList fll = new FunctionalLinkedList();
        fll.add("One");
        fll.add("Two");
        fll.add("Three");
        fll.add("Four");
        fll.add("Five");
        fll.add("Six");
        System.out.println("The head of the list is: " + fll.head().getReturnValue().toString());
        System.out.println();
        FunctionalList rest = fll.rest();
        System.out.println("The rest of the list is:");
        for (int i = 0; i < rest.size(); i++) {
            System.out.println(rest.get(i).getReturnValue().toString());
        }
    }
}
