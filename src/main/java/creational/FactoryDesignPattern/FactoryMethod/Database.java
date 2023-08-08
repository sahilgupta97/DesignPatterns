package creational.FactoryDesignPattern.FactoryMethod;

public interface Database {
    // methods like connect etc.

    // Factory method
    Query createQuery();
}
