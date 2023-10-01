package behavioural.StateDesignPattern.VendingMachine.Inventory;

public class Product {
  String name;
  int productId;
  double price;

  public Product(String name, int productId, double price) {
    this.name = name;
    this.productId = productId;
    this.price = price;
  }

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
