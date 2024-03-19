package smartercalculator.calculatorResult;

import smartercalculator.CalculationRequest;

 public record CalculationResult(CalculationRequest request) {
    public CalculationRequest request(){
        return this.request;
    }

    public CalculationResult(CalculationRequest request) {
        this.request = request;
    }

    public CalculationRequest getRequest() {
        return request;
    }
    public abstract Object computeResult();
}
