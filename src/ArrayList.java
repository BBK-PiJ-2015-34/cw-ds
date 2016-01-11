/**
 * Created by davidwright on 09/01/2016.
 */
public class ArrayList implements List {

    Object[] list;

    public ArrayList(){

    }

    @Override
    public boolean isEmpty() {
        if(list == null || list.length == 0){
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
        } else if(index < 0 || index >= size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else {
            ReturnObject ro = new ReturnObjectImpl(list[index]);
            Object[] tmpArrayList = new Object[size()-1];
            int listIndex = 0;
            for (int i = 0; i < size(); i++) {
                if(index == i){
                    continue;
                } else {
                    tmpArrayList[listIndex] = list[i];
                    listIndex++;
                }
            }
            list = tmpArrayList;
            return ro;
        }
    }


    @Override
    public ReturnObject add(int index, Object item) {
        if(null == item){
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else if(index < 0 || index >= size()){
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else {
            Object[] tmpArrayList = new Object[size()+1];
            int listIndex = 0;
            for (int i = 0; i < size()+1; i++) {
                if(index == i){
                    tmpArrayList[i] = item;
                } else {
                    tmpArrayList[i] = list[listIndex];
                    listIndex++;
                }

            }
            list = tmpArrayList;
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
            Object[] tmpArrayList = new Object[size()+1];
            for (int i = 0; i < size(); i++) {
                tmpArrayList[i] = list[i];
            }
            tmpArrayList[size()] = item;
            list = tmpArrayList;
            return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        }
    }


}
