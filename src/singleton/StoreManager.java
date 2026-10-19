package singleton;

import model.Product;
import java.util.List;
import java.util.ArrayList;



public class StoreManager {
    private static StoreManager instance;
    List<Product> productsSold;

    private StoreManager() {
        productsSold = new ArrayList<>();
    }
    public static StoreManager getInstance() {
        if (instance == null) {
            instance = new StoreManager();
        }
        return instance;
    }
    public void registerSale (Product product) {
        productsSold.add(product);
    }
    public void listSales() {
        System.out.println("==== RELATÓRIO DE VENDAS ====");
        System.out.println("Total de vendas: "+productsSold.size());
        for (int i=0; i<productsSold.size(); i++) {
            Product product = productsSold.get(i);
            System.out.println(i+". "+product.getName());
            System.out.println(" ");
        }
    }
}
