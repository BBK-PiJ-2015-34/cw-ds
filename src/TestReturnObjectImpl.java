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
        ro = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        System.out.println(ro.getError().toString());
        if (ro.hasError()){
            System.out.println("No value returned");;
        } else {
            System.out.printf(ro.getReturnValue().toString());
        }
        System.out.println();

        ReturnObject ro2 = new ReturnObjectImpl(42);
        System.out.println(ro2.getReturnValue().toString());
        System.out.println(ro2.getError().toString());

        System.out.println();
        ReturnObject ro3 = new ReturnObjectImpl(null);
        //System.out.println(ro3.getReturnValue().toString());
        System.out.println(ro3.getError().toString());
    }
}
