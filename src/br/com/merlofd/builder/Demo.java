package br.com.merlofd.builder;

public class Demo {
    //onde o padrão de projeto age, ele esconde a estrutura de criacao do burguer
    //mais coesão e facilidade de alteração

    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setBuilder(new CheeseBurgerBuilder());
        Burger burger = gerente.buildBurger();
        burger.print();

        gerente.setBuilder(new VeganBurgerBuilder());
        Burger burger1 = gerente.buildBurger();
        burger1.print();
    }
}