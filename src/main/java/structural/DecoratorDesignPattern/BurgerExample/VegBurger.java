package structural.DecoratorDesignPattern.BurgerExample;

public class VegBurger extends Burger {

  @Override
  public String getDescription() {
    return "VEG_BURGER";
  }

  @Override
  public double getCost() {
    return 100.0;
  }
}
