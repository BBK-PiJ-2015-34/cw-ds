/**
 * Created by davidwright on 10/01/2016.
 *
 * SampleableArrayListImpl is my implementation of SampleableList
 * This class works with an ArrayList
 *
 */
public class SampleableArrayListImpl extends ArrayList implements SampleableList {

    @Override
    public SampleableList sample() {
        if (isEmpty()){
            return new SampleableArrayListImpl();
        } else {
            SampleableList sample = new SampleableArrayListImpl();

            for (int i = 0; i < size(); i+=2) {
                sample.add(get(i).getReturnValue());
            }
            return sample;
        }
    }
}
