package smartercalculator.calculatorResult;

import smartercalculator.CalculationRequest;

final public class DoubleCalculationResult extends CalculationResult {
    public DoubleCalculationResult(CalculationRequest request) {
        super(request);
    }

    @Override
    public Object computeResult() {
        CalculationRequest request = getRequest();
        Double leftOperand = (Double) request.getLeftOperand();
        Double rightOperand = (Double) request.getRightOperand();

        return switch (request.getOperation()) {
            case "+" -> leftOperand + rightOperand;
            case "-" -> leftOperand - rightOperand;
            case "*" -> leftOperand * rightOperand;
            case "/" -> leftOperand / rightOperand;
            default -> throw new IllegalArgumentException();
        };
    }
}
