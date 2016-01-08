

public class ReturnObjectImpl implements ReturnObject {

    private Object returnValue;
    private ErrorMessage errorMessage;

    public ReturnObjectImpl(Object returnValue){
        if (null == returnValue){
            this.errorMessage = ErrorMessage.EMPTY_STRUCTURE;
        } else {
            errorMessage = ErrorMessage.NO_ERROR;
            this.returnValue = returnValue;
        }
    }

    public ReturnObjectImpl(ErrorMessage errorMessage){
        if(errorMessage != ErrorMessage.NO_ERROR){
            this.errorMessage = errorMessage;
        } else {
            this.errorMessage = ErrorMessage.EMPTY_STRUCTURE;
        }
        returnValue = null;
    }
    @Override
    public boolean hasError(){

        if (errorMessage == ErrorMessage.NO_ERROR){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public ErrorMessage getError(){

        return errorMessage;
    }

    @Override
    public Object getReturnValue(){
        if(hasError()){
            return null;
        } else {
            return returnValue;
        }

    }

}