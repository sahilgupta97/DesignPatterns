package structural.DecoratorDesignPattern.BurgerExample;

public class TestingBurgers {

  public static void main(String[] args) {
    Burger burger = new VegBurger();
    System.out.println(burger.getDescription() + " : " + burger.getCost());

    burger = new ExtraCheeseBurger(burger);
    System.out.println(burger.getDescription() + " : " + burger.getCost());

    burger = new ExtraMayoBurger(burger);
    System.out.println(burger.getDescription() + " : " + burger.getCost());

  }

}
