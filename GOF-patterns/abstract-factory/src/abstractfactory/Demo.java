package abstractfactory;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String prompt = leitura(" Digite a grade de carros que deseja adquirir: 'A' ou 'B' ");

        Customer cliente = new Customer(prompt, contract(leitura(" Tem contrato na companhia? ('S' ou 'N') ")));
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Boolean contract(String prompt) {
        if ("S".equalsIgnoreCase(prompt)){
            return true;
        } else if ("N".equalsIgnoreCase(prompt)) {
            return false;
        } else {
            return null;
        }
    }

    public static String leitura(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    private static Factory getFactory(Customer cliente) {
        if (cliente.hasCompanyContract()) {
            return new ContratosFactory();
        } else {
            return new SemContratosFactory();
        }
    }
}
