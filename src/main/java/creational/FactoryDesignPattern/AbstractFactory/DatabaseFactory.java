package creational.FactoryDesignPattern.AbstractFactory;

public interface DatabaseFactory {
    // Factory methods
    Query createQuery();

    Transaction createTransaction();
}
