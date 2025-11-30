package br.com.merlofd.dinjection;

public class SPDeductionService implements IDeductionService{
    @Override
    public double deduction(double amont) {
        return amont * 0.1;
    }
}
