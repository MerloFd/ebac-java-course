package br.com.merlofd.dinjection;

public class MGDeductionService implements IDeductionService{
    @Override
    public double deduction(double amont) {
        return amont * 0.12;
    }
}
