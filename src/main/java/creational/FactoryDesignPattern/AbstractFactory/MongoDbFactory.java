package creational.FactoryDesignPattern.AbstractFactory;

public class MongoDbFactory implements DatabaseFactory {
    @Override
    public Query createQuery() {
        return new MongoQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new MongoTransaction();
    }
}
