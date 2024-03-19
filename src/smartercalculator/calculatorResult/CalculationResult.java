package smartercalculator.calculatorResult;

import smartercalculator.CalculationRequest;

 public abstract class CalculationResult {

     private final CalculationRequest request;


    public CalculationResult(CalculationRequest request) {
        this.request =request;
    }

    public CalculationRequest getRequest() {
        return CalculationRequest.deepCopy(request);
    }
    public abstract Object computeResult();
}
