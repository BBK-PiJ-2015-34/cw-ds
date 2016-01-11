/**
 * Created by david on 11/01/2016.
 */
public class TestImprovedStackImpl {

    public static void main(String[] args) {
        TestImprovedStackImpl tisi = new TestImprovedStackImpl();
        tisi.launch();
    }

    public void launch(){


        ImprovedStackImpl arrayStack = new ImprovedStackImpl(new ArrayList());
        arrayStack.push("Hello");
        arrayStack.push("World");
        System.out.println("TESTING FOR AN ARRAY STACK");
        System.out.println("I am expecting the top of the stack to be: World");
        System.out.println("I got : " + arrayStack.top().getReturnValue().toString());
        System.out.println();

        System.out.println("I pop the stack and expect to get: World");
        System.out.println("I got the: " + arrayStack.pop().getReturnValue().toString());
        System.out.println();

        System.out.println("I am expecting the top of the stack to be: Hello");
        System.out.println("I got : " + arrayStack.top().getReturnValue().toString());
        System.out.println();

        System.out.println("I pop the stack again and expect to get: Hello");
        System.out.println("I got the: " + arrayStack.pop().getReturnValue().toString());
        System.out.println();

        System.out.println("I pop the stack again and expect to get an error");
        System.out.println("I got the: " + arrayStack.pop().getError().toString());
        System.out.println();

        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);

        ImprovedStack reverseArrayStack = arrayStack.reverse();
        int size = reverseArrayStack.size();
        for (int i = 0; i < size; i++) {
            System.out.println(reverseArrayStack.pop().getReturnValue().toString());
        }

        System.out.println("TESTING FOR AN LINKED LIST STACK");
        ImprovedStackImpl linkedStack = new ImprovedStackImpl(new LinkedList());
        linkedStack.push("Hello");
        linkedStack.push("World");

        System.out.println("I am expecting the top of the stack to be: World");
        System.out.println("I got : " + linkedStack.top().getReturnValue().toString());
        System.out.println();

        System.out.println("I pop the stack and expect to get: World");
        System.out.println("I got the: " + linkedStack.pop().getReturnValue().toString());
        System.out.println();

        System.out.println("I am expecting the top of the stack to be: Hello");
        System.out.println("I got : " + linkedStack.top().getReturnValue().toString());
        System.out.println();

        System.out.println("I pop the stack again and expect to get: Hello");
        System.out.println("I got the: " + linkedStack.pop().getReturnValue().toString());
        System.out.println();

        System.out.println("I pop the stack again and expect to get an error");
        System.out.println("I got the: " + linkedStack.pop().getError().toString());
        System.out.println();
    }
}
