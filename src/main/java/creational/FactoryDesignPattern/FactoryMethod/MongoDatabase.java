package creational.FactoryDesignPattern.FactoryMethod;

public class MongoDatabase implements Database {

    @Override
    public Query createQuery() {
        return new MongoQuery();
    }
}
