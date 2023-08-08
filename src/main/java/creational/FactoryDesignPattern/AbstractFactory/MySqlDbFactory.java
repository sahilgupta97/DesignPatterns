package creational.FactoryDesignPattern.AbstractFactory;

public class MySqlDbFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new MySqlTransaction();
    }
}
