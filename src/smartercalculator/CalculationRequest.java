package smartercalculator;

public record CalculationRequest(Object leftOperand, Object rightOperand, String operation) {

    public CalculationRequest(final Object leftOperand, final Object rightOperand, final String operation) {

        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operation = operation;
        if(getRequestType()==RequestType.Undefined)
            throw new RuntimeException();
    }
 public String operation(){
        return this.operation;
 }
 public Object leftOperand(){
        return this.leftOperand;
 }
 public Object rightoperand(){
        return this.rightOperand;
 }


 public static CalculationRequest deepCopy(CalculationRequest other){
        return new CalculationRequest(other.leftOperand,other.rightOperand, other.operation);
 }
    public RequestType getRequestType() {

        if (this.leftOperand instanceof Boolean) {
            return RequestType.Boolean;
        } else if (this.leftOperand instanceof Integer) {
            return this.rightOperand instanceof Integer ? RequestType.Integer : RequestType.Double;
        } else if (this.leftOperand instanceof Double) {
            return RequestType.Double;
        }

        return RequestType.Undefined;
    }

    @Override
    public String toString() {
        return leftOperand + " " + operation + " " + rightOperand;
    }

    public Object getLeftOperand() {
        return leftOperand;
    }

    public Object getRightOperand() {
        return rightOperand;
    }

    public String getOperation() {
        return operation;
    }

    public enum RequestType {
        Undefined,
        Integer,
        Double,
        Boolean
    }
}
