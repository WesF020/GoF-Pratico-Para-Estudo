package factory;

import abstractFactory.NotaFiscalAbstractFactory;
import model.Product;
import singleton.StoreManager;

public abstract class ProductStore {

    protected NotaFiscalAbstractFactory nota;

    public ProductStore(NotaFiscalAbstractFactory nota) {
        this.nota = nota;
    }

    public Product orderProduct(String type) {

        Product product = createProduct(type);

        product.getProduct();
        product.getPrice();
        StoreManager.getInstance().registerSale(product);
        return product;
    }

    protected abstract Product createProduct(String type);

}
