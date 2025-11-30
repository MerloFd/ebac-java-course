package br.com.merlofd.dinjection;

public class app {
    public static void main (String[] Args){
        //basta mudar a instância da dependencia no app, logo menos acoplamento
        PayService ps = new PayService(new SPDeductionService());

        double tax = ps.tax(1000.00);
        System.out.println(tax);
    }
}
