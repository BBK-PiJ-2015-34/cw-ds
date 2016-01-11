/**
 * Created by david on 11/01/2016.
 *
 * This is an implementation of the ImprovedStack interface that works
 * with an ArrayList
 */
public class ImprovedArrayStackImpl implements ImprovedStack {
    private StackImpl internalstack;
    private List list;

    public ImprovedArrayStackImpl(List list){
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
        ImprovedStack reverseStack = new ImprovedArrayStackImpl(new ArrayList());
        for (int i = 0; i < internalstack.size(); i++) {
            reverseStack.push(list.get(i).getReturnValue());
        }
        return reverseStack;
    }

    @Override
    public void remove(Object object) {
        boolean found = true;
        while (found == true) {
            found = false;
            for (int i = 0; i < list.size(); i++) {
                Object currentObject = list.get(i).getReturnValue();
                if(currentObject.equals(object)){
                    list.remove(i);
                    found = true;
                }
            }
        }
    }
}
