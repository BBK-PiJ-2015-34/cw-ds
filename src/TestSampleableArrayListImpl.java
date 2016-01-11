/**
 * Created by david on 11/01/2016.
 */
public class TestSampleableArrayListImpl {
    public static void main(String[] args) {
        TestSampleableArrayListImpl tsali = new TestSampleableArrayListImpl();
        tsali.launch();
    }

    public void launch(){
        SampleableArrayListImpl sa = new SampleableArrayListImpl();
        sa.add(1);
        sa.add(2);
        sa.add(3);
        sa.add(4);
        sa.add(5);
        sa.add(6);
        sa.add(7);
        sa.add(8);
        sa.add(9);
        sa.add(10);
        sa.add("Eleven");
        System.out.println("The list contains the following items:");
        for (int i = 0; i < sa.size(); i++) {
            System.out.println(sa.get(i).getReturnValue());
        }
        System.out.println();

        SampleableList sl = sa.sample();
        System.out.println("The sample list contains the following items:");
        for (int i = 0; i < sl.size(); i++) {
            System.out.println(sl.get(i).getReturnValue());
        }
    }
}
