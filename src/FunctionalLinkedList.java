/**
 * Created by davidwright on 10/01/2016.
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList {
    @Override
    public ReturnObject head() {
        if(isEmpty()){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            ReturnObject ro = get(0);
            if (ro.hasError()){
                return ro;
            } else {
                return ro;
            }
        }
    }

    @Override
    public FunctionalList rest() {
        if(isEmpty()){
            return new FunctionalLinkedList();
        } else {
            FunctionalLinkedList restList = new FunctionalLinkedList();
            for (int i = 1; i < size(); i++) {
                restList.add(get(i).getReturnValue());
            }
            return restList;
        }
    }
}
