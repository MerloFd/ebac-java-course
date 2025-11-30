package abstractfactory;

import java.util.Scanner;

public class SemContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equalsIgnoreCase(requestedGrade)){
            String cor = leitura("Você escolheu um Chevrolet, digite a cor do seu carro: ");
            return new Chevrolet(153, "gasolina", cor);
        } else if ("B".equalsIgnoreCase(requestedGrade)){
            String cor = leitura("Você escolheu um Volksvagen, digite a cor do seu carro: ");
            return new Volksvagen(140, "gasolina",cor);
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
