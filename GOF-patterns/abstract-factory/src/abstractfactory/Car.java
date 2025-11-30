package abstractfactory;

public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName()+" está pronto!");
        System.out.println("O motor foi abastecido com " + fuelSource + ", foi ligado e está pronto para usar " + horsePower + "HP de potência!");
    }
    public void clean(){
        System.out.println("O carro foi limpo e a cor " + color.toLowerCase() + " está reluzente");
    }
    public void mechanicCheck(){
        System.out.println("O carro foi verificado pelo mecânico. Tudo parece estar certo!");
    }
    public void fuelCar(){
        System.out.println("O carro está sendo abastecido com " + fuelSource);
    }
}
