package behavioural.StateDesignPattern.VendingMachine.Inventory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Inventory {
  Map<Integer, Product> aisleToProductTable;
  Map<Integer, Integer> productToCountTable;

  Queue<Integer> availableAisles;

  public Inventory(int aisleCount) {
    this.aisleToProductTable = new HashMap<>();
    this.productToCountTable = new HashMap<>();
    this.availableAisles = new LinkedList<>();
    for(int aisleNo = 1; aisleNo <= aisleCount; aisleNo++) {
      this.availableAisles.offer(aisleNo);
    }
  }

  public void addProduct(Product product) throws Exception {
    int productId = product.getProductId();
    int productCount = productToCountTable.getOrDefault(productId, 0);

    if(productCount == 0) {
      if(availableAisles.isEmpty()) {
        throw new Exception("No aisles available to add new product");
      }
      aisleToProductTable.put(availableAisles.poll(), product);
    }
    productToCountTable.put(productId, productCount + 1);
  }

  public Product getProductAt(int aisleNumber) {
    return aisleToProductTable.get(aisleNumber);
  }

  public boolean checkIfProductAvailable(int productId) {
    int productCount =  productToCountTable.getOrDefault(productId, 0);
    return productCount > 0;
  }

  public void deductProductCount(int aisleNumber) {
    int productId = aisleToProductTable.get(aisleNumber).getProductId();
    int updatedProductCount = productToCountTable.get(productId) - 1;
    if(updatedProductCount == 0) {
      productToCountTable.remove(productId);
      aisleToProductTable.remove(aisleNumber);
      availableAisles.offer(aisleNumber);
    } else {
      productToCountTable.put(productId, updatedProductCount);
    }
  }

}
