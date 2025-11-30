package br.com.merlofd.dinjection;

public class PayService {
    private IDeductionService deductionService;

    public PayService (IDeductionService deductionService){
        this.deductionService = deductionService;
    }

    public double tax(Double amont) {
        amont = amont - deductionService.deduction(amont);
        return amont * 0.2;
    }
}
