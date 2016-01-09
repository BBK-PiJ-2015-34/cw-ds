import java.util.Arrays;

/**
 * Created by davidwright on 08/01/2016.
 */
public class TestReturnObjectImpl {


    public static void main(String[] args) {
        TestReturnObjectImpl troi = new TestReturnObjectImpl();
        troi.launch();
    }

    public void launch(){
        System.out.println("Test 01");
        ReturnObject ro = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        System.out.println(ro.getError());
        if (ro.hasError()){
            System.out.println("No value returned");
        } else {
            System.out.printf(ro.getReturnValue() + " - returned");
        }
        System.out.println();

        System.out.println("Test 02");
        ReturnObject ro2 = new ReturnObjectImpl(42);
        System.out.println(ro2.getError());
        System.out.println(ro2.getReturnValue().toString() + " - returned");
        System.out.println();

        System.out.println("Test 03");
        ReturnObject ro3 = new ReturnObjectImpl(null);
        System.out.println(ro3.getError());
        if (ro3.hasError()){
            System.out.println("No value returned");
        } else {
            System.out.println(ro3.getReturnValue() + " - returned");
        }
        System.out.println();

        System.out.println("Test 04");
        ReturnObject ro4 = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        System.out.println(ro4.getError());
        if (ro4.hasError()){
            System.out.println("No value returned");
        } else {
            System.out.printf(ro4.getReturnValue().toString() + " - returned");
        }
        System.out.println();

        System.out.println("Test 05");
        ReturnObject ro5 = new ReturnObjectImpl("Hello World");
        System.out.println(ro5.getError());
        System.out.println(ro5.getReturnValue().toString() + " - returned");
        System.out.println();

        System.out.println("Test 06");
        ReturnObject ro6 = new ReturnObjectImpl(3.142);
        System.out.println(ro6.getError());
        System.out.println(ro6.getReturnValue().toString() + " - returned");
        System.out.println();

        System.out.println("Test 07");
        int[] anArray = {45, 7, 9, 4};
        ReturnObject ro7 = new ReturnObjectImpl(anArray);
        System.out.println(ro7.getError());
        System.out.println(Arrays.toString((int[])ro7.getReturnValue()) + " - returned");
    }
}
