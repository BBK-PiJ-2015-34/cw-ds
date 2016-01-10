/**
 * Created by davidwright on 10/01/2016.
 */
public class TestFunctionalArrayList {
    public static void main(String[] args) {
        TestFunctionalArrayList tfal = new TestFunctionalArrayList();
        tfal.launch();
    }

    public void launch(){
        FunctionalArrayList fal1 = new FunctionalArrayList();

        fal1.add("One");
        fal1.add("Two");
        fal1.add("Three");
        fal1.add("Four");
        fal1.add("Five");
        fal1.add("Six");
        System.out.println("The head of the list is: " + fal1.head().getReturnValue().toString());
        System.out.println();
        FunctionalList rest = fal1.rest();
        System.out.println("The rest of the list is:");
        for (int i = 0; i < rest.size(); i++) {
            System.out.println(rest.get(i).getReturnValue().toString());
        }
    }
}
