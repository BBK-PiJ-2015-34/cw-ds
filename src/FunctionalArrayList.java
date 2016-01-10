/**
 * Created by davidwright on 10/01/2016.
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {
    @Override
    public ReturnObject head() {
        if(isEmpty()){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            ReturnObject ro = get(0);
            if (ro.hasError()){
                return new ReturnObjectImpl(ro.getError());
            } else {
                return new ReturnObjectImpl(ro.getReturnValue());
            }
        }
    }

    @Override
    public FunctionalList rest() {
        if(isEmpty()){
            return new FunctionalArrayList();
        } else {
            FunctionalArrayList restList = new FunctionalArrayList();
            for (int i = 1; i < size(); i++) {
                restList.add(get(i).getReturnValue());
            }
            return restList;
        }
    }
}
