package creational.FactoryDesignPattern.FactoryMethod;

public class MySqlDatabase implements Database{
    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }
}
