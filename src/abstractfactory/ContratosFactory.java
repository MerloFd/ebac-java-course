package abstractfactory;

import java.util.Scanner;

public class ContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equalsIgnoreCase(requestedGrade)){
            String cor = leitura("Você escolheu um Tesla, digite a cor do seu carro: ");
            return new Tesla(346, "gasolina", cor);
        } else if ("B".equalsIgnoreCase(requestedGrade)){
            String cor = leitura("Você escolheu um Audi, digite a cor do seu carro: ");
            return new Audi(220,"gasolina",cor);
        } else {
            return null;
        }
    }
    public static String leitura(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
}
