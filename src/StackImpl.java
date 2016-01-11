/**
 * Created by david on 11/01/2016.
 */
public class StackImpl extends AbstractStack {

    public StackImpl(List list){
        super(list);
    }
    @Override
    public boolean isEmpty() {
        return internalList.isEmpty();
    }

    @Override
    public int size() {
        return internalList.size();
    }

    @Override
    public void push(Object item) {
        if(internalList.isEmpty()){
            internalList.add(item);
        } else {
            internalList.add(0,item);
        }
    }

    @Override
    public ReturnObject top() {
        if(internalList.isEmpty()){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            Object data = internalList.get(0).getReturnValue();
            return new ReturnObjectImpl(data);
        }
    }

    @Override
    public ReturnObject pop() {
        if(internalList.isEmpty()){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            Object data = internalList.get(0).getReturnValue();
            internalList.remove(0);
            return new ReturnObjectImpl(data);
        }
    }
}
