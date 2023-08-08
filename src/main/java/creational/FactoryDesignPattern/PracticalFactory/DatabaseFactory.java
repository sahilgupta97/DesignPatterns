package creational.FactoryDesignPattern.PracticalFactory;

public class DatabaseFactory {
    public static Database createDatabase(String url) {
        Database defaultDatabase = new MySqlDatabase(url);
        if(url.contains("mysql")) {
            return new MySqlDatabase(url);
        } else if(url.contains("mongo")) {
            return new MongoDatabase(url);
        }

        return defaultDatabase;
    }
}
