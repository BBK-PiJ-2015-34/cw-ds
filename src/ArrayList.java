/**
 * Created by davidwright on 09/01/2016.
 */
public class ArrayList implements List {

    Object[] list;

    public ArrayList(){

    }

    @Override
    public boolean isEmpty() {
        if(list == null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        if(isEmpty()){
            return 0;
        } else {
            return list.length;
        }
    }

    @Override
    public ReturnObject get(int index) {
        if(isEmpty()){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else if(index < 0 || index >= size()){
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else {
            return new ReturnObjectImpl(list[index]);
        }

    }

    @Override
    public ReturnObject remove(int index) {
        if(isEmpty()){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            //TODO - need to implement deleting and copy elements to new array
            return new ReturnObjectImpl(list[index]);
        }
    }

    @Override
    public ReturnObject add(int index, Object item) {
        if(null == item){
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else if(index < 0 || index >= size()){
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else {
            //TODO - need implement adding item at index and copying to new array
            return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        }
    }

    @Override
    public ReturnObject add(Object item) {
        if(null == item){
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else if(isEmpty()){
            list = new Object[1];
            list[0] = item;
            return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        } else {
            //TODO - need implement copying array and adding item at end
            return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        }
    }


}
