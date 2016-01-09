/**
 * Created by davidwright on 08/01/2016.
 */
public class TestReturnObjectImpl {

    private ReturnObject ro;


    public static void main(String[] args) {
        TestReturnObjectImpl troi = new TestReturnObjectImpl();
        troi.launch();
    }

    public void launch(){
        System.out.println("Test 01");
        ro = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        System.out.println(ro.getError());
        if (ro.hasError()){
            System.out.println("No value returned");
        } else {
            System.out.printf(ro.getReturnValue().toString() + " - returned");
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
    }
}
