/**
 * Created by david on 11/01/2016.
 */
public class ImprovedStackImpl implements ImprovedStack {
    private StackImpl internalstack;
    private List list;

    public ImprovedStackImpl(List list){
        this.list = list;
        internalstack = new StackImpl(list);
    }

    @Override
    public boolean isEmpty() {
        return internalstack.isEmpty();
    }

    @Override
    public int size() {
        return internalstack.size();
    }

    @Override
    public void push(Object item) {
        internalstack.push(item);
    }

    @Override
    public ReturnObject top() {
        return internalstack.top();
    }

    @Override
    public ReturnObject pop() {
        return internalstack.pop();
    }

    @Override
    public ImprovedStack reverse() {
        ImprovedStack reverseStack = new ImprovedStackImpl(new ArrayList());
        for (int i = 0; i < internalstack.size(); i++) {
            reverseStack.push(list.get(i).getReturnValue());
        }
        return reverseStack;
    }

    @Override
    public void remove(Object object) {

    }
}
