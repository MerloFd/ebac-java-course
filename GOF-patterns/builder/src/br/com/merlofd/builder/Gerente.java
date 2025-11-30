package br.com.merlofd.builder;

public class Gerente {

    BurgerBuilder builder;

    //cria o hamburguer pelo setter, sem ter que mudar o obj
    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }

    public Burger buildBurger() {
        builder.buildBun();
        builder.buildMeat();
        builder.buildSalad();
        builder.buildCheese();
        builder.buildSauce();
        return builder.build();
    }
}