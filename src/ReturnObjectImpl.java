

public class ReturnObjectImpl implements ReturnObject {

    private Object returnValue;
    private ErrorMessage errorMessage;

    public ReturnObjectImpl(Object returnValue){
        errorMessage = ErrorMessage.NO_ERROR;
        this.returnValue = returnValue;
    }

    public ReturnObjectImpl(ErrorMessage errorMessage){

        this.errorMessage = errorMessage;
        returnValue = null;
    }

    public boolean hasError(){

        if (errorMessage != ErrorMessage.NO_ERROR){
            return false;
        } else {
            return true;
        }
    }

    public ErrorMessage getError(){

        return errorMessage;
    }

    public Object getReturnValue(){

        return this;
    }

}